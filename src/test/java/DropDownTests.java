import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests {
    @Test

    public void dropDownTest() {


        WebDriver driver;

        String url = "https://the-internet.herokuapp.com/";

        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        options.addArguments("--start-maximized");
        driver.get(url);
        driver.findElement(By.linkText("Dropdown")).click();
        driver.findElement(By.id("dropdown")).getText();
        System.out.println("Please select an option");
    }
}