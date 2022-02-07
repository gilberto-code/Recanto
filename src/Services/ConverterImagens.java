    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author joaol
 */
public class ConverterImagens {
    public static ImageIcon montarImagem(String imgString) {

        try {
            if (imgString != null) {
                byte[] montar = Base64.getDecoder().decode(imgString);
                
                ImageIcon oi = new ImageIcon(montar);
                int larg = oi.getIconWidth();
                int alt = oi.getIconHeight();
                ImageIcon image = new ImageIcon(oi.getImage()
                        .getScaledInstance(150, 150, Image.SCALE_FAST));
                return image;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Controllers.ControllerAnimal.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
    
    public static String ImagemParaString (ImageIcon Imagem){
            ImageIcon img_icon = Imagem;
            Icon icon = img_icon;

            BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = img.createGraphics();
            icon.paintIcon(null, g2d, 0, 0);
            g2d.dispose();

            byte[] img_bytes = null;
            String encodedImage = null;
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
                try {
                    ImageIO.write(img, "png", ios);
                    // Set a flag to indicate that the write was successful
                } finally {
                    ios.close();
                }
                img_bytes = baos.toByteArray();
                Base64.Encoder encoder = Base64.getEncoder();
                encodedImage = encoder.encodeToString(img_bytes);
                return(encodedImage);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        return null;   
    }
}
