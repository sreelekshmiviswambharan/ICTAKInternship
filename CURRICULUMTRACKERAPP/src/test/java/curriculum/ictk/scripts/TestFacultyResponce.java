package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginFacultyResponce;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestFacultyResponce extends BaseClass {
LoginFacultyResponce log;
	
	@Test
	public void verifyFacultyResponce() throws IOException//TC 031
, InterruptedException


	{
		log=new LoginFacultyResponce(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.requirementClick();
		Thread.sleep(2000);
		log.detailsClick();
		Thread.sleep(2000);
		String serialno=ExcelUtility.getCellData(21, 0);
		String description=ExcelUtility.getCellData(22,0 );
		log.setserialno(serialno);
		log.setdescription(description);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}


