package ro.siit.session28;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String percentage = in.next();
        // String percentageNumber = percentage.substring(0, percentage.length()-1);
        String percentageNumber = percentage.replace("%", "");
        Integer percentageAsNumber = Integer.parseInt(percentageNumber);

        int[] divisors = {2, 2, 5, 5};

        Integer firstNumber = percentageAsNumber;
        Integer secondNumber = 100;

        for(int i = 0; i < divisors.length; i++){
            if(firstNumber % divisors[i] == 0){
                firstNumber = firstNumber / divisors[i];
                secondNumber = secondNumber / divisors[i];
            }
        }



        System.out.println(firstNumber + " : " + secondNumber);
    }
}
