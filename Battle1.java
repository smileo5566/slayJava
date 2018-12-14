
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Battle1 extends JFrame{
    private Container cp;
//    private JPanel jpnN = new JPanel(new GridLayout(2,6,1,1));
//    private JPanel jpnC = new JPanel(new GridLayout(1,14,1,1));
//    private JPanel jpnS = new JPanel(new GridLayout(2,4,1,1));

    private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");
//    畫面
//    private JLabel jlbHpchg1 = new JLabel();
//    private JLabel jlbHpchg2 = new JLabel();
//    private JLabel jlbBlank1 = new JLabel();
//    private JLabel jlbBlank2 = new JLabel();
//    private JLabel jlbBlank3 = new JLabel();
//    private JLabel jlbBlank4 = new JLabel();

    private ImageIcon iconAshe = new ImageIcon("img/神射.png");
    private JLabel Ashe = new JLabel();
    private ImageIcon iconLanBao = new ImageIcon("img/神射.png");
    private JLabel LanBao = new JLabel();

    private JButton jbtSkill1 = new JButton("攻擊!");
    private JButton jbtSkill2 = new JButton("回復!");
    private JButton jbtSkill3 = new JButton("剪頭髮!");
    private JButton jbtSkill4 = new JButton("不開心!");

    Random rdm1 = new Random();

    public Battle1(){
        init();
    }
    public void init(){
        this.setBounds(400,100,1000,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setJMenuBar(jMB);
        cp =this.getContentPane();
        cp.setLayout(null);
        cp =this.getContentPane();

        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);




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
