/* This program has method calculating circle,rectangle,and trapezoid
 * Erli Qiu
 * Prof.Fauh
 * CSE002-310
 */
import java.util.Scanner;

public class areas {  
	public static double area(int a){ //method that has one parameter
		return a*a*Math.PI; //calculate area of circle
	}
	public static double area(int a,int b){ //method that has 2 parameter
		return a*b;//calculate area of rectangle
	}
	public static double area(int a,int b,int c){//method that has 3 parameter
		return (a+b)*c*0.5; //calculate area of trapezoid
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);  //create a scanner
		while(true){ //keep looping until the user exits the program
		System.out.println("enter a shape,  either circle, rectangle, or trapezoid, type exit to exit the program");//ask to enter a shape
		String str = kb.next(); //assign it to str
	
		if(str.equals("circle")){ //if the sring entered is circle, do the following code
			System.out.println("enter a radius"); //ask to enter a radius
			int radius = kb.nextInt(); //assign it to radius
			area(radius); //use the 1st method 
			System.out.println("the area is "+ area(radius)); //print out result
		}
		
		if(str.equals("rectangle")){//if the sring entered is rectangle, do the following code
			System.out.println("enter width and length");//ask to enter width and length
			int width = kb.nextInt(); //assign to width
			int length = kb.nextInt();//assign to length
			area(width,length); //use the 2nd method
			System.out.println("the area is "+ area(width,length)); //print out result
		}
		
		if(str.equals("trapezoid")){//if the sring entered is trapezoid, do the following code
			System.out.println("enter two bases and height"); //ask to enter 2 bases and height
			int base1 = kb.nextInt(); //assign to base 1 
			int base2 = kb.nextInt();//assign to base 2
			int height = kb.nextInt(); //assign to height
			area(base1,base2,height); //use the 3rd method
			System.out.println("the area is "+ area(base1,base2,height)); //print out result
		}
		if(str.equals("exit")){ //if user enter exit,do following
			System.exit(0); //terminate the program
		}
	  }		
	}
}
