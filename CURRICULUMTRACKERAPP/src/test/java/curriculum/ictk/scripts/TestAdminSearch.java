package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.*;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAdminSearch extends BaseClass {
	LoginAdminSearch log;
	
	@Test
	public void AdminSearchAreaoftraining() throws IOException//TC027
, InterruptedException


	{
		log=new LoginAdminSearch(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(17, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	@Test
	public void AdminSearchInstitution() throws IOException//TC028
, InterruptedException


	{
		log=new LoginAdminSearch(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(18, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
	@Test
	public void AdminSearchCategoryofRequirement() throws IOException//TC029
, InterruptedException


	{
		log=new LoginAdminSearch(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		String search=ExcelUtility.getCellData(19, 0);
		log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}
