/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafirma;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.JFileChooser;

/**
 *
 * @author jafet
 */
public class Ruta {
    
    public static String ruta(){
    String ruta = "";
    try {
      JFileChooser chooser = new JFileChooser();
      chooser.setDialogTitle("Choose file");
      int opcion = chooser.showOpenDialog(chooser);
      if (opcion == JFileChooser.APPROVE_OPTION){
        File f = chooser.getSelectedFile();
        ruta = f.getAbsolutePath();
        return ruta;
      }
    } catch (HeadlessException e) {
        }
       return "";
    }
    
    public static String readFile(String filePath) throws IOException {
        StringBuilder fileData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath))) {
            char[] buf = new char[1024];
            int numRead=0;
            while((numRead=reader.read(buf)) != -1){
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
        }
        return fileData.toString();
    }
    
    public static void saveFile(String text, String name) throws IOException {
        String path = "C:\\Users\\Federico Laptop\\Desktop\\5semestre\\Crypthograpy\\Firma\\PracticaFirma\\"+name;
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            out.write(text);
            out.close();
        } catch (Exception e) {
        }
    }
    
}
