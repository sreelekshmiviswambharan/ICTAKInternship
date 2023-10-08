package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginFacultyDashboard;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestFacultyDashboard extends BaseClass {
LoginFacultyDashboard log;
	
	@Test
	public void verifyFacultyDashboard() throws IOException//TC 032
, InterruptedException


	{
		log=new LoginFacultyDashboard(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.dashboardClick();
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/Rformfaculty";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}

