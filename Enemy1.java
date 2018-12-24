
import sun.awt.WindowClosingListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Enemy1 extends JFrame{
    private Container cp;
    public JFrame Map;



    private ImageIcon iconAshe = new ImageIcon("img/神射.png");
    private JLabel Ashe = new JLabel();
    private ImageIcon iconLanBao = new ImageIcon("img/神射.png");
    private JLabel LanBao = new JLabel();


    Random rdm1 = new Random();

    public Enemy1(JFrame jFrame){
        init(jFrame);
    }
    public void init(JFrame jFrame){
        this.setBounds(400,100,1000,550);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);

        this.setResizable(false);
        this.Map = jFrame;
        cp = this.getContentPane();
        cp.setLayout(null);
        cp = this.getContentPane();


        Enemy1.this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

            }
        });


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
