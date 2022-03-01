
import Controllers.ControllerAdotante;
import Controllers.ControllerAnimal;
import Controllers.ControllerPedidos;
import Controllers.ControllerUser;
import Objects.Adotante;
import Objects.Animal;
import Objects.PedidoAdocao;
import Objects.User;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
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
public class PedidosAdocao {

    public static void main(String[] args) throws Exception {
        pegarPedidosAdocao();
    }
    public static void pegarPedidosAdocao() throws Exception{
        ControllerPedidos c = new ControllerPedidos();
        ArrayList<PedidoAdocao> p = c.getList();
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }
    }
    
}
