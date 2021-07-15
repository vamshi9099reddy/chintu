package jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestJdbc {
	private static String INSERT_QUERY =  "insert into sales.customers(customer_id,first_name,last_name,gender,email_address,number_of_complaints)  "
			+ "values(?,?,?,?,?,?) ";
	public static void addCustomers(Customers customers) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:1234/TestJdbc","root","root@123");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
			preparedStatement.setInt(1,customers.getCustomer_id());
			preparedStatement.setString(2,customers.getFirst_name());
			preparedStatement.setString(3, customers.getLast_name());
			preparedStatement.setGender(4,customers.getGender());
			
			
			
		} catch (Exception e) {
		}
	}
		
	

	public static void main(String[] args) {
		
      
	}
}

