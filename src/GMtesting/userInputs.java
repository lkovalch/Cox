package GMtesting;

import java.util.Scanner;

public class userInputs {

	//main method begins execution of Java application
	public static void main(String[] args) {
		
		//create Scanner to obtain inputs from command line		
		Scanner input = new Scanner (System.in);
		
		int  number1; //first number
		int  number2; //second number
		int  number3; //third number
	
		//Prompt user to enter first number
		System.out.println("Enter first Integer: ");
		number1 = input.nextInt();
		
		//Prompt user to enter second number
		System.out.println("Enter second Integer: ");
		number2 = input.nextInt();
		
		//Prompt user to enter third number
		System.out.println("Enter third Integer: ");
		number3 = input.nextInt();
		
		int sum= number1+number2+number3;
		
		System.out.println("Summary of three entered numbers is " + sum);
		
		if ( number1 == number2 )
			{System.out.printf( "%d = %d\n", number1, number2 );}
		
		if ( number1 < number2 )
			{System.out.printf( "%d < %d\n", number1, number2 );}
		if ( number1 > number2 )
			{System.out.printf( "%d > %d\n", number1, number2 );}
		
		input.close();
				
		
	}
	
}