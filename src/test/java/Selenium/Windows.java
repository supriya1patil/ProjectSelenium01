package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows
{
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void openBrowser() throws Exception
    {   System.out.println("Open Chrome Browser");
        driver.navigate().to("https://demoqa.com/browser-windows");
    }
    @Test
    public void window1()
    {   driver.findElement(By.id("tabButton")).click();
        String parent_window = driver.getWindowHandle();
        Set<String> winHandle = driver.getWindowHandles();
        System.out.println(winHandle);
        for(String win:winHandle)
        { if(!win.equals(parent_window))
            {   driver.switchTo().window(win);
                System.out.println(driver.findElement(By.id("sampleHeading")));
                Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(),"This is a sample page");
            }
        }
        driver.switchTo().window(parent_window);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/browser-windows");
        Assert.assertEquals(driver.getTitle(),"ToolsQA");

        Alert alt = driver.switchTo().alert();
        alt.getText();
        System.out.println(alt);
        alt.accept();
    }
}
