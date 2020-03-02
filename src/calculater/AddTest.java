package calculater;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		calculater test=new calculater();
		double output =test.add(5, 6);
		assertEquals(11,11,output);
	}

}
