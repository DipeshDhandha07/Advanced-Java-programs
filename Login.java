import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField p1;
    Login()
    {
        l1= new JLabel("Enter your name");
        l2= new JLabel("Enter your password");
        l3= new JLabel("");
        t1= new JTextField(15);
        p1= new JPasswordField(15);
        b1= new JButton("Login");
        b2= new JButton("Save",new ImageIcon("D:\\Pictures\\dog.jpg"));
        p1.setEchoChar('*');

        b1.addActionListener(this);
        b1.addActionListener(this);
        
        setSize(650,400);
        setVisible(true);
        setLayout(new GridLayout(4,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(b1);
        add(b2);
        add(l3);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String user= t1.getText();
            String pass= p1.getText();
            if(user.equals("admin")&&pass.equals("admin"))
            {
                l3.setForeground(Color.red);
                l3.setText("Login Succesfull");
            }
            else
            {
                l3.setText("Try again after sometime");
            }
        }
        else
        {
            t1.setText("");
            p1.setText("");
            l3.setText("");
        }
    }

    public static void main(String[] args) 
    {
        new Login();    
    }
}