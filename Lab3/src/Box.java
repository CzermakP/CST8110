import java.util.Scanner;

public class Box {

	public double length, width, height;

	public Scanner input;

	Box() {
		length = 1;
		width = 1;
		height = 1;
		input = new Scanner(System.in);
	}

	Box(double aLength, double aWidth, double aHeight) {
		length = aLength;
		width = aWidth;
		height = aHeight;
		input = new Scanner(System.in);
	}

	Box(Box aBox) {
		length = aBox.length;
		width = aBox.width;
		height = aBox.height;
	}

	public void inputLength() {
		System.out.print("Enter Length: ");
		length = input.nextDouble();
	}

	public void inputWidth() {
		System.out.print("Enter Width: ");
		width = input.nextDouble();
	}

	public void inputHeight() {
		System.out.print("Enter Height: ");
		height = input.nextDouble();
	}

	public void displayDimensions() {
		System.out.print(length + " X " + width + " X " + height);
	}

	public double calcVolume() {
		return length * width * height;

	}
}
