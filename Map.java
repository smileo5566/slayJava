import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class Map extends JFrame{
    private Container cp;
    private JPanel jpn1 = new JPanel();
    private  JPanel jpnC = new JPanel();
    private JPanel jpnN = new JPanel();
    private JPanel jpnSetting = new JPanel();
    private  JPanel jpnAbout = new JPanel();
    private  JPanel jpnRename = new JPanel();
    private  JPanel jpnCard = new JPanel();
    private  JPanel jpnCard2 = new JPanel();
    private JScrollPane jsp = new JScrollPane(jpnCard);
//  Map icon
    private ImageIcon iconEnemy = new ImageIcon("img/enemy.png");
    private JLabel enemyImg = new JLabel();
    private ImageIcon iconEnemy2 = new ImageIcon("img/enemy.png");
    private JLabel enemyImg2 = new JLabel();
    private ImageIcon iconEnemy3 = new ImageIcon("img/enemy.png");
    private JLabel enemyImg3 = new JLabel();
    private ImageIcon iconEnemyB = new ImageIcon("img/enemyB.png");
    private JLabel enemyImgB = new JLabel();
    private ImageIcon iconEnemyC = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC = new JLabel();
    private ImageIcon iconEnemyC2 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC2 = new JLabel();
    private ImageIcon iconEnemyC3 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC3 = new JLabel();
    private ImageIcon iconEnemyC4 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC4 = new JLabel();
    private ImageIcon iconEnemyR = new ImageIcon("img/enemyR.png");
    private JLabel enemyImgR = new JLabel();

    private ImageIcon iconShop = new ImageIcon("img/shop.png");
    private JLabel shopImg = new JLabel();
    private ImageIcon iconShop2 = new ImageIcon("img/shop.png");
    private JLabel shopImg2 = new JLabel();
    private ImageIcon iconShopB = new ImageIcon("img/shopB.png");
    private JLabel shopImgB = new JLabel();
    private ImageIcon iconShopC = new ImageIcon("img/shopC.png");
    private JLabel shopImgC = new JLabel();
    private ImageIcon iconShopC2 = new ImageIcon("img/shopC.png");
    private JLabel shopImgC2 = new JLabel();
    private ImageIcon iconShopR= new ImageIcon("img/shopR.png");
    private JLabel shopImgR = new JLabel();

    private ImageIcon iconsEnemy = new ImageIcon("img/sEnemy.png");
    private JLabel sEnemyImg = new JLabel();
    private ImageIcon iconsEnemy2 = new ImageIcon("img/sEnemy.png");
    private JLabel sEnemyImg2 = new JLabel();
    private ImageIcon iconsEnemyB = new ImageIcon("img/sEnemyB.png");
    private JLabel sEnemyImgB = new JLabel();
    private ImageIcon iconsEnemyC = new ImageIcon("img/sEnemyC.png");
    private JLabel sEnemyImgC = new JLabel();
    private ImageIcon iconsEnemyC2 = new ImageIcon("img/sEnemyC.png");
    private JLabel sEnemyImgC2 = new JLabel();
    private ImageIcon iconsEnemyR = new ImageIcon("img/sEnemyR.png");
    private JLabel sEnemyImgR = new JLabel();

    private ImageIcon iconBox = new ImageIcon("img/box.png");
    private JLabel boxImg = new JLabel();
    private ImageIcon iconBox2 = new ImageIcon("img/box.png");
    private JLabel boxImg2 = new JLabel();
    private ImageIcon iconBoxB = new ImageIcon("img/boxB.png");
    private JLabel boxImgB = new JLabel();
    private ImageIcon iconBoxC = new ImageIcon("img/boxC.png");
    private JLabel boxImgC = new JLabel();
    private ImageIcon iconBoxC2 = new ImageIcon("img/boxC.png");
    private JLabel boxImgC2 = new JLabel();
    private ImageIcon iconBoxR = new ImageIcon("img/boxR.png");
    private JLabel boxImgR = new JLabel();

    private ImageIcon iconRest = new ImageIcon("img/rest.png");
    private JLabel restImg = new JLabel();
    private ImageIcon iconRest2 = new ImageIcon("img/rest.png");
    private JLabel restImg3 = new JLabel();
    private ImageIcon iconRest3 = new ImageIcon("img/rest.png");
    private JLabel restImg2 = new JLabel();
    private ImageIcon iconRestB = new ImageIcon("img/restB.png");
    private JLabel restImgB = new JLabel();
    private ImageIcon iconRestC = new ImageIcon("img/restC.png");
    private JLabel restImgC = new JLabel();
    private ImageIcon iconRestC2 = new ImageIcon("img/restC.png");
    private JLabel restImgC2 = new JLabel();
    private ImageIcon iconRestC3 = new ImageIcon("img/restC.png");
    private JLabel restImgC3 = new JLabel();
    private ImageIcon iconRestR = new ImageIcon("img/restR.png");
    private JLabel restImgR = new JLabel();

    private ImageIcon iconQuest = new ImageIcon("img/quest.png");
    private JLabel questImg = new JLabel();
    private ImageIcon iconQuest2 = new ImageIcon("img/quest.png");
    private JLabel questImg2 = new JLabel();
    private ImageIcon iconQuest3 = new ImageIcon("img/quest.png");
    private JLabel questImg3 = new JLabel();
    private ImageIcon iconQuestB = new ImageIcon("img/questB.png");
    private JLabel questImgB = new JLabel();
    private ImageIcon iconQuestC = new ImageIcon("img/questC.png");
    private JLabel questImgC = new JLabel();
    private ImageIcon iconQuestC2 = new ImageIcon("img/questC.png");
    private JLabel questImgC2 = new JLabel();
    private ImageIcon iconQuestC3 = new ImageIcon("img/questC.png");
    private JLabel questImgC3 = new JLabel();
    private ImageIcon iconQuestR = new ImageIcon("img/questR.png");
    private JLabel questImgR = new JLabel();

    private ImageIcon iconBoss = new ImageIcon("img/boss.png");
    private JLabel bossImg = new JLabel();
    private ImageIcon iconBossR = new ImageIcon("img/bossR.png");
    private JLabel bossImgR = new JLabel();
//  Other icon
    private ImageIcon iconPointer = new ImageIcon("img/point.png");
    private JLabel pointerImg = new JLabel();
//  jpnN
    private ImageIcon iconMoney = new ImageIcon("img/money.png");
    private JLabel moneyImg = new JLabel();
    private ImageIcon iconHeart = new ImageIcon("img/heart.png");
    private JLabel heartImg = new JLabel();
    private ImageIcon iconMap = new ImageIcon("img/map.png");
    private JLabel mapImg = new JLabel();
    private ImageIcon iconSetting = new ImageIcon("img/setting.png");
    private JLabel settingImg = new JLabel();
    private ImageIcon iconCard = new ImageIcon("img/Card.png");
    private JLabel cardImg = new JLabel();
    private JLabel jlbcardInt = new JLabel(Integer.toString(cardInt));
    public static int cardInt = 10;

    public static int heartInt = 100;
    public static int moneyInt = 99;
    int nameLength = character.JtfName.getText().length() * 65; //設定職業和暱稱距離
    int roleLength = character.JtfName.getText().length() * 65/2 + 50; //設定職業和暱稱距離


    public static JLabel jlbName = new JLabel(character.JtfName.getText());
    private JLabel jlbRole = new JLabel("神射手");

    private  JLabel jlbHeartInt = new JLabel(Integer.toString(heartInt));
    private  JLabel jlbMoneyInt = new JLabel(Integer.toString(moneyInt));

//    jpnSetting
    private JButton jbtAbout = new JButton("About");
    private JButton jbtRename = new JButton("Rename");
    private JButton jbtRetry = new JButton("Retry");
    private JButton jbtClose = new JButton("End");
    private JButton jbtConfirmSetting = new JButton("Confirm");

    private JLabel jlbAbout = new JLabel("<html><body><p>作者 : 謝量 陳鼎超 王哲為</p><br><p>作品名 : Slay 2 Rise</p><br><p>發布日 : 2019/01/10</p><body></html>");
    private JLabel jlbAboutTitle = new JLabel("About");
    private JButton jbtConfirmAbout = new JButton("Confirm");

    private JTextField jtfRename = new JTextField(" ");
    private JButton jbtConfirmRename = new JButton("Confirm");
    private JLabel jlbRenameTitle = new JLabel("Rename");

//  Other
    private JLabel jlbForest = new JLabel("迷途森林");
    private Font fontWeiRuan80 = new Font("微軟正黑體", Font.BOLD,80);
    private Font fontAntiqua65 = new Font("Book Antiqua", Font.BOLD,65);
    private Font fontAntiqua50 = new Font("Book Antiqua", Font.BOLD,50);
    private Font fontAntiqua30 = new Font("Book Antiqua", Font.BOLD,30);
    private Font fontWeiRuan40 = new Font("微軟正黑體", Font.BOLD,40);
    public static int pass1 = 1;

//    牌組VA
    public static Vector VA = new Vector(cardInt);
    private ImageIcon iconCardShoot1 = new ImageIcon("img/Card/cardShoot1.png");
    private ImageIcon iconCardShoot1_2 = new ImageIcon("img/Card/cardShoot1.png");
    private ImageIcon iconCardShoot1_3 = new ImageIcon("img/Card/cardShoot1.png");
    private ImageIcon iconCardShoot1_4 = new ImageIcon("img/Card/cardShoot1.png");
    private ImageIcon iconCardShoot1_5 = new ImageIcon("img/Card/cardShoot1.png");
    private ImageIcon iconCardShield1 = new ImageIcon("img/Card/cardShield1.png");
    private ImageIcon iconCardShield1_2 = new ImageIcon("img/Card/cardShield1.png");
    private ImageIcon iconCardShield1_3 = new ImageIcon("img/Card/cardShield1.png");
    private ImageIcon iconCardShield1_4 = new ImageIcon("img/Card/cardShield1.png");
    private ImageIcon iconCardShoot2 = new ImageIcon("img/Card/cardShoot2.png");

    private ImageIcon iconCardBShoot1 = new ImageIcon("img/Card/cardBShoot1.png");
    private ImageIcon iconCardBShoot2 = new ImageIcon("img/Card/cardBShoot2.png");
    private ImageIcon iconCardBShield1 = new ImageIcon("img/Card/cardBShield1.png");

    private JLabel jlbCard1 = new JLabel();
    private JLabel jlbCard2 = new JLabel();
    private JLabel jlbCard3 = new JLabel();
    private JLabel jlbCard4 = new JLabel();
    private JLabel jlbCard5 = new JLabel();
    private JLabel jlbCard6 = new JLabel();
    private JLabel jlbCard7 = new JLabel();
    private JLabel jlbCard8 = new JLabel();
    private JLabel jlbCard9 = new JLabel();
    private JLabel jlbCard10 = new JLabel();
    private JLabel jlbCard11 = new JLabel();
    private JLabel jlbCard12 = new JLabel();
    private JLabel jlbCard13 = new JLabel();
    private JLabel jlbCard14 = new JLabel();
    private JLabel jlbCard15 = new JLabel();
    private JLabel jlbCard16 = new JLabel();
    private JLabel jlbCard17 = new JLabel();
    private JLabel jlbCard18 = new JLabel();
    private JLabel jlbCard19 = new JLabel();
    private JLabel jlbCard20 = new JLabel();
    private JLabel jlbCard21 = new JLabel();
    private JLabel jlbCard22 = new JLabel();
    private JLabel jlbCard23 = new JLabel();
    private JLabel jlbCard24 = new JLabel();
    private JLabel jlbCard25 = new JLabel();
    private JLabel jlbCard26 = new JLabel();
    private JLabel jlbCard27 = new JLabel();
    private JLabel jlbCard28 = new JLabel();

    private JButton jbtConfirmCard = new JButton("Confirm");
    private JLabel jlbCardBig = new JLabel();

    public Map(){
        init();
    }
    public void init(){
        this.setBounds(150,100,1600,850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(141,141,130));
        cp.add(jpn1);
        cp.add(jpnN);
        cp.add(jpnC);
        cp.add(jpnSetting);
        cp.add(jpnAbout);
        cp.add(jpnRename);
        cp.add(jsp);
        cp.add(jpnCard2);
        cp.add(jbtConfirmCard);
        jbtConfirmCard.setBounds(1350,320,200,100);
        jbtConfirmCard.setVisible(false);

        jsp.setBounds(100,70,708,650);
        jsp.setVisible(false);

        jpnC.setBounds(0,0,1600,750);
        jpnC.setBackground(new Color(141,141,130));
        jpnC.setLayout(null);
        jpnC.add(enemyImgB);
        jpnC.add(enemyImg);
        jpnC.add(shopImg);
        jpnC.add(questImg);
        jpnC.add(sEnemyImg);
        jpnC.add(restImg);
        jpnC.add(questImg2);
        jpnC.add(enemyImg2);
        jpnC.add(boxImg);
        jpnC.add(sEnemyImg2);
        jpnC.add(shopImg2);
        jpnC.add(questImg3);
        jpnC.add(restImg2);
        jpnC.add(enemyImg3);
        jpnC.add(restImg3);
        jpnC.add(bossImg);
        jpnC.add(pointerImg);

        jpn1.add(jlbForest);

        jpnN.add(jlbName);
        jpnN.add(jlbRole);
        jpnN.add(heartImg);
        jpnN.add(jlbHeartInt);
        jpnN.add(moneyImg);
        jpnN.add(jlbMoneyInt);
        jpnN.add(jlbcardInt);
        jpnN.add(cardImg);
        jpnN.add(mapImg);
        jpnN.add(settingImg);

        enemyImgB.setBounds(32,232,62,63);
        enemyImg.setBounds(150,250,26,26);
        shopImg.setBounds(247,248,32,30);
        questImg.setBounds(350,245,27,36);
        sEnemyImg.setBounds(443,246,40,33);
        restImg.setBounds(547,246,33,34);
        questImg2.setBounds(650,245,27,36);
        enemyImg2.setBounds(750,250,26,26);
        boxImg.setBounds(844,250,38,27);
        sEnemyImg2.setBounds(943,246,40,33);
        shopImg2.setBounds(1047,248,32,30);
        questImg3.setBounds(1150,245,27,36);
        restImg2.setBounds(1247,246,33,34);
        enemyImg3.setBounds(1350,250,26,26);
        restImg3.setBounds(1447,246,33,34);
        bossImg.setBounds(700,500,188,200);

        pointerImg.setBounds(48,150,30,66);
        pointerImg.setVisible(false);

        jpn1.setBackground(Color.black);
        jpn1.setBounds(0,200,1600,130);
        jlbForest.setBounds(0,0,200,80);
        jlbForest.setFont(fontWeiRuan80);
        jlbForest.setForeground(Color.WHITE);

        jpnN.setBounds(0,0,1600,75);
        jpnN.setBackground(new Color(61,73,78));
        jpnN.setLayout(null);
        jpnN.setVisible(false);
        jlbName.setBounds(10,7,nameLength,65);
        jlbName.setFont(fontAntiqua65);
        jlbName.setForeground(Color.WHITE);
        jlbRole.setBounds(roleLength,23,150,40);
        jlbRole.setFont(fontWeiRuan40);
        heartImg.setBounds(700,20,38,32);
        jlbHeartInt.setBounds(780,10,100,50);
        jlbHeartInt.setFont(fontAntiqua50);
        jlbHeartInt.setForeground(Color.WHITE);
        moneyImg.setBounds(950,17,46,39);
        jlbMoneyInt.setBounds(1030,10,100,50);
        jlbMoneyInt.setFont(fontAntiqua50);
        jlbMoneyInt.setForeground(Color.WHITE);
        cardImg.setBounds(1300,15,49,46);
        jlbcardInt.setBounds(1325,35,30,30);
        jlbcardInt.setFont(fontAntiqua30);
        jlbcardInt.setForeground(new Color(255,128,255));
        mapImg.setBounds(1400,10,53,50);
        settingImg.setBounds(1500,10,53,52);

        jpnSetting.setBackground(new Color(165,191,199));
        jpnSetting.setBounds(600,100,400,550);
        jpnSetting.setLayout(null);
        jpnSetting.add(jbtAbout);
        jpnSetting.add(jbtRename);
        jpnSetting.add(jbtRetry);
        jpnSetting.add(jbtClose);
        jpnSetting.add(jbtConfirmSetting);
        jbtAbout.setBounds(100,50,200,70);
        jbtRename.setBounds(100,150,200,70);
        jbtRetry.setBounds(100,250,200,70);
        jbtClose.setBounds(100,350,200,70);
        jbtConfirmSetting.setBounds(150,470,100,50);
        jbtAbout.setBorder(BorderFactory.createRaisedBevelBorder());
        jbtRename.setBorder(BorderFactory.createRaisedBevelBorder());
        jbtRetry.setBorder(BorderFactory.createRaisedBevelBorder());
        jbtClose.setBorder(BorderFactory.createRaisedBevelBorder());
        jbtConfirmSetting.setBorder(BorderFactory.createRaisedBevelBorder());
        jpnSetting.setVisible(false);

        jpnAbout.setBackground(new Color(165,191,199));
        jpnAbout.setBounds(600,100,400,550);
        jpnAbout.setLayout(null);
        jpnAbout.add(jlbAbout);
        jpnAbout.add(jbtConfirmAbout);
        jpnAbout.add(jlbAboutTitle);
        jlbAboutTitle.setBounds(125,50,150,50);
        jlbAboutTitle.setFont(fontAntiqua50);
        jlbAbout.setBounds(100,100,200,200);
        jbtConfirmAbout.setBounds(150,470,100,50);
        jpnAbout.setVisible(false);

        jpnRename.setBackground(new Color(165,191,199));
        jpnRename.setBounds(600,100,400,550);
        jpnRename.setLayout(null);
        jpnRename.add(jtfRename);
        jpnRename.add(jlbRenameTitle);
        jpnRename.add(jbtConfirmRename);
        jlbRenameTitle.setFont(fontAntiqua50);
        jtfRename.setBounds(100,200,200,50);
        jlbRenameTitle.setBounds(100,50,200,50);
        jbtConfirmRename.setBounds(150,470,100,50);
        jpnRename.setVisible(false);

        VA.addElement(jlbCard1.getIcon());
        VA.addElement(jlbCard2.getIcon());
        VA.addElement(jlbCard3.getIcon());
        VA.addElement(jlbCard4.getIcon());
        VA.addElement(jlbCard5.getIcon());
        VA.addElement(jlbCard6.getIcon());
        VA.addElement(jlbCard7.getIcon());
        VA.addElement(jlbCard8.getIcon());
        VA.addElement(jlbCard9.getIcon());
        VA.addElement(jlbCard10.getIcon());
        VA.addElement(jlbCard11.getIcon());
        VA.addElement(jlbCard12.getIcon());
        VA.addElement(jlbCard13.getIcon());
        VA.addElement(jlbCard14.getIcon());
        VA.addElement(jlbCard15.getIcon());
        VA.addElement(jlbCard16.getIcon());
        VA.addElement(jlbCard17.getIcon());
        VA.addElement(jlbCard18.getIcon());
        VA.addElement(jlbCard19.getIcon());
        VA.addElement(jlbCard20.getIcon());
        VA.addElement(jlbCard21.getIcon());
        VA.addElement(jlbCard22.getIcon());
        VA.addElement(jlbCard22.getIcon());
        VA.addElement(jlbCard23.getIcon());
        VA.addElement(jlbCard24.getIcon());
        VA.addElement(jlbCard25.getIcon());
        VA.addElement(jlbCard26.getIcon());
        VA.addElement(jlbCard27.getIcon());
        VA.addElement(jlbCard28.getIcon());


        jpnCard.setBounds(0,0,708,1590);
        jpnCard.setBackground(new Color(165,191,199));
        jpnCard.setVisible(false);
        jpnCard.setLayout(null);
        jpnCard.add(jlbCard1);
        jpnCard.add(jlbCard2);
        jpnCard.add(jlbCard3);
        jpnCard.add(jlbCard4);
        jpnCard.add(jlbCard5);
        jpnCard.add(jlbCard6);
        jpnCard.add(jlbCard7);
        jpnCard.add(jlbCard8);
        jpnCard.add(jlbCard9);
        jpnCard.add(jlbCard10);
        jpnCard.add(jlbCard11);
        jpnCard.add(jlbCard12);
        jpnCard.add(jlbCard13);
        jpnCard.add(jlbCard14);
        jpnCard.add(jlbCard15);
        jpnCard.add(jlbCard16);
        jpnCard.add(jlbCard17);
        jpnCard.add(jlbCard18);
        jpnCard.add(jlbCard19);
        jpnCard.add(jlbCard20);
        jpnCard.add(jlbCard21);
        jpnCard.add(jlbCard22);
        jpnCard.add(jlbCard23);
        jpnCard.add(jlbCard24);
        jpnCard.add(jlbCard25);
        jpnCard.add(jlbCard26);
        jpnCard.add(jlbCard27);
        jpnCard.add(jlbCard28);

        jlbCard1.setBounds(0,0,157,210);
        jlbCard2.setBounds(177,0,157,210);
        jlbCard3.setBounds(354,0,157,210);
        jlbCard4.setBounds(531,0,157,210);
        jlbCard5.setBounds(0,230,157,210);
        jlbCard6.setBounds(177,230,157,210);
        jlbCard7.setBounds(354,230,157,210);
        jlbCard8.setBounds(531,230,157,210);
        jlbCard9.setBounds(0,460,157,210);
        jlbCard10.setBounds(177,460,157,210);
        jlbCard11.setBounds(354,460,157,210);
        jlbCard12.setBounds(531,460,157,210);
        jlbCard13.setBounds(0,690,157,210);
        jlbCard14.setBounds(177,690,157,210);
        jlbCard15.setBounds(354,690,157,210);
        jlbCard16.setBounds(531,690,157,210);
        jlbCard17.setBounds(0,920,157,210);
        jlbCard18.setBounds(177,920,157,210);
        jlbCard19.setBounds(354,920,157,210);
        jlbCard20.setBounds(531,920,157,210);
        jlbCard21.setBounds(0,1150,157,210);
        jlbCard22.setBounds(177,1150,157,210);
        jlbCard23.setBounds(354,1150,157,210);
        jlbCard24.setBounds(531,1150,157,210);
        jlbCard25.setBounds(0,1380,157,210);
        jlbCard26.setBounds(177,1380,157,210);
        jlbCard27.setBounds(354,1380,157,210);
        jlbCard28.setBounds(531,1380,157,210);

        jlbCard1.setIcon(iconCardShoot1);
        jlbCard2.setIcon(iconCardShoot1_2);
        jlbCard3.setIcon(iconCardShoot1_3);
        jlbCard4.setIcon(iconCardShoot1_4);
        jlbCard5.setIcon(iconCardShoot1_5);
        jlbCard6.setIcon(iconCardShield1);
        jlbCard7.setIcon(iconCardShield1_2);
        jlbCard8.setIcon(iconCardShield1_3);
        jlbCard9.setIcon(iconCardShield1_4);
        jlbCard10.setIcon(iconCardShoot2);

        jpnCard2.setBounds(843,70,485,650);
        jpnCard2.setBackground(new Color(165,191,199));
        jpnCard2.setVisible(false);
        jpnCard2.add(jlbCardBig);
        jlbCardBig.setBounds(0,0,485,650);

//        敵人圖片
        Image imgEnemy = iconEnemy.getImage();
        Image newImgEnemy = imgEnemy.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy = new ImageIcon(newImgEnemy);
        enemyImg.setIcon(iconEnemy);

        Image imgEnemy2 = iconEnemy2.getImage();
        Image newImgEnemy2 = imgEnemy2.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy2 = new ImageIcon(newImgEnemy2);
        enemyImg2.setIcon(iconEnemy2);

        Image imgEnemy3 = iconEnemy3.getImage();
        Image newImgEnemy3 = imgEnemy3.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy3 = new ImageIcon(newImgEnemy3);
        enemyImg3.setIcon(iconEnemy3);

        Image imgEnemyB = iconEnemyB.getImage();
        Image newImgEnemyB = imgEnemyB.getScaledInstance(63,63, Image.SCALE_SMOOTH);
        iconEnemyB = new ImageIcon(newImgEnemyB);
        enemyImgB.setIcon(iconEnemyB);

        Image imgEnemyC = iconEnemyC.getImage();
        Image newImgEnemyC = imgEnemyC.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC = new ImageIcon(newImgEnemyC);
        enemyImgC.setIcon(iconEnemyC);

        Image imgEnemyC2 = iconEnemyC2.getImage();
        Image newImgEnemyC2 = imgEnemyC2.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC2 = new ImageIcon(newImgEnemyC2);
        enemyImgC2.setIcon(iconEnemyC2);

        Image imgEnemyC3 = iconEnemyC3.getImage();
        Image newImgEnemyC3 = imgEnemyC3.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC3 = new ImageIcon(newImgEnemyC3);
        enemyImgC3.setIcon(iconEnemyC3);

        Image imgEnemyC4 = iconEnemyC4.getImage();
        Image newImgEnemyC4 = imgEnemyC4.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC4 = new ImageIcon(newImgEnemyC4);
        enemyImgC4.setIcon(iconEnemyC4);

        Image imgEnemyR = iconEnemyR.getImage();
        Image newImgEnemyR = imgEnemyR.getScaledInstance(63,63, Image.SCALE_SMOOTH);
        iconEnemyR = new ImageIcon(newImgEnemyR);
        enemyImgR.setIcon(iconEnemyR);



//        商人圖片
        Image imgShop = iconShop.getImage();
        Image newImgShop = imgShop.getScaledInstance(32,36, Image.SCALE_SMOOTH);
        iconShop = new ImageIcon(newImgShop);
        shopImg.setIcon(iconShop);

        Image imgShop2 = iconShop2.getImage();
        Image newImgShop2 = imgShop2.getScaledInstance(32,36, Image.SCALE_SMOOTH);
        iconShop2 = new ImageIcon(newImgShop2);
        shopImg2.setIcon(iconShop2);

        Image imgShopB = iconShopB.getImage();
        Image newImgShopB = imgShopB.getScaledInstance(74,70, Image.SCALE_SMOOTH);
        iconShopB = new ImageIcon(newImgShopB);
        shopImgB.setIcon(iconShopB);

        Image imgShopC = iconShopC.getImage();
        Image newImgShopC = imgShopC.getScaledInstance(80,77, Image.SCALE_SMOOTH);
        iconShopC = new ImageIcon(newImgShopC);
        shopImgC.setIcon(iconShopC);

        Image imgShopC2 = iconShopC2.getImage();
        Image newImgShopC2 = imgShopC2.getScaledInstance(80,77, Image.SCALE_SMOOTH);
        iconShopC2 = new ImageIcon(newImgShopC2);
        shopImgC2.setIcon(iconShopC2);

        Image imgShopR = iconShopR.getImage();
        Image newImgShopR = imgShopR.getScaledInstance(74,70, Image.SCALE_SMOOTH);
        iconShopR = new ImageIcon(newImgShopR);
        shopImgR.setIcon(iconShopR);

//        菁英圖片
        Image imgsEnemy = iconsEnemy.getImage();
        Image newImgsEnemy = imgsEnemy.getScaledInstance(40,33, Image.SCALE_SMOOTH);
        iconsEnemy = new ImageIcon(newImgsEnemy);
        sEnemyImg.setIcon(iconsEnemy);

        Image imgsEnemy2 = iconsEnemy2.getImage();
        Image newImgsEnemy2 = imgsEnemy2.getScaledInstance(40,33, Image.SCALE_SMOOTH);
        iconsEnemy2 = new ImageIcon(newImgsEnemy2);
        sEnemyImg2.setIcon(iconsEnemy2);

        Image imgsEnemyB = iconsEnemyB.getImage();
        Image newImgsEnemyB = imgsEnemyB.getScaledInstance(76,59, Image.SCALE_SMOOTH);
        iconsEnemyB = new ImageIcon(newImgsEnemyB);
        sEnemyImgB.setIcon(iconsEnemyB);

        Image imgsEnemyC = iconsEnemyC.getImage();
        Image newImgsEnemyC = imgsEnemyC.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconsEnemyC = new ImageIcon(newImgsEnemyC);
        sEnemyImgC.setIcon(iconsEnemyC);

        Image imgsEnemyC2 = iconsEnemyC2.getImage();
        Image newImgsEnemyC2 = imgsEnemyC2.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconsEnemyC2 = new ImageIcon(newImgsEnemyC2);
        sEnemyImgC2.setIcon(iconsEnemyC2);

        Image imgsEnemyR = iconsEnemyR.getImage();
        Image newImgsEnemyR = imgsEnemyR.getScaledInstance(76,59, Image.SCALE_SMOOTH);
        iconsEnemyR = new ImageIcon(newImgsEnemyR);
        sEnemyImgR.setIcon(iconsEnemyR);

//        寶相圖片
        Image imgBox = iconBox.getImage();
        Image newImgBox = imgBox.getScaledInstance(38,27, Image.SCALE_SMOOTH);
        iconBox = new ImageIcon(newImgBox);
        boxImg.setIcon(iconBox);

        Image imgBox2 = iconBox2.getImage();
        Image newImgBox2 = imgBox2.getScaledInstance(38,27, Image.SCALE_SMOOTH);
        iconBox2 = new ImageIcon(newImgBox2);
        boxImg2.setIcon(iconBox2);

        Image imgBoxB = iconBoxB.getImage();
        Image newImgBoxB = imgBoxB.getScaledInstance(95,68, Image.SCALE_SMOOTH);
        iconBoxB = new ImageIcon(newImgBoxB);
        boxImgB.setIcon(iconBoxB);

        Image imgBoxC = iconBoxC.getImage();
        Image newImgBoxC = imgBoxC.getScaledInstance(75,79, Image.SCALE_SMOOTH);
        iconBoxC = new ImageIcon(newImgBoxC);
        boxImgC.setIcon(iconBoxC);

        Image imgBoxC2 = iconBoxC2.getImage();
        Image newImgBoxC2 = imgBoxC2.getScaledInstance(75,79, Image.SCALE_SMOOTH);
        iconBoxC2 = new ImageIcon(newImgBoxC2);
        boxImgC2.setIcon(iconBoxC2);

        Image imgBoxR = iconBoxR.getImage();
        Image newImgBoxR = imgBoxR.getScaledInstance(95,68, Image.SCALE_SMOOTH);
        iconBoxR = new ImageIcon(newImgBoxR);
        boxImgR.setIcon(iconBoxR);

//        休息圖片
        Image imgRest = iconRest.getImage();
        Image newImgRest = imgRest.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest = new ImageIcon(newImgRest);
        restImg.setIcon(iconRest);

        Image imgRest2 = iconRest2.getImage();
        Image newImgRest2 = imgRest2.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest2 = new ImageIcon(newImgRest2);
        restImg2.setIcon(iconRest2);

        Image imgRest3 = iconRest3.getImage();
        Image newImgRest3 = imgRest3.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest3 = new ImageIcon(newImgRest3);
        restImg3.setIcon(iconRest3);

        Image imgRestB = iconRestB.getImage();
        Image newImgRestB = imgRestB.getScaledInstance(77,81, Image.SCALE_SMOOTH);
        iconRestB = new ImageIcon(newImgRestB);
        restImgB.setIcon(iconRestB);

        Image imgRestC = iconRestC.getImage();
        Image newImgRestC = imgRestC.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC = new ImageIcon(newImgRestC);
        restImgC.setIcon(iconRestC);

        Image imgRestC2 = iconRestC2.getImage();
        Image newImgRestC2 = imgRestC2.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC2 = new ImageIcon(newImgRestC2);
        restImgC2.setIcon(iconRestC2);

        Image imgRestC3 = iconRestC3.getImage();
        Image newImgRestC3 = imgRestC3.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC3 = new ImageIcon(newImgRestC3);
        restImgC3.setIcon(iconRestC3);

        Image imgRestR = iconRestR.getImage();
        Image newImgRestR = imgRestR.getScaledInstance(77,81, Image.SCALE_SMOOTH);
        iconRestR = new ImageIcon(newImgRestR);
        iconRestR = new ImageIcon(newImgRestR);
        restImgR.setIcon(iconRestR);


//        問號圖片
        Image imgQuest = iconQuest.getImage();
        Image newImgQuest = imgQuest.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest = new ImageIcon(newImgQuest);
        questImg.setIcon(iconQuest);

        Image imgQuest2 = iconQuest2.getImage();
        Image newImgQuest2 = imgQuest2.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest2 = new ImageIcon(newImgQuest2);
        questImg2.setIcon(iconQuest2);

        Image imgQuest3 = iconQuest3.getImage();
        Image newImgQuest3 = imgQuest3.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest3 = new ImageIcon(newImgQuest3);
        questImg3.setIcon(iconQuest3);

        Image imgQuestB = iconQuestB.getImage();
        Image newImgQuestB = imgQuestB.getScaledInstance(59,88, Image.SCALE_SMOOTH);
        iconQuestB = new ImageIcon(newImgQuestB);
        questImgB.setIcon(iconQuestB);

        Image imgQuestC = iconQuestC.getImage();
        Image newImgQuestC = imgQuestC.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC = new ImageIcon(newImgQuestC);
        questImgC.setIcon(iconQuestC);

        Image imgQuestC2 = iconQuestC2.getImage();
        Image newImgQuestC2 = imgQuestC2.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC2 = new ImageIcon(newImgQuestC2);
        questImgC2.setIcon(iconQuestC2);

        Image imgQuestC3 = iconQuestC3.getImage();
        Image newImgQuestC3 = imgQuestC3.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC3 = new ImageIcon(newImgQuestC3);
        questImgC3.setIcon(iconQuestC3);

        Image imgQuestR = iconQuestR.getImage();
        Image newImgQuestR = imgQuestR.getScaledInstance(59,88, Image.SCALE_SMOOTH);
        iconQuestR = new ImageIcon(newImgQuestR);
        questImgR.setIcon(iconQuestR);


//        王圖片
        Image imgBoss = iconBoss.getImage();
        Image newImgBoss = imgBoss.getScaledInstance(188,200, Image.SCALE_SMOOTH);
        iconBoss = new ImageIcon(newImgBoss);
        bossImg.setIcon(iconBoss);

        Image imgBossR = iconBossR.getImage();
        Image newImgBossR = imgBossR.getScaledInstance(188,200, Image.SCALE_SMOOTH);
        iconBossR = new ImageIcon(newImgBossR);
        bossImgR.setIcon(iconBossR);

//        其他圖片
        Image imgPointer = iconPointer.getImage();
        Image newImgPointer = imgPointer.getScaledInstance(30,66, Image.SCALE_SMOOTH);
        iconPointer = new ImageIcon(newImgPointer);
        pointerImg.setIcon(iconPointer);

        Image imgMoney = iconMoney.getImage();
        Image newImgMoney = imgMoney.getScaledInstance(46,39, Image.SCALE_SMOOTH);
        iconMoney = new ImageIcon(newImgMoney);
        moneyImg.setIcon(iconMoney);

        Image imgHeart = iconHeart.getImage();
        Image newImgHeart = imgHeart.getScaledInstance(38,32, Image.SCALE_SMOOTH);
        iconHeart = new ImageIcon(newImgHeart);
        heartImg.setIcon(iconHeart);

        Image imgMap = iconMap.getImage();
        Image newImgMap =imgMap.getScaledInstance(53,50, Image.SCALE_SMOOTH);
        iconMap = new ImageIcon(newImgMap);
        mapImg.setIcon(iconMap);

        Image imgSetting = iconSetting.getImage();
        Image newImgSetting = imgSetting.getScaledInstance(53,52, Image.SCALE_SMOOTH);
        iconSetting = new ImageIcon(newImgSetting);
        settingImg.setIcon(iconSetting);

        Image imgCard = iconCard.getImage();
        Image newImgCard = imgCard.getScaledInstance(49,46, Image.SCALE_SMOOTH);
        iconCard = new ImageIcon(newImgCard);
        cardImg.setIcon(iconCard);
//  牌組VA
        Image imgCardShoot1 = iconCardShoot1.getImage();
        Image newImgCardShoot1 = imgCardShoot1.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot1 = new ImageIcon(newImgCardShoot1);

        Image imgCardShoot1_2 = iconCardShoot1_2.getImage();
        Image newImgCardShoot1_2 = imgCardShoot1_2.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot1_2 = new ImageIcon(newImgCardShoot1_2);

        Image imgCardShoot1_3 = iconCardShoot1_3.getImage();
        Image newImgCardShoot1_3 = imgCardShoot1_3.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot1_3 = new ImageIcon(newImgCardShoot1_3);

        Image imgCardShoot1_4 = iconCardShoot1_4.getImage();
        Image newImgCardShoot1_4 = imgCardShoot1_4.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot1_4 = new ImageIcon(newImgCardShoot1_4);

        Image imgCardShoot1_5 = iconCardShoot1_5.getImage();
        Image newImgCardShoot1_5 = imgCardShoot1_5.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot1_5 = new ImageIcon(newImgCardShoot1_5);

        Image imgCardShield1 = iconCardShield1.getImage();
        Image newImgCardShield1 = imgCardShield1.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShield1 = new ImageIcon(newImgCardShield1);

        Image imgCardShield1_2 = iconCardShield1_2.getImage();
        Image newImgCardShield1_2 = imgCardShield1_2.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShield1_2 = new ImageIcon(newImgCardShield1_2);

        Image imgCardShield1_3 = iconCardShield1_3.getImage();
        Image newImgCardShield1_3 = imgCardShield1_3.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShield1_3 = new ImageIcon(newImgCardShield1_3);

        Image imgCardShield1_4 = iconCardShield1_4.getImage();
        Image newImgCardShield1_4 = imgCardShield1_4.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShield1_4 = new ImageIcon(newImgCardShield1_4);

        Image imgCardShoot2 = iconCardShoot2.getImage();
        Image newImgCardShoot2 = imgCardShoot2.getScaledInstance(157,210, Image.SCALE_SMOOTH);
        iconCardShoot2 = new ImageIcon(newImgCardShoot2);

        Image imgCardBShoot1 = iconCardBShoot1.getImage();
        Image newImgCardBShoot1 = imgCardBShoot1.getScaledInstance(485,650, Image.SCALE_SMOOTH);
        iconCardBShoot1 = new ImageIcon(newImgCardBShoot1);

        Image imgCardBShoot2 = iconCardBShoot2.getImage();
        Image newImgCardBShoot2 = imgCardBShoot2.getScaledInstance(485,650, Image.SCALE_SMOOTH);
        iconCardBShoot2 = new ImageIcon(newImgCardBShoot2);

        Image imgCardBShield1 = iconCardBShield1.getImage();
        Image newImgCardBShield1 = imgCardBShield1.getScaledInstance(485,650, Image.SCALE_SMOOTH);
        iconCardBShield1 = new ImageIcon(newImgCardBShield1);

//        傾聽
        Map.this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                Timer timer1 = new Timer();
                super.windowOpened(e);
                timer1.schedule(new TimerTask() {
                      public void run() {
                          jpn1.setVisible(false);
                          jpnN.setVisible(true);
                          pointerImg.setVisible(true);
                        }
                   }, 300);
            }
        });
        enemyImgB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Enemy1 en1 = new Enemy1(Map.this);
                en1.setVisible(true);
                enemyImgB.setSize(76,79);
                enemyImgB.setIcon(iconEnemyC);
                enemyImg.setBounds(132,232,62,63);
                enemyImg.setIcon(iconEnemyB);
                pointerImg.setBounds(148,150,30,66);
                Map.this.setExtendedState(JFrame.HIDE_ON_CLOSE);

            }
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (enemyImgB.getIcon() != iconEnemyC) {
                    enemyImgB.setIcon(iconEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (enemyImgB.getIcon() != iconEnemyC) {
                    enemyImgB.setIcon(iconEnemyB);
                }

            }
        });

        enemyImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (enemyImgB.getIcon() == iconEnemyC) {
                    Enemy2 en2 = new Enemy2();
                    en2.setVisible(true);
                    Map.this.setVisible(false);
                    enemyImg.setBounds(125,224,76,79);
                    enemyImg.setIcon(iconEnemyC2);
                    shopImg.setBounds(226,228,74,70);
                    shopImg.setIcon(iconShopB);
                    pointerImg.setBounds(248,150,30,66);
                    pass1 = 2;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (enemyImg.getIcon() != iconEnemyC2 && enemyImgB.getIcon() == iconEnemyC) {
                    enemyImg.setIcon(iconEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (enemyImg.getIcon() != iconEnemyC2 && enemyImgB.getIcon() == iconEnemyC) {
                    enemyImg.setIcon(iconEnemyB);
                }

            }
        });

        shopImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (enemyImg.getIcon() == iconEnemyC2) {
                    Shop3 s3 = new Shop3();
                    s3.setVisible(true);
                    Map.this.setVisible(false);
                    shopImg.setBounds(227,225,80,77);
                    shopImg.setIcon(iconShopC);
                    sEnemyImg.setBounds(325,234,76,59);
                    sEnemyImg.setIcon(iconsEnemyB);
                    pointerImg.setBounds(348,150,30,66);
                    pass1 = 3;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (shopImg.getIcon() != iconShopC && enemyImg.getIcon() == iconEnemyC2) {
                    shopImg.setIcon(iconShopR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (shopImg.getIcon() != iconShopC && enemyImg.getIcon() == iconEnemyC2) {
                    shopImg.setIcon(iconShopB);
                }

            }
        });

        sEnemyImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (shopImg.getIcon() == iconShopC) {
                    sEnemy4 sEn2 = new sEnemy4();
                    sEn2.setVisible(true);
                    Map.this.setVisible(false);
                    sEnemyImg.setBounds(325,224,76,79);
                    sEnemyImg.setIcon(iconsEnemyC);
                    questImg.setBounds(434,219,59,88);
                    questImg.setIcon(iconsEnemyB);
                    pointerImg.setBounds(448,150,30,66);
                    pass1 = 4;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (sEnemyImg.getIcon() != iconsEnemyC && shopImg.getIcon() == iconShopC) {
                    sEnemyImg.setIcon(iconsEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (sEnemyImg.getIcon() != iconsEnemyC && shopImg.getIcon() == iconShopC) {
                    sEnemyImg.setIcon(iconsEnemyB);
                }

            }
        });
        questImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (sEnemyImg.getIcon() == iconsEnemyC) {
                    Quest5 q5 = new Quest5();
                    q5.setVisible(true);
                    Map.this.setVisible(false);
                    questImg.setBounds(425,224,79,78);
                    questImg.setIcon(iconQuestC);
                    restImg.setBounds(525,228,77,81);
                    restImg.setIcon(iconRestB);
                    pointerImg.setBounds(548,150,30,66);
                    pass1 = 5;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (questImg.getIcon() != iconQuestC && sEnemyImg.getIcon() == iconsEnemyC) {
                    questImg.setIcon(iconQuestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (questImg.getIcon() != iconQuestC && sEnemyImg.getIcon() == iconsEnemyC) {
                    questImg.setIcon(iconQuestB);
                }

            }
        });

        restImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (questImg.getIcon() == iconQuestC) {
                    Rest6 r6 = new Rest6();
                    r6.setVisible(true);
                    Map.this.setVisible(false);
                    restImg.setBounds(523,222,80,79);
                    restImg.setIcon(iconRestC);
                    questImg2.setBounds(634,219,59,88);
                    questImg2.setIcon(iconQuestB);
                    pointerImg.setBounds(648,150,30,66);
                    pass1 = 6;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            if (restImg.getIcon() != iconRestC && questImg.getIcon() == iconQuestC) {
                    restImg.setIcon(iconRestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (restImg.getIcon() != iconRestC && questImg.getIcon() == iconQuestC) {
                    restImg.setIcon(iconRestB);
                }

            }
        });
        questImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (restImg.getIcon() == iconRestC) {
                    Quest7 q7 = new Quest7();
                    q7.setVisible(true);
                    Map.this.setVisible(false);
                    questImg2.setBounds(625,224,79,78);
                    questImg2.setIcon(iconQuestC2);
                    enemyImg2.setBounds(732,232,62,63);
                    enemyImg2.setIcon(iconsEnemyB);
                    pointerImg.setBounds(748,150,30,66);
                    pass1 = 7;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (questImg2.getIcon() != iconQuestC2 && restImg.getIcon() == iconRestC) {
                    questImg2.setIcon(iconQuestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (questImg2.getIcon() != iconQuestC2 && restImg.getIcon() == iconRestC) {
                    questImg2.setIcon(iconQuestB);
                }

            }
        });

        enemyImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (questImg2.getIcon() == iconQuestC2) {
                    Enemy8 en8 = new Enemy8();
                    en8.setVisible(true);
                    Map.this.setVisible(false);
                    enemyImg2.setBounds(725,224,76,79);
                    enemyImg2.setIcon(iconEnemyC3);
                    boxImg.setBounds(816,229,95,68);
                    boxImg.setIcon(iconBoxB);
                    pointerImg.setBounds(848,150,30,66);
                    pass1 = 8;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (enemyImg2.getIcon() != iconEnemyC3 && questImg2.getIcon() == iconQuestC2) {
                    enemyImg2.setIcon(iconEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (enemyImg2.getIcon() != iconEnemyC3 && questImg2.getIcon() == iconQuestC2) {
                    enemyImg2.setIcon(iconEnemyB);
                }

            }
        });

        boxImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (enemyImg2.getIcon() == iconEnemyC3) {
                    Box9 b9 = new Box9();
                    b9.setVisible(true);
                    Map.this.setVisible(false);
                    boxImg.setBounds(825,224,75,79);
                    boxImg.setIcon(iconBoxC);
                    sEnemyImg2.setBounds(925,234,76,59);
                    sEnemyImg2.setIcon(iconEnemyB);
                    pointerImg.setBounds(948,150,30,66);
                    pass1 = 9;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (boxImg.getIcon() != iconBoxC && enemyImg2.getIcon() == iconEnemyC3) {
                    boxImg.setIcon(iconBoxR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (boxImg.getIcon() != iconBoxC && enemyImg2.getIcon() == iconEnemyC3) {
                    boxImg.setIcon(iconBoxB);
                }

            }
        });
        sEnemyImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (boxImg.getIcon() == iconBoxC) {
                    sEnemy10 sEn2 = new sEnemy10();
                    sEn2.setVisible(true);
                    Map.this.setVisible(false);
                    sEnemyImg2.setBounds(925,224,76,79);
                    enemyImg.setIcon(iconEnemyC2);
                    shopImg2.setBounds(1026,228,74,70);
                    shopImg2.setIcon(iconShopB);
                    pointerImg.setBounds(1048,150,30,66);
                    pass1 = 10;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (sEnemyImg2.getIcon() != iconsEnemyC2 && boxImg.getIcon() == iconBoxC) {
                    sEnemyImg2.setIcon(iconsEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (sEnemyImg2.getIcon() != iconsEnemyC2 && boxImg.getIcon() == iconBoxC) {
                    sEnemyImg2.setIcon(iconsEnemyB);
                }

            }
        });
        shopImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (sEnemyImg2.getIcon() == iconsEnemyC2) {
                    Shop11 s11 = new Shop11();
                    s11.setVisible(true);
                    Map.this.setVisible(false);
                    shopImg2.setBounds(1023,224,80,77);
                    shopImg2.setIcon(iconShopC2);
                    questImg3.setBounds(1134,219,59,88);
                    questImg3.setIcon(iconQuestB);
                    pointerImg.setBounds(1148,150,30,66);
                    pass1 = 11;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (shopImg2.getIcon() != iconShopC2 && sEnemyImg2.getIcon() == iconsEnemyC2) {
                    shopImg2.setIcon(iconShopR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (shopImg2.getIcon() != iconShopC2 && sEnemyImg2.getIcon() == iconsEnemyC2) {
                    shopImg2.setIcon(iconShopB);
                }

            }
        });

        questImg3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (shopImg2.getIcon() == iconShopC2) {
                    Quest12 q12= new Quest12();
                    q12.setVisible(true);
                    Map.this.setVisible(false);
                    questImg3.setBounds(1125,224,79,78);
                    questImg3.setIcon(iconQuestC3);
                    restImg2.setBounds(1225,228,77,81);
                    restImg2.setIcon(iconRestB);
                    pointerImg.setBounds(1248,150,30,66);
                    pass1 = 12;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (questImg3.getIcon() != iconQuestC3 && shopImg2.getIcon() == iconShopC2) {
                    questImg.setIcon(iconQuestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (questImg3.getIcon() != iconQuestC3 && shopImg2.getIcon() == iconShopC2) {
                    questImg.setIcon(iconQuestB);
                }

            }
        });

        restImg2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (questImg3.getIcon() == iconQuestC3) {
                    Rest13 r13 = new Rest13();
                    r13.setVisible(true);
                    Map.this.setVisible(false);
                    restImg2.setBounds(1227,220,80,79);
                    restImg2.setIcon(iconRestC2);
                    enemyImg3.setBounds(1332,232,62,63);
                    enemyImg3.setIcon(iconEnemyB);
                    pointerImg.setBounds(1348,150,30,66);
                    pass1 = 13;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (restImg2.getIcon() != iconRestC2 && questImg3.getIcon() == iconQuestC3) {
                    restImg2.setIcon(iconRestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (restImg2.getIcon() != iconRestC2 && questImg3.getIcon() == iconQuestC3) {
                    restImg2.setIcon(iconRestB);
                }

            }
        });

        enemyImg3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (restImg2.getIcon() == iconRestC2) {
                    Enemy14 en14 = new Enemy14();
                    en14.setVisible(true);
                    Map.this.setVisible(false);
                    enemyImg3.setBounds(1325,224,76,79);
                    enemyImg3.setIcon(iconEnemyC4);
                    restImg3.setBounds(1425,228,77,81);
                    restImg3.setIcon(iconRestB);
                    pointerImg.setBounds(1448,150,30,66);
                    pass1 = 14;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (enemyImg3.getIcon() != iconEnemyC4 && restImg2.getIcon() == iconRestC2) {
                    enemyImg3.setIcon(iconEnemyR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (enemyImg3.getIcon() != iconEnemyC4 && restImg2.getIcon() == iconRestC2) {
                    enemyImg3.setIcon(iconEnemyB);
                }

            }
        });
        restImg3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (enemyImg3.getIcon() == iconEnemyC4) {
                    Rest15 r15 = new Rest15();
                    r15.setVisible(true);
                    Map.this.setVisible(false);
                    restImg3.setBounds(1423,224,80,79);
                    restImg3.setSize(80,79);
                    restImg3.setIcon(iconEnemyC2);
                    pointerImg.setVisible(false);
                    pass1 = 15;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (restImg3.getIcon() != iconRestC3 && enemyImg3.getIcon() == iconEnemyC4) {
                    restImg3.setIcon(iconRestR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (restImg3.getIcon() != iconRestC3 && enemyImg3.getIcon() == iconEnemyC4) {
                    restImg3.setIcon(iconRest3);
                }

            }
        });
        bossImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (restImg3.getIcon() == iconRestC3) {
                    Boss16 boss = new Boss16();
                    boss.setVisible(true);
                    Map.this.setVisible(false);
                    pass1 = 16;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (restImg3.getIcon() == iconRestC3) {
                    bossImg.setIcon(iconBossR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (restImg3.getIcon() == iconRestC3) {
                    bossImg.setIcon(iconBoss);
                }

            }
        });
        mapImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Map2 mp2 = new Map2();
                mp2.setVisible(true);
            }
        });
        settingImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpnSetting.setVisible(true);
                jpnC.setVisible(false);
            }
        });
        jbtAbout.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnAbout.setVisible(true);
                jpnSetting.setVisible(false);

            }
        });
        jbtRename.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnRename.setVisible(true);
                jpnSetting.setVisible(false);
            }
        });
        jbtRetry.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map.this.setVisible(false);
                character c1 = new character();
                c1.setVisible(true);
            }
        });
        jbtClose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Click to Close", "End", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        });
        jbtConfirmSetting.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnSetting.setVisible(false);
                jpnC.setVisible(true);
            }
        });
        jbtConfirmAbout.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnAbout.setVisible(false);
                jpnSetting.setVisible(true);
            }
        });
        jbtConfirmRename.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbName.setText(jtfRename.getText());
                nameLength = jtfRename.getText().length() * 65;
                roleLength = jtfRename.getText().length() * 65/2 +50;
                jlbName.setBounds(10,7,nameLength,65);
                jlbRole.setBounds(roleLength,23,150,40);
                jpnRename.setVisible(false);
                jpnSetting.setVisible(true);
            }
        });
        cardImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jpnCard.setVisible(true);
                jpnCard2.setVisible(true);
                jsp.setVisible(true);
                jpnC.setVisible(false);
                jbtConfirmCard.setVisible(true);
            }
        });
        jbtConfirmCard.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jsp.setVisible(false);
                jpnCard2.setVisible(false);
                jpnC.setVisible(true);
                jbtConfirmCard.setVisible(false);
            }
        });
        jlbCard1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard1.getIcon().toString() == "img/cardShoot1.png"){
                    jlbCardBig.setIcon(iconCardBShoot1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard2.getIcon().toString() == "img/cardShoot1.png"){
                    jlbCardBig.setIcon(iconCardBShoot1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard3.getIcon().toString() == "img/cardShoot1.png"){
                    jlbCardBig.setIcon(iconCardBShoot1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard4.getIcon().toString() == "img/cardShoot1.png"){
                    jlbCardBig.setIcon(iconCardBShoot1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard5.getIcon().toString() == "img/cardShoot1.png"){
                    jlbCardBig.setIcon(iconCardBShoot1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard6.getIcon().toString() == "img/cardShield1.png"){
                    jlbCardBig.setIcon(iconCardBShield1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard7.getIcon().toString() == "img/cardShield1.png"){
                    jlbCardBig.setIcon(iconCardBShield1);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard8.getIcon().toString() == "img/cardShield1.png"){
                    jlbCardBig.setIcon(iconCardBShield1);
                }

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard9.getIcon().toString() == "img/cardShield1.png"){
                    jlbCardBig.setIcon(iconCardBShield1);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (jlbCard10.getIcon().toString() == "img/cardShoot2.png"){
                    jlbCardBig.setIcon(iconCardBShoot2);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard26.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
        jlbCard28.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlbCardBig.setIcon(null);
            }
        });
    }



}
