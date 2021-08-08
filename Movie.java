import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Movie extends JFrame implements ActionListener,ItemListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1,b2;
    JPanel p1,p2;
    JComboBox cb;
    int a= 100, b=120, c=150, result=0;
    double total=1;
    Movie()
    {
        l1= new JLabel("Welcome to PVR Theater",JLabel.RIGHT);
        l6= new JLabel("");
        l2= new JLabel("Select your movie");
        l3= new JLabel("Select number of seats");
        t1= new JTextField(25);
        p1= new JPanel();
        p2= new JPanel();
        l4= new JLabel("Select Seat type");
        l5= new JLabel("Select Payment Option");
        r1= new JRadioButton("Stall");
        r2= new JRadioButton("Upper Class");
        r3= new JRadioButton("Balcony");
        r4= new JRadioButton("Cash");
        r5= new JRadioButton("Debit");
        b1= new JButton("Calculate");
        b2= new JButton("Reset");

        cb= new JComboBox();
        cb.addItem("Bhagam Bhag");
        cb.addItem("Phir Heri Pheri");
        cb.addItem("Chup chup ke");
        
        add(l1);
        add(l6);
        add(l2);
        add(cb);
        add(l3);
        add(t1);
        add(l4);
        add(p1);
        add(r1);
        add(r2);
        add(r3);
        add(l5);
        add(p2);
        add(r4);
        add(r5);
        add(b1);
        add(b2);

        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        p2.add(r4);
        p2.add(r5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        cb.addItemListener(this);

        setSize(600,500);
        setVisible(true);
        setLayout(new GridLayout(7,2));
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String str= (String) cb.getSelectedItem();
        JOptionPane.showMessageDialog(this,str);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        int num= Integer.parseInt(t1.getText());
        if(r1.isSelected()&& ae.getSource()==b1)
        {
            result= num*a;
            JOptionPane.showMessageDialog(this,result);
        }

        else if(r2.isSelected()&& ae.getSource()==b1)
        {
            result= num*b;
            JOptionPane.showMessageDialog(this,result);
        }

        else if(r3.isSelected()&& ae.getSource()==b1)
        {
            result= num*c;
            JOptionPane.showMessageDialog(this,result);
        }

        else if(r4.isSelected()&& ae.getSource()==b1)
        {
            total=result;
            JOptionPane.showMessageDialog(this,result);
        }

        else if(r5.isSelected()&& ae.getSource()==b1)
        {
            total=0.5*result;
            JOptionPane.showMessageDialog(this,result);
        }      
    }

    public static void main(String[] args)
    {
        new Movie();
    }
}
