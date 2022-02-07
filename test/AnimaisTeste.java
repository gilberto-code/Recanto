

import Controllers.ControllerAnimal;
import DataAcess.ConnectionDB;
import Objects.Animal;
import Objects.User;
import java.io.File;
import java.util.Base64;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gilberto
 */
public class AnimaisTeste {
    public static void main(String[] args) throws Exception {
//        criarAnimal();
//        criarAnimal();
//        criarAnimal();
        deleteAnimal();
        
        
//        if(checkLogin() != true){
//            throw new Exception("Login Falhou");
//        } else {
//            JOptionPane.showMessageDialog(null, "Login confirmado");
//        }
    }
    public static void criarAnimal() throws Exception{
        String filePath = "C:/Users/Gilberto/Desktop/_MG_5330.jpg";
        byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        Animal animal = new Animal("nome", 1, "especie", "raca", 
                "cor", "porte", "sexo",
                "descricao",null, 
                "qualDoenca", true, true, true, encodedString);
        
        ControllerAnimal controllerAnimal = new ControllerAnimal();
        controllerAnimal.insert(animal);
    }
    public static void deleteAnimal() throws Exception{
          
        Animal animal = new Animal("nome", 1, "especie", "raca", 
                "cor", "porte", "sexo",
                "descricao",null, 
                "qualDoenca", true, true, true, "imagem");
        animal.setId(37);
        ControllerAnimal controllerAnimal = new ControllerAnimal();
        controllerAnimal.delete(animal);
    }
    /*public static boolean checkLogin() throws Exception{
        User user = new User("gilberto", "gil@gmail.com","semsenha");
        ControllerAnimal controllerAnimal = new ControllerAnimal();
        return ControllerAnimal.checkLogin(user);
    }*/
}
