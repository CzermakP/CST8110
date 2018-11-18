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
	private String letterGrade;
	private double less;

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
		letterGrade = "";
		less = 0;
	}

	// b) prompt user for individual marks Method
	public void getMarks() {
		do {
			System.out.print("Enter your Lab mark out of 10: ");
			lab = input.nextDouble();
		} while (lab < 0 || lab > 10);
		do {
			System.out.print("Enter your Test mark out of 10: ");
			test = input.nextDouble();
		} while (test < 0 || test > 10);
		do {
			System.out.print("Enter your Assignment mark out of 20: ");
			assignment = input.nextDouble();
		} while (assignment < 0 || assignment > 20);
		do {
			System.out.print("Enter your Midterm mark out of 20: ");
			midterm = input.nextDouble();
		} while (midterm < 0 || midterm > 20);
		do {
			System.out.print("Enter your Final Exam mark out of 40: ");
			finalExam = input.nextDouble();
		} while (finalExam < 0 || finalExam > 40);
		System.out.println();

	}

	// c) calculates grades Method
	public void calculateGrades() {

		theory = (test + midterm + finalExam) / 70 * 100; // Theory grade calculation
		practical = (assignment + lab) / 30 * 100; // Practical grade calculation
		finalGrade = (test + assignment + lab + midterm + finalExam); // Final grade calculation
		if (theory < practical) {
			less = theory;
		}
		if (practical < theory) {
			less = practical;
		}
		if (theory < 50) {
			finalGrade = theory;
		} else if (practical < 50) {
			finalGrade = practical;
		}
		if (theory < 50 || practical < 50) {
			finalGrade = less;
		}
	}

	// d)letterGrade calculator Method
	public void letterGrade() {
		if (finalGrade >= 90) {
			letterGrade = "A+";
		} else if (finalGrade <= 89 && finalGrade >= 85) {
			letterGrade = "A";
		} else if (finalGrade <= 84 && finalGrade >= 80) {
			letterGrade = "-A";
		} else if (finalGrade <= 77 && finalGrade >= 79) {
			letterGrade = "B+";
		} else if (finalGrade <= 73 && finalGrade >= 76) {
			letterGrade = "B";
		} else if (finalGrade <= 70 && finalGrade >= 72) {
			letterGrade = "-B";
		} else if (finalGrade <= 67 && finalGrade >= 69) {
			letterGrade = "C+";
		} else if (finalGrade <= 63 && finalGrade >= 65) {
			letterGrade = "C";
		} else if (finalGrade <= 60 && finalGrade >= 62) {
			letterGrade = "C-";
		} else if (finalGrade <= 59) { //OR THIS WAY //else {
			letterGrade = "F";                       //letterGrade = "F";
		}                                            // }
	}

	// e) displays grades Method
	public void displayGrades() {
		System.out.println("Theory grade: " + df.format(theory) + "%");
		System.out.println("Practical grade: " + df.format(practical) + "%");
		System.out.println("Final grade: " + df.format(finalGrade) + "%");
		System.out.println("Letter grade: " + letterGrade);
	}

}// end class
