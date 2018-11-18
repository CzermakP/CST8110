//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette

import java.util.Scanner;

public class Box {
	// DECLARING variables
	private double length, width, height;
	private Scanner input;

	// DEFAULT CONSTRUCTOR - initializing data members to lowest values
	public Box() {
		length = 0.0;
		width = 0.0;
		height = 0.0;
		input = new Scanner(System.in);
	}

	// PARAMETERIZED CONSTRUCTOR
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.input = new Scanner(System.in);
	}

	// COPY CONSTRUCTOR
	public Box(Box aBox) {
		length = aBox.length;
		width = aBox.width;
		height = aBox.height;
	}

	// USER INPUT value for LENGTH
	public void inputLength() {
		System.out.print("Enter Length: ");
		length = input.nextDouble();
	}

	// USER INPUT value for WIDTH
	public void inputWidth() {
		System.out.print("Enter Width: ");
		width = input.nextDouble();
	}

	// USER INPUT value for HEIGHT
	public void inputHeight() {
		System.out.print("Enter Height: ");
		height = input.nextDouble();
	}

	// DISPLAY BOX - displays the box in the proper format
	public void displayDimensions() {
		System.out.print(length + " X " + width + " X " + height);
	}

	// CALCULATION for box volume
	public double calcVolume() {
		return length * width * height;
	}
}//end of class
