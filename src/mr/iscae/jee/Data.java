package mr.iscae.jee;

public class Data {
	static	String id;
	static String password;
	/*static  Integer idDG;
	static  String nomDG;
	
	private static DirecteurG dirt=new DirecteurG(idDG,nomDG);;
	
	public Data(Integer idDG, String nomDG) {
}

	public static DirecteurG getDirt(){
		return dirt;
	}

	public static void setDirt(DirecteurG dirt) {
		Data.dirt = dirt;
	}*/
	public Data() {
	}
	private static Adminstrateur adminParDefaut=new  Adminstrateur("admin","admin");

	public Data(String id, String password) {
		// TODO Auto-generated constructor stub
	}

	public static Adminstrateur getAdminParDefaut(){
		return adminParDefaut;
	}
	
	public static void setAdminParDefaut(Adminstrateur adminParDefaut) {
		
		Data.adminParDefaut = adminParDefaut;
	}
	
}
