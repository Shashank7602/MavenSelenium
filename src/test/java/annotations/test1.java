package annotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@BeforeMethod
	void Login() {
		System.out.println("Login...");
		
	}
	@Test(priority = 1)
	void Search() {
		System.out.println("Search...");
	}
	@AfterMethod
	void Logout() {
		System.out.println("Logout...");
	}
	
	@Test(priority = 2)
	void Logim() {
		System.out.println("Search...");
	}
	@Test(priority = 3)
	void AdvanceSearch() {
		System.out.println("ADvance Search...");
	}

}
