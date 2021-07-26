package ro.siit.session12.exceptionsThrow;

import javax.sql.rowset.FilteredRowSet;

public class Main {
    public static void main(String[] args) throws MySecondException {
        // ...
        try {
            method();
            throw new MyFirstException("Error first");
        } catch(MyFirstException mfe){
            System.out.println(mfe.getMessage());
        } catch(MySecondException mse){
            System.out.println(mse.getMessage());
        } finally {
            System.out.println("Always executed");
        }

        //......
    }

    static public void method() throws MySecondException{
        throw new MySecondException("second exeption");
        //.....
    }
}
