/*This program will ask user to define size of array,which will be filled with random integer from 
 * to 100, then ask user to input index, the number at tha position will be moved to the end of 
 * array, the numbers on the right will shift to left.	
 *Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
import java.util.Scanner;

public class moveIndex {
	  
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); //create a scanner
		System.out.println("enter the size of the array: "); //ask user to input size
		int size=0; //initialize size
		int[] arr=null; //initialize array
		
		//catch exceptions when size is smaller than zero
		try {
			size = kb.nextInt();
			arr = new int[size-1];	
		} catch(Exception a){
		
			System.out.println("invalid input, please re-enter"); //display message
			System.exit(0); //terminate the program
		}
		arr = new int[size];//re-initialize array when size is appropriate
		
		System.out.println(""); //print empty line
		for(int a=0;a<size;a++){
			arr[a] = (int)(Math.random()*101); //fill numbers into array
			}
		for(int a=0;a<size;a++){
			System.out.print(arr[a]+" "); //print out the array
			}
		//do the following when there is no exception
		try{
			System.out.println("enter the index: ");  //ask user to input an number
			int index=kb.nextInt(); //assign it to index
			int temp = arr[index];//put the number at the index position to a temporary variable
			for(int a=index;a<size-1;a++){ //shift the numbers on the right to left
				arr[a]=arr[a+1];
			}
			
			arr[size-1]=temp; //put the number back into the end of array
			
			
			
		}catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("invalid index"); //print out message when exception is caught
		}
		for(int a=0;a<size;a++){
			System.out.print(arr[a]+" "); //print out the new array
			}
	}
}
