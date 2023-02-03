package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BuyPageAssertions {
    private WebDriver driver;

    public BuyPageAssertions(WebDriver driver){
        this.driver = driver;
    }
    protected BuyPageElements elements(){
        return  new BuyPageElements(driver);
    }
    public void assertTrueMobile(){
        Assert.assertTrue(elements().mobileEnterAssert().isDisplayed());
    }
    public void assertTrueCompare(){
        Assert.assertTrue(elements().compareLink().isDisplayed());
    }
    public void asserHeaderTag(){
        Assert.assertEquals(elements().headerTag().getText(), "Сравнение товаров");
    }
}
