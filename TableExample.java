// A program to create a table and show some data

import javax.swing.*;    
import java.awt.*;
public class TableExample extends JFrame 
{     
    TableExample()
    {    
      String data[][]={ {"101","Amit","670000"},    
                        {"102","Jai","780000"},    
                        {"101","Sachin","700000"}};    
      String column[]={"ID","NAME","SALARY"};         
      JTable jt= new JTable(data,column);     
      JScrollPane sp= new JScrollPane(jt);    
      add(sp);      
      setSize(600,500);    
      setVisible(true);
      setLayout(new FlowLayout());    
}     
   public static void main(String[] args) 
   {    
       new TableExample();    
   }    
}  
