package Assignment1.BMITest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class bmiTest 
{
	@Mock
	Bmi testHelper;
	
	@Before
	public void initMocks()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getsPositiveIntTest(){
	    Mockito.when(testHelper.getInt(null)).thenReturn(180);
	    assertEquals(180, testHelper.getInt(null));
	}
	
	@Test
	public void getRealisticIntTest()
	{
	    Mockito.when(testHelper.getInt(null)).thenReturn(180);		
	    assertEquals(180, testHelper.getInt(null));
	}
	
	@Test
	public void getRealisticIntRevisitedTest()
	{
		Bmi newHelper = new Bmi();
		String input = "200";
		int test = newHelper.getInt(input);
		assertEquals(200, test);
	}
	@Test
	public void returns0IfNotRealisticIntTest()
	{
		Bmi newHelper = new Bmi();
		int test = newHelper.getInt("0");
		assertEquals(0, test);
	}
	
	@Test
	public void isInputIntegerTest()
	{
		String test = "100";
		boolean bol = testHelper.isInteger(test);
		assertTrue(bol);
	}
	
	
	@Test
	public void calculateBmiTest()
	{
		Bmi calcHelper = new Bmi();					//Don't know why I needed to add a new Bmi. EDIT. Probably because of Mocking!
		double test = 0;
		int height = 200;
		int weight = 100;
		test = calcHelper.calculateBmi(height, weight);
		assertEquals(25.0, test, 1);				//Allowing up to 1.0 wrong.
	}

	@Test
	public void calculateBmiDifferentValuesTest()
	{
		Bmi calcHelper = new Bmi();
		double test = 0;
		int height = 190;
		int weight = 80;
		test = calcHelper.calculateBmi(height, weight);
		assertEquals(22.16, test, 1);				
	}
	
	@Test
	public void isPersonObeseTest()
	{
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(31);	
		assertEquals("Obese", test);
	}
	
	@Test
	public void isPersonOverweightTest()
	{
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(27);	
		assertEquals("Overweight", test);
	}
	
	@Test
	public void isPersonNormalWeightTest()
	{
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(25);	
		assertEquals("Normal", test);
	}
	
	@Test
	public void isPersonUnderWeightTest()
	{
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(19);	
		assertEquals("Underweigth", test);
	}
	@Test
	public void displayStartScreenTest()
	{
		Mockito.doCallRealMethod().when(testHelper).printStartScreen();
		//Mockito.verify(testHelper.printStartScreen());
	}
	@Test
	public void bmiShouldReturnOnlyOneDecimalTest()
	{
		Bmi calcHelper = new Bmi();
		double test = 0;
		int height = 190;
		int weight = 80;
		test = calcHelper.calculateBmi(height, weight);
		String decValue = Double.toString(test);
		assertEquals("22.2", decValue);	
	}
}
