package POM.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementShared {
    private static WebDriver driver;
    private Actions action;

    private static WebDriverWait wait;

    public ElementShared() {
        this.driver = DriverSetup.getDriver();
    }

    public void hover(WebElement btn , WebElement btn2){
        action = new Actions(driver);
        action.moveToElement(btn).build().perform();
        btn2.click();
    }
    public void esc() {
        action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
    }
    public static WebElement xpathFoodName(String name){
        return driver.findElement(By.xpath("//div[text()='" +name+ "']"));
    }

    public static void wait(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
