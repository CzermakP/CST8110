//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette
//Class Die is designed to hold the model for 3 die values(within an Array) and their totals combined
//which then the Game class utilizes 

import java.util.Random; //utility to generate Random things (numbers in this program)

public class Die {
	private int[] dv = new int[3];// declaring a new array of integers of size 3
	Random randomNumbers = new Random(); // declaring

	public Die() { // default constructor

	}

	public void rollDie() { // method to generate random die values
		for (int i = 0; i < 2; i++) {
			dv[i] = randomNumbers.nextInt(6) + 1;
		}

	}

	public void displayDie() { // displaying the value of the 3 die
		System.out.println("Your dies are: " + dv[0] + " and " + dv[1] + " and " + dv[2] + " for a total value of "
				+ (dv[0] + dv[1] + dv[2]));

	}

	public int getValue() { // returning the total value of the 3 die
		return dv[0] + dv[1] + dv[2];
	}

}
