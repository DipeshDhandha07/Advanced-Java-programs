import javax.swing.*;
import java.awt.event.*;
class PopMenuEx 
{
    JFrame f= new JFrame("PopupMenu Example");
    JPopupMenu popupmenu;
    PopMenuEx()
    {
        popupmenu= new JPopupMenu();
        JMenuItem cut= new JMenuItem("Cut");
        JMenuItem copy= new JMenuItem("Copy");
        JMenuItem paste= new JMenuItem("Paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                popupmenu.show(f,me.getX(),me.getY()); 
            }
        });
        f.add(popupmenu);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args)
    {
        new PopMenuEx();
    }
}