package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi 
{
	public int getInt(Scanner input)
	{
		int inp = input.nextInt();
		if (inp>0||inp<250)
		{
			return inp;
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
}
