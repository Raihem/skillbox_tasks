import java.sql.Connection;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "tetrartetrar";

        try {

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");
            while (resultSet.next()){
                String courseName = resultSet.getString("name");
                System.out.println(courseName);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
