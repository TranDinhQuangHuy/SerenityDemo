package POM.page;

import POM.setup.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage{
    @FindBy(xpath = "//div[contains(@class,'CartItems_CartBoxRight')]/button[contains(@class,'CartItems_PlaceOrder')]")
    private WebElement btnCheckOut;
    @FindBy(xpath = "//input[@type='number']")
    private WebElement qtyProductInCart;
    @FindBy(xpath = "//div[contains(@class, 'CartItems_Title')]")
    private WebElement nameProductInCart;


    public CartPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    public String getQtyProductInCart() {
        return qtyProductInCart.getAttribute("value");
    }

    public String getNameProductInCart() {
        return nameProductInCart.getText();
    }

    private void clickBtnCheckOut() {
        btnCheckOut.click();
    }

    public void checkOut() {
        clickBtnCheckOut();
    }
}
