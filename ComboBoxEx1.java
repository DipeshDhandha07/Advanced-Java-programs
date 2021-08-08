import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComboBoxEx1 extends JFrame implements ActionListener,ItemListener 
{
    JComboBox cb;
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2;
    int a=5,b=20;
    ComboBoxEx1()
    {
        cb= new JComboBox();
        t1= new JTextField(20);
        t2= new JTextField(20);
        b1= new JButton("Add");
        l1= new JLabel("Enter Product Name:");
        l2= new JLabel("Total");
        l3= new JLabel("");
        add(t1);
        add(t2);
        add(l1);
        add(cb);
        add(b1);
        add(l2);
        add(l3);

        b1.addActionListener(this);
        cb.addItemListener(this);

        setLayout(new GridLayout(2,2));
        setSize(250,250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str= t1.getText();
        cb.addItem(str);
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
       String str1=(String)cb.getSelectedItem();
       int q= Integer.parseInt(t2.getText());
       if(str1.equals("a"))
       {
           l3.setText(""+(a*q));
       } 
       else if(str1.equals("b"))
       {
           l3.setText(""+(b*q));
       }
       else
       {
          l3.setText(""+(a*b*q));
       }
    }
    public static void main(String[] args)
    {
        new ComboBoxEx1();
    }    
}
