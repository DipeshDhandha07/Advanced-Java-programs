import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuExColor extends JFrame implements ActionListener
{
    JMenu M1,M2;
    JMenuItem m1,m2,m3,m4;
    JMenuBar mb;
    MenuExColor()
    {
        M1= new JMenu("Color");
        M2= new JMenu("SYCS");

        m1= new JMenuItem("Red");
        m2= new JMenuItem("Blue");
        m3= new JMenuItem("Android");
        m4= new JMenuItem(".NET");

        mb= new JMenuBar();

        M1.add(m1);
        M1.add(m2);
        M2.add(m3);
        M2.add(m4);

        mb.add(M1);
        mb.add(M2);

        m1.addActionListener(this);
        m2.addActionListener(this);
        
        setJMenuBar(mb);
        setSize(600,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
     public void actionPerformed(ActionEvent ae)
     {
         Container cb= getContentPane();
         if(ae.getSource()==m1)
         {
            cb.setBackground(Color.RED);
         }
         else
         {
            cb.setBackground(Color.BLUE);
         }
     }
     public static void main(String[] args)
     {
         new MenuExColor();
     }
}
