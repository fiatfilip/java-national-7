package ro.siit.session12.exceptionsThrow;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class MainThrowSubclass {
    public static Logger logger = LogManager.getLogger(MainThrowSubclass.class);

    public static void main(String[] args) {
        try{
            throw new MyFirstException("First");
            // throw new MySecondException("Second");
        }catch (MyFirstException myFirstException){
            System.out.println("A prins my first exception");
            logger.error("A prins my first exception");
        }catch(Exception ex){
            System.out.println("A prins Exception");
        }
    }
}
