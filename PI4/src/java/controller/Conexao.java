package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import modelos.Usuario;

/**
 * @author jefferson
 */

public class conexao {
    Connection con = null;
    
    public conexao() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        String url = "gandalf-pi.database.windows.net";
        String user = "TSI";
        String password = "SistemasInternet123";
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, user, password);
    }
    
}
