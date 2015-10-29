
/*
 * This program will ask the user to define the size of an array
 * it will print out random number from 0-100
 * it also calculates the average and sum
 * Finally, it will print out numbers in the array that are greater than average
 * Erli Qiu
 * Prof.Fauh
 * CSE002-310
 */
import java.util.Scanner;

public class array {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create scanner
		System.out.println("enter the size of array"); //ask user to enter a size of array
		int size = kb.nextInt();//assign the input to size
		int[] ary = new int[size]; //initialize array
		for(int a=0;a<size;a++){ //loop
			ary[a]=(int) (Math.random()*100);//generates random numbers from 0 to 100 and add it to empty array
		}
		for(int b=0;b<size;b++){ //loop
			System.out.println(ary[b]); //print out all elements in the array
		}
		int sum=0; //initialize sum
		for(int c=0;c<size;c++){ //loop
			sum+=ary[c]; //add numbers into sum
		}
		double avg = (double)sum/(double)size; //calculate average and cast it to double
		System.out.println("sum is "+ sum+ " average is "+ avg); //print out sum and average
		
		for(int d=0;d<size;d++){ //loop
			if(ary[d]>=avg){ //check each number see if it is greater than average
				System.out.println(ary[d]); //print out numbers that are greater than average
			}
		}
		
	}
}
