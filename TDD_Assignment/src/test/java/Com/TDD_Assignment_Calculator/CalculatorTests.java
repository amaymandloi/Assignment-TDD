package Com.TDD_Assignment_Calculator;

import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTests {

	@Test 
	void testAdd() { 
		Calculator calculator = new Calculator(); 
	int expected;
	 
	  assertEquals(22, calculator.add(12, 10));
	  
	  }

	@Test 
	void testDivide1() {
		Calculator calculator = new Calculator(); 
	int expected;
	 
	  assertEquals(1, calculator.divide(12, 10));
	  
	  }

	@Test 
	void testSubstract() { 
		Calculator calculator = new Calculator(); 
	int expected;
	 
	  assertEquals(2, calculator.substract(12, 10));
	  
	  }

	@Test 
	void testMultiply1() {
		
		Calculator calculator = new Calculator(); 
	int expected;
	 
	  assertEquals(0, calculator.multiply(12, 0));
	  
	  }
	@Test 
	void testMultiply2() { 
	Calculator calculator = new Calculator(); 
	int expected;
	 
	  assertEquals(0, calculator.multiply(0, 12));
	  
	  }

	@Test 
	void testMultiply() {
		Calculator calculator = new Calculator(); 
	int expected;
    assertEquals(120, calculator.multiply(12, 10));
	  
	  }

		
		  @Test 
		  void testDivide() {
			  Calculator calculator = new Calculator(); 
			  int expected;
		  
		  assertEquals(1, calculator.divide(12, 10));
		 
		  }
		 
    
	     
	
}

