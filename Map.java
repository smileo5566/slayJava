import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JFrame{
    private Container cp;
    private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");

    private ImageIcon icon1 = new ImageIcon("img/敵人.png");
    private JLabel enemyImg = new JLabel();
    private ImageIcon icon1_1 = new ImageIcon("img/敵人.png");
    private JLabel enemyImg_1 = new JLabel();
    private ImageIcon icon1_2 = new ImageIcon("img/敵人.png");
    private JLabel enemyImg_2 = new JLabel();
    private ImageIcon icon2 = new ImageIcon("img/敵人2.png");
    private JLabel enemyImg2 = new JLabel();
    private ImageIcon icon3 = new ImageIcon("img/商人.png");
    private JLabel shopImg = new JLabel();
    private ImageIcon icon3_1 = new ImageIcon("img/商人.png");
    private JLabel shopImg_1 = new JLabel();
    private ImageIcon icon4 = new ImageIcon("img/商人2.png");
    private JLabel shopImg2 = new JLabel();
    private ImageIcon icon5 = new ImageIcon("img/菁英.png");
    private JLabel sEnemyImg = new JLabel();
    private ImageIcon icon5_1 = new ImageIcon("img/菁英.png");
    private JLabel sEnemyImg_1 = new JLabel();
    private ImageIcon icon6 = new ImageIcon("img/菁英2.png");
    private JLabel sEnemyImg2 = new JLabel();
    private ImageIcon icon7 = new ImageIcon("img/寶相.png");
    private JLabel boxImg = new JLabel();
    private ImageIcon icon8 = new ImageIcon("img/寶相2.png");
    private JLabel boxImg2 = new JLabel();
    private ImageIcon icon9 = new ImageIcon("img/休息.png");
    private JLabel restImg = new JLabel();
    private ImageIcon icon9_1 = new ImageIcon("img/休息.png");
    private JLabel restImg_1 = new JLabel();
    private ImageIcon icon9_2 = new ImageIcon("img/休息.png");
    private JLabel restImg_2 = new JLabel();
    private ImageIcon icon10 = new ImageIcon("img/休息2.png");
    private JLabel restImg2 = new JLabel();
    private ImageIcon icon11 = new ImageIcon("img/問號.png");
    private JLabel questionImg = new JLabel();
    private ImageIcon icon11_1 = new ImageIcon("img/問號.png");
    private JLabel questionImg_1 = new JLabel();
    private ImageIcon icon11_2 = new ImageIcon("img/問號.png");
    private JLabel questionImg_2 = new JLabel();
    private ImageIcon icon12 = new ImageIcon("img/問號2.png");
    private JLabel questionImg2 = new JLabel();
    private ImageIcon icon13 = new ImageIcon("img/王.png");
    private JLabel bossImg = new JLabel();
    private ImageIcon icon14 = new ImageIcon("img/敵人3.png");
    private JLabel enemyImg3 = new JLabel();
    private ImageIcon icon14_1 = new ImageIcon("img/敵人3.png");
    private JLabel enemyImg3_1 = new JLabel();
    private ImageIcon icon14_2 = new ImageIcon("img/敵人3.png");
    private JLabel enemyImg3_2 = new JLabel();
    private ImageIcon icon15 = new ImageIcon("img/商人3.png");
    private JLabel shopImg3 = new JLabel();
    private ImageIcon icon15_1 = new ImageIcon("img/商人3.png");
    private JLabel shopImg3_1 = new JLabel();
    private ImageIcon icon16 = new ImageIcon("img/菁英3.png");
    private JLabel sEnemyImg3 = new JLabel();
    private ImageIcon icon16_1 = new ImageIcon("img/菁英3.png");
    private JLabel sEnemyImg3_1 = new JLabel();
    private ImageIcon icon17 = new ImageIcon("img/寶相3.png");
    private JLabel boxImg3 = new JLabel();
    private ImageIcon icon18 = new ImageIcon("img/休息3.png");
    private JLabel restImg3 = new JLabel();
    private ImageIcon icon18_1 = new ImageIcon("img/休息3.png");
    private JLabel restImg3_1 = new JLabel();
    private ImageIcon icon18_2 = new ImageIcon("img/休息3.png");
    private JLabel restImg3_2 = new JLabel();
    private ImageIcon icon19 = new ImageIcon("img/問號3.png");
    private JLabel questionImg3 = new JLabel();
    private ImageIcon icon19_1 = new ImageIcon("img/問號3.png");
    private JLabel questionImg3_1 = new JLabel();
    private ImageIcon icon19_2 = new ImageIcon("img/問號3.png");
    private JLabel questionImg3_2 = new JLabel();
    private ImageIcon icon20 = new ImageIcon("img/敵人4.png");
    private JLabel enemyImg4 = new JLabel();
    private ImageIcon icon21 = new ImageIcon("img/商人4.png");
    private JLabel shopImg4 = new JLabel();
    private ImageIcon icon22 = new ImageIcon("img/菁英4.png");
    private JLabel sEnemyImg4 = new JLabel();
    private ImageIcon icon23 = new ImageIcon("img/寶相4.png");
    private JLabel boxImg4 = new JLabel();
    private ImageIcon icon24 = new ImageIcon("img/休息4.png");
    private JLabel restImg4 = new JLabel();
    private ImageIcon icon25 = new ImageIcon("img/問號4.png");
    private JLabel questionImg4 = new JLabel();
    private ImageIcon icon26 = new ImageIcon("img/王2.png");
    private JLabel bossImg2 = new JLabel();




    public Map(){
        init();
    }
    public void init(){
        this.setBounds(150,100,1600,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setJMenuBar(jMB);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(141,141,130));
        cp.add(enemyImg2);
        cp.add(enemyImg);
        cp.add(shopImg);
        cp.add(sEnemyImg);
        cp.add(questionImg);
        cp.add(restImg);
        cp.add(questionImg_1);
        cp.add(enemyImg_1);
        cp.add(boxImg);
        cp.add(sEnemyImg_1);
        cp.add(shopImg_1);
        cp.add(questionImg_2);
        cp.add(restImg_1);
        cp.add(enemyImg_2);
        cp.add(restImg_2);
        cp.add(bossImg);

        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);

        enemyImg2.setBounds(50,250,70,70);
        enemyImg.setBounds(150,250,70,70);
        shopImg.setBounds(250,250,70,70);
        sEnemyImg.setBounds(350,250,70,70);
        questionImg.setBounds(450,250,70,70);
        restImg.setBounds(550,250,70,70);
        questionImg_1.setBounds(650,250,70,70);
        enemyImg_1.setBounds(750,250,70,70);
        boxImg.setBounds(850,250,70,70);
        sEnemyImg_1.setBounds(950,250,70,70);
        shopImg_1.setBounds(1050,250,70,70);
        questionImg_2.setBounds(1150,250,70,70);
        restImg_1.setBounds(1250,250,70,70);
        enemyImg_2.setBounds(1350,250,70,70);
        restImg_2.setBounds(1450,250,70,70);
        bossImg.setBounds(700,400,200,200);

//        敵人圖片
        Image imgE = icon1.getImage();
        Image newImgE =imgE.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgE);
        enemyImg.setIcon(icon1);

        Image imgE_1 = icon1_1.getImage();
        Image newImgE_1 =imgE_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon1_1 = new ImageIcon(newImgE_1);
        enemyImg_1.setIcon(icon1_1);

        Image imgE_2 = icon1_2.getImage();
        Image newImgE_2 =imgE_2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon1_2 = new ImageIcon(newImgE_2);
        enemyImg_2.setIcon(icon1_2);


