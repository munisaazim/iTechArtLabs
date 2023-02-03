package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BuyPage {
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
    public void getPage(){
        //driver.manage().window().maximize();
        driver.get(urlPage);
    }
    public void mobileEnter(){
        elements().mobileEnter().click();
        assertionsTake().assertTrueMobile();
    }
    public void chooseMobile() throws InterruptedException{
        js.executeScript("arguments[0].click()", elements().chooseMobileApple());
        js.executeScript("arguments[0].click()", elements().chooseMobileHONOR());
        js.executeScript("arguments[0].click()", elements().chooseMobileHONOR());
    }
    public void chooseNumber(){
        js.executeScript("arguments[0].click()",elements().chooseNumberOne());
        js.executeScript("arguments[0].click()",elements().chooseNumberThree());
        assertionsTake().assertTrueCompare();
    }
    public void comparePage(){
        js.executeScript("arguments[0].click()" ,elements().compareLink());
        assertionsTake().asserHeaderTag();
    }
}
