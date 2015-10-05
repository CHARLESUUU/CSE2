import java.util.Scanner;
/*
 * This program will ask users to enter a number that defines the size of pyramid
 * Then it will print out a scalable pyramid 
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */

public class pyramid {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create a scanner that accept inputs from users
		System.out.println("enter the size of pyramid: ");//ask uses to define the size
		int size = kb.nextInt(); //assign the input to variable "size"
		
		//the following structure has to do with the relationship among size, space numbers, 
		//,and asterisks number. 
		//The space number for each line n = size - n
		//The asterisks number for each line n = n*2 -1
		
		for(int a=1;a<=size;a++) //the outer loop 
		{
			for(int b=0;b<size-a;b++){ //this inner loop prints out the number space before *
				System.out.print(" ");
			}
			for(int c=0;c<a*2-1;c++){ //this inner loop prints out the number of *
				System.out.print("*");
			}
			System.out.println(""); // it goes to the next line every time when finish one line
		}
	}
}
