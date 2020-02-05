import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pass = "root";
		String query1 = "select id,ename,team from demo";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, uname, pass);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query1);

		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("ename") + "\t\t");
			System.out.println(resultSet.getString("team"));
		}

		statement.close();
		connection.close();
	}
}
