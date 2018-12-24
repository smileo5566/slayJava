
import javax.swing.*;
import java.awt.*;

public class Enemy8 extends JFrame{
    private Container cp;
    private JLabel jlb1 = new JLabel();
    public Enemy8(){
        init();
    }
    public void init(){
        this.setBounds(150,100,1600,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
    }
}