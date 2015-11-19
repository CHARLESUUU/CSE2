
/*
 * This prgram will use non-static method to calculate the area of the object I create
 * Erli Qiu
 * Prof.Fouh
 * CSE002-310
 */
 
public class Rectangle {
	double width; //create field
	double height;//create field
	
	public void setWidth(double a){ //non-static method
		width = a; //assign the argument to the field width
	}
	public void setHeight(double b){//non-static method
		height = b;//assign the argument to the field height
	}
	public double getArea(){//non-static method
		return width* height;//return the product of heigh and width
	}
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(); //create an object retangle
		r1.setWidth(5.3); //call method setwidth
		r1.setHeight(7.3);//call method setheight
		System.out.println(r1.getArea()); //call the getarea method and print it
	}
}
