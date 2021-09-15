package ro.siit.session19and20.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyNio {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("java_in.png"), Paths.get("copied_java_logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
