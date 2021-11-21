package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButton
{
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/radio-button");
    }
    @Test
    public void radioButtos()
    {
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
        Assert.assertEquals(text,"Yes");

        driver.findElement(By.xpath("impressiveRadio")).click();
        WebElement text1 = driver.findElement(By.xpath("//span[contains(text(),'Impressive')]"));
        Assert.assertEquals(text1,"Impressive");
    }
}
