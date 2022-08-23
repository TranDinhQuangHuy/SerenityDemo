package POM.page;

import POM.setup.DriverSetup;
import POM.setup.ElementShared;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
    WebDriver driver;

    @FindBy(xpath = "//button[@tabindex='0']")
    private WebElement btnClose;
    @FindBy(xpath = "//div[text()='Dog']")
    private WebElement btnDog;
    @FindBy(linkText = "Food")
    private WebElement btnFood;

    public HomePage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    private void clickBtnClose() {
        btnClose.click();
    }

    private void hoverMenu() {
        ElementShared elementShared = new ElementShared();
        elementShared.hover(btnDog, btnFood);
    }
    public void findFood() {
        try {
            Thread.sleep(4500);
            clickBtnClose();
            hoverMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
