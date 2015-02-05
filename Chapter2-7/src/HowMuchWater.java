


	/**
	 * @param Assignment #1
	 * Author: Likun Ma
	 * Date: 2/3/2015
	 * Email: ml20130@email.vccs.edu
	 * P132-7 
	 */
	import java.util.Scanner;
public class HowMuchWater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;//in foot
		double depth;//in foot
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the radius of the well casing in inch ");
		radius = keyboard.nextDouble();//>=3 inches
		System.out.println("Convert inch to feet " + radius / (12));
		System.out.println("Enter the depth of the well in feet ");
		depth = keyboard.nextDouble();//> 170 feet
		double volume = 3.14159 * radius / (12) * radius / (12) * depth;
		System.out.println("The volume of a cylinder is " + (3.14159) * radius / (12) * radius / (12) * depth);
		System.out.println("Convert cubic foot to gallons " + volume * 7.48);//1 cubic foot = 7.48 gallons of water
		System.out.println("The number of gallons stored in the well casing is " + volume * 7.48 + " gallons of water");
				
		
		
		
		
		
		

	}

}
