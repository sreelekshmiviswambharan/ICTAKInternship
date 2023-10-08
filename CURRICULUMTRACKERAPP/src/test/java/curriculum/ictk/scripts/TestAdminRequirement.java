package curriculum.ictk.scripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.LoginAdminRequirement;
import curriculum.ictk.utility.ExcelUtility;

public class TestAdminRequirement extends BaseClass {
LoginAdminRequirement log;
	
	@Test
	public void verifyValidLogin() throws IOException//TC017
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptyrequirement() throws IOException//TC018
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(0, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptyarea() throws IOException//TC019
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(0, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptyinstitution() throws IOException//TC020
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(0, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptycategory() throws IOException//TC021
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(0, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptyhours() throws IOException//TC022
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(0, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptychoosefiles() throws IOException//TC023
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(16, 0);
		String area=ExcelUtility.getCellData(17, 0);
		String institution=ExcelUtility.getCellData(18, 0);
		String category=ExcelUtility.getCellData(19, 0);
		String hours=ExcelUtility.getCellData(20, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	
	@Test
	public void verifyInValidLoginwithemptyfields() throws IOException//TC024
, InterruptedException


	{
		log=new LoginAdminRequirement(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.requirementformClick();
		Thread.sleep(2000);
		log.createformClick();
		Thread.sleep(2000);
		String requirementname=ExcelUtility.getCellData(0, 0);
		String area=ExcelUtility.getCellData(0, 0);
		String institution=ExcelUtility.getCellData(0, 0);
		String category=ExcelUtility.getCellData(0, 0);
		String hours=ExcelUtility.getCellData(0, 0);
		log.setrequirementname(requirementname);
		log.setarea(area);
		log.setinstitution(institution);
		log.setcategory(category);
		log.sethours(hours);
		log.submit1Click();
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list/rform";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}


 