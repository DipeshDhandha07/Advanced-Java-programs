import javax.swing.*;
import java.awt.*;
public class TabbedPane extends JFrame
{
    TabbedPane()
    {
        JTextArea ta=new JTextArea(50,50);
        JPanel p1=new JPanel();
        p1.add(ta);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tp=new JTabbedPane();
        // tp.setBounds(50,50,200,200);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        add(tp);
        setSize(800,600);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new TabbedPane();
    }
}