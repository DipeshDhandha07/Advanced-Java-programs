import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FontEx extends JFrame implements ActionListener
{
    JRadioButton r1,r2,r3;
    JTextField t1;
    JButton b1;
    Font f1,f2,f3;
    FontEx()
    {
        t1= new JTextField(20);
        r1= new JRadioButton("Bold");
        r2= new JRadioButton("Italic");
        r3= new JRadioButton("Plain");
        b1= new JButton("Reset"); 
        f1= new Font("Microsoft Sans Serif",Font.BOLD,16);
        f2= new Font("Arial",Font.ITALIC,16);
        f3= new Font("Yu Gothic",Font.PLAIN,16);

        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        b1.addActionListener(this);

        add(t1);
        add(r1);
        add(r2);
        add(r3);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            t1.setText("");
        }
        if(ae.getSource()==r1)
        {
            t1.setForeground(Color.RED);
            t1.setFont(f1);
        }
        else if(ae.getSource()==r2)
        {
            t1.setForeground(Color.BLUE);
            t1.setFont(f2);
        }
        else
        {
            t1.setForeground(Color.BLACK);
            t1.setFont(f3);
        }
    }
    public static void main(String[] args)
    {
        new FontEx();
    }
}
