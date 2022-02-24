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
import com.itextpdf.text.Rectangle;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GerarPDF {

    public void gerar(ArrayList<Animal> lis) throws Exception {
        int numcolunas = 12;
        Document doc = new Document();
        String arquivoPdf = "PDF Animais";
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
            doc.open();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();


            Paragraph p = new Paragraph("Lista de Animais - "+dateFormat.format(date));
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            PdfPTable table = new PdfPTable(numcolunas);
            Font font = new Font(FontFamily.UNDEFINED, 8, Font.NORMAL, new BaseColor(0, 0, 255));
            Font font2 = new Font(FontFamily.UNDEFINED, 8, Font.NORMAL, new BaseColor(0, 0, 0));

            PdfPCell cell = new PdfPCell(new Paragraph("Nome", font));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Idade", font));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Especie", font));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Raça", font));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Cor", font));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Porte", font));
            PdfPCell cel7 = new PdfPCell(new Paragraph("Sexo", font));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Doente", font));
            PdfPCell cel9 = new PdfPCell(new Paragraph("Castrado", font));
            PdfPCell cel10 = new PdfPCell(new Paragraph("Vacinado", font));
            PdfPCell cel11 = new PdfPCell(new Paragraph("Adotado", font));
            PdfPCell cel12 = new PdfPCell(new Paragraph("Data Cadastro", font));
            
            table.addCell(cell);
            table.addCell(cel2);
            table.addCell(cel3);
            table.addCell(cel4);
            table.addCell(cel5);
            table.addCell(cel6);
            table.addCell(cel7);
            table.addCell(cel8);
            table.addCell(cel9);
            table.addCell(cel10);
            table.addCell(cel11);
            table.addCell(cel12);

            for (Animal animal : lis) {
                cell = new PdfPCell(new Paragraph(animal.getNome(), font2));
                cel2 = new PdfPCell(new Paragraph(animal.getIdade() + "",font2));
                cel3 = new PdfPCell(new Paragraph(animal.getEspecie(),font2));
                cel4 = new PdfPCell(new Paragraph(animal.getRaca(),font2));
                cel5 = new PdfPCell(new Paragraph(animal.getCor(),font2));
                cel6 = new PdfPCell(new Paragraph(animal.getPorte(),font2));
                cel7 = new PdfPCell(new Paragraph(animal.getSexo(),font2));
                if (animal.isDoente()) {
                    cel8 = new PdfPCell(new Paragraph("Sim",font2));
                } else {
                    cel8 = new PdfPCell(new Paragraph("Não",font2));
                }
                if (animal.isCastrado()) {
                    cel9 = new PdfPCell(new Paragraph("Sim",font2));
                } else {
                    cel9 = new PdfPCell(new Paragraph("Não",font2));
                }
                if (animal.isVacinado()) {
                    cel10 = new PdfPCell(new Paragraph("Sim",font2));
                } else {
                    cel10 = new PdfPCell(new Paragraph("Não",font2));
                }
                if (animal.isAdotado()) {
                    cel11 = new PdfPCell(new Paragraph("Sim",font2));
                } else {
                    cel11 = new PdfPCell(new Paragraph("Não",font2));
                }
                
                cel12 = new PdfPCell(new Paragraph(animal.getDataDeCadastro()+"",font2));
                float[] sizes = new float [12];

                table.addCell(cell);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
                table.addCell(cel7);
                table.addCell(cel8);
                table.addCell(cel9);
                table.addCell(cel10);
                table.addCell(cel11);
                table.addCell(cel12);
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
    
}
