package TDD_Assignmen_Special_Character;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpecialTests {
	@Test
	public void test1() 
	{
		
		SpecialCharacter stringclass = new SpecialCharacter();
	   String  str = "This @ Red $car-";
	   String expected = "This Red car";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}
	
	
	@Test
	public void test2() 
	{
		
		SpecialCharacter stringclass = new SpecialCharacter();
	   String  str = "This@# 6454 is My** Home%";
	   String expected = "This is My Home";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}

}


