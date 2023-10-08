package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginAdminDelete {
	WebDriver driver;
    private WebElement emailid;
    private WebElement password;
    private WebElement submit;
    private WebElement ok;
    private WebElement allcurriculum;
    private WebElement delete;
    public LoginAdminDelete(WebDriver driver)
	
    {
   	 this.driver=driver;
    }
    
    public void setemailid(String setemail)
    {
   	 emailid=driver.findElement(By.id("exampleInputEmail1"));
   	 emailid.sendKeys(setemail);
    }
    
    public void setpassword(String setpass)
    {
   	 password=driver.findElement(By.id("exampleInputPassword1"));
   	 password.sendKeys(setpass);
   	 
    }
    public void submitClick()
    {
   	 submit=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")); 
   	 submit.click();
    }
    public void okClick()
    {
   	 ok=driver.findElement(By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]"));
   	 ok.click();
    }
    public void  allcurriculumClick()
    {
     allcurriculum=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[1]/div/ul/li[2]/a/span"));
     allcurriculum.click();
    }
    public void  deleteClick()
    {
    delete=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-curriculum-list/div/div/div/div[1]/div/button"));
    delete.click();
    }
}
