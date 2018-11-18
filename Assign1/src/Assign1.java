
/* Patrick Czermak
 * CST8110_Section_314
 * Jason Mombourquette
 * This programs purpose is to calculate the final grade of course CST8215 through allowing the user to input
 * weights for each area of marking. The program then separates these areas and calculates them into Theory and 
 * Practical grades. Finally it calculates a Final grade for the user based on the Theory and Practical grades.
 * Assignment 1
 * October 3, 2018
 */

import java.util.Scanner; //Import statement for the scanner class
import java.text.DecimalFormat; //Import statement for the decimal format class

public class Assign1 { // Class declaration

	public double Lab, QuizTest, Assignment, Midterm, Final; // Instance variable declaration

	public static void main(String[] args) { // Entry point - code starts here

		System.out.println("Welcome to the CST8215 Final Mark Calculator\n"); // Outputs text to console

		Scanner input = new Scanner(System.in); // Declare and initialize the scanner

		DecimalFormat df = new DecimalFormat("#.##"); // Declare and initialize the decimal formatting
		// "#.##" means to force the code to output 2 decimal places before and after
		// the decimal.

		System.out.print("Enter your Lab mark out of 10: "); // Outputs text to console
		double Lab = input.nextDouble(); // Allows user to input values in console

		System.out.print("Enter your Quiz/Test mark out of 10: "); // Outputs text to console
		double QuizTest = input.nextDouble(); // Allows user to input values in console

		System.out.print("Enter your Assignment mark out of 20: "); // Outputs text to console
		double Assignment = input.nextDouble(); // Allows user to input values in console

		System.out.print("Enter your Midterm mark out of 20: "); // Outputs text to console
		double Midterm = input.nextDouble(); // Allows user to input values in console

		System.out.print("Enter your Final Exam mark out of 40: "); // Outputs text to console
		double FinalExam = input.nextDouble(); // Allows user to input values in console

		System.out.println(); // Prints a line

		double TheoryGrade = (QuizTest + Midterm + FinalExam) / 70 * 100; // Theory grade calculation
		double PracticalGrade = (Assignment + Lab) / 30 * 100; // Practical grade calculation
		double FinalGrade = (QuizTest + Assignment + Lab + Midterm + FinalExam); // Final grade calculation

		System.out.println("Theory grade: " + df.format(TheoryGrade) + "%"); // Prints Theory grade in decimal format
		System.out.println("Practical grade: " + df.format(PracticalGrade) + "%"); // Prints Practical grade in decimal format
		System.out.println("Final grade: " + df.format(FinalGrade) + "%"); // Prints Final grade in decimal format

	} //end of main

} //end of class
