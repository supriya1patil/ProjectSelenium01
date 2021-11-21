package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Program01 {
    public static <select> void main(String args[])
    {
        System.out.println("Opening Chrome Browser");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");

        //Login Page
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        String text = driver.findElement(By.tagName("h3")).getText();
        System.out.println(text);

        if (text.trim().equals("Login Successfully"))
        {
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Supriya");
        driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("supriya@abc.com");
        driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("Pimpale Saudagar, Pune");
        driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Pune");
        driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("411017");
        WebElement country = driver.findElement(By.xpath("//select[@name = 'country']"));
        Select se = new Select(country);
        se.selectByValue("INDIA");

        WebElement cname = se.getFirstSelectedOption();
        System.out.println(cname.getText());

        //User Information
        driver.findElement(By.id("email")).sendKeys("supriya@abc.com");
        driver.findElement(By.name("password")).sendKeys("Selenium");
        driver.findElement(By.name("confirmPassword")).sendKeys("Selenium");
        driver.findElement(By.name("submit")).click();

        WebElement msg = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')] "));
        String actual = msg.getText();
        //String message = msg.getAttribute();
        System.out.println(actual);
        String expected = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";

        Assert.assertEquals(actual,expected);

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.close();

    }
}
