package Server;

import modelos.Cliente;
import controller.Conexao;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author jefferson.ysantos
 */
@Path("/cliente")
public class ClienteRest {
    
    @GET
    @Produces("application/json")
    public ClienteRest getUser(@QueryParam("idCliente") int id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Conexao connect = new Conexao();
        User
                
    }
}
