package Com.TDD.Assignment_Item;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
public class ItemTests {


	@Test
	public void whenItemIdIsLessThanThree()
	{
	    Class<IllegalArgumentException> esp =IllegalArgumentException.class()->{
	    	Item item=new Item();
	    	item.setItemid(13);
	    });
	    assertEquals("itemid should have 3 digits at least", exception.getMessage());
	}	
}


