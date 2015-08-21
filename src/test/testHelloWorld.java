package test;

import main.HelloWorld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testHelloWorld {
	
	HelloWorld helloWorld = new HelloWorld();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHelloWorldPrinted() {
		Assert.assertTrue(helloWorld.printHelloWorld());
	}

}
