import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame
{
    public static void main(String arg[]) 
    {
        JFrame aim = new JFrame("Frame");
        aim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BMDSGUI frame = new BMDSGUI();
        
        aim.getContentPane().add(frame);
        aim.pack();
        aim.setVisible(true);
        
        
    
    } 
   
    
    
    
}
