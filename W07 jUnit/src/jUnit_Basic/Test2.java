package jUnit_Basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void Test2() {
		Main test = new Main();
		int output = test.cookie_pan(3);
			
		int browniepananswer = 18;
			
		assertEquals(browniepananswer, output);
		
	}

}
