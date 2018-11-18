import java.util.Scanner;

public class PrimeNumbers {
	// DECLARING data members
	private int numberOfPrimes = 0;
	private int[] primes;
	private double A1;
	private double B1;
	Scanner input = new Scanner(System.in);

	// METHOD to get numbers from user
	public void getNumberFromUser() {
		System.out.println("How many prime numbers do you want? ");
		numberOfPrimes = input.nextInt();
		primes = new int[numberOfPrimes];
		// positive number constraint for user
		while (numberOfPrimes <= 0) {
			System.out.println("You need to generate atleast one prime number");
			numberOfPrimes = input.nextInt();
		}
	}

	// METHOD to generate prime numbers
	public void generatePrimes() {
		// DECLARING data members used in method
		int primeNumbers;
		int current;
		int previousPrime;
		boolean isPrime;
		
		A1 = System.currentTimeMillis(); //tracks beginning run time of generate primes method

		primes[0] = 2;
		primeNumbers = 1;
		current = 3;
		while (primeNumbers < numberOfPrimes) {
			isPrime = true;
			previousPrime = 0;
			while (previousPrime < primeNumbers) {
				if (current % primes[previousPrime] == 0) {
					isPrime = false;
					break;//BONUS***breaks out of loop when isPrime becomes false
				}//end if
				previousPrime = previousPrime + 1;
			}//end while
			if (isPrime) {
				primes[primeNumbers] = current;
				primeNumbers = primeNumbers + 1;
			}//end if
			current = current + 2;	
		}

		B1 = System.currentTimeMillis(); //tracks ending time of generate prime method
	}//end of generate primes method

	// METHOD to print
	public void printPrimes() {
		int num = 1;
		System.out.println("\nThe First " + numberOfPrimes + " prime numbers are:");
		for (int i = 0; i < numberOfPrimes; i++) {
			System.out.println(num + " " + primes[i]);
			num++;
		}
		
		System.out.println((B1-A1)/1000 + "seconds"); //displays total run time of generate primes method

	}
}
