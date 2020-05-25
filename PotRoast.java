/**
Author:George Samu
Date:5/24/2020
Purpose: This program will calculate
the energy needed to heat a pot roast from
an initial temperature to 160 degrees fahrenheit
*/
import java.util.Scanner;

public class PotRoast
{
	public static void main (String[]args)
	{
	
	final double Tfinal=160;
	
	System.out.print("Calculate the energy needed to heat ");
	System.out.print("a pot roast from ");
	System.out.print("an initial temperature to 160 degrees fahrenheit.");
	
	System.out.println();
	
	//create a scanner to get input data
	Scanner keyboard=new Scanner(System.in);
	//PotRoastWeight is in kilograms
	System.out.println("What is the weight of the pot roast");
	double PotRoastWeight=keyboard.nextDouble();
	
	//Get inital temperature in fahrenheit is Tstart
	System.out.println("What is inital temperature in Fahrenheit: ");
	double Tstart = keyboard.nextDouble();
	
	//using Tstart information and converting to Celsius
	//converting Tfinal to Celsius
	double CelsiusTstart= 5*(Tstart-32)/9;
	double CelsiusTfinal=5*(Tfinal-32)/9;
	
	double Q=PotRoastWeight * (CelsiusTfinal - CelsiusTstart) * 4184;
	
	System.out.println("Tfinal is: " + CelsiusTfinal + " Tstart is: " +CelsiusTstart);
	System.out.println("The energy needed to heat a pot roast is (Q): "+ Q + " joules");
	
	
	
	}//end main
}//end PotRoast