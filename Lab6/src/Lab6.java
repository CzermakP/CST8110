import java.util.Scanner;


public class Lab6 {
	// DECLARING DATA MEMBERS
	private double firstTerm;
	private double commonRatio;
	private double precision;
	private double total;

	// DEFAULT CONSRUCTOR - initializing data members to lowest value
	public Lab6() {
		double firstTerm = 0.0;
		double commonRatio = 0.0;
		double precision = 0.0;
		double total = 0.0;

	}

	// INPUT METHOD FOR USER VALUES
	public void getValues() {
		Scanner input = new Scanner(System.in);

		// First term user input method with boundaries
		System.out.print("First term: ");
		firstTerm = input.nextDouble();
		while (firstTerm == 0) {
			System.out.print("Please select a non-zero value, First term: ");
			firstTerm = input.nextDouble();
		}
		// Common ratio user input method with boundaries
		System.out.print("Common Ratio: ");
		commonRatio = input.nextDouble();
		while (commonRatio >= 1 || commonRatio <= -1) {
			System.out.print("Please select a value between -1 and 1, Common ratio: ");
			commonRatio = input.nextDouble();
		}
		// Precision user input method with boundaries
		System.out.print("Precision: ");
		precision = input.nextDouble();
		while (precision < 0) {
			System.out.print("Please select a non-negative value, Precision:  ");
			precision = input.nextDouble();
		}
	}

	// CALCULATION METHOD - calculates geometric series(given in Lab instructions)
	public void calculateSeries() {
		total = 0;
		double term = firstTerm;
		while (term > precision || (term * -1) > precision) {
			total = total + term;
			term = term * commonRatio;
		}
	}

	// DISPLAY METHOD - displays the calculations while rounding precision to 
	// the users inputed decimal place
	public void display() {
		// PATRICK'S NOTES!! JASON TO IGNORE LOL
		// if precision is 0... then total/precision*precision is 0 
		// so check for 0 value and just use "total" value instead of Math.round
		// System.out.println("Total : " +
		// (precision==0?total:Math.round(total/precision)*precision));
		// if (precision == 0) {
	//LINE 67 IS EXAMPLE 1 (NO BONUS)
		//System.out.println("Total: " + total);
	//LINE 69 IS ROUND TO 10TH OF DECIMAL PLACE FOR EXAMPLE 2
		System.out.println("Total: " + Math.round(total * 1) / 1.0);
		// } else
	//LINE 73 IS "LAB BONUS" EXAMPLE 3, CALCULATES PRECISION TO USER ENTERED 
	//DECIMAL PLACE USING Math.round
		System.out.println("Total: " + (Math.round(total/precision)*precision));
	}

}// end of class
