package Element;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TextBox
{   WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void textBox()
    { driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Supriya");
     driver.findElement(By.id("userEmail")).sendKeys("supriya@abc.com");
     driver.findElement(By.id("currentAddress")).sendKeys("Pune");
     driver.findElement(By.id("permanentAddress")).sendKeys("Pune");
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,800)");
     driver.findElement(By.id("submit")).click();


     }

}
