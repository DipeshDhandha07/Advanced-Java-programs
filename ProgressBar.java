import javax.swing.*;
public class ProgressBar extends JFrame
{
    JProgressBar jb;
    int i=0,num=0;
    ProgressBar()
    {
        jb=new JProgressBar(0,2000);
        jb.setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250,150);
        setLayout(null);
    }
    public void iterate()
    {
        while(i<=2000)
            {
                jb.setValue(i);
                i=i+20;
                //if(i>=100 && i<=200)
                // jb.setString("20% completed");
            try
            {
                Thread.sleep(150);
                if(i==2000)
                {
                    setVisible(false);
                    new ProgressBar();
                }     
            }
            catch(Exception e)
            {
                System.out.println(e);
            }    
        }
}
    public static void main(String[] args)
    {
        ProgressBar m=new ProgressBar();
        m.setVisible(true);
        m.iterate();
    }
}