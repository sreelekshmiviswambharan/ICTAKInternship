package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginAdmin {
	WebDriver driver;
    private WebElement emailid;
    private WebElement password;
    private WebElement Submit;
    
    public LoginAdmin(WebDriver driver)
    	
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
    public void SubmitClick()
    {
   	 Submit=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
   	 Submit.click();
    }
	

}
