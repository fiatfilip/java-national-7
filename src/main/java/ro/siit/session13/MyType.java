package ro.siit.session13;

public class MyType {
    public void myMethod(){
        System.out.println("Called my method");
    }

    public static void main(String[] args) {
        Object myObject = new MyType();

        Object[] objects = new Object[2];
        objects[0] = myObject;
        objects[1] = new String();

        //myObject.myMethod();
        ((MyType)myObject).myMethod();

        for(Object object:objects){
            ((MyType)object).myMethod();
            System.out.println(object);
        }
    }
}
