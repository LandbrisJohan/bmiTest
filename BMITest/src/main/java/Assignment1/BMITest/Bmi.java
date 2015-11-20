package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi 
{
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
		return (weight/(heightInMeters*heightInMeters));
	}
	
	public String defineBmi(double bmi)
	{
		if (bmi>30)
		{
			return "Obese";
		}
		else
		{
			return "";
		}
	}
}

