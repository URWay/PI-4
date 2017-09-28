package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jefferson
 */

public class Conexao {
    Connection con = null;
    
    public Conexao() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        String url = "gandalf-pi.database.windows.net";
        String user = "TSI";
        String password = "SistemasInternet123";
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, user, password);
    }
    
    public void fechaConexao() throws SQLException{
        con.close();
    }
    
    /* Exemplos de Insert, Delete, e pegar usuário
    public void insertUser(User user) {
   
               try {
   
                      PreparedStatement preparedStatement = con
                                    .prepareStatement("insert user (id, user_name, password, address, email) values(?,?,?,?,?)");
                      preparedStatement.setInt(1, user.getId());
                      preparedStatement.setString(2, user.getUserName());
                      preparedStatement.setString(3, user.getPassword());
                      preparedStatement.setString(4, user.getAddress());
                      preparedStatement.setString(5, user.getEmail());
                      preparedStatement.execute();
   
               } catch (SQLException ex) {
                      Logger lgr = Logger.getLogger(Connect.class.getName());
                      lgr.log(Level.SEVERE, ex.getMessage(), ex);
   
               }
         }
   
         public User getUser(int id) {
   
               User user = null;
               try {
   
                      PreparedStatement preparedStatement = con
                                    .prepareStatement("select * from user where id = ?");
                      preparedStatement.setInt(1, id);
   
                      ResultSet rs = preparedStatement.executeQuery();
   
                      if (rs.next()) {
   
                             user = new User();
                             user.setId(rs.getInt(1));
                             user.setUserName(rs.getString(2));
                             user.setPassword(rs.getString(3));
                             user.setAddress(rs.getString(4));
                             user.setEmail(rs.getString(5));
   
                      }
   
               } catch (SQLException ex) {
                      Logger lgr = Logger.getLogger(Connect.class.getName());
                      lgr.log(Level.SEVERE, ex.getMessage(), ex);
   
               }
               return user;
         }
         
         public void deleteUser(int id) {
   
               try {
   
                      PreparedStatement preparedStatement = con
                                    .prepareStatement("delete from user where id = ?");
                      preparedStatement.setInt(1, id);
   
                      preparedStatement.execute();
   
               } catch (SQLException ex) {
                      Logger lgr = Logger.getLogger(Connect.class.getName());
                      lgr.log(Level.SEVERE, ex.getMessage(), ex);
   
               }
         }
    */
}
