package Controllers;


import DataAcess.ConnectionDB;
import Objects.Animal;
import java.awt.Image;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author João Lucas Silva Solano
 */
public class ControllerAnimal {

    public void insert(Animal animal) throws Exception {
        PreparedStatement stmt
                = ConnectionDB.getConnection().prepareStatement(
                        ("insert into tbl_animais(nome ,especie,idade ,raca ,cor ,porte ,sexo ,descricao ,"
                        + "temperamento ,bairroEncontrado ,nomeContato,telefoneContato ,dataDeCadastro ,qualDoenca,"
                        + "qualAcidente , doente ,acidentado ,castrado ,vacinado ,prenha )"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);"));
        
        stmt.setString(1, animal.getNome());
        stmt.setString(2, (animal.getEspecie()));
        stmt.setInt(3, animal.getIdade());
        stmt.setString(4, (animal.getRaca()));
        stmt.setString(5, (animal.getCor()));
        stmt.setString(6, (animal.getPorte()));
        stmt.setString(7, (animal.getSexo()));
        stmt.setString(8, (animal.getDescricao()));
        stmt.setDate(13, (animal.getDataDeCadastro()));
        stmt.setString(14, (animal.getQualDoenca()));
        stmt.setBoolean(16, animal.isDoente());
        stmt.setBoolean(18, (animal.isCastrado()));
        stmt.setBoolean(19, (animal.isVacinado()));
        stmt.setBoolean(20, (animal.isPrenha()));

        int row = stmt.executeUpdate();
        if (row == 0) {
            throw new Exception("Insercao não realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
        }
        
        stmt.close();
        
        Statement st2 = ConnectionDB.getConnection().createStatement();
        ResultSet rsImg = st2.executeQuery("select idAnimal from tbl_animais ORDER BY idAnimal DESC LIMIT 1;");
            //ResultSet rsImg = st2.executeQuery("select imagem from tb_imagens where CHAVE = '"+animal.getCHAVEIMAGEM()+"';");
            int id = 0;
            while (rsImg.next()) {
                id = rsImg.getInt(1);
            }
        insertImage(animal.getImagem(), id);
        
        stmt.close();

    }

    public void insertImage(String imagem, int id) throws Exception {
        PreparedStatement stmt
                = ConnectionDB.getConnection().prepareStatement("insert into tbl_imagens(imagem , idAnimal) "
                        + "VALUES(?,?);");
            stmt.setString(1, imagem);
            stmt.setInt(2, id);
            int row = stmt.executeUpdate();
            if (row == 0) {
                throw new Exception("Insercao não realizada");
            }
    }
    
    public void delete(Animal animal) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement(
                        "delete from animais_adocao WHERE id = ?");
        ps.setInt(1, animal.getId());
        int row = ps.executeUpdate();
        if (row == 0) {
            throw new Exception("Exclusão não realizada");
        }
    }

    public void update(Animal animal) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement(
                        "UPDATE tbl_animais SET  especie = ?, nome = ?, idade = ?,raca = ?, cor = ?,"
                                +"porte = ?, descricao = ?, temperamento = ?,bairroEncontrado = ?, nomeContato = ?,"
                                +"telefoneContato = ?,dataDeCadastro = ?, qualDoenca = ?, qualAcidente = ?, doente  = ?,"
                                +"acidentado = ?, castrado = ?, vacinado = ?,prenha = ? WHERE idAnimal  = ?");
        ps.setString(1, animal.getEspecie());
        ps.setString(2, animal.getNome());
        ps.setInt(3, animal.getIdade());
        ps.setString(4, animal.getRaca());
        ps.setString(5, animal.getCor());
        ps.setString(6, animal.getPorte());
        ps.setString(7, animal.getDescricao());
        ps.setDate(12, animal.getDataDeCadastro());
        ps.setString(13, animal.getQualDoenca());
        ps.setBoolean(15, animal.isDoente());
        ps.setBoolean(17, animal.isCastrado());
        ps.setBoolean(18, animal.isVacinado());
        ps.setBoolean(19, animal.isPrenha());
        ps.setInt(20, animal.getId());

        int row = ps.executeUpdate();
        if (row == 0) {
            throw new Exception("Atualização não realizada");
        }
    }

    public ArrayList<Animal> retrieve(String nome) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from tbl_animais where nome like ?");
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> retrieve(String nome, int idade) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from tbl_animais where nome like ? and idade like ?");
        ps.setString(1, "%" + nome + "%");
        ps.setInt(2, idade);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> retrieve(int idade) throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select * from tbl_animais where idade like ?");
        ps.setInt(1, idade);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    public ArrayList<Animal> getList() throws Exception {
        Statement st = ConnectionDB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select nome ,especie,idade ,raca ,cor ,porte ,sexo ,descricao ,\n" +
"                + temperamento ,bairroEncontrado ,nomeContato,telefoneContato ,dataDeCadastro ,qualDoenca,\n" +
"                + qualAcidente , doente ,acidentado ,castrado ,vacinado \n" +
"                ,prenha,imagem ,tb.idAnimal from tbl_animais tb left join tbl_imagens img on tb.idAnimal = img.idAnimal;");
        //ResultSet rsIm = st.executeQuery("select imagem from tb_imagens where id =");
        return carregarLista(rs);
    }

    private ArrayList<Animal> carregarLista(ResultSet rs) throws SQLException, IOException {
        ArrayList<Animal> lista = new ArrayList<>();
        Animal animal;
        animal = new Animal();
        while (rs.next()) {
//            animal = new Animal(
//                    //nome
//                    rs.getString(1),
//                    //especie
//                    rs.getString(2),
//                    //idade
//                    rs.getInt(3),
//                    //raca
//                    rs.getString(4),
//                    //cor
//                    rs.getString(5),
//                    //porte
//                    rs.getString(6),
//                    //sexo
//                    rs.getString(7),
//                    //descricao
//                    rs.getString(8),
//                    //temperamento
//                    rs.getString(9),
//                    //bairroEncontrado
//                    rs.getString(10),
//                    //nomecontato
//                    rs.getString(11),
//                    //telefone
//                    rs.getString(12),
//                    //datadecadastro
//                    rs.getDate(13),
//                    //qualDoenca
//                    rs.getString(14),
//                    //qualAcidente
//                    rs.getString(15),
//                    //doente
//                    rs.getBoolean(16),
//                    //acidentado
//                    rs.getBoolean(17),
//                    //castrado
//                    rs.getBoolean(18),
//                    //vacinado
//                    rs.getBoolean(19),
//                    //prenha
//                    rs.getBoolean(20),
//                    //id
//                    rs.getString(21),
//                    rs.getInt(22)
//            );
            lista.add(animal);
        }
        rs.close();
        return lista;
    }

    public ImageIcon montarImagem(String imgString) {

        if (imgString != null) {
            //byte[] montar = new sun.misc.BASE64Decoder().decodeBuffer(imgString);
            byte[] montar = null;
            ImageIcon oi = new ImageIcon(montar);
            int larg = oi.getIconWidth();
            int alt = oi.getIconHeight();
            ImageIcon image = new ImageIcon(oi.getImage()
                    .getScaledInstance(larg, alt, Image.SCALE_DEFAULT));
            return image;
        }
        return null;
    }
    
}
