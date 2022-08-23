package POM.page;

import POM.setup.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutsPage {
    @FindBy(xpath = "//input[contains(@id,'checkout_email')]")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[contains(@id,'first_name')]")
    private WebElement txtFirstName;
    @FindBy(xpath = "//input[contains(@id,'last_name')]")
    private WebElement txtLastName;
    @FindBy(xpath = "//input[contains(@id,'address_address1')]")
    private WebElement txtAddress;
    @FindBy(xpath = "//input[contains(@id,'address_address2')]")
    private WebElement txtAddressApartment;
    @FindBy(xpath = "//input[contains(@id,'address_zip')]")
    private WebElement txtPostalCode;
    @FindBy(xpath = "//input[contains(@id,'address_phone')]")
    private WebElement txtPhone;
    @FindBy(xpath = "//button[@id='continue_button']")
    private WebElement btnContinue;
    @FindBy(xpath = "//div[contains(@class,'block__content')]/bdo[@dir='ltr']")
    private WebElement txtContact;
    @FindBy(xpath = "//div[contains(@class,'block__content')]/address[contains(@class,'address')]")
    private WebElement txtShip;

    public WebElement getTxtContact() {
        return txtContact;
    }

    public WebElement getTxtShip() {
        return txtShip;
    }

    public CheckoutsPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    private void clickAndSendKey(WebElement element , String keyWord){
        element.click();
        element.sendKeys(keyWord);
    }

    private void inputTxtEmail(String email) {
        clickAndSendKey(txtEmail,email);
    }

    private void inputTxtFirstName(String firstName) {
        clickAndSendKey(txtFirstName, firstName);
    }

    private void inputTxtLastName(String lastName) {
        clickAndSendKey(txtLastName,lastName);
    }

    private void inputTxtAddress(String address)  {
        clickAndSendKey(txtAddress, address);
    }

    private void inputTxtApartment(String apartment) {
        clickAndSendKey(txtAddressApartment, apartment);

    }

    private void inputTxtPostalCode(String postal) {
        clickAndSendKey(txtPostalCode, postal);
    }

    private void inputTxtPhone(String phone) {
        clickAndSendKey(txtPhone, phone);
    }

    private void clickBtnContinue() {
        btnContinue.click();
    }


    public void continueWithShipping(String email, String firstName, String lastName, String address, String apartment, String postalCode, String phone) {
        inputTxtEmail(email);
        inputTxtFirstName(firstName);
        inputTxtLastName(lastName);
        inputTxtAddress(address);
        inputTxtApartment(apartment);
        inputTxtPostalCode(postalCode);
        inputTxtPhone(phone);
        clickBtnContinue();
    }
}
