import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CheckBoxEx extends JFrame implements ItemListener
{
    JCheckBox c1,c2;
    CheckBoxEx()
    {
    c1= new JCheckBox("Java");
    c2= new JCheckBox("Python",true);
    
    c1.addItemListener(this);
    c2.addItemListener(this);
   
    setSize(500,400);
    setVisible(true);
    setLayout(new FlowLayout());

    add(c1);
    add(c2);

    }

    public void itemStateChanged(ItemEvent ie)
    {
        String msg="";
        if(c1.isSelected())
        {
            msg=msg+"Java";
        }
        if(c2.isSelected())
        {
            msg=msg+"Python";
        }
        System.out.println(msg);
    }
    public static void main(String[] args)
    {
        new CheckBoxEx();
    }
}
