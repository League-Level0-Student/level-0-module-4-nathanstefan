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
String alpha = JOptionPane.showInputDialog("how much Nick-el-es do you have?");
		// Convert their answer to an int using Integer.parseInt()
int beta = Integer.parseInt(alpha);

		// Ask 
		// Ask the user how many dimes they have, and convert their answer
String delta = JOptionPane.showInputDialog("how much dimes do you have?");
int locomccoco = Integer.parseInt(delta);

		// Ask the user how many quarters they have, and convert their answer
String omega = JOptionPane.showInputDialog("how many quarters do you have?");
int dawae = Integer.parseInt(omega);

		// Tell the user how much money they have
double epsilon = beta * 5 + locomccoco * 10 + dawae * 25;
System.out.println("$"+epsilon/100.00);
	}
}

