import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class triangle extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1;
    int b=6;int h=10;
    triangle()
    {
        l1= new JLabel("\n");
        b1= new JButton("Calculate");
        add(b1);
        add(l1);

        b1.addActionListener(this);
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            l1.setText("Area of triangle"+0.5*b*h);
        }
        else
        {
            System.out.println("Calculation error");
        }
    }
    public static void main(String[] args)
    {
        new triangle();
    }
}