//        敵人2圖片
        Image imgE2 = icon2.getImage();
        Image newImgE2 =imgE2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImgE2);
        enemyImg2.setIcon(icon2);

//        商人圖片
        Image imgS = icon3.getImage();
        Image newImgS =imgS.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newImgS);
        shopImg.setIcon(icon3);

        Image imgS_1 = icon3_1.getImage();
        Image newImgS_1 =imgS_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon3_1 = new ImageIcon(newImgS_1);
        shopImg_1.setIcon(icon3_1);

//        商人2圖片
        Image imgS2 = icon4.getImage();
        Image newImgS2 =imgS2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(newImgS2);
        shopImg2.setIcon(icon4);

//        菁英圖片
        Image imgsE = icon5.getImage();
        Image newImgsE =imgsE.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(newImgsE);
        sEnemyImg.setIcon(icon5);

        Image imgsE_1 = icon5_1.getImage();
        Image newImgsE_1 =imgsE_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon5_1 = new ImageIcon(newImgsE_1);
        sEnemyImg_1.setIcon(icon5_1);

//        菁英2圖片
        Image imgsE2 = icon6.getImage();
        Image newImgsE2 =imgsE2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon6 = new ImageIcon(newImgsE2);
        sEnemyImg2.setIcon(icon6);

//        寶相圖片
        Image imgB = icon7.getImage();
        Image newImgB =imgB.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon7 = new ImageIcon(newImgB);
        boxImg.setIcon(icon7);

//        寶相2圖片
        Image imgB2 = icon8.getImage();
        Image newImgB2 =imgB2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon8 = new ImageIcon(newImgB2);
        boxImg2.setIcon(icon8);

//        休息圖片
        Image imgR = icon9.getImage();
        Image newImgR =imgR.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon9 = new ImageIcon(newImgR);
        restImg.setIcon(icon9);

        Image imgR_1 = icon9_1.getImage();
        Image newImgR_1 =imgR_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon9_1 = new ImageIcon(newImgR_1);
        restImg_1.setIcon(icon9_1);

        Image imgR_2 = icon9_2.getImage();
        Image newImgR_2 =imgR_2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon9_2 = new ImageIcon(newImgR_2);
        restImg_2.setIcon(icon9_2);

//        休息2圖片
        Image imgR2 = icon10.getImage();
        Image newImgR2 =imgR2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon10 = new ImageIcon(newImgR2);
        restImg2.setIcon(icon10);

