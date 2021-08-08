import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComboBoxEx extends JFrame implements ItemListener
{
    JComboBox cb;
    JLabel l1,l2;
    ComboBoxEx()
    {
        cb=new JComboBox();
        cb.addItem("red");
        cb.addItem("blue");
        l1= new JLabel("Indian Captains");
        l2= new JLabel("");
        add(cb);
        add(l1);
        add(l2);
        
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);

        cb.addItemListener(this);
    }
     
    public void itemStateChanged(ItemEvent ie)
    {
        String str= (String)cb.getSelectedItem();
        if(str.equals("red"))
        {
            l2.setText("Captain Name: "+"Sachin");
            l2.setForeground(Color.red);
        }
        else
        {
            l2.setText("Captain Name: "+"Dhoni");
            l2.setForeground(Color.blue);
        }
    }
    public static void main(String[] args)
    {
        new ComboBoxEx();
    }
}
