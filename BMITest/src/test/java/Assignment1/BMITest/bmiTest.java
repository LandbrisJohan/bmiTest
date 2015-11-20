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
	public void getsPositiveInt(){
	//	testHelper = new Bmi();
	    Mockito.when(testHelper.getInt(null)).thenReturn(180);
	    assertEquals(180, testHelper.getInt(null));
	}
	
	@Test
	public void getRealisticInt()
	{
	    Mockito.when(testHelper.getInt(null)).thenReturn(0);
	    assertEquals(180, testHelper.getInt(null));
	}
	
	
}
