import java.io.*;
import javax.swing.*;

/**
 * DataOutput is a simple program that illustrates the  output of data to a file at the
 * level of primitive data types.
 */

public class DataOutput{
  public static void main(String[] args){
    File outFile;
    FileOutputStream outStream=null;
    DataOutputStream outDataStream=null;
    int i= 34;
    long l=45L;
    char c='$';
    boolean bool=true;
    float f=3.14256F;
    double d=2.34563;
    
    outFile = getOutputFile();
    //outFile = new File("/Users/sunil/Dropbox/Spring2012/Programs/FileIO/DataTest");
    if(outFile==null)
      return;
    
    try{
      outStream = new FileOutputStream(outFile);
      
      outDataStream = new DataOutputStream(outStream);
      outDataStream.writeInt(i);      
      outDataStream.writeLong(l);      
      outDataStream.writeFloat(f);      
      outDataStream.writeDouble(d);      
      outDataStream.writeChar(c);      
      outDataStream.writeBoolean(bool); 

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
