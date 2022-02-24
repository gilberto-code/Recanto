package Controllers;

import DataAcess.ConnectionDB;
import Objects.Animal;
import java.io.IOException;
import java.sql.Date;
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
 * @author João Lucas Silva Solano
 */
public class ControllerAnimal {

    public void insert(Animal animal) throws Exception {
        long miliseconds = System.currentTimeMillis();
        Date dataAtual = new Date(miliseconds);

        PreparedStatement stmt
                = ConnectionDB.getConnection().prepareStatement(
                        ("INSERT INTO tb_animais(nome,idade,especie,raca,cor,"
                        + "porte ,sexo ,descricao,dataDeCadastro,"
                        + "qualDoenca,doente,castrado,vacinado)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);"));

        stmt.setString(1, animal.getNome());
        stmt.setInt(2, animal.getIdade());
        stmt.setString(3, (animal.getEspecie()));
        stmt.setString(4, (animal.getRaca()));
        stmt.setString(5, (animal.getCor()));
        stmt.setString(6, (animal.getPorte()));
        stmt.setString(7, (animal.getSexo()));
        stmt.setString(8, (animal.getDescricao()));
        stmt.setDate(9, dataAtual);
        stmt.setString(10, (animal.getQualDoenca()));
        stmt.setBoolean(11, animal.isDoente());
        stmt.setBoolean(12, (animal.isCastrado()));
        stmt.setBoolean(13, (animal.isVacinado()));

        int row = stmt.executeUpdate();
        if (row == 0) {
            throw new Exception("Infelismente o Animal não foi cadastrado, tente novamente");
        } else {
            stmt.close();

            Statement st2 = ConnectionDB.getConnection().createStatement();
            ResultSet rsImg = st2.executeQuery("select idAnimal from tb_animais"
                    + " ORDER BY idAnimal DESC LIMIT 1;");
            int id = 0;
            while (rsImg.next()) {
                id = rsImg.getInt(1);
            }
            insertImage(animal.getImagem(), id);

            stmt.close();
        }
    }

    public void insertImage(String imagem, int id) throws Exception {
        PreparedStatement stmt
                = ConnectionDB.getConnection().prepareStatement("insert into "
                        + "tb_imagens(imagem , idAnimal) "
                        + "VALUES(?,?);");
        stmt.setString(1, imagem);
        stmt.setInt(2, id);
        int row = stmt.executeUpdate();
        if (row == 0) {
            throw new Exception("Insercao não realizada");
        } else {
            //JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
        }
    }

