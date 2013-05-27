import java.util.Scanner;

public class NextInLine01 {

	public static void main(String[] args) {
		
		int ageBetween, youngestChild, middleChild, oldestChild;
		Scanner kb = new Scanner(System.in);
		
		String input = kb.nextLine();
		youngestChild = Integer.parseInt(input);
		
		String input2 = kb.nextLine();
		middleChild = Integer.parseInt(input2);
		
		ageBetween = middleChild - youngestChild;
		oldestChild = middleChild + ageBetween;
		
		System.out.println(oldestChild);
	}
}
