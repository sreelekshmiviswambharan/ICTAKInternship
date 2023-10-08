package curriculum.ictk.scripts;
import curriculum.ictk.base.BaseClass;

import curriculum.ictk.pages.LoginFacultyEdit;
import curriculum.ictk.utility.ExcelUtility;

import java.io.IOException;
 
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestFacultyEdit extends BaseClass {
LoginFacultyEdit log;
	
	@Test
	public void verifyValidLogin() throws IOException//TC 037
, InterruptedException


	{
		log=new LoginFacultyEdit(driver);
		String emailid=ExcelUtility.getCellData(8, 0);
		String password=ExcelUtility.getCellData(9, 0);
		log.setemailid(emailid);
		log.setpassword(password);
		log.submitClick();
		Thread.sleep(2000);
		log.okClick();
		log.mycurriculumClick();
		Thread.sleep(2000);
		log.curriculumClick();
		Thread.sleep(2000);
		log.editClick();
		String expectedtitle="http://143.244.139.123:3001/faculty-dashboard/curriculum-fetch/curriculum-view/650ede29c9e1655d52f75cd4";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
}
