package mr.iscae.jee;

public class Adminstrateur {
	String id;
	String password;
	//Data data=new  Data(id,password);
	public Adminstrateur(String id,String password){
		this.id=id;
		this.password=password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
