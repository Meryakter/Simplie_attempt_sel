import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DragandDreoTests {
    @Test

    public void dragAndDropTest() {


        WebDriver driver;

    String url = "https://the-internet.herokuapp.com/";

    String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);

        options.addArguments("--start-maximized");
        driver.get(url);
        driver.findElement(By.linkText("Drag and Drop")).click();


        //Test (drag,drop);

        boolean actualStatus=driver.findElement(By.id("column-a")).isSelected();
        if (actualStatus==true){
            driver.findElement(By.id("column-a")).click();
            System.out.println("First column is selected");
        }
        else {
            System.out.println("First column  selected already");
        }

        /*Checking the status of second checkbox*/
        boolean actualStatusForSecondBox =driver.findElement(By.id("column-b")).isSelected();
        if (actualStatusForSecondBox==true){
            driver.findElement(By.id("column-b")).click();
            System.out.println("Second column is selected");
        }
        else {
            System.out.println("Second column been selected already");
        }

        driver.close();

    }



            }


