 


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BMDSGUI extends JPanel
{
    private JTextField reg_numField, DOBField, first_NameField, last_NameField, Birth_PlaceField, BlackTextField;
    private JRadioButton Parents, Siblings, Family;
    private JLabel reg_num, DOB, first_Name, last_Name, Birth_Place, Record, result6, but;
    private JButton Previous, Next, Search;
    private JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11;
   // private JPanel Reg, firstname, lastname, DOB,Placeofbirth checkbox result; 
    
    public BMDSGUI()
    {
        reg_num = new JLabel ("Reg. #: ");
        first_Name = new JLabel ("First Name: ");
        last_Name = new JLabel ("Last Name: ");
        DOB = new JLabel ("DOB: ");
        Birth_Place = new JLabel ("Birth Place: ");
        Record = new JLabel ("Record: ");
        but = new JLabel ("  ");
       
        reg_numField = new JTextField (10);
        first_NameField = new JTextField (20);
        last_NameField = new JTextField (20);
        DOBField = new JTextField (9);
        Birth_PlaceField = new JTextField (9);
        JTextArea BlackTextField = new JTextArea (5,35);
        BlackTextField.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        Next = new JButton ("Next");
      //  Confirm.addActionListener (new ButtonListener());
        Previous = new JButton ("Previous");
        //Confirm.addActionListener (new ButtonListener());
        Search = new JButton ("Search");
       // Confirm.addActionListener (new ButtonListener());
        Parents = new JRadioButton ("Parents");
        //Confirm.addActionListener (new ButtonListener());
        Siblings = new JRadioButton ("Siblings");
        //Confirm.addActionListener (new ButtonListener());
        Family = new JRadioButton ("Family");
        //Confirm.addActionListener (new ButtonListener());
        panel = new JPanel ();
        panel2 = new JPanel ();
        panel3 = new JPanel ();
        panel4 = new JPanel ();
        panel5 = new JPanel ();
        panel6 = new JPanel ();
        panel7 = new JPanel ();
        panel8 = new JPanel ();
        panel9 = new JPanel ();
        panel10 = new JPanel ();
        panel11 = new JPanel ();
        
        panel.setBackground (Color.white);
        panel.setPreferredSize (new Dimension (40,10));
        panel.setLayout(new FlowLayout());
        panel.add(reg_num);
        panel.add(reg_numField);
        panel.add(Record);
        
        
        panel2.setBackground (Color.white);
        panel2.setPreferredSize (new Dimension (15,10));
        panel2.setLayout (new FlowLayout());
        panel2.add(first_Name);
        panel2.add(first_NameField);
        
        panel3.setBackground (Color.white);
        panel3.setPreferredSize (new Dimension (15,10));
        panel3.setLayout (new FlowLayout());
        panel3.add(last_Name);
        panel3.add(last_NameField);
        
        panel4.setBackground (Color.white);
        panel4.setPreferredSize (new Dimension (10,10));
        panel4.setLayout (new FlowLayout());
        panel4.add(DOB);
        panel4.add(DOBField);
        panel4.add(Birth_Place);
        panel4.add(Birth_PlaceField);
        
        panel5.setBackground (Color.white);
        panel5.setPreferredSize (new Dimension (30,30));
        panel5.add(but);
        panel5.add(Search);
        
        panel6.setBackground (Color.white);
        panel6.setPreferredSize (new Dimension (450,210));
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.PAGE_AXIS));
        panel6.add(panel);
        panel6.add(panel2);
        panel6.add(panel3);
        panel6.add(panel4);
        panel6.add(panel5);
        
        panel7.setBackground (Color.white);
        panel7.setPreferredSize(new Dimension (50,21));
        panel7.setLayout(new FlowLayout());
        panel7.add(Parents);
        panel7.add(Siblings);
        panel7.add(Family);
        
        panel8.setBackground (Color.white);
        panel8.add(BlackTextField);
        
        
        panel9.setBackground (Color.white);
        panel9.setPreferredSize(new Dimension (250,110));
        panel9.setLayout (new FlowLayout());
        panel9.add(Previous);
        panel9.add(Next);
  
        panel10.setBackground (Color.white);
        panel10.setPreferredSize(new Dimension (420, 250));
        panel10.setLayout(new BoxLayout(panel10, BoxLayout.PAGE_AXIS));
        panel10.add(panel7);
        panel10.add(panel8);
        panel10.add(panel9);
        
        panel11.setLayout(new BoxLayout(panel11, BoxLayout.PAGE_AXIS));
        panel11.add(panel6);
        panel11.add(panel10);
        add(panel11);
        
        setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        setBackground (Color.white);
        setPreferredSize (new Dimension(400,440));
    }
    
    
   
 }
    
    