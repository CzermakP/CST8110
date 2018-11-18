import java.util.Scanner;//import scanner method to allow user to input into console for code 

public class InLab2Test {//start of class
	private int value1, value2;//data members
	Scanner input;
	
	public InLab2Test() {//parameterized and initialized constructor
		int value1 = 1;//setting value1 to equal 1
		int value2 = 1;//setting value2 to equal 2
		input = new Scanner(System.in);//setting Scanner to input
		
	}//end of parameterized and initialized constructor
	public void getValues() {//method to getValues from user
		System.out.print("Enter the first value: ");//outputs to console
		value1 = input.nextInt();//allows user to input into console
		while(value1 < 1) {//user input constraint
			System.out.print("Invalid entry..Enter the first value: ");//outputs to console
			value1 = input.nextInt();//allows user to re-enter input into console
		}//end of while
			
		System.out.print("Enter the second value: ");//outputs to console
		value2 = input.nextInt();//allows user to input into console
		while(value2 < 1 ) {//user input constraint
			System.out.print("Invalid entry..Enter the second value: ");//outputs to console
			value2 = input.nextInt();//allows user to re-enter input into console
		}//end of while
	}//end of getValues method
		public void display() {//method to display
			if (value1 > value2 ) {//calculation constraint
				int p = value1/value2;//initializing "int p" to equal division calculation
			 System.out.println(value1 + "/" + value2 + "=" + p);//outputs to console the values divided and total new value after calculation
			}else {//continuation of calculation constraint
				int p = value2/value1;//initializing "int p" to equal division calculation of values reversed
				System.out.println(value2 + "/" + value1 + "=" + p);//outputs to console the values divided and total new value after calculation
			}//end of method
			
		
	}//end of display method
	
}//end of class
