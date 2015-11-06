/*
 * This program will create three arrays
 * the 1st one is filled with 20 random integers from 0 to 100
 * the 2nd one is filled with 10 random integers from 0 to 100
 * the third one is filled with elements from array1 and array2
 * all arrays will be sorted
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
public class sort {
	public static void srt(int array[]) { //bubble sort
        int n = array.length; //assign the size of array to n
        int k; //initialize a variable
        for (int m = n; m >= 0; m--) { //loop
            for (int i = 0; i < n - 1; i++) { //loop
                k = i + 1; 
                if (array[i] > array[k]) { //compare two adjacent numbers in array
                    swapNumbers(i, k, array); //if the left one is greater, swap it
                }
            }
         
        }
    }
	
	private static void swapNumbers(int i, int j, int[] array) {
		  
        int temp; //initialize a variable for temporarily storage
        temp = array[i];// store numbers at position i in temp
        array[i] = array[j]; //replace number at position i with number at position j
        array[j] = temp; //replace number at position j with number that is previously stored in temp 
    }


	public static void main(String[] args){
		int[] ary = new int[20]; //initialize array
		int[] ary2=new int[10];//initialize array
		int[] ary3=new int[30];//initialize array
		for(int a=0;a<20;a++){
			ary[a]=(int) (Math.random()*101); //add 20 random integers from 0 to 100 to array1
		}
		srt(ary);//sort it by calling the method
		for(int a=0;a<10;a++){
			ary2[a]=(int) (Math.random()*101);//add 10 random integers from 0 to 100 to array2
		}
		srt(ary2);//sort it by calling the method
		for(int a=0;a<30;a++){
			if(a<20){
				ary3[a]=ary[a]; //add first 20 numbers from array1 to array3
			}
			else 
				ary3[a]=ary2[a-20];//add last 10 numbers from array2 to array3
		}
		
		srt(ary3); //sort it by calling the method
		for(int a=0;a<30;a++){
			System.out.println(ary3[a]); //print out each number from array3
		}
	}
}
