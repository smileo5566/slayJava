import javax.swing.*;
import java.awt.*;

public class Battle1 extends JFrame {
    private Container cp;
    private JPanel jpnN = new JPanel(new GridLayout(1,2,1,1));
    private JPanel jpnC = new JPanel(new GridLayout(1,6,1,1));
    private JPanel jpnS = new JPanel(new GridLayout(2,2,1,1));
//    Menu
    private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");
//    畫面
    private ImageIcon icon1 = new ImageIcon("pencilMan.png");
    private ImageIcon icon2 = new ImageIcon("monsterTako.png");
    private JLabel pencilManImg = new JLabel();
    private JLabel monsterTakoImg = new JLabel();
    private JLabel jlbManHpX = new JLabel("100");
    private JLabel jlbManLine = new JLabel("/");
    private JLabel jlbManHp = new JLabel("100");
    private JLabel jlbTakoHpX = new JLabel("50");
    private JLabel jlbTakoLine = new JLabel("/");
    private JLabel jlbTakoHp = new JLabel("50");
    private JButton jbtSkill1 = new JButton("攻擊!");
    private JButton jbtSkill2 = new JButton("回復!");
    private JButton jbtSkill3 = new JButton("剪頭髮!");
    private JButton jbtSkill4 = new JButton("不開心!");



    public Battle1(){
        init();
    }
    public void init(){
        this.setBounds(400,100,1000,750);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setJMenuBar(jMB);
        cp =this.getContentPane();
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnS,BorderLayout.SOUTH);
        cp.add(jpnN,BorderLayout.NORTH);
        jpnC.setBackground(Color.white);
        jpnS.setBackground(Color.white);
        jpnN.setBackground(Color.white);




    }
}