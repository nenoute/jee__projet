package mr.iscae.jee;

public class Data {
	String id;
	String password;
	private Adminstrateur adminParDefaut=new  Adminstrateur("admin","admin");

	public Data(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Adminstrateur getAdminParDefaut(){
		return adminParDefaut;
	}
	
	public void setAdminParDefaut(Adminstrateur adminParDefaut) {
		
		this.adminParDefaut = adminParDefaut;
	}
}
