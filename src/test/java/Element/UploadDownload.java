package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadDownload
{
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void openBrowser() throws Exception
    {
        System.out.println("Open Chrome Browser");
        driver.get("https://demoqa.com/upload-download");
    }
    @Test
    public void downLoad()
    {
       driver.findElement(By.id("downloadButton")).click();
       System.out.println("File Downloaded");
    }
    public void upload()
    {
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Supriya\\Desktop\\Tausha.jpg");
    }

}
