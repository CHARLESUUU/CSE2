

/*
 * This program will ask the user to input numbers of employees
 * and for each employee, it will ask for pay rate and working hours 
 * for each day (Monday to Friday). Then it will sum up the working
 * hours and print out the specific pay roll for that employee.
 * At the end, it will print out the total pay roll for all
 * employees.
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
import java.util.Scanner;

public class timeSheets {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create a scanner that accept inputs from users
		System.out.println("how many employees?: ");////ask user to enter numbers of employee
		int numOfEmployee =  kb.nextInt(); //takes inputs and assign to numOfEmployee
		double totalPay=0; //initialize total pay roll to zero
		
		//the outer for loop will loop n times, n is the number of employees
		//it will takes inputs(pay rate) from users and assign to payRate
		//also it will initialize the payRoll, totalWorkHour for each employee
		
		for (int a=1;a<=numOfEmployee;a++){
			System.out.println("what's the pay rate ? (in cents): ");
			double payRate = kb.nextDouble();
			double payRoll=0;	
			int totalWorkHour = 0;
		
		//the inner loop will loop through 5 times, each time ask user to input working hours for one day
		// then it adds them up to total work hours
			for(int b=0;b<5;b++){
					System.out.println("enter the working hours for each day (Monday to Friday): ");
					int workHours= kb.nextInt();
					totalWorkHour = totalWorkHour+workHours;
				}
				
	//each time, (each employee) it will calculate the pay roll and print out that value	
	// it also add the pay roll of one specific employee into total pay roll (all employee)
				payRoll=totalWorkHour*payRate;
				System.out.println("the pay roll for employee " + a +" is " + payRoll+ " cents");
				totalPay =totalPay+payRoll;
			
			
		}
		//print out the total pay roll for employees
		System.out.println("the pay roll for all employees is " + totalPay +" cents");
	}
}
