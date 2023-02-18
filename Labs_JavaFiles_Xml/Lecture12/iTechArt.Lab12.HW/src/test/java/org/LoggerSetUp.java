package org;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerSetUp {
    Logger log;
    public LoggerSetUp(){
        PropertyConfigurator.configure("src/test/java/org/log4j.properties");
         this.log = Logger.getLogger("devpinoyLogger");
    }
}
