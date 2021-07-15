package jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TestPro {
	private static String INSERT_QUERY =  "insert into test.product(id,name,price,description,quantity)  "
			+ "values(?,?,?,?,?) ";
	private final static String SELECT_QUERY = "select * from test.product where id=?";
	private final static String SELECT_ALL_QUERY = "select * from test.product";
	public static List<Product> findAll(){
		List<Product> productList = new ArrayList<Product>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root","365Pass");
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY);
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				productList.add(product);
				
			}
		
		} catch (Exception e) {
			
		}
		return productList;
	}

	
	
	public static Product findById(int productid) {
		Product product = null;
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root","365Pass");
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);
			preparedStatement.setInt(1,productid);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return product;
		
	}
	
	public static void addProduct(Product product) {
		try {

			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root","365Pass");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
			preparedStatement.setInt(1,product.getId());
			preparedStatement.setString(2,product.getName());
			preparedStatement.setFloat(3,product.getPrice());
			preparedStatement.setString(4,product.getDescription());
			preparedStatement.setInt(5,product.getQuantity());
			int noOfRowsUpdated = preparedStatement.executeUpdate();
			if(noOfRowsUpdated==1) {
				System.out.println("record updated sucessfully");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	public static void main(String[] args) {
		List<Product> produtcs = findAll();
		for (Product product : produtcs) {
			System.out.println(product);
			
		}
		
//		Product product = findById(2);
//		System.out.println(product);
//		
//		Product product = new Product(101,"XS",700,"SmartPhone",99);
//		addProduct(product);
//		

	}

}
