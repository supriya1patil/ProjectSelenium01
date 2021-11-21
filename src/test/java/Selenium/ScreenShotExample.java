package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenShotExample {
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void screenShot()
    {
        
    }
}
//    To Capture Screenshot
//        try {
//        String img = (new SimpleDateFormat("yyMMddHHmmssZ")).format(new Date());
//
//        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File dest = new File(System.getProperty("user.dir") + "/screenshots/" + img + ".png");
//        FileHandler.copy(source, dest);
//        } catch (IOException exception) {
//        exception.printStackTrace();
//        }