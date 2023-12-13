import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedirectLinkTests {
    @Test
    public void redirectLinkTest() {
        WebDriver driver;

        String url = "https://the-internet.herokuapp.com/";

        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        options.addArguments("--start-maximized");
        driver.get(url);
        driver.findElement(By.linkText("Redirect Link")).click();
        driver.findElement(By.linkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        driver.quit();
    }

}
