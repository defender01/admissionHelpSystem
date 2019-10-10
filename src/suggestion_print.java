

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

public class suggestion_print {

    Socket client;
    BufferedReader in;
    PrintWriter out;
    String filename;

    suggestion_print(Socket client, String filename) {
        this.client = client;
        this.filename = filename;
        try {
            in = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            out = new PrintWriter(this.client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }
        out.println("suggestion*" + filename);
        out.flush();
        try {
            System.out.println("last line before close");
            String ss = in.readLine();
            print(ss);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(String ss) {
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

        JFrame frame = new JFrame();
        JPanel panelcont = new JPanel();
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
       // frame.setLayout(new CardLayout());
        panel.setLayout(null);

        JScrollPane scrpane1 = new JScrollPane(du.panel3);
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
        panelcont.setLayout(cl);


        frame.setBounds(200, 50, 800, 750);
        frame.add(panelcont);

        JButton back = new JButton("Back");
        JButton buttonlog1 = new JButton("Dhaka University");
        JButton buttonlog2 = new JButton("Bangladesh University Of Engineering & Technology");
        JButton buttonlog3 = new JButton("Jhangirnagar University");
        JButton buttonlog4 = new JButton("Rajshahi University");
        JButton buttonlog5 = new JButton("Khulna University");
        JButton buttonlog6 = new JButton("Chittagong University");
        JButton buttonlog7 = new JButton("Shahjalal University Of Science & Technology ");
        JButton buttonlog8 = new JButton("Bangladesh Agriculture University");
        JButton buttonlog9 = new JButton("Khulna University Of Engineering & Technology");
        JButton buttonlog10 = new JButton("Chittagong University Of Engineering & Technology");
        JButton ten_minutes_school = new JButton("Ten minutes school");
        JButton shoshikkha = new JButton("Shoshikkha");
        JButton nctb = new JButton("NCTB");
        JButton khan_academy = new JButton("Khan Academy");


        back.setLocation(150, 600);
        back.setSize(100, 30);
        //frame.getContentPane().add(back);
        JLabel label = new JLabel();
        label.setBounds(10,10,700,30);
        label.setForeground(Color.BLUE);
        panel.add(back);
        Font f = new Font("Arial", Font.BOLD, 20);
        label.setFont(f);

        StringTokenizer st = new StringTokenizer(ss, "*");
        String printing = " Based on your information following universities are suggested for you.";
        label.setText(printing);
        panel.add(label);

        JLabel label1 = new JLabel();
        label1.setBounds(10,300,200,30);
        Font f1 = new Font("Arial",Font.BOLD,20);
        label1.setFont(f1);
        label1.setForeground(Color.BLUE);
        String important_links = "Important links..";
        label1.setText(important_links);
        panel.add(label1);

        JTextArea textField = new JTextArea();
        textField.setBounds(450,350,290,250);
        Font f2 = new Font("Arial",Font.BOLD,14);
        textField.setFont(f2);
        //label2.setForeground(Color.BLUE);
        String advice = "Dear student,be attentive in \n your reading throughout \n the examination period . Be careful \n of your exam routine .You can take \n help from given important links \n which may increase your academic \n skill. Best of luck. Wish you all the best. ";
        textField.setText(advice);

        panel.add(textField);


        int cnt = 40;
       // buttonlog1.setLocation(20, 100 + cnt);
      //  buttonlog1.setSize(100, 50);
      //  panel.add(buttonlog1);
        while (st.hasMoreTokens()) {
            String input = st.nextToken();
            System.out.println(input+1);
            if (input.equals("University of Dhaka")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog1.setLocation(300, 20 + cnt);
                buttonlog1.setSize(230, 30);
                panel.add(buttonlog1);
                System.out.println(1);
            } else if (input.equals("Bangladesh university of Engineering And Technology")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog2.setLocation(300, 20 + cnt);
                buttonlog2.setSize(230, 30);
                panel.add(buttonlog2);
                System.out.println(2);
            } else if (input.equals("Jahangirnagar University")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog3.setLocation(300, 20 + cnt);
                buttonlog3.setSize(230, 30);
                panel.add(buttonlog3);
                System.out.println(3);
            } else if (input.equals("Rajshahi University")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog4.setLocation(300, 20 + cnt);
                buttonlog4.setSize(230, 30);
                panel.add(buttonlog4);
                System.out.println(4);

            } else if (input.equals("Khulna University")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog5.setLocation(300, 20 + cnt);
                buttonlog5.setSize(230, 30);
                panel.add(buttonlog5);
                System.out.println(5);

            } else if (input.equals("Chittagong University")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog6.setLocation(300, 20 + cnt);
                buttonlog6.setSize(230, 30);
                panel.add(buttonlog6);
                System.out.println(6);

            } else if (input.equals("Shahjalal University Of Science And Technology")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog7.setLocation(300, 20 + cnt);
                buttonlog7.setSize(230, 30);
                panel.add(buttonlog7);
                System.out.println(7);

            } else if (input.equals("Bangladesh Agricultural University")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog8.setLocation(300, 20 + cnt);
                buttonlog8.setSize(230, 30);
                panel.add(buttonlog8);
                System.out.println(8);

            } else if (input.equals("Khulna University Of Engineering And Technology")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog9.setLocation(300, 20 + cnt);
                buttonlog9.setSize(230, 30);
                panel.add(buttonlog9);
                System.out.println(9);

            } else if (input.equals("Chittagong University Of Engineering And Technology")) {
                // printing+="<tr> <td> "+input+" </td> </tr>";
                buttonlog10.setLocation(300, 20 + cnt);
                buttonlog10.setSize(230, 30);
                panel.add(buttonlog10);
                System.out.println(10);

            }
            cnt += 40;


        }

        ten_minutes_school.setLocation(100,350);
        ten_minutes_school.setSize(230,30);
        shoshikkha.setLocation(100,390);
        shoshikkha.setSize(230,30);
        nctb.setLocation(100,430);
        nctb.setSize(230,30);
        khan_academy.setLocation(100,470);
        khan_academy.setSize(230,30);
        panel.add(ten_minutes_school);
        panel.add(shoshikkha);
        panel.add(nctb);
        panel.add(khan_academy);

        panelcont.add(panel, "1");
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
        // printing+=" </table> </html>";
        //frame.getContentPane().add(label);

        ten_minutes_school.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Desktop d =  Desktop.getDesktop();
                try {
                    d.browse(new URI("http://10minuteschool.com/"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

        });

        shoshikkha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Desktop d =  Desktop.getDesktop();
                try {
                    d.browse(new URI("http://shoshikkha.com/"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

        });

        nctb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Desktop d =  Desktop.getDesktop();
                try {
                    d.browse(new URI("http://www.nctb.gov.bd/"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

        });

        khan_academy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Desktop d =  Desktop.getDesktop();
                try {
                    d.browse(new URI("https://bn.khanacademy.org/"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

        });

        frame.setVisible(true);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
    }
}
