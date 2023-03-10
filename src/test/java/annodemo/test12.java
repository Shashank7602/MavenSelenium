package annodemo;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class test12 {
	@Test
	public void abc() {
		System.out.println("Test 12");
	}
	@BeforeTest
	void m() {
		System.out.println("Before Class");
	}
}
