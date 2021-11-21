package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PracticeFormToolsQA
{   WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void studentDetail()
    {   driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("Supriya");
        driver.findElement(By.id("lastName")).sendKeys("Patil");
        driver.findElement(By.id("userEmail")).sendKeys("supriya@abc.com");
        driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567898");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Subject");
        js.executeScript("window.scrollBy(0,800)");

        WebElement ch1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement ch2 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement ch3 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));

        Actions actions = new Actions(driver);
        Action build = actions.click(ch1).moveToElement(ch2).click(ch2).click(ch3).build();
        build.perform();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Supriya\\Desktop\\Tausha.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Pune-411017"+ Keys.TAB);

        WebElement state = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(state).click(state).sendKeys("Haryana").click().build().perform();

        WebElement city = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(city).click(city).sendKeys("Karnal").click().build().perform();

        driver.findElement(By.id("submit"));
    }
}
