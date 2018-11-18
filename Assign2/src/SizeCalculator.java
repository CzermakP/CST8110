
// Name: Patrick Czermak
// Section: 314
// Lab Instructor: Jason Mombourquette

import java.text.DecimalFormat;

// DECLARING DATA MEMBERS OF CLASS
public class SizeCalculator {
	private Box firstBox;
	private Box secondBox;
	private String message;
	private DecimalFormat df;

	// DEFAULT CONSTRUCTOR - initializing to lowest values
	public SizeCalculator() {
		System.out.println("Size Calculator - Calculating Volume Differences Since 2018!\n");
		firstBox = null;
		secondBox = null;
		message = "";
		df = new DecimalFormat("#.##");
	}

	// USER INPUT METHOD - allows the user to input values for 2 box dimensions
	public void inputBoxes() {
		firstBox = new Box();
		System.out.println("Enter first box dimensions");
		inputBox(firstBox);
		System.out.println();
		secondBox = new Box();
		System.out.println("Enter second box dimensions");
		inputBox(secondBox);
	}

	// COPY CONSTRUCTOR - copying boxes
	private void inputBox(Box inputBox) {
		inputBox.inputLength();
		inputBox.inputWidth();
		inputBox.inputHeight();
	}

	// CALCULATION METHOD - guidelines for box size differences calculations
	public void calculateSize() {
		double vol1 = firstBox.calcVolume();
		double vol2 = secondBox.calcVolume();

		if (vol1 == vol2) {
			message = "The first box is the same size as the second box";
		} else {
			if (vol1 > vol2) {
				double multiple = vol1 / vol2;
				if (multiple < 2)
					message = "The first box is slightly bigger than the second box";
				else if (multiple >= 2 && multiple < 3)
					message = "The first box is twice the size of the second box";
				else if (multiple >= 3 && multiple < 4)
					message = "The first box is triple the size of the second box";
				else if (multiple <= 4 && multiple < 5)
					message = "The first box is quarduple the size of the second box";
				else
					message = "The first box is " + df.format(multiple) + " times the size of the second box";
			} else {
				double multiple = vol2 / vol1;
				if (multiple < 2)
					message = "The second box is slightly bigger than the first box";
				else if (multiple >= 2 && multiple < 3)
					message = "The second box is twice the size of the first box";
				else if (multiple >= 3 && multiple < 4)
					message = "The second box is triple the size of the first box";
				else if (multiple >= 4 && multiple < 5)
					message = "The second box is quadruple the size of the first box";
				else
					message = "The second box is " + df.format(multiple) + " times the size of the first box";
			}
		}
	}
	

	// DISPLAY METHOD - displays calculated volumes for each boxes values inputed by
	// user
	public void display() {
		System.out.print("First box: ");
		firstBox.displayDimensions();
		System.out.println(" volume=" + df.format(firstBox.calcVolume()));
		System.out.print("Second box: ");
		secondBox.displayDimensions();
		System.out.println(" volume=" + df.format(secondBox.calcVolume()));
		System.out.println(message);
	}
}// end of class
