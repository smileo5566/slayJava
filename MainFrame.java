import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private Container cp;
    private ImageIcon icon1 = new ImageIcon("img/pencilMan.png");
    private ImageIcon icon2 = new ImageIcon("img/slayTitle.JPG");
    private JLabel pencilManImg = new JLabel();
    private JLabel slayImg = new JLabel();
    private JButton jbtnRun = new JButton("Run");
    private JButton jbtnExit = new JButton("Exit");
    private JPanel jpnC = new JPanel();
    private JPanel jpnS = new JPanel(new GridLayout(2,2,1,1));
    private JPanel jpnN = new JPanel();
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(675,250,300,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        cp =this.getContentPane();
        cp.add(jpnN,BorderLayout.NORTH);
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnS,BorderLayout.SOUTH);

        jpnN.setBackground(Color.white);
        jpnC.setBackground(Color.white);
        jpnS.setBackground(Color.white);
        jpnN.add(pencilManImg);
        jpnC.add(slayImg);
        jpnS.add(jbtnRun);
        jpnS.add(jbtnExit);
//       火柴人圖片
        Image imgP = icon1.getImage();
        Image newImgP =imgP.getScaledInstance(109,187, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgP);
        pencilManImg.setIcon(icon1);
//        Slay圖片
        Image imgS = icon2.getImage();
        Image newImgS =imgS.getScaledInstance(235,130, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImgS);
        slayImg.setIcon(icon2);


        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnRun.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Battle1 bt1 = new Battle1();
                bt1.setVisible(true);
                MainFrame.this.setVisible(false);
            }
        });

    }
}