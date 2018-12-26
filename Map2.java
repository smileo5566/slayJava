

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Map2 extends JFrame{
    private Container cp;
    private JButton jbtClose = new JButton("關閉!");

    private ImageIcon iconEnemy = new ImageIcon("img/enemy.png");
    private JLabel enemyImg = new JLabel();
    private ImageIcon iconEnemy2 = new ImageIcon("img/enemy.png");
    private JLabel enemyImg2 = new JLabel();
    private ImageIcon iconEnemy3 = new ImageIcon("img/enemy.png");
    private JLabel enemyImg3 = new JLabel();
    private ImageIcon iconEnemy4 = new ImageIcon("img/enemy.png");
    private JLabel enemyImg4 = new JLabel();
    private ImageIcon iconEnemyC = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC = new JLabel();
    private ImageIcon iconEnemyC2 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC2 = new JLabel();
    private ImageIcon iconEnemyC3 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC3 = new JLabel();
    private ImageIcon iconEnemyC4 = new ImageIcon("img/enemyC.png");
    private JLabel enemyImgC4 = new JLabel();

    private ImageIcon iconShop = new ImageIcon("img/shop.png");
    private JLabel shopImg = new JLabel();
    private ImageIcon iconShop2 = new ImageIcon("img/shop.png");
    private JLabel shopImg2 = new JLabel();
    private ImageIcon iconShopC = new ImageIcon("img/shopC.png");
    private JLabel shopImgC = new JLabel();
    private ImageIcon iconShopC2 = new ImageIcon("img/shopC.png");
    private JLabel shopImgC2 = new JLabel();

    private ImageIcon iconsEnemy = new ImageIcon("img/sEnemy.png");
    private JLabel sEnemyImg = new JLabel();
    private ImageIcon iconsEnemy2 = new ImageIcon("img/sEnemy.png");
    private JLabel sEnemyImg2 = new JLabel();
    private ImageIcon iconsEnemyC = new ImageIcon("img/sEnemyC.png");
    private JLabel sEnemyImgC = new JLabel();
    private ImageIcon iconsEnemyC2 = new ImageIcon("img/sEnemyC.png");
    private JLabel sEnemyImgC2 = new JLabel();

    private ImageIcon iconBox = new ImageIcon("img/box.png");
    private JLabel boxImg = new JLabel();
    private ImageIcon iconBox2 = new ImageIcon("img/box.png");
    private JLabel boxImg2 = new JLabel();
    private ImageIcon iconBoxC = new ImageIcon("img/boxC.png");
    private JLabel boxImgC = new JLabel();
    private ImageIcon iconBoxC2 = new ImageIcon("img/boxC.png");
    private JLabel boxImgC2 = new JLabel();

    private ImageIcon iconRest = new ImageIcon("img/rest.png");
    private JLabel restImg = new JLabel();
    private ImageIcon iconRest2 = new ImageIcon("img/rest.png");
    private JLabel restImg3 = new JLabel();
    private ImageIcon iconRest3 = new ImageIcon("img/rest.png");
    private JLabel restImg2 = new JLabel();
    private ImageIcon iconRestC = new ImageIcon("img/restC.png");
    private JLabel restImgC = new JLabel();
    private ImageIcon iconRestC2 = new ImageIcon("img/restC.png");
    private JLabel restImgC2 = new JLabel();
    private ImageIcon iconRestC3 = new ImageIcon("img/restC.png");
    private JLabel restImgC3 = new JLabel();

    private ImageIcon iconQuest = new ImageIcon("img/quest.png");
    private JLabel questImg = new JLabel();
    private ImageIcon iconQuest2 = new ImageIcon("img/quest.png");
    private JLabel questImg2 = new JLabel();
    private ImageIcon iconQuest3 = new ImageIcon("img/quest.png");
    private JLabel questImg3 = new JLabel();
    private ImageIcon iconQuestC = new ImageIcon("img/questC.png");
    private JLabel questImgC = new JLabel();
    private ImageIcon iconQuestC2 = new ImageIcon("img/questC.png");
    private JLabel questImgC2 = new JLabel();
    private ImageIcon iconQuestC3 = new ImageIcon("img/questC.png");
    private JLabel questImgC3 = new JLabel();

    private ImageIcon iconBoss = new ImageIcon("img/boss.png");
    private JLabel bossImg = new JLabel();
    private ImageIcon iconBossR = new ImageIcon("img/bossR.png");
    private JLabel bossImgR = new JLabel();


    private int pass1 = Map.pass1;

    public Map2(){
        init();
    }
    public void init(){
        this.setBounds(150,100,1600,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(141,141,130));
        cp.add(enemyImg);
        cp.add(enemyImg2);
        cp.add(shopImg);
        cp.add(sEnemyImg);
        cp.add(questImg);
        cp.add(restImg);
        cp.add(questImg2);
        cp.add(enemyImg3);
        cp.add(boxImg);
        cp.add(sEnemyImg2);
        cp.add(shopImg2);
        cp.add(questImg3);
        cp.add(restImg2);
        cp.add(enemyImg4);
        cp.add(restImg3);
        cp.add(bossImg);
        cp.add(bossImgR);
        cp.add(jbtClose);

        enemyImg.setBounds(50,250,26,26);
        enemyImg2.setBounds(150,250,26,26);
        shopImg.setBounds(247,248,32,30);
        sEnemyImg.setBounds(343,246,40,33);
        questImg.setBounds(450,245,27,36);
        restImg.setBounds(547,246,33,34);
        questImg2.setBounds(650,245,27,36);
        enemyImg3.setBounds(750,250,26,26);
        boxImg.setBounds(844,250,38,27);
        sEnemyImg2.setBounds(943,246,40,33);
        shopImg2.setBounds(1047,248,32,30);
        questImg3.setBounds(1150,245,27,36);
        restImg2.setBounds(1247,246,33,34);
        enemyImg4.setBounds(1350,250,26,26);
        restImg3.setBounds(1447,246,33,34);
        bossImg.setBounds(700,400,188,200);
        jbtClose.setBounds(1300, 500,100,50);

        Image imgEnemy = iconEnemy.getImage();
        Image newImgEnemy =imgEnemy.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy = new ImageIcon(newImgEnemy);
        enemyImg.setIcon(iconEnemy);

        Image imgEnemy2 = iconEnemy2.getImage();
        Image newImgEnemy2 =imgEnemy2.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy2 = new ImageIcon(newImgEnemy2);
        enemyImg2.setIcon(iconEnemy2);

        Image imgEnemy3 = iconEnemy3.getImage();
        Image newImgEnemy3 =imgEnemy3.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy3 = new ImageIcon(newImgEnemy3);
        enemyImg3.setIcon(iconEnemy3);

        Image imgEnemy4 = iconEnemy4.getImage();
        Image newImgEnemy4 =imgEnemy4.getScaledInstance(26,26, Image.SCALE_SMOOTH);
        iconEnemy4 = new ImageIcon(newImgEnemy4);
        enemyImg4.setIcon(iconEnemy4);

        Image imgEnemyC = iconEnemyC.getImage();
        Image newImgEnemyC =imgEnemyC.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC = new ImageIcon(newImgEnemyC);
        enemyImgC.setIcon(iconEnemyC);

        Image imgEnemyC2 = iconEnemyC2.getImage();
        Image newImgEnemyC2 =imgEnemyC2.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC2 = new ImageIcon(newImgEnemyC2);
        enemyImgC2.setIcon(iconEnemyC2);

        Image imgEnemyC3 = iconEnemyC3.getImage();
        Image newImgEnemyC3 =imgEnemyC3.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC3 = new ImageIcon(newImgEnemyC3);
        enemyImgC3.setIcon(iconEnemyC3);

        Image imgEnemyC4 = iconEnemyC4.getImage();
        Image newImgEnemyC4 =imgEnemyC4.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconEnemyC4 = new ImageIcon(newImgEnemyC4);
        enemyImgC4.setIcon(iconEnemyC4);


        Image imgShop = iconShop.getImage();
        Image newImgShop =imgShop.getScaledInstance(32,36, Image.SCALE_SMOOTH);
        iconShop = new ImageIcon(newImgShop);
        shopImg.setIcon(iconShop);

        Image imgShop2 = iconShop2.getImage();
        Image newImgShop2 =imgShop2.getScaledInstance(32,36, Image.SCALE_SMOOTH);
        iconShop2 = new ImageIcon(newImgShop2);
        shopImg2.setIcon(iconShop2);

        Image imgShopC = iconShopC.getImage();
        Image newImgShopC =imgShopC.getScaledInstance(80,77, Image.SCALE_SMOOTH);
        iconShopC = new ImageIcon(newImgShopC);
        shopImgC.setIcon(iconShopC);

        Image imgShopC2 = iconShopC2.getImage();
        Image newImgShopC2 =imgShopC2.getScaledInstance(80,77, Image.SCALE_SMOOTH);
        iconShopC2 = new ImageIcon(newImgShopC2);
        shopImgC2.setIcon(iconShopC2);


        Image imgsEnemy = iconsEnemy.getImage();
        Image newImgsEnemy =imgsEnemy.getScaledInstance(40,33, Image.SCALE_SMOOTH);
        iconsEnemy = new ImageIcon(newImgsEnemy);
        sEnemyImg.setIcon(iconsEnemy);

        Image imgsEnemy2 = iconsEnemy2.getImage();
        Image newImgsEnemy2 =imgsEnemy2.getScaledInstance(40,33, Image.SCALE_SMOOTH);
        iconsEnemy2 = new ImageIcon(newImgsEnemy2);
        sEnemyImg2.setIcon(iconsEnemy2);

        Image imgsEnemyC = iconsEnemyC.getImage();
        Image newImgsEnemyC =imgsEnemyC.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconsEnemyC = new ImageIcon(newImgsEnemyC);
        sEnemyImgC.setIcon(iconsEnemyC);

        Image imgsEnemyC2 = iconsEnemyC2.getImage();
        Image newImgsEnemyC2 =imgsEnemyC2.getScaledInstance(76,79, Image.SCALE_SMOOTH);
        iconsEnemyC2 = new ImageIcon(newImgsEnemyC2);
        sEnemyImgC2.setIcon(iconsEnemyC2);


        Image imgBox = iconBox.getImage();
        Image newImgBox =imgBox.getScaledInstance(38,27, Image.SCALE_SMOOTH);
        iconBox = new ImageIcon(newImgBox);
        boxImg.setIcon(iconBox);

        Image imgBox2 = iconBox2.getImage();
        Image newImgBox2 =imgBox2.getScaledInstance(38,27, Image.SCALE_SMOOTH);
        iconBox2 = new ImageIcon(newImgBox2);
        boxImg2.setIcon(iconBox2);

        Image imgBoxC = iconBoxC.getImage();
        Image newImgBoxC =imgBoxC.getScaledInstance(75,79, Image.SCALE_SMOOTH);
        iconBoxC = new ImageIcon(newImgBoxC);
        boxImgC.setIcon(iconBoxC);

        Image imgBoxC2 = iconBoxC2.getImage();
        Image newImgBoxC2 =imgBoxC2.getScaledInstance(75,79, Image.SCALE_SMOOTH);
        iconBoxC2 = new ImageIcon(newImgBoxC2);
        boxImgC2.setIcon(iconBoxC2);


        Image imgRest = iconRest.getImage();
        Image newImgRest =imgRest.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest = new ImageIcon(newImgRest);
        restImg.setIcon(iconRest);

        Image imgRest2 = iconRest2.getImage();
        Image newImgRest2 =imgRest2.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest2 = new ImageIcon(newImgRest2);
        restImg2.setIcon(iconRest2);

        Image imgRest3 = iconRest3.getImage();
        Image newImgRest3 =imgRest3.getScaledInstance(33,34, Image.SCALE_SMOOTH);
        iconRest3 = new ImageIcon(newImgRest3);
        restImg3.setIcon(iconRest3);

        Image imgRestC = iconRestC.getImage();
        Image newImgRestC =imgRestC.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC = new ImageIcon(newImgRestC);
        restImgC.setIcon(iconRestC);

        Image imgRestC2 = iconRestC2.getImage();
        Image newImgRestC2 =imgRestC2.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC2 = new ImageIcon(newImgRestC2);
        restImgC2.setIcon(iconRestC2);

        Image imgRestC3 = iconRestC3.getImage();
        Image newImgRestC3 =imgRestC3.getScaledInstance(80,79, Image.SCALE_SMOOTH);
        iconRestC3 = new ImageIcon(newImgRestC3);
        restImgC3.setIcon(iconRestC3);


        Image imgQuest = iconQuest.getImage();
        Image newImgQuest =imgQuest.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest = new ImageIcon(newImgQuest);
        questImg.setIcon(iconQuest);

        Image imgQuest2 = iconQuest2.getImage();
        Image newImgQuest2 =imgQuest2.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest2 = new ImageIcon(newImgQuest2);
        questImg2.setIcon(iconQuest2);

        Image imgQuest3 = iconQuest3.getImage();
        Image newImgQuest3 =imgQuest3.getScaledInstance(27,36, Image.SCALE_SMOOTH);
        iconQuest3 = new ImageIcon(newImgQuest3);
        questImg3.setIcon(iconQuest3);

        Image imgQuestC = iconQuestC.getImage();
        Image newImgQuestC =imgQuestC.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC = new ImageIcon(newImgQuestC);
        questImgC.setIcon(iconQuestC);

        Image imgQuestC2 = iconQuestC2.getImage();
        Image newImgQuestC2 =imgQuestC2.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC2 = new ImageIcon(newImgQuestC2);
        questImgC2.setIcon(iconQuestC2);

        Image imgQuestC3 = iconQuestC3.getImage();
        Image newImgQuestC3 =imgQuestC3.getScaledInstance(79,78, Image.SCALE_SMOOTH);
        iconQuestC3 = new ImageIcon(newImgQuestC3);
        questImgC3.setIcon(iconQuestC3);


        Image imgBoss = iconBoss.getImage();
        Image newImgBoss =imgBoss.getScaledInstance(188,200, Image.SCALE_SMOOTH);
        iconBoss = new ImageIcon(newImgBoss);
        bossImg.setIcon(iconBoss);

        Image imgBossR = iconBossR.getImage();
        Image newImgBossR =imgBossR.getScaledInstance(188,200, Image.SCALE_SMOOTH);
        iconBossR = new ImageIcon(newImgBossR);
        bossImgR.setIcon(iconBossR);

        jbtClose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map2.this.setVisible(false);
            }
        });



        switch (pass1){
            case 1 :
                enemyImg.setIcon(iconEnemyC);
                enemyImg.setBounds(25,224,76,79);
            break;
            case 2 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);
            break;
            case 3 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);
                break;
            case 4 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);
                break;
            case 5 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);
                break;
            case 6 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);
                break;
            case 7 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);
                break;
            case 8 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);
                break;
            case 9 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);
                break;
            case 10 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);
                break;
            case 11 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);
                break;
            case 12 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2); questImg3.setIcon(iconQuestC3);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);questImg3.setBounds(1125,224,79,78);
                break;
            case 13 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2); questImg3.setIcon(iconQuestC3); restImg2.setIcon(iconRestC2);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);questImg3.setBounds(1125,224,79,78);restImg2.setBounds(1227,220,80,79);
                break;
            case 14 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2); questImg3.setIcon(iconQuestC3); restImg2.setIcon(iconRestC2); enemyImg4.setIcon(iconEnemyC4);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);questImg3.setBounds(1125,224,79,78);restImg2.setBounds(1227,220,80,79);enemyImg3.setBounds(1325,224,76,79);
                break;
            case 15 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2); questImg3.setIcon(iconQuestC3); restImg2.setIcon(iconRestC2); enemyImg4.setIcon(iconEnemyC4); restImg3.setIcon(iconRestC3);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);questImg3.setBounds(1125,224,79,78);restImg2.setBounds(1227,220,80,79);enemyImg3.setBounds(1325,224,76,79);restImg3.setBounds(1423,224,80,79);
                break;
            case 16 :
                enemyImg.setIcon(iconEnemyC); enemyImg2.setIcon(iconEnemyC2); shopImg.setIcon(iconShopC); sEnemyImg.setIcon(iconsEnemyC); questImg.setIcon(iconQuestC); restImg.setIcon(iconRestC); questImg2.setIcon(iconQuestC2); enemyImg3.setIcon(iconEnemyC3); boxImg.setIcon(iconBoxC); sEnemyImg2.setIcon(iconsEnemyC2); shopImg2.setIcon(iconShopC2); questImg3.setIcon(iconQuestC3); restImg2.setIcon(iconRestC2); enemyImg4.setIcon(iconEnemyC4); restImg3.setIcon(iconRestC3); bossImg.setIcon(iconBossR);
                enemyImg.setBounds(25,224,76,79);enemyImg.setBounds(125,224,76,79);shopImg.setBounds(227,225,80,77);sEnemyImg.setBounds(325,224,76,79);questImg.setBounds(425,224,79,78);restImg.setBounds(523,222,80,79);questImg2.setBounds(625,224,79,78);enemyImg2.setBounds(725,224,76,79);boxImg.setBounds(825,224,75,79);sEnemyImg2.setBounds(925,224,76,79);shopImg2.setBounds(1023,224,80,77);questImg3.setBounds(1125,224,79,78);restImg2.setBounds(1227,220,80,79);enemyImg3.setBounds(1325,224,76,79);restImg3.setBounds(1423,224,80,79);
                break;
        }

    }
}
