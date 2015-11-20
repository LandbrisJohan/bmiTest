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
	public void isInputIntegerTest()
	{
		String test = "100";
		boolean bol = testHelper.isInteger(test);
		assertTrue(bol);
	}
	
	
	@Test
	public void calculateBmiTest()
	{
		int height = 200;
		int weight = 100;
		int test = testHelper.calculateBmi(height, weight);
		assertTrue(25, test);
	}

	
}
