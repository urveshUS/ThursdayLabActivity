package question2;

import java.util.*;

public class calculator {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:- ");
		int number1 = input.nextInt();
		
		System.out.println("Enter a second number:- ");
		int number2 = input.nextInt();
		
		System.out.println("Which operation you want to perform:- ");
		String operation = input.next();
		
		switch (operation) {
		case "*":
			System.out.println("Your multiplication is " + (number1 * number2));
			break;
			
		case "+":
			System.out.println("Your addition is " + (number1 + number2));
			break;
		case "-":
			System.out.println("Your subtraction is " + (number1 - number2));
			break;
		case "/":
			System.out.println("Your division is " + (number1 / number2));
			break;
		default: 
			System.out.println("Enter a valid operation from +,-,*,/");
			break;
		}
	}
}