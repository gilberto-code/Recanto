
import Controllers.ControllerUser;
import DataAcess.ConnectionDB;
import Objects.User;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gilberto
 */
public class UserTests {
    public static void main(String[] args) throws Exception {
        //criarUsuario();
        
        if(checkLogin() != true){
            throw new Exception("Login Falhou");
        } else {
            JOptionPane.showMessageDialog(null, "Login confirmado");
        }
    }
    public static void criarUsuario() throws Exception{
        User user = new User("gilberto", "gil@gmail.com","semsenha");
        ControllerUser controllerUser = new ControllerUser();
        controllerUser.inserir(user);
    }
    public static boolean checkLogin() throws Exception{
        User user = new User("gilberto", "gil@gmail.com","semsenha");
        ControllerUser controllerUser = new ControllerUser();
        return controllerUser.checkLogin(user);
    }
}
