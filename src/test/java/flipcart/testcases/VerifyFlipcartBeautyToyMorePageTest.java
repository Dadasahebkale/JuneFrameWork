package flipcart.testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import flipcart.testbase.TestBase;

public class VerifyFlipcartBeautyToyMorePageTest extends TestBase{
	@BeforeClass
	public void isSkip() {

		testCaseName = this.getClass().getSimpleName();
		
		 // System.out.println("testCaseName is :-" +testCaseName);
		  
		  if(run_mode.get(testCaseName).equalsIgnoreCase("Y")) {
		  System.out.println("Executing Test Case:- " +testCaseName); 
		  }
		  else throw new SkipException("Skipping Test case "+testCaseName+" as it's run mode is set to No");
		 
	}
	@Test
	public void VerifyFlipcartBeautyToyMorePage() {
		fp.BeautyToyMorePage();
		
	}
	


}
