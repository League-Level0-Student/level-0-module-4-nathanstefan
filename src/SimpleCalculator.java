

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String callum = JOptionPane.showInputDialog("Pick 1 numbers. They better not be silly numbers like 42!");
String callum2 = JOptionPane.showInputDialog("Pick one mores 1 numbers. They better not be silly numbers like 42!");
int callum = Integer.parseInt();
int callum2 = Integer.parseInt();

// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want me to do with these numbers", "Copyright NathanCorp 2018", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
System.out.println(operation);
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	if (operation == 0 ) {
		
	}

		// TO DO Auto-generated method stub


	// 3. Create method for addition operation.
	private static void addition () {
		
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
} private static void subtraction () {
	
}
	private static void multiplication () {
		
		
	}
		private static void division () {
	}
}