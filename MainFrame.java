import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame{
    private Container cp;
    private ImageIcon icon1 = new ImageIcon("img/Login.jpg");
    private ImageIcon icon2 = new ImageIcon("img/LoginBtn.png");
    private ImageIcon icon2_1 = new ImageIcon("img/LoginBtn.png");
    private ImageIcon icon3 = new ImageIcon("img/End.png");
    private ImageIcon icon3_1 = new ImageIcon("img/End.png");
    private JLabel LoginImg = new JLabel();
    private JLabel LoginBtnImg = new JLabel();
    private JLabel LoginBtn2Img = new JLabel();
    private JLabel EndImg = new JLabel();
    private JLabel End2Img = new JLabel();
    private JButton jbtnRun = new JButton("Run");
    private JButton jbtnExit = new JButton("Exit");
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(550,200,800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.add(LoginBtnImg);
        cp.add(EndImg);
        cp.add(LoginImg);
        this.setResizable(false);

        LoginImg.setBounds(0,0,800,600);
        LoginBtnImg.setBounds(600,239,81,38);
        EndImg.setBounds(608,350,65,35);

//       Login圖片
        Image imgL = icon1.getImage();
        Image newImgL =imgL.getScaledInstance(800,600, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgL);
        LoginImg.setIcon(icon1);
//       LoginBtn圖片
        Image imgLB = icon2.getImage();
        Image newImgLB =imgLB.getScaledInstance(81,38, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImgLB);
        LoginBtnImg.setIcon(icon2);

        Image imgLB2 = icon2_1.getImage();
        Image newImgLB2 =imgLB2.getScaledInstance(89,42, Image.SCALE_SMOOTH);
        icon2_1 = new ImageIcon(newImgLB2);
        LoginBtn2Img.setIcon(icon2_1);
//        End圖片
        Image imgE = icon3.getImage();
        Image newImgE =imgE.getScaledInstance(65,35, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newImgE);
        End2Img.setIcon(icon3);

        Image imgE2 = icon3_1.getImage();
        Image newImgE2 =imgE2.getScaledInstance( 71, 38, Image.SCALE_SMOOTH);
        icon3_1 = new ImageIcon(newImgE2);
        End2Img.setIcon(icon3_1);


        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnRun.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map map1 = new Map();
                map1.setVisible(true);
                MainFrame.this.setVisible(false);
            }
        });

        LoginBtnImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                character ch1 = new character();
                ch1.setVisible(true);
                MainFrame.this.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                LoginBtnImg.setBounds(596,237,89,42);
                LoginBtnImg.setIcon(icon2_1);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                LoginBtnImg.setBounds(600,239,81,38);
                LoginBtnImg.setIcon(icon2);
            }
        });
        EndImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                EndImg.setBounds(605,349,71,38);
                EndImg.setIcon(icon3_1);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                EndImg.setBounds(608,350,65,35);
                EndImg.setIcon(icon3);

            }
        });
    }
}