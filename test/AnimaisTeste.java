
import Controllers.ControllerAnimal;
import Objects.Animal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;
import java.sql.Date;
import javax.imageio.ImageIO;

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

        for (int i = 0; i < 1; i++) {
            criarAnimal();
        }

        //criarAnimal();
        //deleteAnimal();
//        if(checkLogin() != true){
//            throw new Exception("Login Falhou");
//        } else {
//            JOptionPane.showMessageDialog(null, "Login confirmado");
//        }
    }

    public static void criarAnimal() throws Exception {
        String filePath = "C:/Users/Gilberto/Desktop/650PIN.png";

        BufferedImage bufferedImage = ImageIO.read(new File(filePath));
        Image image = bufferedImage.getScaledInstance(500,
                500, Image.SCALE_SMOOTH);

        BufferedImage bi = new BufferedImage(image.getWidth(null), image.getHeight(null),
                BufferedImage.SCALE_SMOOTH);

        Graphics g = bi.createGraphics();
        g.drawImage(image, 0, 0, null);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bi, "jpg", bos);
        byte[] data = bos.toByteArray();

        String encodedString = Base64.getEncoder().encodeToString(data);

        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        Animal animal = new Animal("nome", 1, "especie", "raca",
                "cor", "porte", "sexo",
                "descricao", date,
                "qualDoenca", true, true, true, false, encodedString);

        ControllerAnimal controllerAnimal = new ControllerAnimal();
        controllerAnimal.insert(animal);
    }

    public static void deleteAnimal() throws Exception {

        Animal animal = new Animal("nome", 1, "especie", "raca",
                "cor", "porte", "sexo",
                "descricao", null,
                "qualDoenca", true, true, true, false, "imagem");
        animal.setId(37);
        ControllerAnimal controllerAnimal = new ControllerAnimal();
        controllerAnimal.delete(animal);
    }
}
