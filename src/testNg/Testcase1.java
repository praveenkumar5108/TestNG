package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {
	
	
	@Test(/*enabled=false*/priority = 1, description="test case is for homeloan functionality")
	public void HomeLoanTest() {
		System.out.println("inside homeloan");
	}
	@Test(priority = 0)
	public void HomeLoanTest1() {
		System.out.println("inside homeloan1");
	}
	
	
	@Test(priority = 0, groups = {"sanity"})
	public void CarLoanTest() {
		System.out.println("inside carloan");
	}
	

}
