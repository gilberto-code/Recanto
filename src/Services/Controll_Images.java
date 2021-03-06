/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gilberto
 */
public class Controll_Images {

    public ImageIcon redimensionar_imagem(ImageIcon img) {

        img.setImage(img.getImage().getScaledInstance(200, 200, 100));
        return img;
    }

    public String redimensionar(String filePath) throws IOException {
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
        return encodedString;
    }

    public String inserirFoto(JLabel fotinha) {
        String path = "";
        JFileChooser jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser1.showOpenDialog(null);
        File arquivo = jFileChooser1.getSelectedFile();
        if (arquivo != null) {
            String foto = arquivo.getPath();
            fotinha.setIcon(redimensionar_imagem(new ImageIcon(foto)));
            foto = (fotinha.getIcon().toString());
            path = foto;
        } else {
            System.out.println("Deu muito ruim");
        }
        return path;
    }

    public static String convertImageForBASE64(String filePath) {
        byte[] fileContent;
        try {
            fileContent = FileUtils.readFileToByteArray(new File(filePath));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            return encodedString;
        } catch (IOException ex) {

        }
        return "";
    }

    public static String ImagemParaString(ImageIcon Imagem) {
        if (Imagem != null) {
            ImageIcon img_icon = Imagem;
            Icon icon = img_icon;

            try {
                BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = img.createGraphics();
                icon.paintIcon(null, g2d, 0, 0);
                g2d.dispose();

                byte[] img_bytes = null;
                String encodedImage = null;

                try ( ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
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
                    return (encodedImage);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "Imagem n??o adicionada corretamente",
                    "Ocorreu um erro durante a execu????o do programa", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        return null;
    }

    public static ImageIcon montarImagem(String imgString, int width, int height) {

        try {
            if (imgString != null) {
                
                byte[] montar = Base64.getDecoder().decode(imgString);

                ImageIcon oi = new ImageIcon(montar);
                int larg = oi.getIconWidth();
                int alt = oi.getIconHeight();
                ImageIcon image = new ImageIcon(oi.getImage()
                        .getScaledInstance(width, height, Image.SCALE_FAST));
                return image;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Controllers.ControllerAnimal.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }
    

    public static String ImagemParaStringNAO(ImageIcon Imagem) {
        ImageIcon img_icon = Imagem;
        Icon icon = img_icon;

        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        byte[] img_bytes = null;
        String encodedImage = null;
        try ( ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
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
            return (encodedImage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
