package com.example;
import com.example.Greeter;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {

	@Test
	public void itGreetsUserWithHelloMessage(){
		Greeter greeter = new Greeter();
		String name = "John";
		String expectedMessage = "Hello, " + name;
		String actualMessage = greeter.greet("John");
		assertEquals(expectedMessage, actualMessage);
	}


}
