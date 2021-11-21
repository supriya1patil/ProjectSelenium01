package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBox
{
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/checkbox");
    }
    @Test
    public void checkBoxs()
   {
       //driver.findElement(By.xpath("//button[@title='Expand all']")).click();
       //driver.findElement(By.id("tree-node-home")).click();
       driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
       driver.findElement(By.xpath("//button[@title='Expand all']")).click();
   }
}
