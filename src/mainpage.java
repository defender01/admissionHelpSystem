

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class mainpage {
    CardLayout cardlayout=null;
    Socket client=null;
    BufferedReader in;
    PrintWriter out;
    boolean flag=false;
    String regno=null,rollno=null,retpassword=null,password=null,Regno=null,Rollno=null;
    public mainpage()
    {
        try {
            client = new Socket("localhost", 3333);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        JFrame f = new JFrame();
        f.setBounds(100,50,1000,800);
        JPanel panelcont = new JPanel();
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.darkGray);
        JPanel panel2 = new JPanel();
      //  ImageIcon image1 = new ImageIcon(getClass().getResource("education.png"));
       // JLabel labimg1 = new JLabel(image1);
       // panel1.add(labimg1);

        cardlayout = new CardLayout();
        panelcont.setLayout(cardlayout);
        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(4,10,40,10);

        JLabel label = new JLabel();
        constraint.gridx=0;
        constraint.gridy=0;

        Font font = new Font("Arial", Font.BOLD, 40);

        label.setText("Welcome to our Tool");
        label.setFont(font);
        label.setForeground(Color.BLUE);
        panel1.add(label,constraint);

        constraint.gridx=0;
        constraint.gridy=0;
        constraint.fill=GridBagConstraints.VERTICAL;


        JButton homebut = new JButton("University & Student Info");
        constraint.gridx=0;
        constraint.gridy=4;
        ///constraint.insets = new Insets(40,10,4,10);
        panel1.add(homebut,constraint);

        ///JButton logbut = new JButton("Login");

        constraint.gridx=0;
        constraint.gridy=2;
        constraint.insets=new Insets(180,4,4,4);
        JPanel logsignpanel=new JPanel(new GridBagLayout());
        logsignpanel.setLayout(new GridLayout(4,2));

        Font ff = new Font("Arial", Font.PLAIN, 14);

        Label label1 = new Label("Registration no : ", "enter hsc registration no", 20, 20, 250, 20, ff);
        logsignpanel.add(label1.labelob);
        myTextField tf1 = new myTextField("", 20, 20, 200, 20, ff);
        logsignpanel.add(tf1.textfieldob);
        tf1.textfieldob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regno = tf1.textfieldob.getText();
                if (regno == null) {
                    JOptionPane.showMessageDialog(null, "Registration number has not entered...");
                } else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + regno);
                }
            }
        });

        Label label3 = new Label("HSC roll : ", "enter 6 digit roll no", 20, 50, 250, 20, ff);
        logsignpanel.add(label3.labelob);
        myTextField tf2 = new myTextField("", 20, 50, 250, 20, ff);
        logsignpanel.add(tf2.textfieldob);
        tf2.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollno = tf2.textfieldob.getText();
                System.out.println(rollno);
                if (rollno == null)
                    JOptionPane.showMessageDialog(null, "Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + rollno);
                }
            }
        });


        Label label2 = new Label("Enter password : ", "enter 8 digit password", 20, 80, 250, 20, ff);
        logsignpanel.add(label2.labelob);
        myPassword pass = new myPassword("", 20, 80, 250, 20);
        logsignpanel.add(pass.pf);

        //System.out.println(check);

        pass.pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pp = new String(pass.pf.getPassword());
                password=pp;
                System.out.println(password+"pw");
            }
        });
        JButton signbut=new JButton("Signup");
        logsignpanel.add(signbut);
        signbut.setBackground(Color.GREEN);

        JButton login=new JButton("Login");
        logsignpanel.add(login);
        login.setBackground(Color.GREEN);


        panel1.add(logsignpanel,constraint);




        Varsity_descript vd = new Varsity_descript(client);
       // panel2.add(vd.panelcont);

        panelcont.add(panel1,"1");
        panelcont.add(vd.panelcont,"2");

        ///loginoperation loginpage=new loginoperation(client);
        signinoperation signinpage=new signinoperation(client);
        ///panelcont.add(loginpage.panel,"3");
        panelcont.add(signinpage.panel,"4");

        cardlayout.show(panelcont,"1" );

        homebut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(panelcont,"2");
               // Varsity_descript vd = new Varsity_descript();
               //panel2.add(vd);
                vd.setfilename(regno+"*"+rollno);

            }
        });
        vd.buttonlogmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(panelcont,"1");
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    out.println("check*" + regno + "*" + rollno);
                    System.out.println(regno+rollno);
                    out.flush();
                    String s = in.readLine();
                    System.out.println("***"+s);
                    if (s.equals("not exists"))
                        flag = false;
                    else {
                        retpassword = s;
                        flag=true;
                    }
                } catch (IOException ee) {
                    System.out.println(ee.getMessage());
                }
                if (flag == false) {
                    pass.pf.setText("");
                    JOptionPane.showMessageDialog(null, "You should create account first....");
                } else if (password==null||password.length() <= 8) {
                    pass.pf.setText("");
                    JOptionPane.showMessageDialog(null, "Password should be at least 8 characters...");
                } else if (password.equals(retpassword)) {
                    Regno=regno;
                    Rollno=rollno;
                    System.out.println(retpassword);
                    JOptionPane.showMessageDialog(null, "You have logged in");
                } else {
                    pass.pf.setText("");
                    JOptionPane.showMessageDialog(null, "wrong Password ...");
                    System.out.println(retpassword + " " + password);
                }
            }
        });
        signbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(panelcont,"4");
            }
        });
        signinpage.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(panelcont,"1");
            }
        });

        f.add(panelcont);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);






    }
    public  static void  main(String args[]){
        mainpage mp = new mainpage();
    }
}
