package common;

import java.io.File;
import javax.swing.JOptionPane;

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
