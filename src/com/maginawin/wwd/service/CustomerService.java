package com.maginawin.wwd.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.maginawin.wwd.model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerService {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/sys";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "wooer1988";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public List<Customer> getCustomerList(String keyword) {
		// TODO
		
		Connection conn = null;
		String sql = "select * from sys_config";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("variable"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Customer getCustomer(long id) {
		// TODO
		return null;
	}

	public boolean createCustomer(Map<String, Object> fieldMap) {
		// TODO
		return false;
	}
	
	public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
		// TODO
		return false;
	}
	
	public boolean deleteCustomer(long id) {
		// TODO
		return false;
	}
}
