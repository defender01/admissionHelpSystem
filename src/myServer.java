//its a server program



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;




class serverThread extends Thread {
    Socket client = null;

    public serverThread(Socket cl) {
        client = cl;
    }


    public void run() {
        dataCollector studentdata = null;
        String s = null;
        ServerSocket server = null;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            FileWriter fw = null;
            PrintWriter pw = null;
            File f1 = null;
            // try {
            while ((s = in.readLine()) != null) {
                //s=in.readLine();
                System.out.println(s);
                String filename = "", regnum = "", rollnum = "", password = "";
                StringTokenizer stok = new StringTokenizer(s, "*");
                String input = stok.nextToken();
                System.out.println(input + "1");
                if (input.equals("create")) {

                    while (stok.hasMoreTokens()) {
                        s = stok.nextToken();
                        if (s.equals("regno")) {
                            System.out.println("*regno");
                            s = stok.nextToken();
                            if (!s.equals("#")) {
                                regnum = s;
                                System.out.println("regno " + regnum);
                            }
                        } else if (s.equals("rollno")) {
                            System.out.println("*rollno");
                            s = stok.nextToken();
                            if (!s.equals("#")) {
                                rollnum = s;
                                System.out.println("regno " + rollnum);
                            }
                        } else if (s.equals("pass")) {
                            System.out.println("*pass");
                            s = stok.nextToken();
                            if (!s.equals("#")) {
                                password = s;
                                System.out.println("password " + password);
                            }
                        }
                    }

                    dataCollector dc = new dataCollector(regnum + rollnum, regnum, rollnum, password);
                    studentdata = dc;
                    out.println("created");
                    out.flush();
                } else if (input.equals("check")) {
                    filename = "";
                    while (stok.hasMoreTokens()) {
                        filename += stok.nextToken();
                    }

                    System.out.println("^^^ " + filename);
					
					CanonicalPath canonicalPath= new CanonicalPath();

                    f1 = new File(canonicalPath.getPath()+"\\studentfiles\\" + filename + ".txt");
                    if (f1.exists()) {
                        FileReader fir = new FileReader(f1);
                        BufferedReader bfir = new BufferedReader(fir);
                        String message = "";

                        dataCollector dcc = new dataCollector(filename, regnum, rollnum, password);

                        /*while ((message = bfir.readLine()) != null) {
                            System.out.println("inserver " + message);
                            StringTokenizer st = new StringTokenizer(message, " ");
                            String ss = st.nextToken();
                            if (ss != null && ss.equals("pass")) {
                                ss = st.nextToken();
                                out.println(ss);
                                out.flush();
                            }
                        }*/

                        ///System.out.println(message);
                        ///out.println(message);
                        out.println(dcc.password);
                        System.out.println("pass:" + dcc.password);

                        fir.close();
                        bfir.close();
                        //System.out.println(1);
                    } else {
                        out.println("not exists");
                        out.flush();
                        System.out.println(2);
                    }
                } else if (input.equals("load")) {
                    filename = "";
                    filename += stok.nextToken();
                    filename += stok.nextToken();
                    System.out.println("filenaem in server " + filename);
                    dataCollector dc = new dataCollector(filename, regnum, rollnum, password);
                    String ss = "";
                    if (dc.name != null && dc.name.length() > 0)
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

                    studentdata = dc;

                    out.println(ss);
                    out.flush();

                } else if (input.equals("update")) {

                    ///dataCollector dtc = new dataCollector(filename,regnum,rollnum,password);
                    String str = null;
                    while (stok.hasMoreTokens()) {
                        str = stok.nextToken();
                        String ss = null;
                        if (stok.hasMoreTokens()) {
                            System.out.println("str:" + str);
                            if (str.equals("name")) {
                                System.out.println("*name");
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.name = ss;
                                System.out.println("name " + studentdata.name);
                            } else if (str.equals("regno")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.regno = ss;
                                System.out.println("*regno" + studentdata.regno);

                            } else if (str.equals("rollno")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.rollno = ss;
                                System.out.println("*rollno" + studentdata.rollno);
                            } else if (str.equals("pass")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.password = ss;
                                System.out.println("*pass" + studentdata.password);

                            } else if (str.equals("group")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.group = ss;
                                System.out.println("*group" + studentdata.group);

                            } else if (str.equals("division")) {
                                studentdata.divisioncnt = 0;
                                System.out.println("*division");

                                while (stok.hasMoreTokens()) {
                                    ss = stok.nextToken();
                                    if (ss.equals("#")) break;
                                    else if (ss.equals("gender")) {
                                        ss = stok.nextToken();
                                        if (!ss.equals("#")) {
                                            studentdata.gender = ss;
                                        }
                                        break;
                                    } else if (!ss.equals("#")) {
                                        studentdata.division[studentdata.divisioncnt++] = ss;
                                    }
                                }

                            } else if (str.equals("gender")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.gender = ss;
                            } else if (str.equals("residential")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.residential = ss;
                            } else if (str.equals("gpa")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.gpa = ss;
                            } else if (str.equals("fee")) {
                                System.out.println("*fee");
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.fee = ss;
                                System.out.println("fee " + studentdata.fee);

                            } else if (str.equals("banMarks")) {
                                System.out.println("*ban");
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.banMarks = ss;

                            } else if (str.equals("engMarks")) {
                                System.out.println("*eng");
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.engMarks = ss;

                            } else if (str.equals("phyMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.phyMarks = ss;

                            } else if (str.equals("chemMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.chemMarks = ss;

                            } else if (str.equals("hMathMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.hMathMarks = ss;

                            } else if (str.equals("ictMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.ictMarks = ss;

                            } else if (str.equals("bioMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.bioMarks = ss;

                            } else if (str.equals("bmMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.bmMarks = ss;

                            } else if (str.equals("acMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.acMarks = ss;

                            } else if (str.equals("mktMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.mktMarks = ss;

                            } else if (str.equals("fnMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.fnMarks = ss;

                            } else if (str.equals("ecmMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.ecmMarks = ss;
                            } else if (str.equals("geoMarks")) {
                                ss = stok.nextToken();
                                if (!ss.equals("#"))
                                    studentdata.geoMarks = ss;

                            } else if (str.equals("subject")) {
                                studentdata.subcnt = 0;
                                while (stok.hasMoreTokens()) {
                                    ss = stok.nextToken();
                                    if (!ss.equals("#") && s != null)
                                        studentdata.selectedsub[studentdata.subcnt++] = ss;
                                }
                            }
                        }

                    }
                    studentdata.update();
                }
                else if(input.equals("suggestion"))
                {
                    String regnumsforsug= stok.nextToken();
                    String rollnumforsug = stok.nextToken();

                    dataCollector dc = new dataCollector(regnumsforsug+rollnumforsug,regnumsforsug,rollnumforsug,"");
                    studentdata = dc;
                    System.out.println("in suggestion."+regnumsforsug+rollnumforsug);
                    suggestion_ber_kore sug = new suggestion_ber_kore(studentdata);
                    String suggestion = sug.result();
                    System.out.println(suggestion+" versities");
                    out.println(suggestion);
                    out.flush();
                }
                System.out.println("server found data::: " + s);

            }
            System.out.println("shesh");
           /* }
            catch (Exception e){
                System.out.println(e);
            }*/
            in.close();
            out.close();
            client.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


public class myServer {


    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(3333);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Socket client = server.accept();
                serverThread serverob = new serverThread(client);
                serverob.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
