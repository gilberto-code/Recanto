/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataAcess.ConnectionDB;
import Objects.Adotante;
import Objects.Animal;
import Objects.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto
 */
public class ControllerAdotante {

    public void inserir(Adotante adotante) throws Exception {
        PreparedStatement stmt = ConnectionDB.
                getConnection().prepareStatement(("insert into tb_adotante(nome,cpf,telefone,endereco)"
                        + "VALUES(?,?,?,?);"));
        stmt.setString(1, adotante.getNome());
        stmt.setString(2, adotante.getCpf());
        stmt.setString(3, adotante.getTelefone());
        stmt.setString(4, adotante.getEndereco());

        try {
            int row = stmt.executeUpdate();
            if (row == 0) {
                JOptionPane.showMessageDialog(null,"Inserção não realizada");
            } else {
                stmt.close();

                Statement st2 = ConnectionDB.getConnection().createStatement();
                ResultSet rsImg = st2.executeQuery("select idAdotante from tb_adotante"
                        + " ORDER BY idAdotante DESC LIMIT 1;");
                int id = 0;
                while (rsImg.next()) {
                    id = rsImg.getInt(1);
                }
                insertImage(adotante.getImagem(), id);

                stmt.close();
            }
        } catch (Exception e) {
            if (e.getLocalizedMessage().startsWith("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Adotante já cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado");
            }
        }
    }

    public void insertImage(String imagem, int id) throws Exception {
        PreparedStatement stmt
                = ConnectionDB.getConnection().prepareStatement("insert into "
                        + "tb_imagens_adotantes(imagem , idAdotante) "
                        + "VALUES(?,?);");
        stmt.setString(1, imagem);
        stmt.setInt(2, id);
        int row = stmt.executeUpdate();
        if (row == 0) {
            JOptionPane.showMessageDialog(null,"Inserção não realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
        }
    }
    

}
