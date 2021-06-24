package ro.siit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        forFct(100);
        System.out.println( "Hello World!" );
        forFct(10);
    }

    public static void forFct(int nr){
        for (int i = 0; i < nr; i++) {
            System.out.println(i);
        }
    }
}
