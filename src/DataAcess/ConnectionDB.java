/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto
 */
public class ConnectionDB {
    private static final String STR_CONEXAO = "jdbc:mysql://database-recanto01.cnjmjy9kebcg.sa-east-1.rds.amazonaws.com/dbRecanto01";
    //private static final String STR_CONEXAO = "jdbc:mysql://sql176.main-hosting.eu/u800322465_db00";
    //para PostgreSql use: private static final String STR_CONEXAO = "jdbc:postgresql://localhost/plano_diario";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //para PostgreSql use: private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "admin";
    private static final String SENHA = "senhateste";
    private static Connection connection;
    
    public static Connection getConnection(){
        if (connection == null){
            new ConnectionDB();
        }
        return connection;
    }
    
    public ConnectionDB(){
        try{
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(
                    STR_CONEXAO, USUARIO, SENHA);
        }catch(Exception ex){    
            JOptionPane.showMessageDialog(null, 
                    "Conexão não estabelecida\n "+ex.getMessage(), 
                    "Erro na Conexao com o SGBD", JOptionPane.INFORMATION_MESSAGE);
        }    
    }
}
