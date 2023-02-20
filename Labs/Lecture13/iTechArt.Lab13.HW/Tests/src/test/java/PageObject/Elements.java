package PageObject;

import com.namespace.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements extends BaseElement {
    private By loc;

    public Elements(By loc, WebDriver driver) {
        super(loc, driver);
    }
}

