package Logfile;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;
public class AllTests {
    @Test
    public void test(){
        PropertyConfigurator.configure("src/test/java/Logfile/log4j.properties");
        //correct
        Logger log = Logger.getLogger("devpinoyLogger");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        log.info("opening webiste");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("entring weight");
        driver.findElement(By.name("wg")).sendKeys("87");
        log.info("selecting kilograms");
        log.debug("heroooooooooooo");
        driver.findElement(By.name("opt1")).sendKeys("kilograms");
        log.info("selecting height in feet");
        driver.findElement(By.name("opt2")).sendKeys("5");
        log.info("selecting height in inchs");
        driver.findElement(By.name("opt3")).sendKeys("10");
        log.info("Clicking on calculate");
        driver.findElement(By.name("cc")).click();

        log.info("Getting SIUnit value");
        String SIUnit = driver.findElement(By.name("si")).getAttribute("value");
        log.info("Getting USUnit value");
        String USUnit = driver.findElement(By.name("us")).getAttribute("value");
        log.info("Getting UKUnit value");
        String UKUnit = driver.findElement(By.name("uk")).getAttribute("value");
        log.info("Getting overall description");
        String note = driver.findElement(By.name("desc")).getAttribute("value");

        System.out.println("SIUnit = " + SIUnit);
        System.out.println("USUnit = " + USUnit);
        System.out.println("UKUnit = " + UKUnit);
        System.out.println("note = " + note);
        driver.quit();
    }
    }
