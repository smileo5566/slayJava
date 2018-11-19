import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;



public class Battle1 extends JFrame{
    private Container cp;
    private JPanel jpnN = new JPanel(new GridLayout(2,6,1,1));
    private JPanel jpnC = new JPanel(new GridLayout(1,14,1,1));
    private JPanel jpnS = new JPanel(new GridLayout(2,4,1,1));
//    Menu
private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");
//    畫面
    private JLabel jlbHpchg1 = new JLabel();
    private JLabel jlbHpchg2 = new JLabel();
    private JLabel jlbBlank1 = new JLabel();
    private JLabel jlbBlank2 = new JLabel();
    private JLabel jlbBlank3 = new JLabel();
    private JLabel jlbBlank4 = new JLabel();

    private ImageIcon icon1 = new ImageIcon("pencilMan.png");
    private ImageIcon icon2 = new ImageIcon("monsterTako.png");
    private ImageIcon icon3 = new ImageIcon("pencilManCut.png");
    private ImageIcon icon4 = new ImageIcon("pencilManCry.png");
    private ImageIcon icon5 = new ImageIcon("pencilManCutCry.png");
    private JLabel pencilManImg = new JLabel();
    private JLabel monsterTakoImg = new JLabel();
    private JLabel pencilManCutImg = new JLabel();
    private JLabel pencilManCryImg = new JLabel();
    private JLabel pencilManCutCryImg = new JLabel();
    private JLabel jlbBlank5 = new JLabel();
    private JLabel jlbBlank6 = new JLabel();
    private JLabel jlbBlank7 = new JLabel();
    private JLabel jlbBlank8 = new JLabel();

    private JLabel jlbManHpX = new JLabel("100");
    private JLabel jlbManLine = new JLabel("/");
    private JLabel jlbManHp = new JLabel("100");
    private JLabel jlbTakoHpX = new JLabel("50");
    private JLabel jlbTakoLine = new JLabel("/");
    private JLabel jlbTakoHp = new JLabel("50");
    private JLabel jlbBlank9 = new JLabel();
    private JLabel jlbBlank10 = new JLabel();
    private JLabel jlbBlank11 = new JLabel();
    private JLabel jlbBlank12= new JLabel();
    private JLabel jlbBlank13= new JLabel();
    private JLabel jlbBlank14 = new JLabel();
    private JLabel jlbBlank15 = new JLabel();
    private JLabel jlbBlank16 = new JLabel();

    private JButton jbtSkill1 = new JButton("攻擊!");
    private JButton jbtSkill2 = new JButton("回復!");
    private JButton jbtSkill3 = new JButton("剪頭髮!");
    private JButton jbtSkill4 = new JButton("不開心!");
    private JLabel jlbBlank17 = new JLabel();
    private JLabel jlbBlank18 = new JLabel();
    private JLabel jlbBlank19 = new JLabel();
    private JLabel jlbBlank20 = new JLabel();


    java.util.Timer timer1 = new java.util.Timer(true);

    public Battle1(){
        init();
    }
    public void init(){
        this.setBounds(400,100,1000,550);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setJMenuBar(jMB);
        cp =this.getContentPane();
        cp.add(jpnN,BorderLayout.NORTH);
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnS,BorderLayout.SOUTH);
        jpnN.setBackground(Color.white);
        jpnC.setBackground(Color.white);
        jpnS.setBackground(Color.white);
        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);
        jpnN.add(jlbBlank1);
        jpnN.add(jlbHpchg1);
        jpnN.add(jlbBlank2);
        jpnN.add(jlbBlank3);
        jpnN.add(jlbHpchg2);
        jpnN.add(jlbBlank4);
        jpnN.add(jlbBlank5);
        jpnN.add(pencilManImg);
        jpnN.add(jlbBlank6);
        jpnN.add(jlbBlank7);
        jpnN.add(monsterTakoImg);
        jpnN.add(jlbBlank8);

        jpnC.add(jlbBlank9);
        jpnC.add(jlbBlank10);
        jpnC.add(jlbManHpX);
        jpnC.add(jlbManLine);
        jpnC.add(jlbManHp);
        jpnC.add(jlbBlank11);
        jpnC.add(jlbBlank12);
        jpnC.add(jlbBlank13);
        jpnC.add(jlbBlank14);
        jpnC.add(jlbTakoHpX);
        jpnC.add(jlbTakoLine);
        jpnC.add(jlbTakoHp);
        jpnC.add(jlbBlank15);
        jpnC.add(jlbBlank16);


        jpnS.add(jlbBlank17);
        jpnS.add(jbtSkill1);
        jpnS.add(jbtSkill2);
        jpnS.add(jlbBlank18);
        jpnS.add(jlbBlank19);
        jpnS.add(jbtSkill3);
        jpnS.add(jbtSkill4);
        jpnS.add(jlbBlank20);


//        火柴人圖片
        Image imgP = icon1.getImage();
        Image newImgP =imgP.getScaledInstance(109,187, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgP);
        pencilManImg.setIcon(icon1);
//        火柴人剪髮圖片
        Image imgPCut = icon3.getImage();
        Image newImgPCut =imgPCut.getScaledInstance(109,187, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newImgPCut);
        pencilManCutImg.setIcon(icon3);
//        火柴人哭哭圖片
        Image imgPCry = icon4.getImage();
        Image newImgPCry =imgPCry.getScaledInstance(109,187, Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(newImgPCry);
        pencilManCryImg.setIcon(icon4);
//        火柴人哭哭剪髮圖片
        Image imgPCutCry = icon5.getImage();
        Image newImgPCutCry =imgPCutCry.getScaledInstance(109,187, Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(newImgPCutCry);
        pencilManCutCryImg.setIcon(icon5);
//        章魚怪圖片
        Image imgT = icon2.getImage();
        Image newImgT =imgT.getScaledInstance(163,130, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImgT);
        monsterTakoImg.setIcon(icon2);



        jMIClose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mf1 = new MainFrame();
                mf1.setVisible(true);
                Battle1.this.setVisible(false);
            }
        });

        jMIRe.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Battle1.this.setVisible(false);
                Battle1 bf1 = new Battle1();
                bf1.setVisible(true);
            }
        });

        jbtSkill1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rdm1 = new Random() ;
                int x = rdm1.nextInt(10) + 20;
                int y = rdm1.nextInt(10) + 5;
                if (Integer.parseInt(jlbTakoHpX.getText()) >= 0){
                   jlbTakoHpX.setText(Integer.toString((Integer.parseInt(jlbTakoHpX.getText() ) - x)));
                   jlbManHpX.setText(Integer.toString((Integer.parseInt(jlbManHpX.getText() ) - y)));
                   jlbHpchg1.setText(Integer.toString(y));
                   jlbHpchg2.setText(Integer.toString(x));
                    if (Integer.parseInt(jlbTakoHpX.getText()) <= 0){
                        jlbTakoHpX.setText("0");


                        Battle1.this.setVisible(false);
                    }
                }

            }
        });
        jbtSkill2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtSkill3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    pencilManImg.setIcon(icon3);
            }
        });
        jbtSkill4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pencilManImg.setIcon(icon4);
            }
        });






    }
}