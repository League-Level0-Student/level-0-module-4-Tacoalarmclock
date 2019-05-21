package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	
	public static void main(String[] args) {

	}
		// 1. Get 2 numbers from the user and convert them to integer.
String a = JOptionPane.showInputDialog("num1");
String b = JOptionPane.showInputDialog("num2");
int num1 = Integer.parseInt(a);
int num2 = Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What opperator", "", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	private void add() {
		
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}