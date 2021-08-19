package ro.siit.session19.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByteTryWithResources {
    public static void main(String[] args) {

        try(
            FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt")
        ) {
            int val;

            while ((val = in.read()) != -1) {
                out.write(val);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File is n ot available");
        }
    }
}
