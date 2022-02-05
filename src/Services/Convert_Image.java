/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gilberto
 */
public class Convert_Image {
    
    public static String convertImageForBASE64(String filePath){
        byte[] fileContent;
        try {
            fileContent = FileUtils.readFileToByteArray(new File(filePath));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            return encodedString;
        } catch (IOException ex) {
            Logger.getLogger(Convert_Image.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public static void convertBase64ForImage(){
        
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
