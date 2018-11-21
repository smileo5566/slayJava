import javax.swing.*;
import java.awt.*;

public class Map extends JFrame{
    private Container cp;
    private JScrollPane jsp=new JScrollPane(cp);
    private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");
    private JPanel jpn1 = new JPanel();

    private ImageIcon icon1 = new ImageIcon("img/敵人.png");
    private JLabel enemyImg = new JLabel();

    public Map(){
        init();
    }
    public void init(){
        this.setBounds(400,100,200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setJMenuBar(jMB);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.add(jpn1,BorderLayout.CENTER);
        jpn1.add(jsp, BorderLayout.CENTER);


        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);

        jpn1.add(enemyImg);

        enemyImg.setBounds(50,50,300,300);


        Image imgE = icon1.getImage();
        Image newImgE =imgE.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgE);
        enemyImg.setIcon(icon1);

    }


}
