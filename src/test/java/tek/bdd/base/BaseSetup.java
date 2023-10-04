package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    //Encapsulation Concept of Java


    private static WebDriver driver;

    public void openBrowser() {
        //Steps to read a property file
        //Step 1) the absolute file path to the property file.

    driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String APP_URL = "https://qa.insurance.tekschool-students.com/";
        driver.get(APP_URL);
    }

    public void driverQuit() {
        if (driver != null)
            driver.close();
    }

    //Ready only Getter to read get Driver instance.
    //Java Encapsulation Concept.
    public WebDriver getDriver() {
        return driver;
    }
}
