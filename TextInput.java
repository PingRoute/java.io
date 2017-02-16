import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * TextInput is a simple program that illustrates the  input of data from a file in text
 * format.
 */

public class TextInput{
  public static void main(String[] args){
    File inFile;
    FileInputStream inStream=null;
    Scanner scanner=null;
    int i= 0;
    long l=0L;
    char c=' ';
    boolean bool=false;
    float f=0.0F;
    double d=0.0;
    
    inFile = getInputFile();
    //inFile = new File("/Users/sunil/PrintTest");
    if(inFile==null)
      return;
    
    try{
      inStream = new FileInputStream(inFile);
      scanner = new Scanner(inStream);
      i = scanner.nextInt();
      l = scanner.nextLong();
      f = scanner.nextFloat();
      d = scanner.nextDouble();
      c = scanner.next().charAt(0);
      bool = scanner.nextBoolean();

      inStream.close(); 

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
