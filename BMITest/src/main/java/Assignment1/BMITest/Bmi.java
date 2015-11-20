package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		Bmi b = new Bmi();
		b.printStart();
	
// 		System.out.print("weight (in pounds)? ");		
//		double weight = console.nextDouble();
//		System.out.println();		
//			
//		return bmiFor(weight, height);
	}
	
	public void printStart()
	{
		int height = 0;
		int weight = 0;
		System.out.println("height in cm: ");	
		input.nextLine();
		if (getInt(input)==0)
		{
			printError();
		}
		else
		{
			height = getInt(input);
		}
		System.out.println("weight in cm: ");
		if (getInt(input)==0)
		{
			printError();
		}
		else
		{
			weight = getInt(input);
		}
		
		System.out.println(calculateBmi(height,weight));
	}
	public void printError()
	{
		System.out.print("Wrong input!");
		printStart();
	}
	public int getInt(Scanner input)
	{
		if (isInteger(input.nextLine())==true)
		{
		int inp = input.nextInt();
		if (inp>0&&inp<250)
		{
			return inp;
		}
		else
		{
			return 0;
		}
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean isInteger(String str) 			
	{
	    if (str == null) 
	    {
	        return false;
	    }
	    int length = str.length();
	    if (length == 0) 
	    {
	        return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') 
	    {
	        if (length == 1) 
	        {
	            return false;
	        }
	        i = 1;
	    }
	    for (; i < length; i++) 
	    {
	        char c = str.charAt(i);
	        if (c < '0' || c > '9') 
	        {
	            return false;
	        }
	    }
	    return true;
	}
	
	public double calculateBmi(int height, int weight)
	{
		double heightInMeters = (double) height/100;
		return (weight/(heightInMeters*heightInMeters));
	}
}

