

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class scienceSubjectChoice  {

    String finaldata=null,banMarks=null,engMarks=null,phyMarks=null,chemMarks=null,hMathMarks=null,ictMarks=null,bioMarks=null;
    boolean flag=false;
    String prevdata=null;

    public scienceSubjectChoice(String s)
    {
        prevdata=s;
        takedata();
    }

    public void takedata(){
		CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon ic=new ImageIcon(canonicalPath.getPath()+"\\pictures\\student.png");
        JFrame frame=new JFrame();
        frame.setBounds(200,70,1000,600);



        frame.setLayout(null);
        frame.setIconImage(ic.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Marks");

        Container c=frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);

        Font f=new Font("Arial",Font.BOLD,14);
        Font ff=new Font("Arial",Font.PLAIN,14);



        Label lb=new Label("Enter your HSC marks here : ","enter subjectwise marks",110,60,250,20,f);
        lb.labelob.setBackground(Color.YELLOW);
        c.add(lb.labelob);
        ///lebels

        Label label1=new Label("Bengali : ","enter your HSC marks",110,120,400,20,f);
        c.add(label1.labelob);
        myTextField tf1=new myTextField(banMarks,600,120,100,20,ff);
        c.add(tf1.textfieldob);
        tf1.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf1.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    banMarks=s;
                }
            }
        });


        Label label2=new Label("English : ","enter your HSC marks",110,160,400,20,f);
        c.add(label2.labelob);
        myTextField tf2=new myTextField(engMarks,600,160,100,20,ff);
        c.add(tf2.textfieldob);
        ///tf2.textfieldob.addActionListener(new myActionListener(tf2.textfieldob));
        tf2.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf2.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    engMarks=s;
                }
            }
        });

        Label label3=new Label("Physics : ","enter your HSC marks",110,200,400,20,f);
        c.add(label3.labelob);
        myTextField tf3=new myTextField(phyMarks,600,200,100,20,ff);
        c.add(tf3.textfieldob);
        ///tf3.textfieldob.addActionListener(new myActionListener(tf3.textfieldob));
        tf3.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf3.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    phyMarks=s;
                }
            }
        });

        Label label4=new Label("Chemistry : ","enter your HSC marks",110,240,400,20,f);
        c.add(label4.labelob);
        myTextField tf4=new myTextField(chemMarks,600,240,100,20,ff);
        c.add(tf4.textfieldob);
        ///tf4.textfieldob.addActionListener(new myActionListener(tf4.textfieldob));
        tf4.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf4.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    chemMarks=s;
                }
            }
        });

        Label label5=new Label("Higher Mathematics : ","enter your HSC marks",110,280,400,20,f);
        c.add(label5.labelob);
        myTextField tf5=new myTextField(hMathMarks,600,280,100,20,ff);
        c.add(tf5.textfieldob);
        ///tf5.textfieldob.addActionListener(new myActionListener(tf5.textfieldob));
        tf5.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf5.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    hMathMarks=s;
                }
            }
        });

        Label label6=new Label("Information & Communication Technology : ","enter your HSC marks",110,320,400,20,f);
        c.add(label6.labelob);
        myTextField tf6=new myTextField(ictMarks,600,320,100,20,ff);
        c.add(tf6.textfieldob);
        ///tf6.textfieldob.addActionListener(new myActionListener(tf6.textfieldob));
        tf6.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf6.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    ictMarks=s;
                }
            }
        });

        Label label7=new Label("Biology : ","enter your HSC marks",110,360,400,20,f);
        c.add(label7.labelob);
        myTextField tf7=new myTextField(bioMarks,600,360,100,20,ff);
        c.add(tf7.textfieldob);
        ///tf7.textfieldob.addActionListener(new myActionListener(tf7.textfieldob));
        tf7.textfieldob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf7.textfieldob.getText();
                if(s==null)
                    JOptionPane.showMessageDialog(null,"Please enter data...");
                else {
                    JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                    bioMarks=s;
                }
            }
        });

        JButton submitButton=new JButton();
        submitButton.setText("SUBMIT");
        submitButton.setBounds(400,450,100,30);


        c.add(submitButton);

        ImageIcon backgroundimg1=new ImageIcon(canonicalPath.getPath()+"\\pictures\\Art-White-Wallpaper.jpg");
        JLabel bgimglabel1=new JLabel();
        bgimglabel1.setIcon(backgroundimg1);
        bgimglabel1.setBounds(60,40,870,490);
        c.add(bgimglabel1);


        ImageIcon backgroundimg2=new ImageIcon(canonicalPath.getPath()+"\\pictures\\59380.jpg");
        JLabel bgimglabel2=new JLabel();
        bgimglabel2.setIcon(backgroundimg2);
        bgimglabel2.setBounds(0,0,backgroundimg2.getIconWidth(),backgroundimg2.getIconHeight());
        c.add(bgimglabel2);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(banMarks!=null&&engMarks!=null&&phyMarks!=null&&chemMarks!=null&&hMathMarks!=null&&ictMarks!=null&&bioMarks!=null)
                {
                    JOptionPane.showMessageDialog(null,"marks "+banMarks+" "+engMarks+" "+phyMarks+" "+chemMarks+" "+hMathMarks+" "+ictMarks+" "+bioMarks);
                    flag=true;
                    frame.setVisible(false);
                    c.setVisible(false);
                    System.out.println(prevdata);
                    myMenubar menubar=new myMenubar(prevdata+" "+banMarks+" "+engMarks+" "+phyMarks+" "+chemMarks+" "+hMathMarks+" "+ictMarks+" "+bioMarks,"signup");
                }
                else JOptionPane.showMessageDialog(null,"Please input all data...");
            }
        });

        if(!flag) {
            frame.setVisible(true);
            c.setVisible(true);
        }
        else {
            //myMenubar menubar=new myMenubar(prevdata+" "+banMarks+" "+engMarks+" "+phyMarks+" "+chemMarks+" "+hMathMarks+" "+ictMarks+" "+bioMarks);

            frame.setVisible(false);
            c.setVisible(false);
        }


    }


    /*public static void main(String[] args) {
        scienceSubjectChoice schoice=new scienceSubjectChoice();
        schoice.takedata();

    }*/

}
