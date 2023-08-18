package lib;

public class User {

	private String userid;
	private String username;
	private String userpassward;
	private int userage;
	private String userenail;
	
	
	
	//생성자 
	
	
	User(String userid, String username, String userpassward, int userage, String userenail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassward = userpassward;
		this.userage = userage;
		this.userenail = userenail;
	}

	//gett setter


	public User(String userid2, String username2, String userpassward2, String string, String userenail2) {
		// TODO Auto-generated constructor stub
		super();
		this.userid = userid;
		this.username = username;
		this.userpassward = userpassward;
		this.userage = userage;
		this.userenail = userenail;
	}

	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getUserpassward() {
		return userpassward;
	}



	public void setUserpassward(String userpassward) {
		this.userpassward = userpassward;
	}



	public int getUserage() {
		return userage;
	}



	public void setUserage(int userage) {
		this.userage = userage;
	}



	public String getUserenail() {
		return userenail;
	}



	public void setUserenail(String userenail) {
		this.userenail = userenail;
	}
	
	
	
	


}
