

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;


public class Varsity_descript {

    DU du = new DU();
    BUET buet = new BUET();
    JU ju = new JU();
    RU ru = new RU();
    KU ku = new KU();
    CU cu = new CU();
    SUST sust = new SUST();
    BAU bau = new BAU();
    KUET kuet = new KUET();
    CUET cuet = new CUET();
    MEDICAL_COLLEGES medical_colleges = new MEDICAL_COLLEGES();
    String filename;
    JPanel panelcont = new JPanel();
    JPanel panel1 = new JPanel();


    JScrollPane scrpane1 = new JScrollPane(du.panel3);
    JScrollPane scrpane2 = new JScrollPane(medical_colleges.panel14);
    JScrollPane scrpane3 = new JScrollPane(du.panel2);
    JScrollPane scrpane4 = new JScrollPane(buet.panel4);
    JScrollPane scrpane5 = new JScrollPane(ju.panel6);
    JScrollPane scrpane6 = new JScrollPane(ru.panel7);
    JScrollPane scrpane7 = new JScrollPane(ku.panel8);
    JScrollPane scrpane8 = new JScrollPane(cu.panel9);
    JScrollPane scrpane9 = new JScrollPane(sust.panel10);
    JScrollPane scrpane10 = new JScrollPane(bau.panel11);
    JScrollPane scrpane11 = new JScrollPane(kuet.panel12);
    JScrollPane scrpane12 = new JScrollPane(cuet.panel13);
    CardLayout cl = new CardLayout();
    JButton buttonlogmenu = null;


    Socket client=null;
    BufferedReader in;
    PrintWriter out;

