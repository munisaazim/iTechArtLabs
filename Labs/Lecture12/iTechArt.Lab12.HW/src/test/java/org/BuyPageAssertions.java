package org;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BuyPageAssertions extends LoggerSetUp{
    private WebDriver driver;

    public BuyPageAssertions(WebDriver driver){
        this.driver = driver;
    }
    protected BuyPageElements elements(){
        return  new BuyPageElements(driver);
    }
    public void assertTrueMobile(){
        log.info("Asserion entering main page");
        Assert.assertTrue(elements().mobileEnterAssert().isDisplayed());
    }
    public void assertTrueCompare(){
        log.info("Assertion compare limk appearance");
        Assert.assertTrue(elements().compareLink().isDisplayed());
    }
    public void asserHeaderTag(){
        log.info("Assertion text \"Сравнение товаров\"");
        Assert.assertEquals(elements().headerTag().getText(), "Сравнение товаров");
    }
}