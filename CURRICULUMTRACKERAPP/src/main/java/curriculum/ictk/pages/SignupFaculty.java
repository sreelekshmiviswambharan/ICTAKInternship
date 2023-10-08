package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SignupFaculty {
	WebDriver driver;
	private WebElement createnew;
	private WebElement name;
    private WebElement emailid;
    private WebElement phone;
    private WebElement password;
    private WebElement confirmpassword;
    private WebElement signup;
    
    public SignupFaculty(WebDriver driver)
    	
    {
   	 this.driver=driver;
    }
    public void createnewClick()
    {
    createnew=driver.findElement(By.xpath("//a[@class=\"create-account\"]"));
    createnew.click();
    }
    public void setname(String setname)
    {
    name=driver.findElement(By.name("Name"));
    name.sendKeys(setname);
    }
    public void setemailid(String setemail)
    {
   	 emailid=driver.findElement(By.name("Email"));
   	 emailid.sendKeys(setemail);
    }
    public void setphone(String setphone)
    {
    phone=driver.findElement(By.name("Contact"));
    phone.sendKeys(setphone);
    }
    public void setpassword(String setpass)
    {
   	 password=driver.findElement(By.name("Password"));
   	 password.sendKeys(setpass);
   	 
    }
    public void confirmsetpassword(String setconfirmpass)
    {
   	 confirmpassword=driver.findElement(By.name("ConfirmPassword"));
   	 confirmpassword.sendKeys(setconfirmpass);
   	 
    }
   
    public void signupClick()
    {
    signup=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
    signup.click();
    }
	
}
