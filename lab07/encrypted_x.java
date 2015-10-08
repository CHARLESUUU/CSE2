/*
 * This program will print out many asteroids 
 * (nxn, where n is the dimension, given by users' input)
 * and hide the secret message X
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
import java.util.Scanner;

public class encrypted_x {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create a scanner that accept inputs from users
		System.out.println("enter the size");//ask users to enter a integer that defines the size
		int size = kb.nextInt(); //takes the input and assign it to variable size
		if (size<101&&size>=0){ //validation check if the number is negative or greater than 100
			for (int a =0;a<size+1;a++){  //outer loop that deals with how much lines been printed
				
				for (int b=0;b<size+1;b++){ //inner loop deals with character in each line
					
					//this part prints out space at nth, and (size-n)th position in each line
					// n is line number
					if(b==a||b==size-a)	 
						System.out.print(" ");
					
					//every thing else will be asteroids
					else
						System.out.print("*");
				}
				System.out.println("");//switch line
			}
		}
		
		//if the number entered is not valid, terminate the program
		else{
			System.exit(-1);
		}
	}
}
