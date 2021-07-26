package ro.siit.session12.exceptionsThrow;

public class MySecondException extends Exception{
    public MySecondException(String message){
        super("Second:" + message);
    }
}
