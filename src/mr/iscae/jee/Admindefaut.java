package mr.iscae.jee;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/adm")
@Produces("application/json")
@Consumes("application/json")
public class Admindefaut {
	public static Map<Integer,String> memoire = new HashMap<>();
	
	@GET
	@Path("/AD")
	public Adminstrateur admin(){
		return Data.getAdminParDefaut();
	}

	@PUT
	 public Adminstrateur modifieradmin(@QueryParam("id") String id,@QueryParam("password") String password){
	Adminstrateur a=new Adminstrateur(id,password);
	Data.setAdminParDefaut(a);
	return Data.getAdminParDefaut();
}

	/*@PUT
	 public DirecteurG  n(@QueryParam("idDG") Integer idDG,@QueryParam("nomDG") String nomDG){
		DirecteurG  m=new DirecteurG(idDG,nomDG);
	Data.setDirt(m);
	return Data.getDirt();
}
	@Path("/dr")
	@GET
		
	public DirecteurG d(){
		return Data.getDirt();
	}*/
	
	}