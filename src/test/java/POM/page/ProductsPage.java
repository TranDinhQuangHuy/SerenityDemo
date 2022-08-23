package POM.page;


import POM.setup.DriverSetup;
import POM.setup.ElementShared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private ElementShared elementShared;

    @FindBy(xpath = "//span[contains(@class, 'ProductDetails_plus')]")
    private WebElement btnAdd;
    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement btnAddToCart;
    @FindBy(xpath = "//a[@href='/cart']/div[contains(@class, 'align-items-center position-relative')]")
    private WebElement iconCart;

    public ProductsPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    private void clickBtnAdd(int count) {
        for (int i = 1; i < count; i++) {
            btnAdd.click();
        }
    }

    private void clickBtnAddToCart() {
        ElementShared.wait(btnAddToCart);
    }

    private void clickIconCart() {
        iconCart.click();
    }

    private void actionESC() {
        elementShared = new ElementShared();
        elementShared.esc();
    }

    public void addToCart(int value) {
        clickBtnAdd(value);
        clickBtnAddToCart();
        actionESC();
        clickIconCart();
    }
}
