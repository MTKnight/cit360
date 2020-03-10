package jUnit_Basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void Test1() {
		Main test = new Main();
		int output = test.brownie_pan(3);
			
		int browniepananswer = 9;
			
		assertEquals(browniepananswer, output);
		
	}

}
