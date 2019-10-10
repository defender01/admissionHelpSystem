

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class signinoperation {


    boolean flag=false;
    String hscRegno=null,hscRollno=null,password=null,name=null,filename=null;
    JPanel panel=null;
    Socket client;
    BufferedReader in;
    PrintWriter out;
    JButton back=null;

    public signinoperation(Socket cl) {
        panel=new JPanel();
        client=cl;
        try {

            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }


        //logframe.setVisible(true);

        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //locframe.setVisible(false);
        // panel.setVisible(true);
        panel.setBounds(200, 200, 700, 450);


        Font f = new Font("Arial", Font.BOLD, 14);
        Font ff = new Font("Arial", Font.PLAIN, 14);
        Label label1 = new Label("Enter HSC registration no : ", "enter 10 digit reg no", 20, 20, 250, 20, f);
        panel.add(label1.labelob);
        myTextField tf5 = new myTextField("1111365799", 300, 20, 250, 20, ff);
        panel.add(tf5.textfieldob);
        tf5.textfieldob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hscRegno = tf5.textfieldob.getText();
                if (hscRegno == null) {
                    JOptionPane.showMessageDialog(null, "Registration number has not entered...");
                } else {
                    JOptionPane.showMessageDialog(null, "Taken Data : "+hscRegno);
                }

            }
        });


        Label label2 = new Label("Enter HSC roll : ", "enter 6 digit roll no", 20, 50, 250, 20, f);
        panel.add(label2.labelob);
        myTextField tf4 = new myTextField("150909", 300, 50, 250, 20, ff);
        panel.add(tf4.textfieldob);
        tf4.textfieldob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hscRollno = tf4.textfieldob.getText();
                if (hscRollno == null) {
                    JOptionPane.showMessageDialog(null, "Roll number has not entered...");
                } else {
                    JOptionPane.showMessageDialog(null, "Taken Data : "+hscRollno);
                }

            }
        });

        Label label3 = new Label("Enter username : ", "enter name in english", 20, 80, 250, 20, f);
        panel.add(label3.labelob);
        myTextField tf1 = new myTextField("Rahat Rizvi Rahman", 300, 80, 250, 20, ff);
        panel.add(tf1.textfieldob);
        tf1.textfieldob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = tf1.textfieldob.getText();
                if (name == null) {
                    JOptionPane.showMessageDialog(null, "name hasnot entered...");
                } else {
                    JOptionPane.showMessageDialog(null, "name entered successfully...");
                }

            }
        });


        Label label4 = new Label("Enter password : ", "enter 8 digit password", 20, 110, 250, 20, f);
        panel.add(label4.labelob);
        myPassword pass = new myPassword("1167141", 300, 110, 250, 20);
        panel.add(pass.pf);
        pass.pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s= new String(pass.pf.getPassword());

                ///String s=pass.pf.getPassword();
                if (s.length() < 8) {
                    JOptionPane.showMessageDialog(null, "Password should be at least 8 characters...");
                } else {
                    password=s;
                    System.out.println("textfield pass"+password);
                    JOptionPane.showMessageDialog(null, "Password entered successfully...");
                }

            }
        });




        ///ImageIcon ic1 = new ImageIcon("C:\\Users\\Ludwig Prandtl\\IdeaProjects\\start\\src\\codeGaos.jpg");
        ///JLabel label7 = new JLabel();
        ///label7.setIcon(ic1);
        ///label7.setBounds(280, 0, ic1.getIconWidth(), ic1.getIconHeight());
        ///panel.add(label7);




        JButton submit=new JButton();
        submit.setText("Submit");
        submit.setBounds(400,300,100,30);
        panel.add(submit);

        back=new JButton();
        back.setText("Back");
        back.setBounds(100,300,100,30);
        panel.add(back);





        /*ImageIcon ic2 = new ImageIcon("C:\\Users\\Ludwig Prandtl\\IdeaProjects\\start\\src\\mask.jpg");
        JLabel label9 = new JLabel();
        label9.setIcon(ic2);
        label9.setBounds(0, 0, 280, 450);
        panel.add(label9);
*/

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hscRegno!=null&&hscRollno!=null&&password!=null)
                {
                    try{
                        System.out.println("create "+hscRegno+" "+hscRollno+" "+password);
                        out.println("create*"+"name"+"*#*"+"regno*"+hscRegno+"*rollno*"+hscRollno+"*pass*"+password+"*group"+"*#*"+"division"+"*#*"+"gender"+"*#*"+"fee"+"*#*"+"banMarks"+"*#*"+"engMarks"+"*#*"+"phyMarks"+"*#*"+"chemMarks"+"*#*"+"hMathMarks"+"*#*"+"ictMarks"+"*#*"+"bioMarks"+"*#*"+"bmMarks"+"*#*"+"acMarks"+"*#*"+"mktMarks"+"*#*"+"fnMarks"+"*#*"+"ecmMarks"+"*#*"+"geoMarks"+"*#*"+"subject"+"*#*");

                        System.out.println("123456");
                        String s=in.readLine();
                        System.out.println(s);
                        if(s.equals("created")) {
                            JOptionPane.showMessageDialog(null,"Your account has been created successfully");
                        }

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    flag=true;
                }
                else
                {
                    if(hscRegno==null)
                        JOptionPane.showMessageDialog(null,"Please input hsc Reg no...");
                    else if(hscRollno==null)
                        JOptionPane.showMessageDialog(null,"Please input hsc Roll no...");
                    else if(password==null)
                        JOptionPane.showMessageDialog(null,"Please input password...");
                    else if(name==null)
                        JOptionPane.showMessageDialog(null,"Please input name...");
                }
            }
        });



    }
}