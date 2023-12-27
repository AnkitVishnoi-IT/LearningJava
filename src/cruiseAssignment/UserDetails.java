package cruiseAssignment;

public class UserDetails {

	String userName, password, name, phNum;

	public UserDetails(String userName, String password, String name, String phNum) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.phNum = phNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

}