//        問號圖片
        Image imgQ = icon11.getImage();
        Image newImgQ =imgQ.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon11 = new ImageIcon(newImgQ);
        questionImg.setIcon(icon11);

        Image imgQ_1 = icon11_1.getImage();
        Image newImgQ_1 =imgQ_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon11_1 = new ImageIcon(newImgQ_1);
        questionImg_1.setIcon(icon11_1);

        Image imgQ_2 = icon11_2.getImage();
        Image newImgQ_2 =imgQ_2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon11_2 = new ImageIcon(newImgQ_2);
        questionImg_2.setIcon(icon11_2);

//        問號2圖片
        Image imgQ2 = icon12.getImage();
        Image newImgQ2 =imgQ2.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        icon12 = new ImageIcon(newImgQ2);
        questionImg2.setIcon(icon12);

//        王圖片
        Image imgBoss = icon13.getImage();
        Image newImgBoss =imgBoss.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        icon13 = new ImageIcon(newImgBoss);
        bossImg.setIcon(icon13);

//        敵人3圖片
        Image imgE3 = icon14.getImage();
        Image newImgE3 =imgE3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon14 = new ImageIcon(newImgE3);
        enemyImg3.setIcon(icon14);

        Image imgE3_1 = icon14_1.getImage();
        Image newImgE3_1 =imgE3_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon14_1 = new ImageIcon(newImgE3_1);
        enemyImg3_1.setIcon(icon14_1);

        Image imgE3_2 = icon14_2.getImage();
        Image newImgE3_2 =imgE3_2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon14_2 = new ImageIcon(newImgE3_2);
        enemyImg3_2.setIcon(icon14_2);

//        商人3圖片
        Image imgS3 = icon15.getImage();
        Image newImgS3 =imgS3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon15 = new ImageIcon(newImgS3);

        Image imgS3_1 = icon15_1.getImage();
        Image newImgS3_1 =imgS3_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon15_1 = new ImageIcon(newImgS3_1);
        shopImg3_1.setIcon(icon15_1);

//        菁英3圖片
        Image imgsE3= icon16.getImage();
        Image newImgsE3 =imgsE3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon16 = new ImageIcon(newImgsE3);
        sEnemyImg3.setIcon(icon16);

//        寶相3圖片
        Image imgB3 = icon17.getImage();
        Image newImgB3 =imgB3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon17 = new ImageIcon(newImgB3);
        boxImg3.setIcon(icon17);

//        休息3圖片
        Image imgR3 = icon18.getImage();
        Image newImgR3 =imgR3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon18 = new ImageIcon(newImgR3);
        restImg3.setIcon(icon18);

//        問號3圖片
        Image imgQ3 = icon19.getImage();
        Image newImgQ3 =imgQ3.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon19 = new ImageIcon(newImgQ3);
        questionImg3.setIcon(icon19);

        Image imgQ3_1 = icon19_1.getImage();
        Image newImgQ3_1 =imgQ3_1.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon19_1 = new ImageIcon(newImgQ3_1);
        questionImg3_1.setIcon(icon19_1);

        Image imgQ3_2 = icon19_2.getImage();
        Image newImgQ3_2 =imgQ3_2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon19_2 = new ImageIcon(newImgQ3_2);
        questionImg3_2.setIcon(icon19_2);

//        敵人4圖片
        Image imgE4 = icon20.getImage();
        Image newImgE4 =imgE4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon20 = new ImageIcon(newImgE4);
        enemyImg4.setIcon(icon20);

//        商人4圖片
        Image imgS4 = icon21.getImage();
        Image newImgS4 =imgS4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon21 = new ImageIcon(newImgS4);
        shopImg4.setIcon(icon21);

//        菁英4圖片
        Image imgsE4 = icon22.getImage();
        Image newImgsE4 =imgsE4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon22 = new ImageIcon(newImgB);
        sEnemyImg4.setIcon(icon22);

//        寶相4圖片
        Image imgB4 = icon23.getImage();
        Image newImgB4 =imgB4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon23 = new ImageIcon(newImgB4);
        boxImg4.setIcon(icon23);

//        休息4圖片
        Image imgR4 = icon24.getImage();
        Image newImgR4 =imgR4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon24 = new ImageIcon(newImgR4);
        restImg4.setIcon(icon24);

//        問號4圖片
        Image imgQ4 = icon25.getImage();
        Image newImgQ4 =imgQ4.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        icon25 = new ImageIcon(newImgQ4);
        questionImg4.setIcon(icon25);

//        王2圖片
        Image imgBoss2 = icon26.getImage();
        Image newImgBoss2 =imgBoss2.getScaledInstance(200,200, Image.SCALE_SMOOTH);
        icon26 = new ImageIcon(newImgBoss2);
        bossImg2.setIcon(icon26);

//
//        傾聽
        enemyImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Battle1 bt1 = new Battle1();
                bt1.setVisible(true);
                Map.this.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                enemyImg2.setIcon(icon20);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                enemyImg2.setIcon(icon2);
            }
        });


    }


}
