/*Erli Qiu 
 *CSE002-310
 *Prof.Fouh
 * This program takes inputs of a block from users,
 * namely, length, width, and height.
 * It will print out the volume and surface area.
 */


import java.util.Scanner;

public class Block {
	public static void main(String[] args){
		Scanner kboard = new Scanner (System.in); // create a scanner that accept inputs from users
		System.out.print("Enter the length: "); // ask users to enter a value 
		double length = kboard.nextDouble(); // take input and assign it to length
		System.out.print("Enter the width: ");//ask users to enter a value 
		double width = kboard.nextDouble(); //take input and assign it to width
		System.out.print("Enter the height: "); //ask users to enter a value 
		double height = kboard.nextDouble(); //take input and assign it to height
		
		double volume = length*width*height; //calculate the volume by using volume formula
		double surfaceArea = (length*width*2) + (length*height*2) + (height*width*2); //calculate the surface area
		
		//print out the results
		System.out.println("The volume of the block of dimensions" + length + " x " + width + " x " + height + " is "+ volume);
		System.out.println("The surface area of the block is "+ surfaceArea);
	}
}
