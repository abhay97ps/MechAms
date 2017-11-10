package MechAms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import MechAms.model.Product;

public class ProductDao {

	public static ProductDao instance = null;
	private ProductDao() {}
	public static ProductDao getInstance() {
		
		if(instance == null) {
			instance = new ProductDao();
		}
		return instance;
	}
	
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost/DBMS";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	
	public int insertProduct(String tableName,Product product,int numAtt) throws SQLException {
		
		String query = "INSERT INTO " + tableName + "(";
		String tempQuery1= product.getAttribute_name_1();
		String tempQuery2= "VALUES (" + "'"+product.getAttribute_value_1()+"'";
		for(int i=2;i<=numAtt;i++) {
			tempQuery1 = tempQuery1 + ", " + product.getAttributeName(i);			
		}
		tempQuery1 += ") ";
		for(int i=2;i<=numAtt;i++) {
			tempQuery2 = tempQuery2 + "," + "'" + product.getAttributeValue(i) + "'";
		}
		tempQuery2 += ") ";
		
		query = query + tempQuery1 + tempQuery2;
		

		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			statement = connection.prepareStatement(query);
			statement.executeUpdate();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
}
