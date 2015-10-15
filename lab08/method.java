import java.util.Arrays;
import java.util.Scanner;
/*
 *This program will calculate the mean and median value of a set of numbers
 *Erli Qiu
 *Prof.Fouh
 *CSE002-310 
 */
public class method {
	
	public static double calculateMean(double[] array){
		double sum=0; // set sum to zero
		for (int a=0;a<array.length;a++){ //loop through each numbers from array
			sum=sum+array[a]; //add each number into sum
		}
		double results=(double)sum/array.length; //calculates the average
		return results; //return the result
	}
	
	public static double calculateMedian(double[] array){
		double median =0; //set median to zero
		if(array.length%2!=0){ //if the size of array is odd
			median = array[array.length/2]; //the median will be the number in the middle of an ordered list
		}
		else{
			median= (array[array.length/2-1]+array[array.length/2])/2; //if the size is even, the median will be the average between two middle numbers
		}
		return median; //return the results
	}
	
	public static void print(double a, double b){
		System.out.println("the mean is "+ a + " and the median is "+ b); //print out the mean and median
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);//create a scanner that accept inputs from users
		System.out.println("enter the size of your set of numbers");//ask users to enter size of numbers
		int size = kb.nextInt(); //set it to size
		System.out.println("enter your set of numbers"); //ask to enter a series of numbers
		double[] array=new double[size]; //initialize an array
		for (int b=0;b<size;b++){  //loop through and add number from user input into empty array
			double num = kb.nextDouble();
			array[b]=num; 
		}
		Arrays.sort(array); //sort the array by using a class from library
	
		double resultsMean = calculateMean(array); //store mean value into a new variable
		double resultsMedian = calculateMedian(array); //store median value into a new variable 
		print(resultsMean,resultsMedian); //call print method
	}
}
