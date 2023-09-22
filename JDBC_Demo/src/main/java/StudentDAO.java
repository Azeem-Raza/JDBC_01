import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	public static void main(String args[]) {
		try {
			//Connection connection = DriverManager.getConnection("jdbc:mariadb://mariadb.vamk.fi/add_project_name", "root/ID", "Generated password");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			
			//int results = statement.executeUpdate("INSERT INTO Students VALUE(1, 'Azeem', 'Raza')");
			
			//int results = statement.executeUpdate("UPDATE Students SET firstName='Azeem' WHERE Student_Num=1");
			
			//int results = statement.executeUpdate("DELETE FROM Students WHERE Student_Num=1");
			
			// System.out.println(results + " rows updated");
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
			while(resultSet.next()) {
				System.out.println("Student Number: " + resultSet.getString(1));
				System.out.println("Last name: " + resultSet.getString(2));
				System.out.println("First name: " + resultSet.getString(3));
			}
			
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}