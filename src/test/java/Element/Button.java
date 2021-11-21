package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Button
{
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/buttons");
    }
    @Test
    public void buttons()
    {
       Actions actions = new Actions(driver);
       WebElement btn = driver.findElement(By.id("doubleClickBtn"));
       actions.doubleClick(btn).perform();
       actions.contextClick(btn).perform();
       actions.click();
    }
}
