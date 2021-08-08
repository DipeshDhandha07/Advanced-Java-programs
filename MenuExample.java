import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuExample extends JFrame implements ActionListener
{
	JMenu M1,M2;
	JMenuItem me1,me2,me3;
	JMenuBar mb;
	MenuExample()
	{
		mb=new  JMenuBar();
		M1=new JMenu("File");
		me1=new JMenuItem("New");
		me2=new JMenuItem("Open");

		M2=new JMenu("Help");
		me3=new JMenuItem("view Help");
		me3.addActionListener(this);
	
		M1.add(me1);
		M1.add(me2);
		mb.add(M1);

		M2.add(me3);
		mb.add(M2);
		setJMenuBar(mb);

		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==me3)
			JOptionPane.showMessageDialog(this,"you select view help MenuItem");
	}
	public static void main(String ar[])
	{
		new MenuExample();
	}
}
