package ro.siit.session30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        Integer[] bisquitsTypesCont = new Integer[k];

        for (int i = 0; i < k; i++) {
            int q = in.nextInt();
            bisquitsTypesCont[i] = q;
        }

        Arrays.sort(bisquitsTypesCont, Collections.reverseOrder());

        int maxDays = 0;

        for(int i = 1; i <= k; i++){
            for(int j = 0; j < i; j++) {
                bisquitsTypesCont[j]--;
            }
            maxDays++;
            Arrays.sort(bisquitsTypesCont, Collections.reverseOrder());

            if(bisquitsTypesCont[i].equals(0)){
                break;
            }
        }

        System.out.println(maxDays);
    }

}
