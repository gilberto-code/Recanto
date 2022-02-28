
import Controllers.ControllerAdotante;
import Controllers.ControllerAnimal;
import Controllers.ControllerUser;
import Objects.Adotante;
import Objects.Animal;
import Objects.User;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.Date;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gilberto
 */
public class AdotanteTests {

    public static void main(String[] args) throws Exception {
        criarAdotante();

    }
    public static void criarAdotante() throws Exception {
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

        Adotante adotante = new Adotante("Gilberto", "13176351674","985224755","Rua Ceará 64",encodedString);
        
        ControllerAdotante controllerAdotante = new ControllerAdotante();
        controllerAdotante.inserir(adotante);
    }
}
