
//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette
//Class Game program holds the logical coding for my dice game.

import java.util.Scanner; //importing utility of scanner

public class Game { // beginning of class
	private int potAmount; // declaring data variable potAmount
	private int betAmount; // declaring data variable betAmount
	private String betType; // declaring data variable betType
	boolean win; // declaring data member win
	private Scanner input;

	public Game() { // beginning of INITIALIZED CONSTRUCTOR (initializing values for data variables)
		potAmount = 100;
		betAmount = 0;
		betType = "";
		win = false;
		input = new Scanner(System.in);

	} // end of initialized constructor

	public void getBetFromUser() { // beginning of method getBetfromUser which gets bet amount from user
		System.out.print("Enter your bet amount: "); // output to console requesting user to input a bet amount
		betAmount = input.nextInt(); // allows user to input bet amount into console

		if (betAmount != 0) { // beginning of if statement
			while (betAmount < 0 || betAmount > potAmount) {// beginning of nested while statement
				System.out.print("ERROR! You can't bet less than 0 or money you don't have in the pot" // outputs to
																										// console
						+ "...RE-ENTER your bet amount: "); // outputs to console
				betAmount = input.nextInt(); // allows user to re-enter bet amount into console
			} // end of nested while statement
		} // end of if statement
	}// end of method getBetFromUser

	public void playGame() { // beginning of method playGame which runs the logic for the game
		Die die = new Die(); // creating object of a die

		while (true) {// beginning of while loop
			System.out.println("Your current pot is " + potAmount); // output to console including beginning pot amount
			if (potAmount == 0) {// beginning of first if statement nested inside of while loop
				break;// Breaks out of loop if if statement is met
			} // end of first if statement nested in while loop
			getBetFromUser();// calls the method getBetFromUser to get the users inputed value
			if (betAmount == 0) {// beginning of second if statement nested inside of while loop
				break;// Breaks out of loop if if statement is met
			}
			System.out.print("Enter your bet type: "); // output to console requesting user to enter a bet type
			betType = input.next(); // allows user to input bet type into console
			while (!(betType.equalsIgnoreCase("odd") || betType.equalsIgnoreCase("even")// beginning of second while
																						// loop
					|| betType.equalsIgnoreCase("high") || betType.equalsIgnoreCase("low"))) { // second while loop
																								// continued
				System.out.print("ERROR...Please enter odd, even, high, or low ....Enter your bet type: ");// output to
																											// console
																											// error
																											// message
				betType = input.next(); // allows user to re-enter bet type
			}
			potAmount -= betAmount;// calculation which removes the bet amount from the pot amount after the user
									// places their bet
			die.rollDie();// calls the rollDie method from Die Class which gets random numbers
			die.displayDie();// calls the displayDie method from Die Class which displays the 3 die values

			if (betType.equals("odd") && die.getValue() % 2 == 1) {// calculation for odd bet type
				win = true;// if odd bet type condition met, assigns win to true
			} else if (betType.equals("even") && die.getValue() % 2 == 0) {// calculation for even bet type
				win = true;// if even bet type condition met, assign win to true
			} else if (betType.equals("high") && die.getValue() >= 9) {// calculation for high bet type
				win = true;// if high bet type condition met, assign win to true
			} else if (betType.equals("low") && die.getValue() < 9) {// calculation for low bet type
				win = true;// if low bet type condition met, assign win to true
			} else
				win = false;// if odd, even, high, low bet type conditions are not met , then assign win to
							// false

			if (win) {// if bet type conditions return win, the following code runs
				System.out.println("Winner! You win double your bet\n");// output to console
				potAmount = potAmount + (betAmount * 2);// calculation for when user wins
			} else {// if bet type condition return anything other than win, ie.false
				System.out.println("Boo Hoo! You lose your bet\n");// output to console

			}

		}
		System.out.println("GAME OVER...You finish with a pot of " + potAmount); // output's to console if bet amount is
																					// zero

	} // end of method playGame
} // end of class
