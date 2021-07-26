package ro.siit.session12.exceptionsThrow;

public class MyFirstException extends Exception{
    public MyFirstException(String message){
        super("First:" + message);
    }
}
