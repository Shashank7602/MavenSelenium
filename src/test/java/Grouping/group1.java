package Grouping;

import org.testng.annotations.Test;


public class group1 {
	@Test (priority = 1, groups = {"sanity","regression"})
	void loginbyEmail() {
		System.out.println("Login by Email");
	}
	@Test(priority = 2, groups = {"sanity","regression"})
	void loginbyFacebook() {
		System.out.println("Login By Facebook");
	}
	
	@Test(priority = 3, groups = {"sanity"})
	void loginbyTwitter() {
		System.out.println("Login By Twitter");
	}	
	
	@Test(priority = 4, groups = {"sanity"})
	void loginbyInsatgram() {
		System.out.println("Login By Instagram");
	}	
		
	}


