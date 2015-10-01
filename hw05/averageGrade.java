/*
 * This program takes input of grade from the user
 * and store it to total grade if the input is valid (0-100)
 * then it calculates and displaysthe average grade 
 * if the number entered is 999.
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
import java.util.Scanner;

public class averageGrade {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in); //create a scanner that accept inputs from users
		int grade=0; //create a variable that will store the grade 
		int count=0; //count will be used to see how many inputs are entered
		double avgGrade=0; // initiate average grade and assign 0 to it
		
		while (true){  //while loop will constantly be used until "break point"
			System.out.println("Please enter a grade that is between 0 and 100"); //ask user to enter valid grade
			int addedGrade = kboard.nextInt(); //takes inputs and assign to addedGrade
			
			if (addedGrade==999){ //check each time, see the commend is 999 or not
				avgGrade=((double)grade)/((double)count); //if yes, calculated the average grade 
				System.out.println("The average grade is: "+ avgGrade);//print out the average
				break; //jump out of the loop and terminate	
			}
				if(addedGrade>100 ||addedGrade<0){ //check the validity of inputs
					System.out.println("Invalid grade, please re-enter a new grade."); //print out this message if the inputs are invalid
				}
			   
				else if (addedGrade<=100 && addedGrade>=0){//check the validity of inputs, if valid, calculation goes on
					grade+=addedGrade; //store all valid input to grade
					count++; //increment each time entering a valid input
						
					
				}
			}	
		}
		
}