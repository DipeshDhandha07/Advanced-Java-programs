import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ColorChooseEx extends JFrame implements ActionListener
{
    JButton b1;
    JLabel l1;
    ColorChooseEx()
    {
        b1= new JButton("Color");
        b1.addActionListener(this);
        l1= new JLabel("ADVANCED JAVA");

        add(b1);
        add(l1);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent ae)
    {
        Color initialColor= Color.BLUE;
        Color color=JColorChooser.showDialog(this,"Select a color",initialColor);
        l1.setForeground(color);
    }
    public static void main(String[] args)
    {
        new ColorChooseEx();
    }   
}
