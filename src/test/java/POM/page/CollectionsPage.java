package POM.page;

import POM.setup.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionsPage {
    @FindBy(xpath = "//input[@type='text']")
    private WebElement txtSearch;
    @FindBy(xpath = "//div[contains(@class, 'NavSearchBar_search')]")
    private WebElement btnSearch;


    public CollectionsPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    public void searchFood(String keyWord) {
       txtSearch.click();
       txtSearch.sendKeys(keyWord);
       btnSearch.click();
    }
}
