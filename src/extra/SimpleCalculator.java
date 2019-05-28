package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	static int ans = 0;
	static String a = JOptionPane.showInputDialog("num1");
	static String b = JOptionPane.showInputDialog("num2");
	static int num1;
	static int num2;
	public static void main(String[] args) {
		 num1 = Integer.parseInt(a);
		 num2 = Integer.parseInt(b);
		// 1. Get 2 numbers from the user and convert them to integer.

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What opperator", "", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		if (operation == 3) {
			add();
			}
		if (operation == 2) {
			subtract();
			}
		if (operation == 1) {
			multiply();
			}
		if (operation == 0) {
			divide();
			}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
System.out.println(ans);
	}

	static int add() {
		 ans = num1 + num2;
		return ans;
	}

	static int subtract() {
		 ans = num1 - num2;
		return ans;
	}

	static int multiply() {
		 ans = num1 * num2;
		return ans;
	}

	static int divide() {
		 ans = num1 / num2;
		return ans;
	}
	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.

}