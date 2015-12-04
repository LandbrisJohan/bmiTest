package Assignment1.BMITest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class bmiTest {
	@Mock
	Bmi testHelper;

	@Mock
	IsIntegerIF isI;
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getsPositiveIntTest() {
		Mockito.when(testHelper.getInt(null)).thenReturn(180);
		assertEquals(180, testHelper.getInt(null));
	}

	@Test
	public void getRealisticIntTest() {
		Mockito.when(testHelper.getInt(null)).thenReturn(180);
		assertEquals(180, testHelper.getInt(null));
	}

	@Test
	public void calculateBmiTest() {
		Bmi calcHelper = new Bmi(); // Don't know why I needed to add a new Bmi.
									// EDIT. Probably because of Mocking!
		double test = 0;
		int height = 200;
		int weight = 100;
		test = calcHelper.calculateBmi(height, weight);
		assertEquals(25.0, test, 1); // Allowing up to 1.0 wrong.
	}

	@Test
	public void calculateBmiDifferentValuesTest() {
		Bmi calcHelper = new Bmi();
		double test = 0;
		int height = 190;
		int weight = 80;
		test = calcHelper.calculateBmi(height, weight);
		assertEquals(22.16, test, 1);
	}

	@Test
	public void isPersonObeseTest() {
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(31);
		assertEquals("Obese", test);
	}

	@Test
	public void isPersonOverweightTest() {
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(27);
		assertEquals("Overweight", test);
	}

	@Test
	public void isPersonNormalWeightTest() {
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(25);
		assertEquals("Normal", test);
	}

	@Test
	public void isPersonUnderWeightTest() {
		Bmi bmiHelper = new Bmi();
		String test = bmiHelper.defineBmi(19);
		assertEquals("Underweigth", test);
	}

	@Test
	public void displayStartScreenTest() {
		Mockito.doCallRealMethod().when(testHelper).printStartScreen();
		// Mockito.verify(testHelper.printStartScreen());
	}

	@Test
	public void bmiShouldReturnOnlyOneDecimalTest() {
		Bmi calcHelper = new Bmi();
		double test = 0;
		int height = 190;
		int weight = 80;
		test = calcHelper.calculateBmi(height, weight);
		String decValue = Double.toString(test);
		assertEquals("22.2", decValue);
	}
	
	@Test
	public void isInputIntegerMockTest() {
		String input = "100";
		Bmi test = new Bmi();
		test.setIsi(isI);
		Mockito.when(isI.isInputInteger(input)).thenReturn(true);
		int test2 = test.getInt(input);
		assertEquals(100, test2);
		Mockito.verify(isI).isInputInteger(input);
	}
	
	@Test
	public void isNotIntegerMockTest() {
		Bmi newHelper = new Bmi();
		newHelper.setIsi(isI);
		String input = "test";
		Mockito.when(isI.isInputInteger(input)).thenReturn(false);
		int test = newHelper.getInt(input);
		assertEquals(0, test);
		Mockito.verify(isI).isInputInteger(input);
	}
	
	@Test
	public void isIntegerToLargeMockTest() {
		Bmi newHelper = new Bmi();
		newHelper.setIsi(isI);
		String input = "500";
		Mockito.when(isI.isInputInteger(input)).thenReturn(true);
		int test = newHelper.getInt(input);
		assertEquals(0, test);
		Mockito.verify(isI).isInputInteger(input);
	}
	
	@Test
	public void isIntegerToSmallMockTest() {
		Bmi newHelper = new Bmi();
		newHelper.setIsi(isI);
		String input = "-1";
		Mockito.when(isI.isInputInteger(input)).thenReturn(true);
		int test = newHelper.getInt(input);
		assertEquals(0, test);
		Mockito.verify(isI).isInputInteger(input);
	}
	
	@Test
	public void isIntegerNullInputTest()
	{
		IsInteger test = new IsInteger();
		assertFalse(test.isInputInteger(null));
	}
	@Test
	public void isIntegerLength0InputTest()
	{
		IsInteger test = new IsInteger();
		assertFalse(test.isInputInteger(""));
	}
	
	@Test
	public void isIntegerPositiveTest()
	{
		IsInteger test = new IsInteger();
		assertFalse(test.isInputInteger("-1"));
	}
	
	@Test
	public void doesWholeStringConsistOfIntegersTest()
	{
		IsInteger test = new IsInteger();
		assertFalse(test.isInputInteger("test"));
	}

}