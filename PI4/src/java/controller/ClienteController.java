package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Cliente;

/**
 * @author jefferson.ysantos
 */
public class ClienteController {
    
    
    public ClienteController getUsuario(int id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
        ClienteController user = null;
        Conexao con = new Conexao();
        
        try {
            
            PreparedStatement preparedStatement = null;
            
            String sql = "select * from cliente where idCliente = ?";
            
            preparedStatement
            
             preparedStatement.setInt(1, id);
             ResultSet rs = preparedStatement.executeQuery();
             
             if(rs.next()){
                user = new Cliente();
                user.setIdCliente(rs.getInt(1));
             }
            
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Conexao.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        
        return user;
    }
}
