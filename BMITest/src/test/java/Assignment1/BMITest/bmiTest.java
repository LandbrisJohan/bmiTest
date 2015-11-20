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
	//	testHelper = new Bmi();
	    Mockito.when(testHelper.getInt(null)).thenReturn(180);
	    assertEquals(180, testHelper.getInt(null));
	}
	
	@Test
	public void getRealisticIntTest()
	{
	    Mockito.when(testHelper.getInt(null)).thenReturn(180);
//	    Mockito.when(testHelper.isInteger("180")).thenReturn(true);			
	    assertEquals(180, testHelper.getInt(null));
	}
	
	@Test
	public void getRealisticIntRevisitedTest()
	{
		String input = "200";
		int test = testHelper.getInt(input);
		assertEquals(200, test);
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
		Bmi calcHelper = new Bmi();					//Don't know why I needed to add a new Bmi...
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
	
}
