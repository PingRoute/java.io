import java.io.*;
import javax.swing.*;

/**
 * FileBrowser a simple program that allows the user to select
 * a file from the local file system.
 */



public class FileBrowser {
  public static void main (String[] args){
    File file, dir;
    
    JFileChooser chooser = new JFileChooser();
    
    int status = chooser.showOpenDialog(null);
    
    if(status == JFileChooser.APPROVE_OPTION) {
      file = chooser.getSelectedFile();
      dir = chooser.getCurrentDirectory();
      JOptionPane.showMessageDialog(null, "You chose to open the file "
                                   + file +
      " in directory " + dir);
    } else
      JOptionPane.showMessageDialog(null, "You decided to cancel");
  }
}
                                      