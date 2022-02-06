/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataAcess.ConnectionDB;
import Objects.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Gilberto
 */
public class ControllerUser {
    
    private Connection con = ConnectionDB.getConnection();
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
     public boolean checkLogin(User user) throws Exception {
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_user WHERE email = ? and senha = ?");
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());
            

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
//            if(stmt != null)
//                stmt.close();
//            if(rs != null)
//                rs.close();
//            if(con != null)
//                con.close();
        }
        return check;

    }
    public void inserir(User user)throws Exception{
      PreparedStatement stmt = ConnectionDB.
              getConnection().prepareStatement(("insert into tb_user(nome,email,senha)"
                  +"VALUES(?,?,?);"));
      stmt.setString(1, user.getNome());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getSenha());

      
       int row = stmt.executeUpdate();
        if (row == 0) {
            throw new Exception("Insercao não realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
        }
        
        
    }
}
