package curriculum.ictk.scripts;

import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginDownload;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDownload extends BaseClass {
LoginDownload log;
	
	@Test
	public void verifyDownload() throws IOException//TC 033
, InterruptedException


	{
		log=new LoginDownload(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.mycurriculumClick();
		Thread.sleep(2000);
		log.curriculumselectClick();
	    String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/curriculum-fetch/curriculum-view/650ede29c9e1655d52f75cd4";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}
