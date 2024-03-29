import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(10));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.WHITE);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box2.add(input);
    box2.add(Box.createVerticalStrut(10));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    // ... insert code to process str or call a method here
    str = doDate(str);

    result.setText(str);
    input.selectAll();
  }

  private String doDate(String str) {
	String month = str.substring(0, str.indexOf("/"));
	str = str.substring(str.indexOf("/" + 1));
	String day = str.substring(0, str.indexOf("/"));
	String year = str.substring(0, str.indexOf("/"));
	
	if (month.length() == 1) {
		month = "0" + month;
	}
	
	if (day.length() == 1) {
		day = "0" + month;
	}
	
	return day + "-" + month + "-" + year;
  }

public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

