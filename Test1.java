import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 extends JFrame {
    private Container cp;
    private ImageIcon monster1 = new ImageIcon("img/敵人2.png");
    private JLabel jlb1 = new JLabel();
    private int x, y, dirFlag;
    Random rdm = new Random();
    public Test1(){
        init();
    }
    public void init(){
        this.setBounds(400,100,1000,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        cp = this.getContentPane();
        cp.setLayout(null);
        cp.add(jlb1);
        x = 200;
        y = 200;
        jlb1.setBounds(x,y,30,30);

        Image imgM = monster1.getImage();
        Image newImgM =imgM.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        monster1 = new ImageIcon(newImgM);
        jlb1.setIcon(monster1);

        java.util.Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            public void run() {
               if (x < 1000){
                   x += 50;
                   jlb1.setLocation(x,y);
               }
               else{
                   x-= 50;
                   jlb1.setLocation(x,y);
               }
               if (y < 550){
                   y += 50;
                   jlb1.setLocation(x,y);
               }
               else {
                   x-= 50;
                   jlb1.setLocation(x,y);
               }
            }

        }, 300);
        new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                switch (rdm.nextInt(4)){
                    case 0 :
                        cp.add(jlb1);
                        jlb1.setBounds(x,200,30,30);
                    case 1 :
                        cp.add(jlb1);
                        jlb1.setBounds(x,200,30,30);
                    case 2 :
                        cp.add(jlb1);
                        jlb1.setBounds(200,y,30,30);
                    case 3 :
                        cp.add(jlb1);
                        jlb1.setBounds(200,y,30,30);

                }

            }
        };
    }
}
