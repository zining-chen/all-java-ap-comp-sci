// This program compares benchmarks for Selection Sort,
// Insertion Sort, and Mergesort

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;

public class Benchmarks extends JFrame
{
  private static int numberOfRuns = 2;

  private JTextField arraySizeInput, display;
  private String sortMethodNames[] =
     {"Selection Sort", "Insertion Sort", "Mergesort", "Quicksort", "Arrays.sort"};
  private JComboBox chooseSortMethod;

  private final long seed;
  private int arraySize;

  // Constructor
  public Benchmarks()
  {
    super("Benchmarks");

    Container c = getContentPane();
    c.setLayout(new GridLayout(6, 1));

    c.add(new JLabel(" Array size: "));
    arraySizeInput = new JTextField(4);
    arraySizeInput.setText("1000");
    arraySizeInput.selectAll();
    c.add(arraySizeInput);

    chooseSortMethod = new JComboBox(sortMethodNames);
    c.add(chooseSortMethod);

    JButton run = new JButton("Run");
    run.addActionListener(new RunButtonListener());
    c.add(run);

    c.add(new JLabel(" Avg Time (milliseconds): "));

    display = new JTextField("   Ready");
    display.setBackground(Color.YELLOW);
    display.setEditable(false);
    c.add(display);

    // Use the same random number generator seed for all benchmarks
    //   in one run of this program:
    seed = System.currentTimeMillis();
  }

  // Fills a[] with random numbers and sorts it using the sorting method
  // specified in sortMethod:
  //     1 -- Selection Sort
  //     2 -- Insertion Sort
  //     3 -- Mergesort
  //     4 -- Quicksort
  // This is repeated numberOfRuns times for better accuracy
  // Returns the total time it took in milliseconds.
  private long runSort(double[] a, int sortMethod, int numberOfRuns)
  {
    long elapsedTime = 0;
    
    Random generator = new Random(seed);
    
    for (int i = 0; i < a.length; i++) {
    	a[i] = generator.nextDouble();
    }
    
    for (int i = 0; i < numberOfRuns; i++) {
    	long startTime = System.currentTimeMillis();
    	switch (sortMethod) {
    	
    	case 1: 
    		InsertionSort.sort(a);
    		elapsedTime += System.currentTimeMillis() - startTime;
    		break;
    	
    	case 2: 
    		SelectionSort.sort(a);
    		elapsedTime += System.currentTimeMillis() - startTime;
    		break;
    	
    	case 3: 
    		Mergesort.sort(a);
    		elapsedTime += System.currentTimeMillis() - startTime;
    		break;
    	
    	case 4: 
    		Quicksort.sort(a);
    		elapsedTime += System.currentTimeMillis() - startTime;
    		break;
    		
    	case 5: 
    		Arrays.sort(a);
    		elapsedTime += System.currentTimeMillis() - startTime;
    		break;
    		
    	}
    	
    }
    
    return elapsedTime;
    
}
    

  // Handles Run button events
  private class RunButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String inputStr = arraySizeInput.getText().trim();
      try
      {
        arraySize = Integer.parseInt(inputStr);
      }
      catch (NumberFormatException ex)
      {
        display.setText(" Invalid array size");
        arraySize = 0;
        return;
      }  

      if (arraySize <= 0)
      {
        display.setText(" Invalid array size");
        return;
      }

      if (arraySize <= 0)
        return;

      int sortMethod = chooseSortMethod.getSelectedIndex() + 1;
      double a[] = new double[arraySize];
      double avgTime = (double)runSort(a, sortMethod, numberOfRuns)
                                                          / numberOfRuns;
      display.setText(String.format("  %.2f", avgTime));
  
      arraySizeInput.selectAll();
      arraySizeInput.requestFocus();
      System.out.println("Array size = " + arraySize +
            " Runs = " + numberOfRuns + " " +
            sortMethodNames[sortMethod - 1] + " avg time: " + avgTime);
         
    }
  }

  //************************************************************

  public static void main(String[] args)
  {
    numberOfRuns = 20;
    if (args.length > 0)
    {
      int n = -1;
      try
      {
        n = Integer.parseInt(args[0].trim());
      }
      catch (NumberFormatException ex)
      {
        System.out.println("Invalid command-line parameter");
        System.exit(1);
      }
      if (n > 0)
        numberOfRuns = n;
    }

    Benchmarks window = new Benchmarks();
    window.setBounds(300, 300, 180, 200);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

