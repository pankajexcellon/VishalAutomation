package auto_bajaj_001_company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j_Implementation {
 
    private static final Logger logger =
            LogManager.getLogger(Log4j_Implementation.class);
 
    public static void main(String[] args) {
 
        logger.info("Application started");
 
        int a = 10;
        int b = 0;
 
        try {
            int result = a / b;
            logger.info("Result is: " + result);
        } catch (Exception e) {
            logger.error("Exception occurred while dividing numbers", e);
        }
 
        logger.info("Application finished");
    }
}