    public Varsity_descript(Socket clnt) {
       client=clnt;
        try {

            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }


        Font f = new Font("Arial", Font.BOLD, 30);


        JLabel lab1 = new JLabel();
        lab1.setBounds(200, 30, 400, 35);
        lab1.setText("Get Introduced with...");
        lab1.setFont(f);
        lab1.setForeground(Color.BLUE);
        lab1.setOpaque(true);
        lab1.setBackground(Color.LIGHT_GRAY);
        panel1.add(lab1);

        panel1.setLayout(null);
        JButton buttonlog1 = new JButton("Dhaka University");
        buttonlog1.setLocation(200, 70);
        buttonlog1.setSize(230, 30);


        JButton  buttonlog2 = new JButton("Bangladesh University Of Engineering & Technology");
        buttonlog2.setLocation(200, 110);
        buttonlog2.setSize(230, 30);

        JButton buttonlog3 = new JButton("Jhangirnagar University");
        buttonlog3.setLocation(200, 150);
        buttonlog3.setSize(230, 30);

        JButton buttonlog4 = new JButton("Rajshahi University");
        buttonlog4.setLocation(200, 190);
        buttonlog4.setSize(230, 30);

        JButton buttonlog5 = new JButton("Khulna University");
        buttonlog5.setLocation(200, 230);
        buttonlog5.setSize(230, 30);

        JButton buttonlog6 = new JButton("Chittagong University");
        buttonlog6.setLocation(200, 270);
        buttonlog6.setSize(230, 30);

        JButton buttonlog7 = new JButton("Shahjalal University Of Science & Technology ");
        buttonlog7.setLocation(200, 310);
        buttonlog7.setSize(230, 30);

        JButton buttonlog8 = new JButton("Bangladesh Agriculture University");
        buttonlog8.setLocation(200, 350);
        buttonlog8.setSize(230, 30);

        JButton buttonlog9 = new JButton("Khulna University Of Engineering & Technology");
        buttonlog9.setLocation(200, 390);
        buttonlog9.setSize(230, 30);

        JButton buttonlog10 = new JButton("Chittagong University Of Engineering & Technology");
        buttonlog10.setLocation(200, 430);
        buttonlog10.setSize(230, 30);

        JButton buttonlog11 = new JButton("Medical Colleges");
        buttonlog11.setLocation(200, 470);
        buttonlog11.setSize(230, 30);

        buttonlogmenu = new JButton("Back");
        buttonlogmenu.setLocation(200, 520);
        buttonlogmenu.setSize(100, 30);

        JButton studentprofilebutton = new JButton("Edit profile");
        studentprofilebutton.setLocation(500, 350);
        studentprofilebutton.setSize(150, 30);

     JButton suggestionbutton = new JButton("Suggestion");
     suggestionbutton.setLocation(500, 400);
     suggestionbutton.setSize(150, 30);


        panelcont.setLayout(cl);
       
        panel1.add(buttonlog1);
        panel1.add(buttonlog2);
        panel1.add(buttonlog3);
        panel1.add(buttonlog4);
        panel1.add(buttonlog5);
        panel1.add(buttonlog6);
        panel1.add(buttonlog7);
        panel1.add(buttonlog8);
        panel1.add(buttonlog9);
        panel1.add(buttonlog10);
        panel1.add(buttonlog11);
        panel1.add(buttonlogmenu);
        panel1.add(studentprofilebutton);
        panel1.add(suggestionbutton);
        panelcont.add(panel1, "1");
        panelcont.add(scrpane3, "2");
        panelcont.add(scrpane1, "3");
        panelcont.add(scrpane4, "4");
        panelcont.add(buet.panel5, "5");
        panelcont.add(scrpane5, "6");
        panelcont.add(scrpane6, "7");
        panelcont.add(scrpane7, "8");
        panelcont.add(scrpane8, "9");
        panelcont.add(scrpane9, "10");
        panelcont.add(scrpane10, "11");
        panelcont.add(scrpane11, "12");
        panelcont.add(scrpane12, "13");
        panelcont.add(scrpane2, "14");
        cl.show(panelcont, "1");


        buttonlog1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelcont, "2");
                du.buttonlogintroback.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelcont, "1");
                    }
                });
                du.buttonforSubreq.addActionListener(new ActionListener() {
                    public void actionPerformed (ActionEvent e){
                        cl.show(panelcont, "3");
                       du.buttonlogsubback.addActionListener(new ActionListener() {
                            public void actionPerformed (ActionEvent e){
                                cl.show(panelcont, "2");
                                System.out.println(6);
                            }
                        });
                    }
                });
               du.urlbut1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiD6YmgotraAhULu48KHRBVDK4QFggnMAA&url=http%3A%2F%2Fwww.du.ac.bd%2F&usg=AOvVaw1RR6rLYp_0zvx5CAyFiMrS"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelcont,"4");
                buet.buttonlogsubback1.addActionListener(new ActionListener() {
                    public void actionPerformed (ActionEvent e){
                        cl.show(panelcont, "1");
                    }
                });
               buet.buttonforsubseat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cl.show(panelcont,"5");
                        buet.buttonlogsubback2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                cl.show(panelcont,"4");
                            }
                        });
                    }
                });
                buet.urlbut2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjQ8ZeVo9raAhWBv48KHfOBDuEQFggmMAA&url=http%3A%2F%2Fwww.buet.ac.bd%2F&usg=AOvVaw0eoYkv2_o1nq_x4d3HWkjk"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "6");
                ju.buttonlogsubback3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

               ju.urlbut3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=0ahUKEwiZtbuXpNraAhXFP48KHbfFDzwQFgg4MAI&url=http%3A%2F%2Fwww.juniv.edu%2F&usg=AOvVaw0JKuOB8X80GT16sdvBpQRX"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });

            }
        });

        buttonlog4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "7");
                ru.buttonlogsubback4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                ru.urlbut4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjA_e6tpdraAhUHKo8KHdVlCTYQFggnMAA&url=http%3A%2F%2Fwww.ru.ac.bd%2F&usg=AOvVaw3Ca5Z3FX6RjpWDLZRQpXP7"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });

            }
        });

        buttonlog5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "8");
               ku.buttonlogsubback5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                ku.urlbut5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiyrq6KptraAhUKuo8KHSmnCGMQFggmMAA&url=http%3A%2F%2Fku.ac.bd%2F&usg=AOvVaw1H4xLBRKzNrRmzpBURtXnj"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "9");
                cu.buttonlogsubback6.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

               cu.urlbut6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjXlsuPp9raAhUDQY8KHbj1CUAQFggnMAA&url=https%3A%2F%2Fwww.cu.ac.bd%2F&usg=AOvVaw2PURcOavqx0pCP8FJEjEBC"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });

            }
        });

        buttonlog7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "10");
                sust.buttonlogsubback7.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

               sust.urlbut7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiJwP_5p9raAhWMOo8KHRNqAyIQFggnMAA&url=http%3A%2F%2Fwww.sust.edu%2F&usg=AOvVaw1bnTXVfmQB-oriVnF4pN22"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "11");
                bau.buttonlogsubback8.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                bau.urlbut8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjAsIb7qNraAhWDsY8KHZ22AMUQFggnMAA&url=https%3A%2F%2Fwww.bau.edu.bd%2F&usg=AOvVaw2mq-z_K9GOb3Ap71wq0fEX"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });

            }
        });

        buttonlog9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "12");
                kuet.buttonlogsubback9.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                kuet.urlbut9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjNwo7VqdraAhVKOY8KHSueCuUQFggnMAA&url=http%3A%2F%2Fwww.kuet.ac.bd%2F&usg=AOvVaw1MU6AmPmoYrlYBesoCvWhF"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "13");
                cuet.buttonlogsubback10.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                cuet.urlbut10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiU0uO6qtraAhUBLo8KHXptAwMQFggnMAA&url=http%3A%2F%2Fwww.cuet.ac.bd%2F&usg=AOvVaw3ySYCMsaZ02_WJ9z6wA0te"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        buttonlog11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cl.show(panelcont, "14");
                medical_colleges.buttonlogsubback11.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cl.show(panelcont, "1");
                    }
                });

                medical_colleges.urlbut11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop d =  Desktop.getDesktop();
                            d.browse(new URI("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwjrxLHzqtraAhVC6Y8KHenjC7IQFggmMAA&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FList_of_medical_colleges_in_Bangladesh&usg=AOvVaw1rcp5QZtXsNm52oC9tt2-e"));
                        }
                        catch(Exception message)
                        {
                            System.out.println(message);
                        }
                    }
                });
            }
        });

        studentprofilebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    out.println("check*" + filename);
                    out.flush();
                    String s = in.readLine();
                    System.out.println("output from server "+s);
                    System.out.println("in studentprofile filename="+filename);
                    if (s.equals("not exists")) {
                        JOptionPane.showMessageDialog(null, "You must login first");
                    } else {
                        studentprofile sp = new studentprofile(client,filename);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

     suggestionbutton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       try {

        out.println("check*" + filename);
        out.flush();
        String s = in.readLine();
        System.out.println("output from server "+s);
        System.out.println("in studentprofile filename="+filename);
        if (s.equals("not exists")) {
         JOptionPane.showMessageDialog(null, "You must login first");
        } else {
         suggestion_print sug = new suggestion_print(client,filename);
        }
       } catch (IOException e1) {
        e1.printStackTrace();
       }
      }
     });



     //panelcont.setBackground(color.LightGray);
       // frame1.add(panelcont);
        //frame1.setVisible(true);
    }
    void setfilename(String s)
    {
        filename=s;
    }

}
