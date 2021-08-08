import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
public class TreeEx extends JFrame
{
    TreeEx()
    {
        DefaultMutableTreeNode style= new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color= new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font= new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red= new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue= new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black= new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green= new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode white= new DefaultMutableTreeNode("white");
        DefaultMutableTreeNode yellow= new DefaultMutableTreeNode("yellow");

        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        color.add(white);
        color.add(yellow);

        JTree jt=new JTree(style);
        add(new JScrollPane(jt));
        setSize(300,300);
        setVisible(true);
        setLayout(new GridLayout(1,1));
    }
    public static void main(String[] args)
    {
        new TreeEx();
    }    
}
