package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		Bmi b = new Bmi();
		b.printStartScreen();
	}
	public void printStartScreen()
	{
		int height = 0;
		int weight = 0;
		System.out.println("Height in cm: ");	
		String inp = input.nextLine();
		if (getInt(inp)==0)
		{
			printError();
		}
		else
		{
			height = getInt(inp);
			System.out.println("Weight in kg: ");
			inp = input.nextLine();
		}
		if (getInt(inp)==0)
		{
			printError();
		}
		else
		{
			
			weight = getInt(inp);
			double bmi = calculateBmi(height,weight);
			System.out.println("Your BMI is: "+bmi+" and is defined as "+defineBmi(bmi)+".");
		}	
	}
	
	public void printError()
	{
		System.out.println("Wrong input, you can only enter numbers between 0 and 250!");
		System.exit(0);
	}
	public int getInt(String input)
	{
		if (isInteger(input)==true)
		{
		int inp = Integer.parseInt(input);
		if (inp>0 && inp<250)
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
		double bmi = (weight/(heightInMeters*heightInMeters));
		bmi = bmi*10;
		bmi = Math.round(bmi);
		bmi = bmi /10;
		return bmi;
	}
	
	public String defineBmi(double bmi)
	{
		if (bmi>30)
		{
			return "Obese";
		}
		else if (bmi<=30&&bmi>25)
		{
			return "Overweight";
		}
		else if (bmi<=25&&bmi>19)
		{
			return "Normal";
		}
		else if (bmi<=19)
		{
			return "Underweigth";
		}
		else
		{
			return "";
		}
	}
}

