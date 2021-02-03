package entity;

public class Employee {
	private int id;
	private String name;
	private Track track;
	private String phoneNo;
	private String role;
	public Employee(int id, String name, Track track, String phoneNo, String role) {
		super();
		this.id = id;
		this.name = name;
		this.track = track;
		this.phoneNo = phoneNo;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Track getTrack() {
		return track;
	}
	public void setTrack(Track track) {
		this.track = track;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
