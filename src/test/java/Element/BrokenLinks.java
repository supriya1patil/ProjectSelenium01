package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinks
{
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/broken");
    }
    @Test
    public void brokenLink()
    {
        driver.findElement(By.xpath("//a[contais(text(),'Click Here for Valid Link')")).click();
    }
}
