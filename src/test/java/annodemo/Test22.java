package annodemo;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Test22 {
	@Test
	public void xyz() {
		System.out.println("Class test22");
	}
	@AfterTest
	public void zxc() {
		System.out.println("After MEthod");
	}
	

}
