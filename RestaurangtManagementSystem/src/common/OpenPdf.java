/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author VAN
 */
public class OpenPdf {
        public static void openById(String Id){
        try{
            String filePath = "E:\\" + Id + ".pdf";
            File file = new File(filePath);
            if(file.exists()){
                Process p = Runtime.getRuntime().exec("cmd /c start \"\" \"" + filePath + "\"");
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occurred while opening the file");
        }
    }
}
