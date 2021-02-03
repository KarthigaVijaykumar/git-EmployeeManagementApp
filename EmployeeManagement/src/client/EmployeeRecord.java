package client;

import java.util.Scanner;

import entity.Employee;
import entity.Track;
import service.EmployeeRecordImpl;

public class EmployeeRecord {
	private static Scanner input = new Scanner(System.in);
	private static EmployeeRecordImpl recordimpl = new EmployeeRecordImpl();
	public static void main(String[] args) {
		boolean valid = true;
		do {
			System.out.println("1.Insert Data\n2.Delete Data\n3.Update Phone Number\n4.Get list of campus mind in specific track\n5.Exit\nEnter your choice");
			byte choice = input.nextByte();
			switch(choice) {
			case 1:
				addDetails();
				break;
			case 2:
				recordimpl.deleteData();
				break;
			case 3:
				recordimpl.updatePhoneNo();
				break;
			case 4:
				recordimpl.getListOfCampusMinds();
				break;
			case 5:
				System.out.println("The program is exited");
				valid = false;
				break;
			}
		}
		while(valid);
	}
	private static void addDetails() {
		System.out.println("Enter your id");
		int id = input.nextInt();
		System.out.println("Enter your name");
		String name = input.next();
		System.out.println("Enter your track");
		Track track = getTrackDetails();
		System.out.println("Enter your phone number");
		String phoneNo = input.next();
		System.out.println("Enter your role");
		String role = input.next();
		Employee employee = new Employee(id,name,track,phoneNo,role);
		recordimpl.insertData(employee);
	}
	private static Track getTrackDetails() {
		System.out.println("Enter your track Id");
		int trackId = input.nextInt();
		System.out.println("Enter your track name");
		String trackName = input.next();
		Track track = new Track(trackId,trackName);
		return track;
	}
}
