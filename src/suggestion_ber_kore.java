

import java.io.*;
import java.net.Socket;
import java.util.StringTokenizer;

public class suggestion_ber_kore {
    dataCollector dc = null;
    versity[] vc = new versity[10];
    String file[] = new String[10], filename = null, ss = null;

    suggestion_ber_kore(dataCollector dc) {
        this.dc = dc;
        for (int i = 0; i < 10; i++) vc[i] = new versity();
        file[0] = "D:\\javaProject\\src\\saadiCode\\versity_info\\1.txt";
        file[1] = "D:\\javaProject\\src\\saadiCode\\versity_info\\2.txt";
        file[2] = "D:\\javaProject\\src\\saadiCode\\versity_info\\3.txt";
        file[3] = "D:\\javaProject\\src\\saadiCode\\versity_info\\4.txt";
        file[4] = "D:\\javaProject\\src\\saadiCode\\versity_info\\5.txt";
        file[5] = "D:\\javaProject\\src\\saadiCode\\versity_info\\6.txt";
        file[6] = "D:\\javaProject\\src\\saadiCode\\versity_info\\7.txt";
        file[7] = "D:\\javaProject\\src\\saadiCode\\versity_info\\8.txt";
        file[8] = "D:\\javaProject\\src\\saadiCode\\versity_info\\9.txt";
        file[9] = "D:\\javaProject\\src\\saadiCode\\versity_info\\10.txt";
        System.out.println("done");

    }

    String result() throws IOException {
        for (int i = 0; i < 10; i++) {
            FileReader fr = null;
            try {
                fr = new FileReader(file[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br = new BufferedReader(fr);
            String input = "";
            while ((input = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(input, "*");
                String ss = st.nextToken();
                if (ss.equals("name")) {
                    ss = st.nextToken();
                    vc[i].name = ss;
                } else if (ss.equals("group")) {
                    System.out.println(ss);
                    boolean flag = false;
                    while (st.hasMoreTokens()) {
                        ss = st.nextToken();
                        System.out.println(ss);
                        if (ss.equals("SCIENCE")) {
                            System.out.println(dc.group);
                            if (dc.group != null) {
                                if (dc.group.equals(ss)) {
                                    vc[i].point += 10;
                                    flag = true;
                                }
                            }
                        } else if (ss.equals("COMMERCE")) {
                            System.out.println(dc.group);
                            if (dc.group != null) {
                                if (dc.group.equals(ss)) {
                                    vc[i].point += 10;
                                    flag = true;
                                }
                            }
                        } else if (ss.equals("ARTS")) {
                            System.out.println(dc.group);
                            if (dc.group != null) {
                                if (dc.group.equals(ss)) {
                                    vc[i].point += 10;
                                    flag = true;
                                }
                            }
                        }
                    }
                    if (!flag)
                        vc[i].point -= 100;
                } else if (ss.equals("division")) {
                    System.out.println(ss);
                    ss = st.nextToken();
                    for (int j = 0; j < dc.divisioncnt; j++) {
                        if (ss.equals(dc.division[j])) {
                            vc[i].point += 10;
                            break;
                        }
                    }
                } else if (ss.equals("fee")) {
                    System.out.println(ss);
                    ss = st.nextToken();
                    if (ss.equals(dc.fee))
                        vc[i].point += 10;
                } else if (ss.equals("sciencegpa")) {
                    System.out.println(ss);
                    if (dc.group != null) {
                        if (dc.group.equals("science")) {
                            ss = st.nextToken();
                            double gpa = Double.parseDouble(ss);
                            double studentgpa = Double.parseDouble(dc.gpa);
                            if (studentgpa >= gpa) {
                                vc[i].point += 10;
                            }
                        }
                    }
                } else if (ss.equals("commercegpa")) {
                    System.out.println(ss);
                    if (dc.group != null) {
                        if (dc.group.equals("commerce")) {
                            ss = st.nextToken();
                            double gpa = Double.parseDouble(ss);
                            double studentgpa = Double.parseDouble(dc.gpa);
                            if (studentgpa >= gpa) {
                                vc[i].point += 10;
                            }
                        }
                    }
                } else if (ss.equals("artsgpa")) {
                    System.out.println(ss);
                    if (dc.group != null) {
                        if (dc.group.equals("arts")) {
                            ss = st.nextToken();
                            double gpa = Double.parseDouble(ss);
                            double studentgpa = Double.parseDouble(ss);
                            if (studentgpa >= gpa)
                                vc[i].point += 10;
                        }
                    }
                } else if (ss.equals("residential")) {
                    if (dc.residential != null) {
                        while (st.hasMoreTokens()) {
                            ss = st.nextToken();
                            if (ss.equals(dc.residential)) {
                                vc[i].point += 5;
                            }
                        }
                    }
                } else if (ss.equals("Subject")) {
                    System.out.println(ss + " sub");
                    while ((input = br.readLine()) != null) {
                        for (int j = 0; j < dc.subcnt; j++) {
                            if (dc.selectedsub[j].equals(input)) {
                                System.out.println(input + " subject");
                                vc[i].point += 2;
                                break;
                            }
                        }
                        System.out.println(input);
                    }
                    break;
                }
                // System.out.println(ss);


            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vc[j].point < vc[j + 1].point) {
                    versity tmp = new versity();
                    tmp = vc[j];
                    vc[j] = vc[j + 1];
                    vc[j + 1] = tmp;
                }
            }
        }
        String ret = "";
        for (int i = 0; i < 5; i++) {
            ret += vc[i].name + "*";
            System.out.println(vc[i].point + " " + vc[i].name);
        }
        return ret;
    }
}



