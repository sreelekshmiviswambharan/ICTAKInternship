package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;
import curriculum.ictk.pages.LoginAdminDelete;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAdminDelete extends BaseClass {
	LoginAdminDelete log;
	
	@Test
	public void verifyAdminDelete() throws IOException//TC 026
, InterruptedException


	{
		log=new LoginAdminDelete(driver);
		String emailid=ExcelUtility.getCellData(12, 0);
		String password=ExcelUtility.getCellData(13,0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		Thread.sleep(2000);
		log.allcurriculumClick();
		Thread.sleep(2000);
		log.deleteClick();
		String expectedtitle="http://143.244.139.123:3001/dashboard/curriculum-list";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}

	


