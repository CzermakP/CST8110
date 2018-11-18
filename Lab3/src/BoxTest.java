
public class BoxTest {
	public static void main(String[] args) {
		// create a box using no-arg constructor
		Box defaultBox=new Box();
		System.out.print("Default dimensions are ");
		defaultBox.displayDimensions();
		System.out.println(" with volume of "+defaultBox.calcVolume());
		
		// create a box using initial constructor
		Box initialBox=new Box(8.5,11,1);
		System.out.print("Initial dimensions are ");
		initialBox.displayDimensions();
		System.out.println(" with volume of "+initialBox.calcVolume());

		// create a box using copy constructor
		Box copyBox=new Box(initialBox);
		System.out.print("Copied dimensions are ");
		copyBox.displayDimensions();
		System.out.println(" with volume of "+copyBox.calcVolume());
		
		// change values based on user input
		System.out.println("\nUpdate dimensions");
		initialBox.inputLength();
		initialBox.inputWidth();
		initialBox.inputHeight();
		System.out.print("Updated dimensions are ");
		initialBox.displayDimensions();
		System.out.print(" with volume of "+initialBox.calcVolume());

	}
}
