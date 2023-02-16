package Logfile;

import java.util.logging.Logger;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        Logger logger = Logger.getLogger("Test");
        System.out.println("Hi");
        logger.info("Hi logger");
        System.out.println("Writing smth");
        logger.info("Writing smth logger");
        System.out.println("Using smth");
        logger.info("Using smth logger");
    }
}
