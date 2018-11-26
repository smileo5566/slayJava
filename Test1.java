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
<?php session_start(); ?>
    <meta http-equiv="content-type" content="text/html ; charset=utf-8" >
<?php
include ('db_conn.inc.php');
$result =mysqli_query($link,$sql);
$row =mysqli_fetch_row($result);
$title= $_POST['title'];
$description = $_POST['description'];
$inputdescription = $_POST['inputdescription'];
$outputdescription =$_POST['outputdescription'];
$input1=$_POST['input1'];
$output1=$_POST['output1'];
$input2=$_POST['input2'];
$output2=$_POST['output2'];
$input3=$_POST['input3'];
$output3=$_POST['output3'];
$state=$_SESSION['id'];
$name=$_SESSION['name'];
echo $name;
if(!empty($title) && !empty($description) && !empty($inputdescription)&& !empty($outputdescription)&& !empty($input1)&& !empty($output1)){
        echo '完成登錄題目';
        $sql = "INSERT INTO `Program` (`title`,`userID`,`description`,`inputdescription`,`outputdescription`,`input1`,`output1`,`input2`,`output2`,`input3`,`output3`,`status`) VALUES ('$title','$name','$description','$inputdescription','$outputdescription','$input1','$output1','$input2','$output2','$input3','$output3','$state')";
        $result = mysqli_query($link, $sql);
        echo '<meta http-equiv="refresh" content="2,url=programmer.php">';
    }
else{
    echo  '登錄失敗';
    echo  '<meta http-equiv="refresh" content="2,url=programmer.php">';
}
