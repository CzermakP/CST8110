import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculator {
	// instance variables
	private double test;
	private double assignment;
	private double lab;
	private double midterm;
	private double finalExam;
	private double theory;
	private double practical;
	private double finalGrade;
	private Scanner input;
	private DecimalFormat df;

	// a) default constructor
	public GradeCalculator() {
		System.out.println("Welcome to the CST8215 Final Mark Calculator\n");
		input = new Scanner(System.in);// Scanner Initializing
		df = new DecimalFormat("#.##");// Decimal Format initializing
		test = 0;
		assignment = 0;
		lab = 0;
		midterm = 0;
		finalExam = 0;
		theory = 0;
		practical = 0;
		finalGrade = 0;
	}

	// b) prompt user for individual marks Method
	public void getMarks() {

		System.out.print("Enter your Lab mark out of 10: ");
		lab = input.nextDouble();
		System.out.print("Enter your Test mark out of 10: ");
		test = input.nextDouble();
		System.out.print("Enter your Assignment mark out of 20: ");
		assignment = input.nextDouble();
		System.out.print("Enter your Midterm mark out of 20: ");
		midterm = input.nextDouble();
		System.out.print("Enter your Final Exam mark out of 40: ");
		finalExam = input.nextDouble();
		System.out.println();

	}

	// c) calculates grades Method
	public void calculateGrades() {

		theory = (test + midterm + finalExam) / 70 * 100; // Theory grade calculation
		practical = (assignment + lab) / 30 * 100; // Practical grade calculation
		finalGrade = (test + assignment + lab + midterm + finalExam); // Final grade calculation

	}

	// d) displays grades Method
	public void displayGrades() {
		System.out.println("Theory grade: " + df.format(theory) + "%");
		System.out.println("Practical grade: " + df.format(practical) + "%");
		System.out.println("Final grade: " + df.format(finalGrade) + "%");

	}

}// end class
