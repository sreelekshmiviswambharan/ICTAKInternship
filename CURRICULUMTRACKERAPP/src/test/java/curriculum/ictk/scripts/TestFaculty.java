package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginFaculty;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestFaculty extends BaseClass {
LoginFaculty log;
	
	@Test
	public void verifyValidLogin() throws IOException//scenario 7
, InterruptedException


	{
		log=new LoginFaculty(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/Rformfaculty";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void VerifyInvalidLoginwithInvalidemail() throws IOException//scenario 8
, InterruptedException


	{
		log=new LoginFaculty(driver);
		String emailid=ExcelUtility.getCellData(10, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String expectedtitle="http://143.244.139.123:3001/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void VerifyInvalidLoginwithInvalidpassword() throws IOException//scenario 9
, InterruptedException


	{
		log=new LoginFaculty(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(11, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String expectedtitle="http://143.244.139.123:3001/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void VerifyInvalidLoginwithInvalidpasswordandInvalidemail() throws IOException//scenario 10
, InterruptedException


	{
		log=new LoginFaculty(driver);
		String emailid=ExcelUtility.getCellData(10, 0);
		String password=ExcelUtility.getCellData(11, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String expectedtitle="http://143.244.139.123:3001/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void VerifyInvalidLoginwithemptypasswordanddemail() throws IOException//scenario 11
, InterruptedException


	{
		log=new LoginFaculty(driver);
		String emailid=ExcelUtility.getCellData(0, 0);
		String password=ExcelUtility.getCellData(0, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String expectedtitle="http://143.244.139.123:3001/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}
