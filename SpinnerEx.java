import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class SpinnerEx extends JFrame implements ChangeListener
{
    JLabel label;
    SpinnerEx()
    {
        label = new JLabel();
        SpinnerModel value =
        new SpinnerNumberModel(5, //initial value
        0, //minimum value
        20, //maximum value
        1); //step
        JSpinner spinner = new JSpinner(value);
        spinner.addChangeListener(this);
        add(spinner);
        add(label);
        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void stateChanged(ChangeEvent e) 
    {
        label.setText("Value : " + ((JSpinner)e.getSource()).getValue());
    }
    public static void main(String[] args) 
    {
        new SpinnerEx();
    }
}