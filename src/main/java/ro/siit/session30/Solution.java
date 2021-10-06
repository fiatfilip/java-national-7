package ro.siit.session30;

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
        int K = in.nextInt();
        int[] bisquitsTypesCont = new int[K];
        for (int i = 0; i < K; i++) {
            int Q = in.nextInt();
            bisquitsTypesCont[i] = Q;
        }
        Arrays.sort(bisquitsTypesCont);

        int[] reverse = new int[K];
        for(int i = 0; i< K; i++){
            reverse[i] = bisquitsTypesCont[K-i-1];
        }

        for (int z = 1; z < K; z++){
            System.out.println(z);
            int bisquitsConsumed = 0;
            int i = 0;
            while(bisquitsConsumed < z && i < K){
                reverse[i]--;
                System.out.println(reverse[i]);
                i++;
                if(reverse[i] >=0) {
                    bisquitsConsumed++;
                }
                System.out.println(bisquitsConsumed);
            }
            if(bisquitsConsumed < z){
                System.out.println(z);
                break;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // System.out.println("ANSWER");
    }
}
