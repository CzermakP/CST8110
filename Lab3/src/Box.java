import java.util.Scanner;

public class Box {

	public double length, width, height; //declaring data members

	public Scanner input; //declaring scanner input

	Box() { //default constructor
		length = 1;
		width = 1;
		height = 1;
		input = new Scanner(System.in);
	}

	Box(double aLength, double aWidth, double aHeight) { //parameterized constructor
		length = aLength;
		width = aWidth;
		height = aHeight;
		input = new Scanner(System.in);
	}

	Box(Box aBox) { //copy constructor
		length = aBox.length;
		width = aBox.width;
		height = aBox.height;
	}

	public void inputLength() { //allows user to input length as a type double 
		System.out.print("Enter Length: ");
		length = input.nextDouble();
	}

	public void inputWidth() { //allows user to input width as a type double 
		System.out.print("Enter Width: ");
		width = input.nextDouble();
	}

	public void inputHeight() { //allows user to input height as type double
		System.out.print("Enter Height: ");
		height = input.nextDouble();
	}

	public void displayDimensions() { //method to display box dimensions
		System.out.print(length + " X " + width + " X " + height);
	}

	public double calcVolume() { //method to calculate box volume
		return length * width * height;

	}
}
