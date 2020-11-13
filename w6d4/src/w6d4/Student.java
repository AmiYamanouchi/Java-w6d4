package w6d4;

public class Student {

	private int id;
	private String email;
	private String fullName;
	
	
	//constructor
	public Student(int id,String email, String fullName) {
		setId(id);
		setEmail(email);
		setFullName(fullName);
		
		
	}
	
	//getter
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return fullName;
	}
	
	//setter
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		return "\nID: " + id + 
				"\nName: " + fullName + 
				"\nEmail: " + email;
	}
	
	
	
}
