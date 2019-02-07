//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette
//Class Assign3(Main class) which is for displaying the header in my program 
//and for calling the playGame method from the Game.java Class

public class Assign3 {

	public static void main(String[] args) {
		System.out.println("Welcome to FIREMASTER'S Double OR Nothing Dice Game..bet an AMOUNT & TYPE");
		System.out.println("      ->if you're CORRECT, you WIN twice your bet, ");
		System.out.println("      ->but if you're WRONG, then your bet belong's to the FIREMASTER!!!");
		System.out.println(
				"RULES: Can't bet less than 0. Can't bet money you don't have in your pot. A bet of 0 ends the game ");
		System.out.println("                         GOOD LUCK, & DON'T GET BURNED");
		Game G = new Game(); // created new object of Class Game

		G.playGame();// calling play game method from Class Game
	}// end of main

}// end of class
