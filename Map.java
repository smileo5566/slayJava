import javax.swing.*;
import java.awt.*;

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
    private ImageIcon icon2 = new ImageIcon("img/敵人2.png");
    private JLabel enemyImg2 = new JLabel();
    private ImageIcon icon3 = new ImageIcon("img/商人.png");
    private JLabel shopImg = new JLabel();
    private ImageIcon icon4 = new ImageIcon("img/商人2.png");
    private JLabel shopImg2 = new JLabel();
    private ImageIcon icon5 = new ImageIcon("img/菁英.png");
    private JLabel sEnemyImg = new JLabel();
    private ImageIcon icon6 = new ImageIcon("img/菁英2.png");
    private JLabel sEnemyImg2 = new JLabel();
    private ImageIcon icon7 = new ImageIcon("img/寶相.png");
    private JLabel boxImg = new JLabel();
    private ImageIcon icon8 = new ImageIcon("img/寶相2.png");
    private JLabel boxImg2 = new JLabel();
    private ImageIcon icon9 = new ImageIcon("img/休息.png");
    private JLabel restImg = new JLabel();
    private ImageIcon icon10 = new ImageIcon("img/休息2.png");
    private JLabel restImg2 = new JLabel();
    private ImageIcon icon11 = new ImageIcon("img/問號.png");
    private JLabel questionImg = new JLabel();
    private ImageIcon icon12 = new ImageIcon("img/問號2.png");
    private JLabel questionImg2 = new JLabel();
    private ImageIcon icon13 = new ImageIcon("img/王.png");
    private JLabel bossImg = new JLabel();
    private ImageIcon icon14 = new ImageIcon("img/敵人3.png");
    private JLabel enemyImg3 = new JLabel();
    private ImageIcon icon15 = new ImageIcon("img/商人3.png");
    private JLabel shopImg3 = new JLabel();
    private ImageIcon icon16 = new ImageIcon("img/菁英3.png");
    private JLabel sEnemyImg3 = new JLabel();
    private ImageIcon icon17 = new ImageIcon("img/寶相3.png");
    private JLabel boxImg3 = new JLabel();
    private ImageIcon icon18 = new ImageIcon("img/休息3.png");
    private JLabel restImg3 = new JLabel();
    private ImageIcon icon19 = new ImageIcon("img/問號3.png");
    private JLabel questionImg3 = new JLabel();




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
        cp.add(enemyImg2);

        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);

        enemyImg2.setBounds(50,250,50,50);

//        敵人圖片
        Image imgE = icon1.getImage();
        Image newImgE =imgE.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImgE);
        enemyImg.setIcon(icon1);

//        敵人2圖片
        Image imgE2 = icon2.getImage();
        Image newImgE2 =imgE2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImgE2);
        enemyImg2.setIcon(icon2);

//        商人圖片
        Image imgS = icon3.getImage();
        Image newImgS =imgS.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newImgS);
        shopImg.setIcon(icon3);

//        商人2圖片
        Image imgS2 = icon4.getImage();
        Image newImgS2 =imgS2.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(newImgS2);
        shopImg2.setIcon(icon4);

//        菁英圖片
        Image imgsE = icon5.getImage();
        Image newImgsE =imgsE.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(newImgsE);
        sEnemyImg.setIcon(icon5);

//        菁英2圖片
        Image imgsE2 = icon6.getImage();
        Image newImgsE2 =imgsE2.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon6 = new ImageIcon(newImgsE2);
        sEnemyImg2.setIcon(icon6);

//        寶相圖片
        Image imgB = icon7.getImage();
        Image newImgB =imgB.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon7 = new ImageIcon(newImgB);
        boxImg.setIcon(icon7);

//        寶相2圖片
        Image imgB2 = icon8.getImage();
        Image newImgB2 =imgB2.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon8 = new ImageIcon(newImgB2);
        boxImg2.setIcon(icon8);

//        休息圖片
        Image imgR = icon9.getImage();
        Image newImgR =imgR.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon9 = new ImageIcon(newImgR);
        restImg.setIcon(icon9);

//        休息2圖片
        Image imgR2 = icon10.getImage();
        Image newImgR2 =imgR2.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon10 = new ImageIcon(newImgR2);
        restImg2.setIcon(icon10);

//        問號圖片
        Image imgQ = icon11.getImage();
        Image newImgQ =imgQ.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon11 = new ImageIcon(newImgQ);
        questionImg.setIcon(icon11);

//        問號2圖片
        Image imgQ2 = icon12.getImage();
        Image newImgQ2 =imgQ2.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon12 = new ImageIcon(newImgQ2);
        questionImg2.setIcon(icon12);
//        王圖片
        Image imgBoss = icon13.getImage();
        Image newImgBoss =imgBoss.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon13 = new ImageIcon(newImgBoss);
        bossImg.setIcon(icon13);
//        敵人3圖片
        Image imgE3 = icon14.getImage();
        Image newImgE3 =imgE3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon14 = new ImageIcon(newImgE3);
        enemyImg3.setIcon(icon14);
//        商人3圖片
        Image imgS3 = icon15.getImage();
        Image newImgS3 =imgS3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon15 = new ImageIcon(newImgS3);
        shopImg3.setIcon(icon15);
//        菁英3圖片
        Image imgsE3= icon16.getImage();
        Image newImgsE3 =imgsE3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon16 = new ImageIcon(newImgsE3);
        sEnemyImg3.setIcon(icon16);
//        寶相3圖片
        Image imgB3 = icon17.getImage();
        Image newImgB3 =imgB3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon17 = new ImageIcon(newImgB3);
        boxImg3.setIcon(icon17);
//        休息3圖片
        Image imgR3 = icon18.getImage();
        Image newImgR3 =imgR3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon18 = new ImageIcon(newImgR3);
        restImg3.setIcon(icon18);
//        問號3圖片
        Image imgQ3 = icon19.getImage();
        Image newImgQ3 =imgQ3.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon19 = new ImageIcon(newImgQ3);
        questionImg3.setIcon(icon19);


    }


}
