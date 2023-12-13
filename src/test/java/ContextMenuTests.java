import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests {
    @Test
    public void contextMenuTest() {
        WebDriver driver;

        String url = "https://the-internet.herokuapp.com/";

        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        options.addArguments("--start-maximized");
        driver.get(url);
        driver.findElement(By.linkText("Context Menu")).click();
        String innerText = driver.findElement(By
                        .xpath("//*[@id=\"content\"]/div/p[1]"))
                        .getText();
        System.out.println(innerText);
        driver.quit();

    }
}