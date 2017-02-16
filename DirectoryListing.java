import java.io.*;
import javax.swing.*;

/**
 * DirectoryListing is a simple program that lists all the files in a given
 * directory.
  */

public class DirectoryListing {
  public static void main(String[] args){
    String fileName, contents[];
    File file;
    
    fileName = JOptionPane.showInputDialog(null, "Enter file name");
    file = new File(fileName);
    
    if(!file.exists()) {
      System.out.println("File does not exist");
      System.exit(0);
    }
    
    if(file.isFile()) {
      System.out.println("File is not a directory");
      System.exit(0);
    }
    
    contents = file.list();
    for(int i=0; i<contents.length; i++)
      System.out.println(contents[i]);
  }
}
    