
/* For this program, it records the number of minutes, 
   counts, distance of each trip.
   It also records the distance of two combined trips.
   It will print out the results of all necessary calculations.
   Erli Qiu
   9.3 2015
   CSE002-311
 */
public class Cyclometer {
    public static void main(String[] args){
      int secsTrip1 = 480; //  initiate a value of total time traveled in seconds for trip1 
      int secsTrip2 = 3220;// initiate a value of total time traveled in seconds for trip2
      int countsTrip1 = 1561;// initiate a number of total counts  for trip1 
      int countsTrip2 = 9037;// initiate a number of total counts  for trip2
      
      double wheelDiameter = 27.0; // initiate the diameter of the wheel
      double PI= 3.14159; // set pi to a certain number
      double feetPerMile = 5280; //initiate the value of how many feet in one mile
      double inchesPerFoot =12; // initiate the value of how many inches in one foot
      double secondsPerMinute=60; // initiate the value of how many seconds in one minute
      double distanceTrip1,distanceTrip2,totalDistance; // initiate  variables for distance of trip1,trip2,and total distance 
     
      System.out.println("Trip 1 took "+ secsTrip1/secondsPerMinute + " minutes and had "+ countsTrip1+ " counts."); // print out the calculation
      System.out.println("Trip 2 took "+ secsTrip2/secondsPerMinute + " minutes and had "+ countsTrip2+ " counts.");
      
      distanceTrip1=countsTrip1*wheelDiameter*PI; 
    		// Above gives distance in inches
    		//(for each count, a rotation of the wheel travels
    		//the diameter in inches times PI)
      distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles for trip1
      distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Converts to distance in miles for trip2
      totalDistance=distanceTrip1+distanceTrip2; // add the distance of two trips together
      System.out.println("Trip 1 was "+distanceTrip1+" miles"); // print out the calculation.
      System.out.println("Trip 2 was "+distanceTrip2+" miles");
      System.out.println("The total distance was "+totalDistance+" miles");
      
      
    }
}