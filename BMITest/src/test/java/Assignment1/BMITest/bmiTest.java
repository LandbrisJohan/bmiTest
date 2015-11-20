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
	public void getsPositiveHeigthInt() throws Exception {
		testHelper = new Bmi();
	    Mockito.when(testHelper.getDouble()).thenReturn((double) -1);

	    assertEquals(1, -1);
	}
}
