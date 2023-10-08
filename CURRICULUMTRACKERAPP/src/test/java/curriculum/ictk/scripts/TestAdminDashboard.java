package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.LoginAdminDashboard;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAdminDashboard extends BaseClass {
LoginAdminDashboard log;
	
	@Test
	public void verifyAdminDashboard() throws IOException//TC 025
, InterruptedException


	{
		log=new LoginAdminDashboard(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13,0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		Thread.sleep(2000);
        log.requirementformClick();
        Thread.sleep(2000);
        String search=ExcelUtility.getCellData(16, 0);
        log.setsearch(search);
		String expectedtitle="http://143.244.139.123:3001/dashboard/requirement-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}

	

