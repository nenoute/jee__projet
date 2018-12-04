package mr.iscae.jee;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/adm")
@Produces("application/json")
public class Admindefaut {
	
	public static Map<String,String> memoire = new HashMap<>();
	
	@GET
	public Adminstrateur admin() {
		//Adminstrateur adm = new Adminstrateur("admin","admin");
		Data data=new  Data("admin","admin");
		return data.getAdminParDefaut();
	}
	/*@POST
	public void insert (Data data) {
		memoire.put(data.id,data.password);

}*/

}
