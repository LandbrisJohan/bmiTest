package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi 
{
	public int getInt(Scanner input)
	{
		int inp = input.nextInt();
		if (inp>0)
		{
			return inp;
		}
		else
		{
			return 0;
		}

	}
	
}
