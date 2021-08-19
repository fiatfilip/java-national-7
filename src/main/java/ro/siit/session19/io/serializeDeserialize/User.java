package ro.siit.session19.io.serializeDeserialize;

import java.io.*;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String email;
    private transient String password;
    // private Integer age;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // this.age = password.length(); // really dummy
    }

//    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                // ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User dummyUser = new User("Dummy User", "dummy@user.com", "iamdummy");
        System.out.println(dummyUser);
        try(
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user.data"))
        ){
            outputStream.writeObject(dummyUser);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
