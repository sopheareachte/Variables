/*
 * Sopheareach Te
 * Feb 03, 2025
 * Staircase.java
 * Prompt user for number of steps in the staircase, 
 * width, rise, and run of a step in centimeters
 * calculate number of cubic centimeters of concrete necessary to build 
 * the staircase, and display the result rounded up to the nearest integer.
 * 
 */

import java.util.Scanner;

public class Staircase {
	
	public static void main (String[] args) {
		//Print program name
		System.out.println("Staircase Volume Calculator");
		
		//Get user input for steps in the staircase
		Scanner input = new Scanner(System.in);
        System.out.print("How many steps in the staircase? ");
        int step = input.nextInt();

		//Get user input for the step width in cm
        System.out.print("Enter step width in cm: ");
        double width = input.nextDouble();
        
        //Get user input for the step rise in cm
        System.out.print("Enter rise of the step in cm: ");
        double rise = input.nextDouble();
        
        //Get user input for the step run in cm
        System.out.print("Enter run of the step in cm: ");
        double run = input.nextDouble();
        
        //Calculate the volume of concrete necessary to build a staircase
        int block = (step * (step + 1)) / 2;
        double volume = block * width * rise * run;
        int volumeRounded = (int) (Math.ceil(volume));
        
        //Print the volume of concrete necessary to build a staircase
        System.out.printf("Total volume is %,d cubic centimeters.", 
							volumeRounded);
        
        input.close();
        
	}
}

