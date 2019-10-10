
/*
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.PrintWriter;


class startpage {
    BufferedImage image;
    JFrame locframe=null;
    JButton buttonlog;
    JButton buttonsign;
    startpage(JFrame locframe)
    {
        this.locframe=locframe;
    }
    public void putimage(){
        try{
            System.out.println(2);
            ImageIcon icon=new ImageIcon("C:\\Users\\Ludwig Prandtl\\IdeaProjects\\start\\src\\codeGaos.jpg");
            Container c=locframe.getContentPane();
            c.setBackground(Color.LIGHT_GRAY);

            locframe.setLayout(new FlowLayout());
            locframe.setIconImage(icon.getImage());
            ImageIcon image = new ImageIcon(getClass().getResource("/Top-ten-public-universities-in-bangladesh-1.jpg"));
            JLabel lbl = new JLabel(image);
            locframe.getContentPane().add(lbl);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    void addbutton()
    {
        buttonlog = new JButton("Login");
        buttonlog.setLocation(500, 1500);
        buttonlog.setSize(160, 40);
        locframe.getContentPane().add(buttonlog);
        buttonsign = new JButton("Sign up");
        buttonsign.setLocation(700, 2000);
        buttonsign.setSize(160, 40);
        locframe.getContentPane().add(buttonsign);
        buttonlog.addActionListener(new loginoperation());
        buttonsign.addActionListener(new signinoperation(locframe));
        System.out.println(6);

    }
}

public class loginSignup {
    public static void main(String[] args) {
        String name=null,sscroll=null,sscreg=null,hscroll=null,hscreg=null;
        JFrame frame1 = new JFrame();
       /// frame1.setSize(2500,1500);
        frame1.setBounds(400,100,700,450);
        startpage start = new startpage(frame1);
        start.putimage();
        frame1.setVisible(true);
        frame1.pack();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.addbutton();

    }
}
*/