    public void delete(Animal animal) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement(
                        "DELETE tb_imagens,tb_animais  FROM tb_imagens\n"
                        + "LEFT JOIN tb_animais ON  tb_imagens.idAnimal= tb_animais.idAnimal \n"
                        + "WHERE tb_animais.idAnimal = tb_imagens.idAnimal \n"
                        + "AND tb_imagens.idAnimal =?;");
        ps.setInt(1, animal.getId());
        int row = ps.executeUpdate();
        if (row == 0) {
            JOptionPane.showMessageDialog(null, "Exclusão Falhou");
        }

    }

    public void update(Animal animal) {
        try {
            PreparedStatement ps
                    = ConnectionDB.getConnection().prepareStatement(
                            "UPDATE tb_animais SET especie = ?, nome = ?, idade = ?,raca = ?, "
                            + "cor = ?,porte = ?, "
                            + "descricao = ?, qualDoenca = ?, "
                            + "doente  = ?, castrado = ?, vacinado = ?,"
                            + " sexo = ? WHERE idAnimal = ?");

            ps.setString(1, animal.getEspecie());
            ps.setString(2, animal.getNome());
            ps.setInt(3, animal.getIdade());
            ps.setString(4, animal.getRaca());
            ps.setString(5, animal.getCor());
            ps.setString(6, animal.getPorte());
            ps.setString(7, animal.getDescricao());
            ps.setString(8, animal.getQualDoenca());
            ps.setBoolean(9, animal.isDoente());
            ps.setBoolean(10, animal.isCastrado());
            ps.setBoolean(11, animal.isVacinado());
            ps.setString(12, animal.getSexo());
            ps.setInt(13, animal.getId());

            int row = ps.executeUpdate();
            System.out.println("OP 1  " + row);
            if (row == 0) {
                JOptionPane.showMessageDialog(null, "Atualização falhou, por favor tente novamente");
            } else {
                ps
                        = ConnectionDB.getConnection().prepareStatement(
                                "UPDATE tb_imagens SET "
                                + " imagem = ? WHERE idAnimal = ?");

                ps.setString(1, animal.getImagem());
                ps.setInt(2, animal.getId());
                row = ps.executeUpdate();
                if (row == 0) {
                    System.out.println("OP 2  " + row);
                    JOptionPane.showMessageDialog(null, "Atualização falhou, por favor tente novamente");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Animal> retrieve(String nome) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from tbl_animais"
                        + " where nome like ?");
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> retrieve(Animal animal) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement(""
                        + "select nome ,idade,especie,raca ,cor ,porte ,"
                        + "sexo ,descricao ,dataDeCadastro ,qualDoenca,\n"
                        + "doente ,castrado ,vacinado,imagem , "
                        + "tb.idAnimal from tb_animais tb left join \n"
                        + "tb_imagens img on tb.idAnimal = img.idAnimal WHERE adotado = ? and \n"
                        + "nome like ? and \n"
                        + "especie  like ? and \n"
                        + "raca like ? and \n"
                        + "porte like ? and \n"
                        + "sexo like ? \n");
        
        ps.setBoolean(1,  animal.isAdotado() );
        ps.setString(2, "%" + animal.getNome() + "%");
        ps.setString(3, "%" + animal.getEspecie()+ "%");
        ps.setString(4, "%" + animal.getRaca()+ "%");
        ps.setString(5, "%" + animal.getPorte()+ "%");
        ps.setString(6, "%" + animal.getSexo()+ "%");
            
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> retrieve(String nome, int idade) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from tbl_animais"
                        + " where nome like ? and idade like ?");
        ps.setString(1, "%" + nome + "%");
        ps.setInt(2, idade);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> retrieve(int idade) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from "
                        + "tbl_animais where idade like ?");
        ps.setInt(1, idade);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> getList(boolean isAdotado) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select nome ,idade,especie,raca "
                        + ",cor ,porte ,\n"
                        + "sexo ,descricao ,dataDeCadastro ,qualDoenca,\n"
                        + " doente ,castrado ,vacinado,imagem ,\n"
                        + "tb.idAnimal from tb_animais tb left join "
                        + "tb_imagens img on tb.idAnimal = img.idAnimal "
                        + "WHERE adotado = ?;");
        ps.setBoolean(1, isAdotado);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    private ArrayList<Animal> carregarLista(ResultSet rs) throws SQLException, IOException {
        ArrayList<Animal> lista = new ArrayList<>();
        Animal animal;
        while (rs.next()) {
            animal = new Animal(
                    //nome
                    rs.getString(1),
                    //especie
                    rs.getInt(2),
                    //idade
                    rs.getString(3),
                    //raca
                    rs.getString(4),
                    //cor
                    rs.getString(5),
                    //porte
                    rs.getString(6),
                    //sexo
                    rs.getString(7),
                    //descricao
                    rs.getString(8),
                    //date
                    rs.getDate(9),
                    //qualDoenca
                    rs.getString(10),
                    //doente
                    rs.getBoolean(11),
                    //castrado
                    rs.getBoolean(12),
                    //vacinado
                    rs.getBoolean(13),
                    //imaagem
                    rs.getString(14),
                    //id
                    rs.getInt(15)
            );
            lista.add(animal);
        }
        rs.close();
        return lista;
    }
}
