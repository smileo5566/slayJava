import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class character extends JFrame{
    private Container cp;

    private JMenuBar jMB = new JMenuBar();
    private JMenu jMYo = new JMenu("Yo!");
    private JMenu jMTool = new JMenu("Tool");
    private JMenu jMAbout = new JMenu("About");
    private JMenuItem jMIRe = new JMenuItem("Restart");
    private JMenuItem jMIClose = new JMenuItem("Close");

    private JLabel Title = new JLabel("Character");
    private JLabel Name = new JLabel("Name");

    public static JTextField JtfName = new JTextField();

    private ImageIcon iconAshe1 = new ImageIcon("img/AsheWhite.png" );
    private ImageIcon iconAshe2 = new ImageIcon("img/Ashe2.png");
    private ImageIcon iconAsheChoose = new ImageIcon("img/AsheChoose.png");
    private ImageIcon iconPointer = new ImageIcon("img/point.png");
    private JLabel AsheImg = new JLabel();
    private JLabel AsheImg2 = new JLabel();
    private JLabel AsheChooseImg = new JLabel();
    private JLabel PointerImg = new JLabel();

    private Font fontAntiqua50 = new Font("Book Antiqua", Font.BOLD,50);
    private Font fontAntiqua30 = new Font("Book Antiqua", Font.BOLD,30);

    private JButton btnGo = new JButton("Go");

    public character(){
        init();
    }
    public void init(){
        this.setBounds(550,200,800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(false);
        cp =this.getContentPane();

        cp.setLayout(null);
        cp.setBackground(new Color(141,141,130));
        cp.add(jMB);
        cp.add(Title);
        cp.add(PointerImg);
        cp.add(AsheImg);
        cp.add(Name);
        cp.add(JtfName);
        cp.add(btnGo);

        jMB.add(jMYo);
        jMB.add(jMTool);
        jMB.add(jMAbout);
        jMYo.add(jMIRe);
        jMYo.add(jMIClose);

        Title.setBounds(290,0,220,50);
        PointerImg.setBounds(385,70,30,66);

        AsheImg.setBounds(300,150,200,214);
        Name.setBounds(357,375, 86,50);
        JtfName.setBounds(340,430,120,30);
        btnGo.setBounds(350,500,100,30);

        Title.setFont(fontAntiqua50);
        Name.setFont(fontAntiqua30);

        btnGo.setBorder(BorderFactory.createRaisedBevelBorder());


        Image imgA = iconAshe1.getImage();
        Image newImgA =imgA.getScaledInstance(200,214, Image.SCALE_SMOOTH);
        iconAshe1 = new ImageIcon(newImgA);
        AsheImg.setIcon(iconAshe1);


        Image imgA2 = iconAshe2.getImage();
        Image newImgA2 =imgA2.getScaledInstance(200,214, Image.SCALE_SMOOTH);
        iconAshe2 = new ImageIcon(newImgA2);
        AsheImg2.setIcon(iconAshe2);

        Image imgAC = iconAsheChoose.getImage();
        Image newImgAC =imgAC.getScaledInstance(200,214, Image.SCALE_SMOOTH);
        iconAsheChoose = new ImageIcon(newImgAC);
        AsheChooseImg.setIcon(iconAsheChoose);

        Image imgP = iconPointer.getImage();
        Image newImgP =imgP.getScaledInstance(30,66, Image.SCALE_SMOOTH);
        iconPointer = new ImageIcon(newImgP);
        PointerImg.setIcon(iconPointer);

        AsheImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AsheImg.setIcon(iconAsheChoose);
                PointerImg.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (AsheImg.getIcon() != iconAsheChoose){
                AsheImg.setIcon(iconAshe2);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (AsheImg.getIcon() != iconAsheChoose){
                    AsheImg.setIcon(iconAshe1);
                }
            }
        });

        btnGo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (AsheImg.getIcon() == iconAsheChoose && JtfName.getText().length() != 0){
                  JOptionPane.showConfirmDialog(null,"Click ok if you are ok", "Be ok!", JOptionPane.YES_NO_OPTION);

                    Map map1 = new Map();
                    map1.setVisible(true);
                    character.this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Do Your Choice!","選擇! 孩子!",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
