package CodingAssignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillsPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91703\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qamarkskills.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.cssSelector("input[id*='checkbox1']"));
        el1.click();
        WebElement el2=driver.findElement(By.cssSelector("label[id$='label1']"));
        String Str1=el2.getText();
        System.out.println(Str1);
        WebElement el3=driver.findElement(By.cssSelector("input[id*='checkbox2']"));
        el3.click();
        WebElement el4=driver.findElement(By.cssSelector("label[id$='label2']"));
        String Str2=el4.getText();
        System.out.println(Str2);
      WebElement el5=driver.findElement(By.cssSelector("input[id*='checkbox3']"));
      el5.click();
      WebElement el6=driver.findElement(By.cssSelector("label[id$='label3']"));
      String Str3=el6.getText();
      System.out.println(Str3);
    }

}
