package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginFacultyResponce {
	WebDriver driver;
    private WebElement emailid;
    private WebElement password;
    private WebElement submit;
    private WebElement ok;
    private WebElement requirementform;
    private WebElement requirement;
    private WebElement details;
    private WebElement serialno;
    private WebElement description;
    private WebElement submit1;
    
    public LoginFacultyResponce(WebDriver driver)
    	
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
    public void requirementClick()
    {
    requirement=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-rform-faculty/div[2]/div/div[1]/div/a/div")); 
    requirement.click();
    }
    public void detailsClick()
    {
    details=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-create-curriculums/div/div[1]/div[1]/ul/li[3]/a")); 
    details.click();
    }
    public void setserialno(String setserialno)
    {
    	serialno=driver.findElement(By.xpath("//*[@id=\"curriculum_id\"]"));
    	serialno.sendKeys(setserialno);
    }
    public void setdescription(String setdescription)
    {
    	description=driver.findElement(By.xpath("//*[@id=\"facultyname\"]"));
    	description.sendKeys(setdescription);
    }
    public void submit1Click()
    {
    submit1=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-create-curriculums/div/div[1]/div[2]/app-details/div/div/div/form/div[5]/button")); 
    submit1.click();
    }
}
