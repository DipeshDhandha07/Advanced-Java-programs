import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioButtonEx extends JFrame implements ActionListener
{
    ButtonGroup bg;
    JRadioButton r1,r2,r3;
    JLabel l1;
    JButton b1;
    RadioButtonEx()
    {
        l1= new JLabel("Select any one");
        r1= new JRadioButton("One");
        r2= new JRadioButton("Two");
        r3= new JRadioButton("Three");
        b1= new JButton("Reset");

        bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        b1.addActionListener(this);
        
        add(l1);
        add(r1);
        add(r2);
        add(r3);
        add(b1);

        setSize(800,400);
        setVisible(true);
        setLayout(new GridLayout(1,5));
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==r1)
        {
            JOptionPane.showMessageDialog(this,"You Selected First");
        }
        else if(ae.getSource()==r2)
        {
            JOptionPane.showMessageDialog(this,"You selected Second");
        }
        else if(ae.getSource()==r3)
        {
            JOptionPane.showMessageDialog(this,"You Selected Third");
        }
        else if(ae.getSource()==b1)
        {
            bg.clearSelection();
        }
    }

    public static void main(String[] args)
    {
        new RadioButtonEx();
    }
}
