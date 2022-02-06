package Services;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import DataAcess.ConnectionDB;
import Objects.Animal;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

public class GerarPDF {
    
    public void gerar (){
        int numcolunas = 10;
        ArrayList<Animal> lis = BindTable();
        Document doc = new Document();
        String arquivoPdf = "PDF Animais";
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
            doc.open();
            Paragraph p = new Paragraph("<: Lista de Animais :>");
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            PdfPTable table = new PdfPTable(numcolunas);
            PdfPCell cell = new PdfPCell(new Paragraph("Nome",
                    new Font(FontFamily.UNDEFINED, 10, Font.NORMAL,new BaseColor(0, 0, 255))));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Especie"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Raça"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Cor"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Bairro En contrado"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Está Doente"));
            PdfPCell cel7 = new PdfPCell(new Paragraph("Está Aci dentado"));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Data De Cadastro"));
            PdfPCell cel9 = new PdfPCell(new Paragraph("Idade"));
            
            table.addCell(cell);
            table.addCell(cel2);
            table.addCell(cel3);
            table.addCell(cel4);
            table.addCell(cel5);
            table.addCell(cel6);
            table.addCell(cel7);
            table.addCell(cel8);
            table.addCell(cel9);
            
            for (Animal animal : lis) {
                cell = new PdfPCell(new Paragraph(animal.getNome()));
                cel2 = new PdfPCell(new Paragraph(animal.getEspecie()));
                cel3 = new PdfPCell(new Paragraph(animal.getRaca()));
                cel4 = new PdfPCell(new Paragraph(animal.getCor()));
                if (animal.isDoente())
                        cel6 = new PdfPCell(new Paragraph("Sim"));
                else cel6 = new PdfPCell(new Paragraph("não"));
                cel8 = new PdfPCell(new Paragraph("DATE"));
                cel9 = new PdfPCell(new Paragraph(animal.getIdade() + ""));
                
                table.addCell(cell);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
                table.addCell(cel7);
                table.addCell(cel8);
                table.addCell(cel9);
            }
            
            table.setLockedWidth(true);
            table.setTotalWidth(595);
            doc.add(table);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPdf));
        } catch (Exception e) {
            System.out.println("Fecha o outro PDF  :)");
        }
    }
    private static ArrayList<Animal> BindTable() {
        ArrayList<Animal> list = new ArrayList<Animal>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("select nome ,especie,idade ,raca ,cor ,porte ,sexo ,descricao ,"
                + "temperamento ,bairroEncontrado ,nomeContato,telefoneContato ,dataDeCadastro ,qualDoenca,"
                + "qualAcidente , doente ,acidentado ,castrado ,vacinado ,prenha,idAnimal from tbl_animais;");

            Animal animal;
            //animal = new Animal(nome, );
            while (rs.next()) {
                animal = new Animal(
                    //nome
                    rs.getString(1),
                    //idade
                    rs.getInt(2),
                    //especie
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
                    rs.getString(21)
                    
            );
                list.add(animal);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    private static Connection getConnection() {

        ConnectionDB fdc = new ConnectionDB();
        return ConnectionDB.getConnection();
    }
}

