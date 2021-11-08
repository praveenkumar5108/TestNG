package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	@BeforeGroups("sanity")
	public void BeforeCls() {
		System.out.println("This method will be executed before the execution of Sanity group");
	}

	@BeforeTest(alwaysRun = true)
	public void BeforeTestMethod() {
		System.out.println("inside before test method");
	}
	@BeforeClass(alwaysRun=true)
	public void BeforeClassM() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod(alwaysRun = true)  //it will execute always
	public void setup() {
		System.out.println("inside before method");
		
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("inside after method");

		
	}
	@AfterClass
	public void AfterClassM() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("inside after test method");
	}
}
