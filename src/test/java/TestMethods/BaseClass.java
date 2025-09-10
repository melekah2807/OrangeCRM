package TestMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver = null;

    public BaseClass () {
        if (driver == null) {
            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\Selenium-Automation\\IdeaProjects\\WebDrivers\\chromedriver-win64\\chromedriver-win64");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demoqa.com/");
            driver.manage().window().maximize();
        }
    }
    @AfterSuite (alwaysRun = true)
    public void setupclose() {
        driver.close();
        driver.quit();
        System.out.println("This is AfterSuit method");

    }

    public static WebDriver getDriver () {
        return driver;

    }
}
