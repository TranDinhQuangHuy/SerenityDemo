package POM.page;


import POM.setup.ElementShared;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private WebElement clickFood(String name){
        return ElementShared.xpathFoodName(name);
    }

    public void clickProducts(String name) {
        ElementShared.wait(clickFood(name));
    }
}
