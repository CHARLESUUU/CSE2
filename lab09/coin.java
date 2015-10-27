/*
 * This program will generate 1 or 0 randomly 
 * As if it is flipping the coin
 * Erli Qiu
 * Prof.Fauh
 * CSE002-310
 */
import java.util.Scanner;

public class coin {
	public static int flip(){
		int result = (int) (Math.random()+0.5); //generate 1 or 0
		if(result==0){  // 0 is tail
			System.out.println("tail"); //print out result
		}
		if(result==1){  //1 is head
			System.out.println("head"); //print out result
		}
		return result; //return the result
	}
	
	public static void flip(int a){
		for(int b =0;b<a;b++){   //takes input from users, call the flip method n times, n is user input
			flip();
		}
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create a scanner that accept inputs from users
		System.out.println("enter a integer"); // ask user to input a value
		int num = kb.nextInt(); //assign it to num
		if(num==0){ // if 0, call flip() 
			flip();
		}
		 if(num>0&&num<=100){ // if n is >0 and <=100, flip the coin for n times
			flip(num);
		}
		else if(num>100){ //if n is >100, terminate the program
			System.exit(0);
		}
	
	}
}
