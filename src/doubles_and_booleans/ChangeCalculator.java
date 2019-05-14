package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()
		String p = JOptionPane.showInputDialog("how many pennies do you have");

		double P = Integer.parseInt(p);
		String n = JOptionPane.showInputDialog("how many nickles do you have");

		double N = Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("how many dimes do you have");

		double D = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("how many quarters do you have");
		double Q = Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable
		double $ = P / 100 + N / 20 + D / 10 + Q / 4;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $" + $);
	}
}
