package curriculum.ictk.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginFacultyEdit {
	WebDriver driver;
    private WebElement emailid;
    private WebElement password;
    private WebElement submit;
    private WebElement ok;
    private WebElement mycurriculum;
    private WebElement curriculum;
    private WebElement edit;
   
    
    public LoginFacultyEdit(WebDriver driver)
    	
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
    public void mycurriculumClick()
    {
    mycurriculum=driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span")); 
    mycurriculum.click();
    }
    public void curriculumClick()
    {
    curriculum=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-my-curriculums/div/div/div/div[1]/div/a")); 
    curriculum.click();
    }
    public void editClick()
    {
    edit=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-curriculum-view/div[2]")); 
    edit.click();
    }
}
