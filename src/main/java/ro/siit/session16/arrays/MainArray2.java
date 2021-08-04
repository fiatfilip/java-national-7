package ro.siit.session16.arrays;

public class MainArray2 {
    public static void main(String[] args) {
        double[] testGrades = new double[15];

        testGrades[2] = 10.0;

        for (double grade: testGrades) {
            System.out.println(grade);
        }
        System.out.println("------");

        testGrades[2] = 9.30;

        // for (double grade: testGrades) {
        for(int i = 0; i < testGrades.length; i = i + 2){
            System.out.println(testGrades[i]);
            if(testGrades[i] > 9.0) {
                System.out.println("*" + i);
            }
        }

        for(int i = testGrades.length - 1;  i >= 0;  i--){
            System.out.println(testGrades[i]);
            if(testGrades[i] > 9.0) {
                System.out.println("*" + i);
            }
        }
    }
}
