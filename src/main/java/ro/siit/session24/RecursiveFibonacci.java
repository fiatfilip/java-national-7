package ro.siit.session24;

import java.util.HashMap;
import java.util.Map;

public class RecursiveFibonacci {

    private static Map<Integer, Integer> elementsMap = new HashMap<>();
    private static int[] elements;

    public static int calculateRecursive(int n){
        System.out.println("calculate "+ n);
        if(n == 0 || n == 1){
            return 1;
        } else{
            return calculateRecursive(n-1) + calculateRecursive(n-2);
        }
    }

    public static int calculateOptimal(int n){
        if(elements == null){
            elements = new int[n+1];
        }
        if(elements[n] != 0)
        {
            return elements[n];
        }
        System.out.println("calculate "+ n);
        if(n == 0 || n == 1){
            elements[n] = 1;
        } else{
            int value = calculateOptimal(n-1) + calculateOptimal(n-2);
            elements[n] = value;
        }
        return elements[n];
    }

    public static int calculateOptimal2(int n){

        if(elementsMap.containsKey(n))
        {
            return elementsMap.get(n);
        }
        System.out.println("calculate "+ n);
        if(n == 0 || n == 1){
            elementsMap.put(n,1);
        } else{
            int value = calculateOptimal2(n-1) + calculateOptimal2(n-2);
            elementsMap.put(n,value);
        }
        return elementsMap.get(n);
    }


    public static void main(String[] args) {
        //System.out.println(calculateRecursive(40));
        //System.out.println(calculateOptimal(40));
        System.out.println(calculateOptimal2(40));
    }
}
