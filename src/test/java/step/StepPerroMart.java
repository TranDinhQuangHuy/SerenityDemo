package step;

import POM.page.*;
import POM.setup.DriverSetup;
import model.tinh;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class StepPerroMart {


    @Step
    public void open(){
        String url = "https://perromart.com.sg/";
        DriverSetup.setDriver("edge");
        DriverSetup.findUrl(url);
    }

    @Step
    public void homepage(){
        HomePage homePage = new HomePage();
        homePage.findFood();
    }
    @Step
    public void collection(){
        CollectionsPage collectionsPage = new CollectionsPage();
        collectionsPage.searchFood("Bronco Salmon");
    }
    @Step
    public void search(){
        SearchPage searchPage = new SearchPage();
        searchPage.clickProducts("Bronco Jerky Salmon Dog Treat 70g");
    }
    @Step
    public void product(){
        ProductsPage productsPage = new ProductsPage();
        productsPage.addToCart(5);
    }
    @Step
    public void cart(){
        CartPage cartPage = new CartPage();
        Assert.assertEquals("Bronco Jerky Salmon Dog Treat 70g", cartPage.getNameProductInCart());
        Assert.assertEquals("5", cartPage.getQtyProductInCart());
        cartPage.checkOut();
    }


}
