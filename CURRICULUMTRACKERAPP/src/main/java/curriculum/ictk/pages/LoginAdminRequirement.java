package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginAdminRequirement {
	WebDriver driver;
    private WebElement emailid;
    private WebElement password;
    private WebElement submit;
    private WebElement ok;
    private WebElement requirementform;
    private WebElement createform;
   /* private WebElement requirementname;
    private WebElement area;
    private WebElement institution;
    private WebElement category;
    private WebElement hours;*/
    private WebElement submit1;
    
    public LoginAdminRequirement(WebDriver driver)
    	
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
    public void requirementformClick()
    {
    requirementform=driver.findElement(By.id("reqform"));
    requirementform.click();
    }
    public void createformClick()
    {
    createform=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-requirementlist/div/div[2]/div/div[78]/div/div/button"));
    createform.click();
    }
    public void setrequirementname(String setname)
    {
   	 emailid=driver.findElement(By.id("requirementName"));
   	 emailid.sendKeys( setname);
    }
    public void setarea(String setarea)
    {
   	 emailid=driver.findElement(By.id("trainingArea"));
   	 emailid.sendKeys(setarea);
    }
    public void setinstitution(String setinstitution)
    {
   	 emailid=driver.findElement(By.id("institution"));
   	 emailid.sendKeys(setinstitution);
    }
    public void setcategory(String setcategory)
    {
   	 emailid=driver.findElement(By.id("category"));
   	 emailid.sendKeys(setcategory);
    }
    public void sethours(String sethours)
    {
   	 emailid=driver.findElement(By.id("trainingHours"));
   	 emailid.sendKeys(sethours);
    }
    public void submit1Click()
    {
   	 submit1=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")); 
   	 submit1.click();
    }
}
