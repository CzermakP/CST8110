import java.util.Scanner;

public class InLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int height;
		int width;
		int area;
		int paint;

		System.out.println("This program, written by Patrick Czermak, will calculate the amount of paint needed");
		System.out.print("Wall height: ");
		height = input.nextInt();
		System.out.print("Wall width: ");
		width = input.nextInt();

		area = (width * height);
		paint = (area * 24 / 100);

		System.out.print("to cover a " + area + " square meter wall you need " + paint + " litres of paint");

	}

}
