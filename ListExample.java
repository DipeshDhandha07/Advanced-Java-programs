import javax.swing.*;  
import java.awt.*;
import javax.swing.event.*;
public class ListExample extends JFrame implements ListSelectionListener
{  
 JLabel L1,L2;
 JList list;
String str[]={"A","B","C","H","D"};
     ListExample(){  
        
             L1=new JLabel("Select values from List");
              list = new JList(str);  
              L2=new JLabel("");

           add(L1);
           add(new JScrollPane(list));  
	add(L2);

         list.addListSelectionListener(this);
         list.setVisibleRowCount(3);
          setSize(200,200);  
          setLayout(new FlowLayout());  
          setVisible(true);  
     }  
  	 public void valueChanged(ListSelectionEvent le)
	 {
		String str1="";
		Object  obj[]=list.getSelectedValues();
		for(int i=0;i<obj.length;i++)
		{
			str1=str1+(String)obj[i];
		}
		L2.setText(""+str1);
		JOptionPane.showConfirmDialog(this,str1,"alert",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String args[])  
    	{  
  		 new ListExample();  
    	}

}   
