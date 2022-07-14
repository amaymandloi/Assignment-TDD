package Com.TDD_Assignments_String_Of_Array;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringArray_Tests {

	@Test
	public void test1() {
		
		StringArray arrayclass = new StringArray();
		
		String [] str = {"apple","orange","banana","lemon"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void test2() {
		
		StringArray arrayclass = new StringArray();
		
		String [] str = {"APPLE","ORANGE","BANANA","LEMON"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
}

