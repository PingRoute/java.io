import java.io.*;
import javax.swing.*;

/**
 * ByteInput is a simple program that illustrates the  input of data to a file at the
 * level of bytes.
  */

public class ByteInput{
  public static void main(String[] args){
    File inFile;
    FileInputStream inStream=null;
    byte[] byteArray;
    
    inFile = getInputFile();
    //inFile = new File("/Users/sunil/Dropbox/Spring2012/Programs/FileIO/test");
    if(inFile==null)
      return;
    
    int fileSize = (int)inFile.length();
    byteArray = new byte[fileSize];
    try{
      inStream = new FileInputStream(inFile);
      inStream.read(byteArray);
      inStream.close();
    } catch (FileNotFoundException e){
      JOptionPane.showMessageDialog(null, "The selected file could not be found");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "IO Exception" + e.getMessage());
    } 
    
      
    for(int i = 0; i<byteArray.length;i++)
      System.out.print(" " + (char)byteArray[i]);
    System.out.println("\n");
  }
  
  static File getInputFile(){
    int status;
    
    JFileChooser chooser = new JFileChooser();
    status = chooser.showOpenDialog(null);
    if(status == JFileChooser.APPROVE_OPTION)
      return chooser.getSelectedFile();
    else
      return null;
  }
}
