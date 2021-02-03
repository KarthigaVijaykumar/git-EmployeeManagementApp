package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Employee;

public class EmployeeRecordImpl {
	JdbcConnection connection = new JdbcConnection();
	Scanner input =  new Scanner(System.in);

	public void insertData(Employee employee) {
		try {
			Connection con = connection.connect();
			String query = "Insert into employee values (?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,employee.getId());
			st.setString(2,employee.getName());
			st.setInt(3, employee.getTrack().getTrackId());
			st.setString(4,employee.getTrack().getTrackName());
			st.setString(5,employee.getPhoneNo());
			st.setString(6,employee.getRole());
			int n = st.executeUpdate();
			System.out.println(n+" row affected");
			connection.close(con, st);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	public void deleteData() {
		System.out.println("Enter the employee id to delete the employee data");
		int employeeId = input.nextInt();
		try {
			Connection con = connection.connect();
			String query = "delete from employee where id = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, employeeId);
			int i = st.executeUpdate();
			System.out.println(i+" row has been deleted");
			connection.close(con, st);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updatePhoneNo() {
		System.out.println("Enter your employee id to update your phone number");
		int id = input.nextInt();
		System.out.println("Enter your updated phone number");
		String phoneNum = input.next();
		try {
			Connection  con = connection.connect();
			String query = "Update employee set phoneNo = ? where id = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, phoneNum);
			st.setInt(2, id);
			int i = st.executeUpdate();
			System.out.println(i+" row have been updated");
			connection.close(con, st);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public void getListOfCampusMinds() {
		System.out.println("Enter the track to get the list of employees");
		String track = input.next();
		try {
			Connection con = connection.connect();
			String query = "select * from employee where track = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,track);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(5)+" "+rs.getString(6));
			}
			connection.close(con, st);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
