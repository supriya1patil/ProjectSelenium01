package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frame
{
  WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/frames");
    }
    @Test(priority=1)
    public void frame1Text()
    {
        WebElement frame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"This is a sample page");
    }


}
