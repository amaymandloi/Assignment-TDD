package Com.TDD_Assignment_HCF;

import static org.junit.Assert.*;

import org.junit.Test;

public class HCFTests {


	@Test
	public void test() 
	{
		HCF main = new HCF();
		int num1 = 36;
		int num2 = 60;
		
		int expected = 12;
		
		int actual = main.ffindHCF(num1, num2);
		assertEquals(expected,actual);
	}
	
	
}
