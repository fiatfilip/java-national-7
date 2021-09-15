package ro.siit.session19and20.io.serializeDeserialize;

import java.io.*;

public class UserResurrector {
    public static void main(String[] args) {
        try(
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.data"))
        ) {
            User resurrectedUser = (User)inputStream.readObject();
            System.out.println(resurrectedUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
