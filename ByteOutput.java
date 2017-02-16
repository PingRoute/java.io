import java.io.*;
import javax.swing.*;

/**
 * ByteOutput is a simple program that illustrates the  output of data to a file at the
 * level of bytes.
 */

public class ByteOutput{
  public static void main (String[] args)throws IOException {
    File outFile;
    FileOutputStream outStream=null;
    byte[] byteArray = {97,98,99,100, 7};
    
    outFile = getOutputFile();
    //outFile = new File("/Users/sunil/Dropbox/Programs/FileIO/test2");
    if(outFile==null)
      return;
    
    try{
      outStream = new FileOutputStream(outFile);
      outStream.write(byteArray);
      //outStream.close();
    } catch (FileNotFoundException e){
      JOptionPane.showMessageDialog(null, "The selected file could not be found \n" + e.getMessage());
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "IO Exception: " + e.getMessage());
    } finally {
      if(outStream != null)
        outStream.close();
    }
    
  }
  
  static File getOutputFile(){
    int status;
    
    JFileChooser chooser = new JFileChooser();
    status = chooser.showOpenDialog(null);
    if(status == JFileChooser.APPROVE_OPTION)
      return chooser.getSelectedFile();
    else
      return null;
  }
}
