

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class loginoperation {
    ///JFrame locframe;
    String regno = null, rollno = null, password = null, check = "check ", filename = null, retpassword = null;
    boolean flag = false;
    myMenubar data = null;
    Socket client;
    BufferedReader in;
    PrintWriter out;
    JButton back = null;
    JPanel loginpanel = null;

    public loginoperation(Socket cl) {
        client=cl;
        loginpanel = new JPanel();
        try {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }


        ///locframe.setVisible(false);
        ///JFrame logframe = new JFrame();
        loginpanel.setSize(300, 300);
		
		CanonicalPath canonicalPath= new CanonicalPath();


        ImageIcon icon = new ImageIcon(canonicalPath.getPath()+"\\pictures\\codeGaos.jpg");
///        Container c = logframe.getContentPane();
        loginpanel.setBackground(Color.LIGHT_GRAY);
        loginpanel.setLayout(null);
        ///loginpanel.setLayout(null);
        //locframe.setVisible(false);
        // logframe.setVisible(true);

        Font f = new Font("Arial", Font.BOLD, 14);
        Font ff = new Font("Arial", Font.PLAIN, 14);

        Label label1 = new Label("Enter your HSC Registration number : ", "enter name in english", 20, 20, 250, 20, f);
        loginpanel.add(label1.labelob);
        myTextField tf1 = new myTextField("", 20, 20, 200, 20, ff);
        loginpanel.add(tf1.textfieldob);
        tf1.textfieldob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regno = tf1.textfieldob.getText();
                if (regno == null) {
                    JOptionPane.showMessageDialog(null, "Registration number has not entered...");
                } else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + regno);
                }
                if (regno != null && rollno != null) {
                    try {
                        out.println("check*" + regno + "*" + rollno);
                        out.flush();
                        String s = in.readLine();
                        System.out.println("***"+s);
                        if (s.equals("not exists"))
                            flag = false;
                        else retpassword = s;
                    } catch (IOException ee) {
                        System.out.println(ee.getMessage());
                    }
                }
            }
        });

        Label label3 = new Label("Enter HSC roll : ", "enter 6 digit roll no", 20, 50, 250, 20, f);
        loginpanel.add(label3.labelob);
        myTextField tf2 = new myTextField("", 20, 50, 250, 20, ff);
        loginpanel.add(tf2.textfieldob);
        tf2.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollno = tf2.textfieldob.getText();
                if (rollno == null)
                    JOptionPane.showMessageDialog(null, "Please enter data...");
                else
                    JOptionPane.showMessageDialog(null, "Taken Data : " + rollno);
                ///data = new myMenubar(check,"login");
                //System.out.println(check);
                //if(data.flag)
                //  flag=true;
                if (regno != null && rollno != null) {
                    try {
                        out.println("check*" + regno + "*" + rollno);
                        out.flush();
                        String s = in.readLine();
                        System.out.println(s+"server theke ");
                        if (s.equals("not exists"))
                            flag = false;
                        else
                        {
                            retpassword = s;
                            flag=true;
                        }
                    } catch (Exception ee) {
                        System.out.println(ee.getMessage());
                    }
                }
            }
        });


        Label label2 = new Label("Enter password : ", "enter 8 digit password", 20, 80, 250, 20, f);
        loginpanel.add(label2.labelob);
        myPassword pass = new myPassword("", 20, 80, 250, 20);
        loginpanel.add(pass.pf);

        //System.out.println(check);

        pass.pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                password = new String(pass.pf.getPassword());
                System.out.println(password+"pw");
                if (flag == false) {
                    JOptionPane.showMessageDialog(null, "You should create account first....");
                } else if (password.length() <= 8) {
                    JOptionPane.showMessageDialog(null, "Password should be at least 8 characters...");
                } else if (password.equals(retpassword)) {
                    System.out.println(retpassword);
                    JOptionPane.showMessageDialog(null, "Password entered successfully...");
                } else {
                    JOptionPane.showMessageDialog(null, "wrong Password ...");
                    System.out.println(retpassword + " " + password);
                }
            }
        });
        back=new JButton("Back");
        back.setBounds(20,120,100,20);
        loginpanel.add(back);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        Socket cl=null;
        try {
            cl=new Socket("localhost", 3333);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        loginoperation lg = new loginoperation(cl);
        frame.add(lg.loginpanel);
        frame.setVisible(true);
    }

}
