/*
 * This program is a special calculator that first ask the user
 * to see if you want to use the calculator
 * and if yes,takes inputs from users to do simple calculations
 * after one calculation is done, it will ask the user again.
 * If the user don't want to use it, the calculator will stop.
 * Erli Qiu
 * Prof.Fauh
 * CSE002-310
 */


import java.util.Scanner;

public class CalculatorSpecial {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in); //create a scanner that accept inputs from users
		System.out.println("Type n or N to stop");// ask users whether you want to use the calculator
		String y = kboard.next();  //take input and assign it to y
		while (!y.equals("n") && !y.equals("N")){     //check if the y is equals to n or N, if no, go ahead and execute the code inside the loop
			System.out.println("enter the first number: "); // ask users to enter a integer 
			int a = kboard.nextInt(); // take input and assign it to 'a'
			System.out.println("enter the second number: "); //ask users to enter another integer 
			int b = kboard.nextInt(); //take input and assign it to 'b'
			System.out.println("enter the number corresponding to operator, 1 is +, 2 is -, 3 is *, 4 is /");// ask the user to enter a number that is corresponding to an operator
			int operator = kboard.nextInt(); //take input and assign it to operator
			
			// make the operator switch, 1 is adding, 2 is subtracting, 
			// 3 is times, 4 is dividing, 
			// the default feature would print out 'illegal operator'
			switch(operator) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println((double)a/(double)b);
				break;
			default:
				System.out.println("illegal operator");
				break;
			}
			System.out.println("Type n or N to stop");  //ask the user again to see if want to continue using the calculator
			String x = kboard.next(); // take the input and assign to x
			if(x.equals("n") || x.equals("N")){  // if x is equal to n or N, jump out of the loop and stops,vise versa
					break; 
			}
			
		}
		
	}
}
