

import java.util.Scanner;

//Erli Qiu 
//CSE002-310
//Prof.Fouh
// This program takes 2 inputs from user, current time and planned dinner time
// then it calculates the time difference and print out that value.
// the time is in HHMM format and uses military time
//Erli Qiu 
//CSE002-310
//Prof.Fouh


public class Time {
public static void main(String[] args){
	

	Scanner kboard = new Scanner(System.in); //create a scanner that accept inputs from users
	System.out.print("Enter the current time: "); //ask user to enter current time
	int currentTime = kboard.nextInt(); // take input and assign it to current time
	System.out.print("Enter the time that you will be eating dinner: ");//ask user to enter planned time
	int dinnerTime = kboard.nextInt();// take input and assign it to dinner time
	
	int currentTimeInMin = currentTime%100 + (currentTime/100)*60; //convert current time into minutes
	int dinnerTimeInMin = dinnerTime%100 + (dinnerTime/100)*60; // convert dinner time in to minutes
	int timeDifferenceInMin = dinnerTimeInMin - currentTimeInMin ; //subtract them and find the time difference in minutes
	String timeDifferenceInHour = timeDifferenceInMin/60 + " hours and " + timeDifferenceInMin%60 + " minutes"; // convert time difference into hours and minutes, then cast it to a string
	 System.out.println("You have " + timeDifferenceInHour + " until dinner."); // print out the result
	
 }
}
