package Assignment1.BMITest;

import java.util.Scanner;

public class Bmi {
	Scanner input = new Scanner(System.in);
	private static IsIntegerIF inte;
	
	public static void main(String[] args) {
		Bmi b = new Bmi();
		inte = new IsInteger();
		b.printStartScreen();
	}

	public void setIsi(IsIntegerIF isI)
	{
		inte=isI;
	}
	
	public void printStartScreen() {
		int height = 0;
		int weight = 0;
		System.out.println("Height in cm: ");
		String inp = input.nextLine();
		if (getInt(inp) == 0) {
			printError();
		} else {
			height = getInt(inp);
			System.out.println("Weight in kg: ");
			inp = input.nextLine();
		}
		if (getInt(inp) == 0) {
			printError();
		} else {

			weight = getInt(inp);
			double bmi = calculateBmi(height, weight);
			System.out.println("Your BMI is: " + bmi + " and is defined as " + defineBmi(bmi) + ".");
		}
	}

	public void printError() {
		System.out.println("Wrong input, you can only enter numbers between 0 and 250!");
		System.exit(0);
	}

	public int getInt(String input) {
		if (inte.isInputInteger(input) == true) {
			int inp = Integer.parseInt(input);
			if (inp > 0 && inp < 250) {
				return inp;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public double calculateBmi(int height, int weight) {
		double heightInMeters = (double) height / 100;
		double bmi = (weight / (heightInMeters * heightInMeters));
		bmi = bmi * 10;
		bmi = Math.round(bmi);
		bmi = bmi / 10;
		return bmi;
	}

	public String defineBmi(double bmi) {
		if (bmi > 30) {
			return "Obese";
		} else if (bmi <= 30 && bmi > 25) {
			return "Overweight";
		} else if (bmi <= 25 && bmi > 19) {
			return "Normal";
		} else if (bmi <= 19) {
			return "Underweigth";
		} else {
			return "";
		}
	}
}