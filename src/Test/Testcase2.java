package Test;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass{


	@Test(groups = {"sanity"}, dependsOnMethods = "CCTest")
	public void CreditcardTest() {
		System.out.println("inside creditcard");
	}
	
	@Test(groups = {"sanity"})
	public void CCTest() {
		System.out.println("inside creditcard1");
	}

	
}
