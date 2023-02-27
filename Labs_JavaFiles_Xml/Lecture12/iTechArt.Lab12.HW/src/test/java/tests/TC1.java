package tests;

import org.ChoosePhonesPage;
import org.CompareProductsPage;
import org.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
        WebDriver driver;
        private String mainPageUrl = "https://catalog.onliner.by/";

        @BeforeTest
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(mainPageUrl);
        }
        @Test
        public void runTC1() {
            MainPage mainPage = new MainPage(driver);
            mainPage.clickOnMobileLink();
            ChoosePhonesPage choosePhonesPage = new ChoosePhonesPage(driver);
            choosePhonesPage.clickOnAppleAndHONOR();
            choosePhonesPage.clickOnProductOneAndProductTwo();
            choosePhonesPage.clickOnLinkCompareProducts();
            CompareProductsPage compareProductsPage = new CompareProductsPage(driver);
            compareProductsPage.assertCompareProductsPage();
        }
        @AfterTest
        public void quit() {
            driver.quit();
        }
    }
