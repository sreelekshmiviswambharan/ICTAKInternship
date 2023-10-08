package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.*;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestSignupFaculty extends BaseClass {

	SignupFaculty log;
		
		@Test
		public void verifyValidLogin() throws IOException //TC001
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(1, 0);
			String emailid=ExcelUtility.getCellData(2, 0);
			String phone=ExcelUtility.getCellData(3, 0);
			String password=ExcelUtility.getCellData(4, 0);
			String confirmpassword=ExcelUtility.getCellData(5, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/login";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void VerifyInvalidLoginWithInvalidName() throws IOException //TC002
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(0, 0);
			String emailid=ExcelUtility.getCellData(2, 0);
			String phone=ExcelUtility.getCellData(3, 0);
			String password=ExcelUtility.getCellData(4, 0);
			String confirmpassword=ExcelUtility.getCellData(4, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/signup";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void VerifyInvalidLoginWithInvalidemail() throws IOException //TC003
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(1, 0);
			String emailid=ExcelUtility.getCellData(5, 0);
			String phone=ExcelUtility.getCellData(3, 0);
			String password=ExcelUtility.getCellData(4, 0);
			String confirmpassword=ExcelUtility.getCellData(4, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/signup";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void VerifyInvalidLoginWithInvalidphone() throws IOException //TC004
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(1, 0);
			String emailid=ExcelUtility.getCellData(2, 0);
			String phone=ExcelUtility.getCellData(6, 0);
			String password=ExcelUtility.getCellData(4, 0);
			String confirmpassword=ExcelUtility.getCellData(4, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/signup";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void VerifyInvalidLoginWithInvalidpassword() throws IOException //TC005
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(1, 0);
			String emailid=ExcelUtility.getCellData(2, 0);
			String phone=ExcelUtility.getCellData(3, 0);
			String password=ExcelUtility.getCellData(4, 0);
			String confirmpassword=ExcelUtility.getCellData(7, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/signup";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void VerifyInvalidEmptyfields() throws IOException //TC006
	, InterruptedException


		{
			log=new SignupFaculty(driver);
			log.createnewClick();
			Thread.sleep(2000);
			String name=ExcelUtility.getCellData(0, 0);
			String emailid=ExcelUtility.getCellData(0, 0);
			String phone=ExcelUtility.getCellData(0, 0);
			String password=ExcelUtility.getCellData(0, 0);
			String confirmpassword=ExcelUtility.getCellData(0, 0);
			log.setname(name);
			log.setemailid(emailid);
			log.setphone(phone);
			log.setpassword(password);
			log.confirmsetpassword(confirmpassword);
			Thread.sleep(2000);
			log.signupClick();
			String expectedtitle="http://143.244.139.123:3001/signup";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
}
