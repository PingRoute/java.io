import java.io.*;
import javax.swing.*;

/**
 * DataInput is a simple program that illustrates the  input of data to a file at the
 * level of primitive data types.
  */

public class DataInput{
  public static void main(String[] args){
    File inFile;
    FileInputStream inStream=null;
    DataInputStream inDataStream=null;
    int i=0;
    long l=0L;
    char c=' ';
    boolean bool=true;
    float f=0.0F;
    double d=0.0;
    
    inFile = getInputFile();
    //inFile = new File("/Users/sunil/Dropbox/Spring2012/Programs/FileIO/DataTest");
    if(inFile==null)
      return;
    
    try{
      inStream = new FileInputStream(inFile);
      
      inDataStream = new DataInputStream(inStream);
      i = inDataStream.readInt();      
      l = inDataStream.readLong();      
      f = inDataStream.readFloat();      
      d = inDataStream.readDouble();      
      c = inDataStream.readChar();      
      bool = inDataStream.readBoolean(); 

    } catch (FileNotFoundException e){
      JOptionPane.showMessageDialog(null, "The selected file could not be found");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, "IO Exception" + e.getMessage());
    } 
    
      
    System.out.println("Read int:" + i);
    System.out.println("Read long:" + l);
    System.out.println("Read float:" + f);
    System.out.println("Read double:" + d);
    System.out.println("Read char:" + c);
    System.out.println("Read boolean:" + bool);
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
