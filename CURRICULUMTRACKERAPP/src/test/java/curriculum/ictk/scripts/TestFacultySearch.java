package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginFacultySearch;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestFacultySearch extends BaseClass {
LoginFacultySearch log;
	
	@Test
	public void verifyFacultySearchAreaofTraining() throws IOException//TC 034
, InterruptedException


	{
		log=new LoginFacultySearch(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(17, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/Rformfaculty";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	@Test
	public void verifyFacultySearchInstitution() throws IOException//TC 035
, InterruptedException


	{
		log=new LoginFacultySearch(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(18, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/Rformfaculty";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	@Test
	public void verifyCategoryofRequirement() throws IOException//TC 036
, InterruptedException


	{
		log=new LoginFacultySearch(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(19, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/Rformfaculty";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}

