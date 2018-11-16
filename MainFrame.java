import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private Container cp;
    private ImageIcon icon1 = new ImageIcon("pencilMan.png");
    private JLabel pencilManImg = new JLabel();


    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(400,600,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.add(pencilManImg);
        Image img1 = icon1.getImage();
        Image newImg =img1.getScaledInstance(50,60, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg);
        pencilManImg.setIcon(icon1);
        pencilManImg.setLocation(0,0);

    }
}
