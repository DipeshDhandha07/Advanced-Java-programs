import javax.swing.*;
import java.awt.*;
class TextAreaEx extends JFrame
{
    JTextArea t1;
    TextAreaEx()
    {
        t1= new JTextArea("",15,20);

        add(new JScrollPane(t1));
        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());
    }   
    public static void main(String[] args) 
    {
        new TextAreaEx();    
    }
}
