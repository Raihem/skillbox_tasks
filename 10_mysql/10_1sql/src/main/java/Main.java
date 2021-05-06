import java.sql.Connection;
import java.sql.*;

public class Main {

    private static final String sqlQuery = "SELECT course_name, " +
            "COUNT(MONTH(subscription_date)) / COUNT(DISTINCT MONTH(subscription_date)) AS count_per_month " +
            "FROM purchaselist GROUP BY course_name";


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "tetrartetrar";
        int purchase_count=0;

        try {

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
//            Statement statement2 = connection.createStatement();

//            обновляем название курса
//            statement.execute("UPDATE courses SET name='Веб-разаботчик с zero до PRO' WHERE id=1");

            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("course_name") + "\t" +
                        resultSet.getString("count_per_month"));
            }

    } catch (NullPointerException | SQLException ex) {
        ex.printStackTrace();
    }
}
}
