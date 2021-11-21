package SeleniumPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumClass\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.tagName("tr"));

        List<WebElement> columns = driver.findElements(By.tagName("td"));
        System.out.println(rows.size());
        System.out.println(columns.size());

        for (WebElement row : rows) {
            for (WebElement col : columns) {

//                if (element.getText().equals("China")) {
//                    System.out.println(element.getText());
//                    break;
            }
        }
    }
}
