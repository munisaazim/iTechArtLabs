package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MultibrowserTest {
    @Test
    public void Test(){
        WebDriver driver = new MultiBrowser().GetDriver(MultiBrowser.Browser.Chrome);
        driver.quit();
    }
}
