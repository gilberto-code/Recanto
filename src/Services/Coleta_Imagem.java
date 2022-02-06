package Processos;

import java.io.File;
import java.text.Normalizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Coleta_Imagem {

    public Coleta_Imagem() {
    }

    public ImageIcon redimensionar_imagem(ImageIcon img) {
        img.setImage(img.getImage().getScaledInstance(200, 200, 100));
        return img;
    }

    public String inserirFoto(JLabel fotinha) {
        String path ="";
        JFileChooser jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser1.showOpenDialog(null);
        File arquivo = jFileChooser1.getSelectedFile();
        if (arquivo != null) {
            String foto = arquivo.getPath();
            fotinha.setIcon(redimensionar_imagem(new ImageIcon(foto)));
            foto = (fotinha.getIcon().toString());
            path = foto;
        } else {
            /*jLfoto.setIcon(new ImageIcon(getClass().getResource("/ViewImagens/no_photo.png")));
            foto = (jLfoto.getIcon().toString());
            System.out.println("else:" + foto);
             */
            System.out.println("Deu muito ruim");
        }
        return path;
       
    }

}
