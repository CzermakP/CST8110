/* Patrick Czermak
 * CST8110_310/314
 * Jason Mombourquette
 * CST8215 Final Grade Calculator
 * Assignment 1
 * October  , 2018
 */


//import statement for the scanner class
//and import statement for the decimal format class
import java.util.Scanner;
import java.text.DecimalFormat;

//class declaration
public class Assign1b {

	// Entry point-code starts here
	public static void main(String[] args) {

		// instance variable declaration(belongs to the main method)
		double lab, quizTest, assignment, midterm, finalExam;

		//output text to console
		System.out.println("Welcome to the CST8215 Final Mark Calculator\n");

		// declare and initialize the scanner
		// declare and initialize the decimal formatting
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##"); //##.## means to force the code to output 2 decimal places before and after "."
		//"if you give me any number i will format as what i have been initialized as...("##.##") and return it to you as a String"

		//output text to console and user inputs
		System.out.print("Enter your Lab mark out of 10: ");
		lab = input.nextDouble();
	
		System.out.print("Enter your Quiz/Test mark out of 10: ");
		quizTest = input.nextDouble();

		System.out.print("Enter your Assignment mark out of 20: ");
		assignment = input.nextDouble();

		System.out.print("Enter your Midterm mark out of 20: ");
		midterm = input.nextDouble();

		System.out.print("Enter your Final Exam mark out of 40: ");
		finalExam = input.nextDouble();

		System.out.println();

		// calculating theory, practical, and final Grades based on inputs made by the user
		double theoryGrade = (quizTest + midterm + finalExam) / 70 * 100;
		double practicalGrade = (assignment + lab) / 30 * 100;
		double finalGrade = (quizTest + assignment + lab + midterm + finalExam);

		// get the return values from the decimal formatter
		// gives the decimal formatter aka df.format()method the theory, practical, and final grade and it will return 
		//the String value using the initialized format
		String formattedTheoryGrade = df.format(theoryGrade);
		String formattedPracticalGrade = df.format(practicalGrade);
		String formattedFinalGrade = df.format(finalGrade);
				
		// print the theory, practical and final Grades based on Decimal Formats created
		System.out.println("Theory grade: " + formattedTheoryGrade + "%");
		System.out.println("Practical grade: " + formattedPracticalGrade + "%");
		System.out.println("Final grade: " + formattedFinalGrade + "%");

	}// Exit point-code ends here

}
