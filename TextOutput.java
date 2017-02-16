import java.io.*;
import javax.swing.*;

/**
 * TextOutput is a simple program that illustrates the  output of data to a file in text
 * format
 */

public class TextOutput{
  public static void main(String[] args){
    File outFile;
    FileOutputStream outStream=null;
    PrintWriter outPrintStream=null;
    int i= 3434;
    long l=45656L;
    char c='$';
    boolean bool=false;
    float f=3.14256F;
    double d=2.34563;
    
    //outFile = getOutputFile();
    outFile = new File("/Users/sunil/PrintTest");
    if(outFile==null)
      return;
    
    try{
      outStream = new FileOutputStream(outFile);
      outPrintStream = new PrintWriter(outStream);
      outPrintStream.println(i);      
      outPrintStream.println(l);      
      outPrintStream.println(f);      
      outPrintStream.println(d);      
      outPrintStream.println(c);      
      outPrintStream.println(bool); 
      outPrintStream.close(); 

    } catch (FileNotFoundException e){
      JOptionPane.showMessageDialog(null, "The selected file could not be found");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "IO Exception" + e.getMessage());
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
