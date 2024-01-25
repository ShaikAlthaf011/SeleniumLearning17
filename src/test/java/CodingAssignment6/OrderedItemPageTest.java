package CodingAssignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrderedItemPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91703\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaorderitems.ccbp.tech/");
        driver.manage().window().maximize();
        List<WebElement> list1=driver.findElements(By.cssSelector("li[class='ordered-item']"));
        if(list1.size()==3){
            System.out.println("Ordered Item count is correct");
        }else{
            System.out.println("Ordered Item count is incorrect");
        }
      List<WebElement>list2=driver.findElements(By.cssSelector("button[class='btn btn-danger ml-3']"));
        for(WebElement s:list2){
            s.click();
        }
        WebElement el5=driver.findElement(By.cssSelector("p[class='text-secondary']"));
        String st=el5.getText();
        String str1="Cart is empty";
        if(st.equals(str1)){
            System.out.println("Empty Cart Text Displayed");
        }else{
            System.out.println("Empty Cart Text Missing");
        }
        driver.quit();
    }
    }

