import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import sun.lwawt.macosx.CInputMethod;

public class JavaScriptAlertsTest {
    @Test
   public void javaScriptAlertTest() {
        WebDriver driver;

        String url = "https://the-internet.herokuapp.com/";

        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        options.addArguments("--start-maximized");
        driver.get(url);
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.className("example")).getText();
        System.out.println("Click for JS Alert");
         driver.close();

    }}




