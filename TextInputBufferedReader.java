import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * TextInputBufferedReader is a simple program that illustrates the  input of data from a file in text
 * format.
  */

public class TextInputBufferedReader{
  public static void main(String[] args){
    File inFile;;
    FileReader fileReader=null;
    BufferedReader bufferedReader=null;
    int i= 0;
    long l=0L;
    char c=' ';
    boolean bool=true;
    float f=0.0F;
    double d=0.0;
    String str;
    
    inFile = getInputFile();
    //inFile = new File("/Users/sunil/PrintTest");
    if(inFile==null)
      return;
    
    try{
      fileReader = new FileReader(inFile);
      bufferedReader = new BufferedReader(fileReader);
      str = bufferedReader.readLine();
      i = Integer.parseInt(str);
      
      str = bufferedReader.readLine();
      l = Long.parseLong(str);
      
      str = bufferedReader.readLine();
      f = Float.parseFloat(str);
      
      str = bufferedReader.readLine();
      d = Double.parseDouble(str);
      
      c = bufferedReader.readLine().charAt(0);
      
      str = bufferedReader.readLine();
      bool = Boolean.parseBoolean(str);

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
