package ro.siit.session25and26;

import ro.siit.session25and26.entity.Author;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;

public class BooksManager {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        if(connection != null){
            System.out.println("Connected to db");

            Scanner keyboard  = new Scanner(System.in);
            printMenu();
            String commmand = keyboard.nextLine().toUpperCase();
            while (!commmand.equalsIgnoreCase("X")){
                switch (commmand){
                    case "L":
                        queryAuthors(connection);
                        break;
                    case "A":
                        System.out.println("Author's name?");
                        String name  = keyboard.nextLine();
                        Author author = new Author(UUID.randomUUID(), name);
                        addAuthor(author, connection);
                        break;
                    case "D":
                        System.out.println("Author's id?");
                        String idAsString = keyboard.nextLine();
                        deleteAuthor(UUID.fromString(idAsString), connection);
                        break;
                    case "U":
                        System.out.println("Author's id?");
                        idAsString = keyboard.nextLine();
                        System.out.println("Author's new name?");
                        name = keyboard.nextLine();
                        author = new Author(UUID.fromString(idAsString), name);
                        updateAuthor(author, connection);
                        break;
                    default:
                        System.out.println("Wrong command!!!");
                }

                printMenu();
                commmand = keyboard.nextLine().toUpperCase();
            }



//            queryAuthors(connection);
//
//            Author author = new Author(UUID.randomUUID(), "Hans Christan Andresen");
//            addAuthor(author, connection);
//
//            queryAuthors(connection);
//
//            updateAuthor(new Author(UUID.fromString("f761b4b6-9c97-4979-94c7-d3dc4b297d80"), "Yuval Noah Harari"), connection);
//            queryAuthors(connection);
//
//            deleteAuthor(author.getId(), connection);
//
//            queryAuthors(connection);


        }
    }

    public static void printMenu(){
        System.out.println("A: add new author");
        System.out.println("L: list authors");
        System.out.println("D: delete author");
        System.out.println("U: update author");
        System.out.println("X: exit");
        System.out.println("command?");
    }

    public static void queryAuthors(Connection connection) throws SQLException {
        System.out.println("..........");
        Statement statement = connection.createStatement();
        ResultSet authors = statement.executeQuery("SELECT *  FROM authors");
        while(authors.next()){
            Author author = new Author(UUID.fromString(authors.getString("id")), authors.getString("name"));
            System.out.println(author);
        }
    }

    public static void addAuthor(Author author, Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO authors VALUES (?, ?)");
        statement.setObject(1, author.getId());
        statement.setString(2, author.getName()); // "ION";DROP TABLE admins;
        // "INSERT INTO authors VALUES (" + author.getId() + ", " + author.getName() +")"

        statement.execute();

    }

    public static void updateAuthor(Author author, Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE authors SET name = ? WHERE id = ?");
        statement.setString(1, author.getName());
        statement.setObject(2, author.getId());

        statement.executeUpdate();

    }

    public static void deleteAuthor(UUID id, Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM authors WHERE id = ?");
        statement.setObject(1, id);

        statement.executeUpdate();

    }

    public static  Connection getConnection(){
        String user = System.getenv("PGUSER");
        String password = System.getenv("PGPASS");
        String url = "jdbc:postgresql://localhost:5432/national7";
        Properties props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password",password);

        try {
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, props);

            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("Unable to load driver");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.println("Unable to create connection");
        }

        return null;
    }
}
