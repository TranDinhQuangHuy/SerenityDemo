package POM.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverSetup {
    private static WebDriver driver;
    public DriverSetup() {
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setDriver(String browserType) {
        switch (browserType) {
            case "chrome":
                driver = chromeDriver();
                break;
            case "edge":
                driver = edgeDriver();
                break;
            case "firefox":
                driver = fireFoxDriver();
                break;
            default:
                driver = edgeDriver();
        }
    }

    private static WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    private static WebDriver edgeDriver(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }
    private static WebDriver fireFoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
    public static void findUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeDriver() {
            driver.close();
    }
}
