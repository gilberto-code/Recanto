/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gilberto
 */
public class TesteBASE64 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/Gilberto/Desktop/a.jpg";
        byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        
        FileWriter arq = new FileWriter("C:/Users/Gilberto/Desktop/nazare.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf(encodedString);

        arq.close();
        
        
        System.out.println("opa");
    }
}
//public class FileToBase64StringConversionUnitTest {
//
//    private String inputFilePath = "test_image.jpg";
//    private String outputFilePath = "test_image_copy.jpg";
//
//    @Test
//    public void fileToBase64StringConversion() throws IOException {
//        // load file from /src/test/resources
//        ClassLoader classLoader = getClass().getClassLoader();
//        File inputFile = new File(classLoader
//          .getResource(inputFilePath)
//          .getFile());
//
//        byte[] fileContent = FileUtils.readFileToByteArray(inputFile);
//        String encodedString = Base64
//          .getEncoder()
//          .encodeToString(fileContent);
//
//        // create output file
//        File outputFile = new File(inputFile
//          .getParentFile()
//          .getAbsolutePath() + File.pathSeparator + outputFilePath);
//
//        // decode the string and write to file
//        byte[] decodedBytes = Base64
//          .getDecoder()
//          .decode(encodedString);
//        FileUtils.writeByteArrayToFile(outputFile, decodedBytes);
//
//        assertTrue(FileUtils.contentEquals(inputFile, outputFile));
//    }
//}
