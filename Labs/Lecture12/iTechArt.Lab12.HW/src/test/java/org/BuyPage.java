package org;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BuyPage extends LoggerSetUp{
    private WebDriver driver;
    JavascriptExecutor js;

    private String urlPage = "https://catalog.onliner.by/";

    BuyPage(WebDriver driver){
        this.driver = driver;
    }
    protected BuyPageElements elements(){
        return new BuyPageElements(driver);
    }
    public BuyPageAssertions assertionsTake(){
        return new BuyPageAssertions(driver);
    }
    @Step("Entering page")
    public void getPage(){
        //driver.manage().window().maximize();
        log.info("Entering main application page");
        driver.get(urlPage);
    }
    public void mobileEnter(){
        log.info("Clicking on link");
        elements().mobileEnter().click();
        assertionsTake().assertTrueMobile();
    }
    public void chooseMobile() throws InterruptedException{
        log.info("Clicking on Apple and HONOR, unclicking HONOR");
        js.executeScript("arguments[0].click()", elements().chooseMobileApple());
        js.executeScript("arguments[0].click()", elements().chooseMobileHONOR());
        js.executeScript("arguments[0].click()", elements().chooseMobileHONOR());
    }
    public void chooseNumber(){
        log.info("Choosing number one and three products to compare");
        js.executeScript("arguments[0].click()",elements().chooseNumberOne());
        js.executeScript("arguments[0].click()",elements().chooseNumberThree());
        assertionsTake().assertTrueCompare();
    }
    public void comparePage(){
        log.info("Click on compare link");
        js.executeScript("arguments[0].click()" ,elements().compareLink());
        assertionsTake().asserHeaderTag();
    }
}