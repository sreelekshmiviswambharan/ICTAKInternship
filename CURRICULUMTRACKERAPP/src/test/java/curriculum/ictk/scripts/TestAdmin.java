package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.*;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAdmin extends BaseClass {
	
		
		LoginAdmin log;
			
			@Test
			public void verifyValidLogin() throws IOException//TC012
		, InterruptedException


			{
				log=new LoginAdmin(driver);
				String emailid=ExcelUtility.getCellData(12, 0);
				String password=ExcelUtility.getCellData(13, 0);
				log.setemailid(emailid);
				log.setpassword(password);
				log.SubmitClick();
				Thread.sleep(2000);
				String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
			    String Displayhome=driver.getCurrentUrl();
			    Assert.assertEquals(Displayhome,expectedtitle);
			}
			
			@Test
			public void verifyInValidLoginwithInvalidemail() throws IOException//TC013
		, InterruptedException


			{
				log=new LoginAdmin(driver);
				String emailid=ExcelUtility.getCellData(14, 0);
				String password=ExcelUtility.getCellData(13,0);
				log.setemailid(emailid);
				log.setpassword(password);
				log.SubmitClick();
				Thread.sleep(2000);
				String expectedtitle="http://143.244.139.123:3001/login";
			    String Displayhome=driver.getCurrentUrl();
			    Assert.assertEquals(Displayhome,expectedtitle);
			}
			
			@Test
			public void verifyInValidLoginwithInvalidpassword() throws IOException//TC014
		, InterruptedException


			{
				log=new LoginAdmin(driver);
				String emailid=ExcelUtility.getCellData(12, 0);
				String password=ExcelUtility.getCellData(15,0);
				log.setemailid(emailid);
				log.setpassword(password);
				log.SubmitClick();
				Thread.sleep(2000);
				String expectedtitle="http://143.244.139.123:3001/login";
			    String Displayhome=driver.getCurrentUrl();
			    Assert.assertEquals(Displayhome,expectedtitle);
			}
			
			@Test
			public void verifyInValidLoginwithInvalidpasswordandemail() throws IOException//TC015
		, InterruptedException


			{
				log=new LoginAdmin(driver);
				String emailid=ExcelUtility.getCellData(14, 0);
				String password=ExcelUtility.getCellData(15,0);
				log.setemailid(emailid);
				log.setpassword(password);
				log.SubmitClick();
				Thread.sleep(2000);
				String expectedtitle="http://143.244.139.123:3001/login";
			    String Displayhome=driver.getCurrentUrl();
			    Assert.assertEquals(Displayhome,expectedtitle);
			}
			
			@Test
			public void verifyInValidLoginwithemptypasswordandemail() throws IOException//TC016
		, InterruptedException


			{
				log=new LoginAdmin(driver);
				String emailid=ExcelUtility.getCellData(0, 0);
				String password=ExcelUtility.getCellData(0,0);
				log.setemailid(emailid);
				log.setpassword(password);
				log.SubmitClick();
				Thread.sleep(2000);
				String expectedtitle="http://143.244.139.123:3001/login";
			    String Displayhome=driver.getCurrentUrl();
			    Assert.assertEquals(Displayhome,expectedtitle);
			}
}
