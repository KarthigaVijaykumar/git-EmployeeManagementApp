package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	public Connection connect() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "root123");
			System.out.println("Connected successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return con;
	}
	public void close (Connection con,PreparedStatement st) {
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public void close(Connection con, Statement st) {
		try {
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
