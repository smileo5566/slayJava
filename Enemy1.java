


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;


public class Enemy1 extends JFrame{
    private Container cp;
    public JFrame Map;
    private ImageIcon iconAshe = new ImageIcon("img/神射.png");
    private JLabel jlbAshe = new JLabel();
    private ImageIcon iconForest = new ImageIcon("img/forest.jpg");
    private JLabel jlbForest = new JLabel();

    Random rdm1 = new Random();

    public Enemy1(JFrame jFrame){
        init(jFrame);
    }
    public void init(JFrame jFrame){
        this.setBounds(150,100,1600,850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
        this.Map = jFrame;
        cp = this.getContentPane();
        cp.setLayout(null);



        cp.add(jlbForest);

        jlbForest.setBounds(0,0,1600,850);

        Image imgForest = iconForest.getImage();
        Image newImgForest =imgForest.getScaledInstance(1600,850, Image.SCALE_SMOOTH);
        iconForest = new ImageIcon(newImgForest);
        jlbForest.setIcon(iconForest);





//        jbtSkill1.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                int x = rdm1.nextInt(10) + 10;
//                int y = rdm1.nextInt(10) + 5;
//                Timer timer1 = new Timer();
//                timer1.schedule(new TimerTask() {
//                    public void run() {
//                        jlbHpchg2.setText("-" + Integer.toString(x));
//                        if ((Integer.parseInt(jlbTakoHpX.getText()) - x) <= 0){
//                            jlbTakoHpX.setText("0");
//                            monsterTakoImg.setIcon(icon6);
//                            JOptionPane.showMessageDialog(getParent(), "Win!");
//                            Battle1.this.setVisible(false);
//
//
//                        }else jlbTakoHpX.setText(Integer.toString((Integer.parseInt(jlbTakoHpX.getText()) - x)));
//
//                        }
//
//                }, 1000);
//                    timer1.schedule(new TimerTask() {
//                        public void run() {
//                            jlbHpchg1.setText("-" + Integer.toString(y));
//                            jlbManHpX.setText(Integer.toString((Integer.parseInt(jlbManHpX.getText()) - y)));
//
//                        }
//                    }, 2000);
//                    timer1.schedule(new TimerTask() {
//                        public void run() {
//                            jlbHpchg2.setText(" ");
//                        }
//                    }, 3000);
//                    timer1.schedule(new TimerTask() {
//                        public void run() {
//                            jlbHpchg1.setText(" ");
//                        }
//                    }, 4000);
//                }
//
//
//
//
//
//
//        });
//        jbtSkill2.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int x = rdm1.nextInt(10) + 10;
//                int y = rdm1.nextInt(10) + 5;
//                Timer timer1 = new Timer();
//                timer1.schedule(new TimerTask() {
//                    public void run() {
//                        jlbHpchg1.setText("+" + Integer.toString(x));
//                        if ((Integer.parseInt(jlbManHpX.getText()) + x) >= 100){
//                            jlbManHpX.setText("100");
//                        }else {
//                            jlbManHpX.setText(Integer.toString((Integer.parseInt(jlbManHpX.getText()) + x)));
//                        }
//                    }
//
//                }, 1000);
//                timer1.schedule(new TimerTask() {
//                    public void run() {
//                        jlbHpchg1.setText("-" + Integer.toString(y));
//                        jlbManHpX.setText(Integer.toString((Integer.parseInt(jlbManHpX.getText()) - y)));
//
//                    }
//                }, 2000);
//                timer1.schedule(new TimerTask() {
//                    public void run() {
//                        jlbHpchg2.setText(" ");
//                    }
//                }, 3000);
//                timer1.schedule(new TimerTask() {
//                    public void run() {
//                        jlbHpchg1.setText(" ");
//                    }
//                }, 4000);
//
//            }
//        });
//        jbtSkill3.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                    pencilManImg.setIcon(icon3);
//            }
//        });
//        jbtSkill4.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                pencilManImg.setIcon(icon4);
//            }
//        });

    }




}
