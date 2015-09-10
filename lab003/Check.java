import java.util.Scanner;
//This program is for calculating the average cost of each person who eats dinner. 
//It will take whatever the value you type in and calculates the results in designed formula. 

public class Check{
//main method required for every Java program
	public static void main(String[] args) {
      Scanner myScanner = new Scanner( System.in ); // declare an instance and call constructor
      System.out.print("Enter the original cost of the check in the form xx.xx: "); //ask users to type in original cost
      double checkCost = myScanner.nextDouble(); //accept user input and assign it to checkCost
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");//ask users to type in tip percentage
      double tipPercent = myScanner.nextDouble();//accept user input and assign it to tipPercent
      tipPercent /= 100; //We want to convert the percentage into a decimal value
      System.out.print("Enter the number of people who went out to dinner: ");//ask users to type in number of participants. 
      int numPeople = myScanner.nextInt();//accept users input and assign it to numPeople
      
      double totalCost; 
      double costPerPerson;
      int dollars, dimes, pennies; //whole dollar amount of cost
                                   //for storing digits
      							   //to the right of the decimal point
                                   //for the cost$
      
      totalCost = checkCost * (1 + tipPercent); //get total cost, original cost plus tips
      costPerPerson = totalCost / numPeople; // get cost per person
      
      //get the whole amount, dropping decimal fraction
      dollars=(int)costPerPerson; 
     
      //get dimes amount, e.g.,
      // (int)(6.73 * 10) % 10 ­> 67 % 10 ­> 7
      // where the % (mod) operator returns the remainder
      // after the division: 583%100 ­> 83, 27%5 ­> 2
      dimes=(int)(costPerPerson * 10) % 10; // get dimes amount
      pennies=(int)(costPerPerson * 100) % 10; //get pennies amount
      System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);//print out the result
      
	} //end of main method
} //end of class