import java.util.Scanner; //program uses class Scanner

/**
 * This program prompts user to enter a numbers, then displays the next number
 * Author: Howard Rosenblum CST8110 Introduction to Computer Programming
 */
public class JavaMain {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		double number = 0.0;
		System.out.println("This program will produce a printout of the three numbers after the entered number.  Enter the number:");

		number = input.nextDouble();

		System.out.println("\nThe next 3 numbers after " + number + " are:");

		System.out.println(number + 1);
		System.out.println(number + 2);
		System.out.println(number + 3);

	} // end of main
}// end of class
