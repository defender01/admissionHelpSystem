

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.net.Socket;
import java.util.StringTokenizer;


public class studentprofile {
    String finaldata = null, banMarks = null, engMarks = null, phyMarks = null, chemMarks = null, hMathMarks = null, ictMarks = null, bioMarks = null;
    String bmMarks = null, acMarks = null, mktMarks = null, fnMarks = null, ecmMarks = null, geoMarks = null;
    String group = null, filename = null;
    double profilepoint=0;
    Socket client;
    BufferedReader in;
    PrintWriter out;
    File clfile;
    PrintWriter clfilewr;


    dataCollector dc = null;

    public studentprofile(Socket cl, String fl) {

        client = cl;
        filename = fl;
        try {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }

        create();
    }

    void create() {
        ///dataCollector dc = new dataCollector("rahatrr.txt");
        String ss = null;
        try {
            out.println("load*" + filename);
            out.flush();
            ss = in.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        StringTokenizer st = new StringTokenizer(ss, "*");
        System.out.println("in sudprofile from server ss=" + ss);

        dc = new dataCollector();

        String str = null;
        while (st.hasMoreTokens()) {
            str = st.nextToken();

            String s = null;
            if (st.hasMoreTokens()) {

                // System.out.println("in studentprofile str="+str+" s= "+s);
                if (str.equals("name")) {
                    s = st.nextToken();
                    ///System.out.println("in studentprofile str="+str+" s= "+s+" dc"+dc.name);
                    if (!s.equals("#")) {
                        profilepoint++;
                        dc.name = s;
                    }

                    System.out.println("name " + dc.name);
                } else if (str.equals("regno")) {
                    s = st.nextToken();
                    if (!s.equals("#")) {
                        profilepoint++;
                        dc.regno = s;
                    }
                    System.out.println("*regno");

                } else if (str.equals("rollno")) {
                    System.out.println("*rollno");
                    s = st.nextToken();
                    if (s.equals("#") == false) {
                        profilepoint++;
                        dc.rollno = "";
                        dc.rollno = s;
                    }

                } else if (str.equals("pass")) {
                    s = st.nextToken();
                    if (s.equals("#") == false)
                        profilepoint++;
                        dc.password = s;
                    System.out.println("*pass" + dc.password);

                } else if (str.equals("group")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        profilepoint++;
                        dc.group = s;
                    }
                    System.out.println("*group" + dc.group);

                } else if (str.equals("division")) {
                    dc.divisioncnt = 0;
                    System.out.println("*division");
                    while (st.hasMoreTokens()) {
                        s = st.nextToken();
                        if (s.equals("#")) break;
                        else if (s.equals("gender")) {
                            s = st.nextToken();
                            if (!s.equals("#")) {
                                dc.gender = s;
                            }
                            System.out.println("*gender" + dc.gender);
                            break;
                        } else if (!s.equals("#")) {
                            if(dc.divisioncnt==0)profilepoint++;
                            dc.division[dc.divisioncnt++] = s;
                        }
                    }
                } else if (str.equals("gender")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        profilepoint++;
                        dc.gender = s;
                    }
                    System.out.println("*gender" + dc.gender);
                } else if (str.equals("residential")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        profilepoint++;
                        dc.residential = s;
                    }
                    System.out.println("*residential" + dc.residential);
                }else if (str.equals("gpa")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        profilepoint++;
                        dc.gpa = s;
                    }
                    System.out.println("*gpa" + dc.gpa);
                }else if (str.equals("fee")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        profilepoint++;
                        dc.fee = s;
                    }
                    System.out.println("fee " + dc.fee);

                } else if (str.equals("banMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                    {
                        dc.banMarks = s;
                    }
                    System.out.println("*ban"+dc.banMarks);

                } else if (str.equals("engMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.engMarks = s;
                    System.out.println("*eng"+dc.engMarks);

                } else if (str.equals("phyMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.phyMarks = s;

                } else if (str.equals("chemMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.chemMarks = s;

                } else if (str.equals("hMathMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.hMathMarks = s;

                } else if (str.equals("ictMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.ictMarks = s;

                } else if (str.equals("bioMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.bioMarks = s;

                } else if (str.equals("bmMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.bmMarks = s;

                } else if (str.equals("acMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.acMarks = s;

                } else if (str.equals("mktMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.mktMarks = s;

                } else if (str.equals("fnMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.fnMarks = s;

                } else if (str.equals("ecmMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.ecmMarks = s;
                } else if (str.equals("geoMarks")) {
                    s = st.nextToken();
                    if (!s.equals("#"))
                        dc.geoMarks = s;

                } else if (str.equals("subject")) {
                    dc.subcnt = 0;
                    while (st.hasMoreTokens()) {
                        s = st.nextToken();
                        if (!s.equals("#") && s != null)
                        {
                            if(dc.subcnt==0)profilepoint++;
                            dc.selectedsub[dc.subcnt++] = s;
                        }
                    }
                }
            }

        }


        JFrame frame = new JFrame("student profile");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.anchor = GridBagConstraints.WEST;

        gbc.insets = new Insets(4, 12, 4, 12);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel jlb1 = new JLabel("Enter full name");
        c.add(jlb1, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 3;
        gbc.gridy = 0;
        JLabel jlb8 = new JLabel("Your profile is "+(int)(profilepoint*100/12)+"% completed");
        jlb8.setBackground(Color.CYAN);
        c.add(jlb8, gbc);


        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        ///JLabel jlb1=new JLabel("Enter full name");
        JTextField jtf1 = new JTextField(dc.name);
        if (dc.name != null) jtf1.setText(dc.name);
        c.add(jtf1, gbc);
        jtf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dc.name = jtf1.getText();
            }
        });

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        JLabel jlb2 = new JLabel("Interested Group");
        c.add(jlb2, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        ///JLabel jlb1=new JLabel("Enter full name");
        ///JTextField jtf1=new JTextField(12);
        String[] groupcollection = {"SCIENCE", "COMMERCE", "ARTS"};
        JComboBox jcmb1 = new JComboBox(groupcollection);
        int ind = 0;
        for (int i = 0; i < 3; i++) {
            if (dc.group != null && dc.group.equals(groupcollection[i])) ind = i;
        }
        jcmb1.setSelectedIndex(ind);
        c.add(jcmb1, gbc);
        jcmb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dc.group = (String) jcmb1.getSelectedItem();
                System.out.println("selected group in student profile:" + dc.group);
            }
        });

        JPanel pan1 = new JPanel();
        String[] alldivision = {"Dhaka", "Chottogram", "Sylhet", "Rajshahi", "Khulna", "Barishal", "Rangpur", "Mymensingh"};
        JList jl1 = new JList(alldivision);
        jl1.setVisibleRowCount(4);
        jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        pan1.add(jl1);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        JScrollPane jsp = new JScrollPane(pan1);
        c.add(jsp, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        JTextArea jta1 = new JTextArea();

        String jta1text = "Selected divisions";
        System.out.println(dc.divisioncnt);
        for (int i = 0; i < dc.divisioncnt; i++) {
            jta1text += "\n" + dc.division[i];
        }
        jta1.setText(jta1text);
        c.add(jta1, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 1;
        gbc.gridy = 2;
        JButton jb1 = new JButton("Set Selected");
        c.add(jb1, gbc);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] selected = jl1.getSelectedValues();
                for (int i = 0; i < selected.length; i++) {
                    dc.division[i] = (String) selected[i];
                    System.out.println(dc.division[i]);
                }
                dc.divisioncnt = selected.length;
                String s = "Selected divisions";
                System.out.println(dc.divisioncnt);
                for (int i = 0; i < dc.divisioncnt; i++) {
                    s += "\n" + dc.division[i];
                }
                System.out.println(s);
                jta1.setText(s);
            }
        });


        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JLabel jlb3 = new JLabel("Enter Division choice");
        ///JTextField jtf1=new JTextField(12);
        c.add(jlb3, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JLabel jlb9 = new JLabel("Residence choice:");
        ///JTextField jtf1=new JTextField(12);
        c.add(jlb9, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb6 = new JCheckBox("residential", false);
        if (dc.residential != null && dc.residential.equals("residential")) {
            cb6.setSelected(true);
        }

        ///JTextField jtf1=new JTextField(12);
        c.add(cb6, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 3;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb7 = new JCheckBox("non-residential", false);
        if (dc.residential != null && dc.residential.equals("non-residential"))
            cb7.setSelected(true);

        c.add(cb7, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb8 = new JCheckBox("dual-residential", false);
        if (dc.residential != null && dc.residential.equals("dual-residential"))
            cb8.setSelected(true);
        c.add(cb8, gbc);



        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JLabel jlb4 = new JLabel("Gender");
        ///JTextField jtf1=new JTextField(12);
        c.add(jlb4, gbc);

        ///checkbox
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 4;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb1 = new JCheckBox("Male", false);
        if (dc.gender != null && dc.gender.equals("male")) {
            cb1.setSelected(true);
        }

        ///JTextField jtf1=new JTextField(12);
        c.add(cb1, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 4;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb2 = new JCheckBox("Female", false);
        if (dc.gender != null && dc.gender.equals("female"))
            cb2.setSelected(true);
        c.add(cb2, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 5;

        JLabel jlb5 = new JLabel("Preferable Monthly Fee");
        c.add(jlb5, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 5;

        JCheckBox cb3 = new JCheckBox("0-5000", false);
        if (dc.fee != null && dc.fee.equals("0-5000")) cb3.setSelected(true);

        c.add(cb3, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 5;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb4 = new JCheckBox("5000-10000", false);
        ///JTextField jtf1=new JTextField(12);
        if (dc.fee != null && dc.fee.equals("5000-10000")) cb4.setSelected(true);
        c.add(cb4, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JCheckBox cb5 = new JCheckBox("10000-20000", false);
        if (dc.fee != null && dc.fee.equals("10000-20000")) cb5.setSelected(true);

        c.add(cb5, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 6;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JButton jb2 = new JButton("Click to ENTER HSC MARKS HERE");

        c.add(jb2, gbc);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame nestedframe = new JFrame("Marks");
                nestedframe.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                gc.insets = new Insets(4, 4, 4, 4);

                nestedframe.setBounds(200, 200, 400, 400);
                JPanel contPanel = new JPanel();

                CardLayout cd = new CardLayout();
                contPanel.setLayout(cd);
                JPanel nestjp1 = new JPanel();
                JPanel nestjp2 = new JPanel();
                JPanel nestjp3 = new JPanel();

                nestjp1.setLayout(new GridBagLayout());
                nestjp2.setLayout(new GridBagLayout());
                nestjp3.setLayout(new GridBagLayout());

                contPanel.add(nestjp1, "1");
                contPanel.add(nestjp2, "2");
                contPanel.add(nestjp3, "3");

                gc.gridx = 0;
                gc.gridy = 0;
                gc.fill = GridBagConstraints.BOTH;

                if (dc.group != null && dc.group.equals("SCIENCE"))
                    cd.show(contPanel, "1");
                else if (dc.group != null && dc.group.equals("COMMERCE"))
                    cd.show(contPanel, "2");

                ///for science students
                Font f = new Font("Arial", Font.BOLD, 14);
                Font ff = new Font("Arial", Font.PLAIN, 14);


                JLabel lb = new JLabel("Enter your HSC marks here : ");
                lb.setBackground(Color.YELLOW);
                gc.gridx = 0;
                gc.gridy = 0;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(lb, gc);
                ///lebels

                JLabel label1 = new JLabel("Bengali : ");
                gc.gridx = 0;
                gc.gridy = 1;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label1, gc);
                JTextField tf1 = new JTextField(8);
                if (dc.banMarks != null) tf1.setText(dc.banMarks);
                gc.gridx = 1;
                gc.gridy = 1;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf1, gc);
                tf1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf1.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.banMarks = s;
                        }
                    }
                });


                JLabel label2 = new JLabel("English : ");
                gc.gridx = 0;
                gc.gridy = 2;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label2, gc);
                JTextField tf2 = new JTextField(8);
                if (dc.engMarks != null) tf2.setText(dc.engMarks);
                gc.gridx = 1;
                gc.gridy = 2;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf2, gc);
                ///tf2.addActionListener(new myActionListener(tf2));
                tf2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf2.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.engMarks = s;
                        }
                    }
                });

                JLabel label3 = new JLabel("Physics : ");
                gc.gridx = 0;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label3, gc);
                JTextField tf3 = new JTextField(8);
                if (dc.phyMarks != null) tf3.setText(dc.phyMarks);
                gc.gridx = 1;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf3, gc);
                ///tf3.addActionListener(new myActionListener(tf3));
                tf3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf3.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.phyMarks = s;
                        }
                    }
                });

                JLabel label4 = new JLabel("Chemistry : ");
                gc.gridx = 0;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label4, gc);
                JTextField tf4 = new JTextField(8);
                if (dc.chemMarks != null) tf4.setText(dc.chemMarks);
                gc.gridx = 1;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf4, gc);
                ///tf4.addActionListener(new myActionListener(tf4));
                tf4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf4.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.chemMarks = s;
                        }
                    }
                });

                JLabel label5 = new JLabel("Higher Mathematics : ");
                gc.gridx = 0;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label5, gc);
                JTextField tf5 = new JTextField(8);
                if (dc.hMathMarks != null) tf5.setText(dc.hMathMarks);
                gc.gridx = 1;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf5, gc);
                ///tf5.addActionListener(new myActionListener(tf5));
                tf5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf5.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.hMathMarks = s;
                        }
                    }
                });

                JLabel label6 = new JLabel("Information & Communication Technology : ");
                gc.gridx = 0;
                gc.gridy = 6;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label6, gc);
                JTextField tf6 = new JTextField(8);
                if (dc.ictMarks != null) tf6.setText(dc.ictMarks);
                gc.gridx = 1;
                gc.gridy = 6;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf6, gc);
                ///tf6.addActionListener(new myActionListener(tf6));
                tf6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf6.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.ictMarks = s;
                        }
                    }
                });

                JLabel label7 = new JLabel("Biology : ");
                gc.gridx = 0;
                gc.gridy = 7;
                gc.anchor = GridBagConstraints.EAST;
                nestjp1.add(label7, gc);
                JTextField tf7 = new JTextField(8);
                if (dc.bioMarks != null) tf7.setText(dc.bioMarks);
                gc.gridx = 1;
                gc.gridy = 7;
                gc.anchor = GridBagConstraints.WEST;
                nestjp1.add(tf7, gc);
                ///tf7.addActionListener(new myActionListener(tf7));
                tf7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = tf7.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.bioMarks = s;
                        }
                    }
                });

                gc.gridx = 0;
                gc.gridy = 8;
                gc.anchor = GridBagConstraints.EAST;
                gc.fill = GridBagConstraints.NONE;
                JButton jb3 = new JButton(" OK ");
                nestjp1.add(jb3, gc);


                ///for Commerce students


                JLabel clb = new JLabel("Enter your HSC marks here : ");
                clb.setBackground(Color.YELLOW);
                gc.gridx = 0;
                gc.gridy = 0;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(clb, gc);
                ///lebels

                JLabel clabel1 = new JLabel("Bengali : ");
                gc.gridx = 0;
                gc.gridy = 1;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel1, gc);
                JTextField ctf1 = new JTextField(8);
                if (dc.banMarks != null) ctf1.setText(dc.banMarks);
                gc.gridx = 1;
                gc.gridy = 1;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf1, gc);
                ctf1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf1.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.banMarks = s;
                        }
                    }
                });


                JLabel clabel2 = new JLabel("English : ");
                gc.gridx = 0;
                gc.gridy = 2;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel2, gc);
                JTextField ctf2 = new JTextField(8);
                if (dc.engMarks != null) ctf2.setText(dc.engMarks);
                gc.gridx = 1;
                gc.gridy = 2;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf2, gc);
                ///tf2.addActionListener(new myActionListener(tf2));
                ctf2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf2.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.engMarks = s;
                        }
                    }
                });

                JLabel clabel3 = new JLabel("Business Organisation & Management : ");
                gc.gridx = 0;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel3, gc);
                JTextField ctf3 = new JTextField(8);
                if (dc.bmMarks != null) ctf3.setText(dc.bmMarks);
                gc.gridx = 1;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf3, gc);
                ///tf3.addActionListener(new myActionListener(tf3));
                ctf3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf3.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.bmMarks = s;
                        }
                    }
                });

                JLabel clabel4 = new JLabel("Accounting : ");
                gc.gridx = 0;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel4, gc);
                JTextField ctf4 = new JTextField(8);
                if (dc.acMarks != null) ctf4.setText(dc.acMarks);
                gc.gridx = 1;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf4, gc);
                ///tf4.addActionListener(new myActionListener(tf4));
                ctf4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf4.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.acMarks = s;
                        }
                    }
                });

                JLabel clabel5 = new JLabel("Production Management & Marketing : ");
                gc.gridx = 0;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel5, gc);
                JTextField ctf5 = new JTextField(8);
                if (dc.mktMarks != null) ctf5.setText(dc.mktMarks);
                gc.gridx = 1;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf5, gc);
                ///tf5.addActionListener(new myActionListener(tf5));
                ctf5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf5.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.mktMarks = s;
                        }
                    }
                });

                JLabel clabel6 = new JLabel("Information & Communication Technology : ");
                gc.gridx = 0;
                gc.gridy = 6;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel6, gc);
                JTextField ctf6 = new JTextField(8);
                if (dc.ictMarks != null) ctf6.setText(dc.ictMarks);
                gc.gridx = 1;
                gc.gridy = 6;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf6, gc);
                ///tf6.addActionListener(new myActionListener(tf6));
                ctf6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf6.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.ictMarks = s;
                        }
                    }
                });

                JLabel clabel7 = new JLabel("Finance,Banking & Insurance : ");
                gc.gridx = 0;
                gc.gridy = 7;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel7, gc);
                JTextField ctf7 = new JTextField(8);
                if (dc.fnMarks != null) ctf7.setText(dc.fnMarks);
                gc.gridx = 1;
                gc.gridy = 7;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf7, gc);
                ///tf7.addActionListener(new myActionListener(tf7));
                ctf7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf7.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.fnMarks = s;
                        }
                    }
                });

                JLabel clabel8 = new JLabel("Economics : ");
                gc.gridx = 0;
                gc.gridy = 8;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel8, gc);
                JTextField ctf8 = new JTextField(8);
                if (dc.ecmMarks != null) ctf8.setText(dc.ecmMarks);
                gc.gridx = 1;
                gc.gridy = 8;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf8, gc);
                ///tf7.addActionListener(new myActionListener(tf7));
                ctf8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf8.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.ecmMarks = s;
                        }
                    }
                });

                JLabel clabel9 = new JLabel("Geography : ");
                gc.gridx = 0;
                gc.gridy = 9;
                gc.anchor = GridBagConstraints.EAST;
                nestjp2.add(clabel9, gc);
                JTextField ctf9 = new JTextField(8);
                if (dc.geoMarks != null) ctf9.setText(dc.geoMarks);
                gc.gridx = 1;
                gc.gridy = 9;
                gc.anchor = GridBagConstraints.WEST;
                nestjp2.add(ctf9, gc);
                ///tf7.addActionListener(new myActionListener(tf7));
                ctf9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ctf9.getText();
                        if (s == null)
                            JOptionPane.showMessageDialog(null, "Please enter data...");
                        else {
                            JOptionPane.showMessageDialog(null, "Taken Data : " + s);
                            dc.geoMarks = s;
                        }
                    }
                });

                gc.gridx = 0;
                gc.gridy = 10;
                gc.anchor = GridBagConstraints.EAST;
                gc.fill = GridBagConstraints.NONE;
                JButton jb4 = new JButton(" OK ");
                nestjp2.add(jb4, gc);

                nestedframe.add(contPanel);
                nestedframe.setVisible(true);

                jb3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nestedframe.setVisible(false);
                    }
                });

                jb4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nestedframe.setVisible(false);
                    }
                });


            }
        });


        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 1;
        gbc.gridy = 6;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JLabel jlb6 = new JLabel(" HSC gpa: ");
        c.add(jlb6, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 6;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JTextField jtf2=new JTextField(8);
        if(dc.gpa!=null)jtf2.setText(dc.gpa);
        c.add(jtf2, gbc);
        jtf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=jtf2.getText();
                if(s!=null)
                {
                    dc.gpa=s;
                }
            }
        });


        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel jlb7 = new JLabel("Select interested subjects ->");

        c.add(jlb7, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        JTextArea jta2 = new JTextArea();
        String jta2text = "selected subjects:";
        for (int i = 0; i < dc.subcnt; i++) {
            jta2text += "\n" + dc.selectedsub[i];
        }
        jta2.setText(jta2text);
        System.out.println(jta2text);
        c.add(jta2, gbc);


        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 8;

        String[] choices = {"Arts", "Business Studies", "Biological Science", "Fine Arts", "Law", "Science", "Social Sciences", "Earth and Environmental Sciences", "Engineering", "Agriculture", "Veterinary Science", "Animal Husbandry", "Fisheries"};
        String[][] allsub = {{"Arabic", "Bengali", "Criminology", "English", "History", "Information Science and Library Management", "Islamic History and Culture", "Islamic Studies", "Linguistics", "Music", "Pali and Buddhist Studies", "Persian Language and Literature", "Philosophy", "Sanskrit", "Theater and Performance Studies", "Urdu", "World Religions and Culture"}, {"Accounting and Information Systems (AIS)", "Banking and Insurance", "Finance", "International Business", "Management", "Management Information Systems (MIS)", "Marketing", "Organization Strategy and Leadership", "Tourism and Hospitality Management"}, {"Pharmacy", "Biochemistry and Molecular Biology", "Botany", "Clinical Psychology", "Educational and Counseling Psychology", "Fisheries", "Genetic Engineering and Bio-technology", "Microbiology", "Psychology", "Soil, Water and Environment", "Zoology"}, {"Ceramics", "Crafts", "Drawing and Painting", "Graphic Design", "History of Art", "Oriental Art", "Printmaking", "Sculpture"}, {"law"}, {"Applied Mathematics", "Biomedical Physics and Technology", "Chemistry", "Mathematics", "Physics", "Statistics"}, {"Anthropology", "Communication Disorders", "Criminology", "Development Studies", "Economics", "International Relations", "Japanese Studies", "Mass Communication and Journalism", "Peace and Conflict Studies", "Political Science", "Population Sciences", "Printing and Publication Studies", "Public Administration", "Sociology", "Television and Film Studies", "Women's and Gender Studies"}, {"Disaster Science and Management", "Geography and Environment", "Geology", "Meteorology", "Oceanography"}, {"Applied Chemistry and Chemical Engineering", "Architecture", "Biomedical Engineering", "Chemical Engineering", "Civil Engineering", "Computer Science and Engineering", "Electrical & Electronic Engineering", "Industrial and Production Engineering", "Materials and Metallurgical Engineering", "Mechanical Engineering", "Naval Architecture and Marine Engineering", "Nuclear Engineering", "Robotics and Mechatronics Engineering", "Urban and Regional Planning", "Water Resources Engineering"}};
        JComboBox jcmb2 = new JComboBox(choices);
        c.add(jcmb2, gbc);
        jcmb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) jcmb2.getSelectedItem();
                System.out.println(s + "****");
                for (int i = 0; i < choices.length; i++) {
                    if (s != null && s.equals(choices[i])) {
                        System.out.println("entered loop");
                        JFrame nestedframe = new JFrame();
                        nestedframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        nestedframe.setSize(200, 300);

                        JPanel pan = new JPanel();
                        JScrollPane jsp = new JScrollPane(pan);

                        GridBagConstraints gc = new GridBagConstraints();
                        gc.gridx = 0;
                        gc.gridy = 0;
                        gc.fill = GridBagConstraints.BOTH;
                        gbc.insets = new Insets(4, 4, 4, 4);
                        nestedframe.setLayout(new GridBagLayout());

                        pan.setLayout(new GridBagLayout());


                        JList list = new JList(allsub[i]);
                        pan.add(list, gc);
                        nestedframe.setVisible(true);

                        gc.gridx = 0;
                        gc.gridy = 1;
                        gc.fill = GridBagConstraints.NONE;
                        JButton jb = new JButton("  OK  ");
                        pan.add(jb, gc);
                        nestedframe.add(jsp);
                        jb.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Object[] ob = list.getSelectedValues();

                                for (int i = 0; i < ob.length; i++) {
                                    dc.selectedsub[dc.subcnt++] = (String) ob[i];
                                    System.out.println("1234");
                                }
                                String jta2text = "selected subjects:\n";
                                for (int i = 0; i < dc.subcnt; i++) jta2text += dc.selectedsub[i] + "\n";
                                jta2.setText(jta2text);
                                nestedframe.setVisible(false);
                            }
                        });


                    }
                }
                System.out.println(s);
            }
        });


        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 8;
        JScrollPane jsps1 = new JScrollPane();
        ///JTextArea



        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 0;
        gbc.gridy = 9;
        ///gbc.fill=GridBagConstraints.HORIZONTAL;
        JButton jb6 = new JButton("UPDATE INFO");
        ///JTextField jtf1=new JTextField(12);
        c.add(jb6, gbc);
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ss = "";
                if (dc.name != null)
                    ss += "name*" + dc.name;
                else ss += "name*#";
                ss += "*regno*" + dc.regno + "*rollno*" + dc.rollno + "*pass*" + dc.password;
                if (dc.group != null)
                    ss += "*group*" + dc.group;
                else ss += "*group" + "*#";
                ss += "*division";
                if (dc.divisioncnt > 0) {
                    for (int i = 0; i < dc.divisioncnt; i++) ss += "*" + dc.division[i];
                } else ss += "*#";
                if (dc.gender != null)
                    ss += "*gender*" + dc.gender;
                else ss += "*gender" + "*#";
                if (dc.residential != null)
                    ss += "*residential*" + dc.residential;
                else ss += "*residential" + "*#";
                if (dc.gpa != null)
                    ss += "*gpa*" + dc.gpa;
                else ss += "*gpa" + "*#";
                if (dc.fee != null)
                    ss += "*fee*" + dc.fee;
                else ss += "*fee" + "*#";
                if (dc.banMarks != null)
                    ss += "*banMarks*" + dc.banMarks;
                else ss += "*banMarks" + "*#";
                if (dc.engMarks != null)
                    ss += "*engMarks*" + dc.engMarks;
                else ss += "*engMarks" + "*#";
                if (dc.phyMarks != null)
                    ss += "*phyMarks*" + dc.phyMarks;
                else ss += "*phyMarks" + "*#";
                if (dc.chemMarks != null)
                    ss += "*chemMarks*" + dc.chemMarks;
                else ss += "*chemMarks" + "*#";
                if (dc.hMathMarks != null)
                    ss += "*hMathMarks*" + dc.hMathMarks;
                else ss += "*hMathMarks" + "*#";
                if (dc.ictMarks != null)
                    ss += "*ictMarks*" + dc.ictMarks;
                else ss += "*ictMarks" + "*#";
                if (dc.bioMarks != null)
                    ss += "*bioMarks*" + dc.bioMarks;
                else ss += "*bioMarks" + "*#";
                if (dc.bmMarks != null)
                    ss += "*bmMarks*" + dc.bmMarks;
                else ss += "*bmMarks" + "*#";
                if (dc.acMarks != null)
                    ss += "*acMarks*" + dc.acMarks;
                else ss += "*acMarks" + "*#";
                if (dc.mktMarks != null)
                    ss += "*mktMarks*" + dc.mktMarks;
                else ss += "*mktMarks" + "*#";
                if (dc.fnMarks != null)
                    ss += "*fnMarks*" + dc.fnMarks;
                else ss += "*fnMarks" + "*#";
                if (dc.ecmMarks != null)
                    ss += "*ecmMarks*" + dc.ecmMarks;
                else ss += "*ecmMarks" + "*#";
                if (dc.geoMarks != null)
                    ss += "*geoMarks*" + dc.geoMarks;
                else ss += "*geoMarks" + "*#";
                ss += "*subject";
                if (dc.subcnt > 0) {
                    for (int i = 0; i < dc.subcnt; i++) ss += "*" + dc.selectedsub[i];
                    ss += "*";
                } else ss += "*#*";

                System.out.println("update*" + ss);
                out.println("update*" + ss);
                out.flush();

                frame.setVisible(false);

            }
        });

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                    dc.gender = "male";
            }
        });
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                    dc.gender = "female";
            }
        });
        cb3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                dc.fee = "0-5000";
            }
        });
        cb4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                dc.fee = "5000-10000";
            }
        });
        cb5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                dc.fee = "10000-20000";
            }
        });
        cb6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                    dc.residential = "residential";
                ///else dc.residential = null;
                System.out.println("after select:"+dc.residential);
            }
        });
        cb7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                    dc.residential = "non-residential";
                ///else dc.residential = null;
                System.out.println("after select:"+dc.residential);
            }
        });
        cb8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1)
                    dc.residential = "dual-residential";
                ///else dc.residential = null;
                System.out.println("after select:"+dc.residential);
            }
        });

        frame.setVisible(true);
        c.setVisible(true);

    }

}