package Library;
import java.util.List;
import java.util.ArrayList;
public class User {
	int userid;
	String name,email;
	List<String> borrowedbooks = new ArrayList<>();
	
	public User(int userid, String name, String email, List<String> borrowedbooks) 
	{
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.borrowedbooks = borrowedbooks; 
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getBorrowedbooks() {
		return borrowedbooks;
	}

	public void setBorrowedbooks(List<String> borrowedbooks) {
		this.borrowedbooks = borrowedbooks;
	}
	
}
