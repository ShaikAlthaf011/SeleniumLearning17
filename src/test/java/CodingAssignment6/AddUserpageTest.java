package CodingAssignment6;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddUserpageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qausersignup.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the add user functionality:
        WebElement el1=driver.findElement(By.cssSelector("input[id='name']"));
        el1.sendKeys("rahul");
        WebElement el2=driver.findElement(By.cssSelector("input[id='email']"));
        el2.sendKeys("rahul@example.com");
        WebElement el3=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        el3.submit();
        WebElement el4=driver.findElement(By.cssSelector("p[class^='success']"));
        String str5=el4.getText();
        String Str6="New user added successfully!";
        if(str5.equals(Str6)){
            System.out.println("Success Message Displayed");
        }else{
            System.out.println("Success Message Missing");
        }
        //Test the display of error message when submitting empty inputs.:
        WebElement el6=driver.findElement(By.cssSelector("span[class='cancel-button']"));
        el6.click();
        WebElement el5=driver.findElement(By.cssSelector("button[type='submit']"));
        el5.click();
         WebElement el7=driver.findElement(By.cssSelector("p[id='nameErrMsg']"));
         boolean namemessage= el7.getText().contains("Required*");
         WebElement el8= driver.findElement(By.cssSelector("p[id='emailErrMsg']"));
         boolean emailmessage=el8.getText().contains("Required*");
         if(namemessage&&emailmessage){
             System.out.println("Errors Displayed correctly");
         }else{
             System.out.println("Errors not Displayed correctly");
         }
         driver.quit();
         }
       }







