package dynamicPolymorphism;

public class StudentDetails {

	private String studentName, studentBrief, username, password;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBrief() {
		return studentBrief;
	}

	public void setStudentBrief(String studentBrief) {
		this.studentBrief = studentBrief;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentDetails(String studentName, String studentBrief, String username, String password) {
		super();
		this.studentName = studentName;
		this.studentBrief = studentBrief;
		this.username = username;
		this.password = password;
	}

}
