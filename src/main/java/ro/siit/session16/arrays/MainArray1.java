package ro.siit.session16.arrays;

public class MainArray1 {
    public static void main(String[] args) {
        String [] myArray [] = new String[3][];

        myArray[0] = new String[2];
        myArray[0][0] = "Super";
        myArray[0][1] = "Tare";
        myArray[1] = new String[4];
        myArray[1][0] = "Gelu";
        myArray[1][1] = "i";
        myArray[1][2] = "le";
        myArray[1][3] = "cere";
        myArray[2] = new String[3];
        myArray[2][0] = "Ana";
        myArray[2][1] = "are";
        myArray[2][2] = "mere";

        for (String[] element: myArray) {
            for (String entry: element) {
                System.out.println(entry);
            }
            System.out.println("--------");
        }
    }
}
