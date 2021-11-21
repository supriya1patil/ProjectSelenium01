package Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTip
{   WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("http://www.menucool.com/tooltip/javascript-tooltip");
    }
    @Test
    public void toolTip1()
    {
        Actions actions = new Actions(driver);
//        WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Basic')]"));
//        actions.moveToElement(ele1).pause(100).click().build().perform();
//        String tip1 = driver.findElement(By.xpath("//div[@class='mcTooltipInner']")).getText();
//        System.out.println("Tooltip for 'Basic' element: " +tip1);

        WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'A little spice')]"));
        actions.moveToElement(ele2).pause(100).click().build().perform();
        String tip2 = driver.findElement(By.id("mcTooltip")).getText();
        System.out.println("Tooltip for 'A little Spice' element: "+tip2);

        }
 }



