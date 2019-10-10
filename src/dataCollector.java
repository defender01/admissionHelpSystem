

import java.io.*;
import java.util.StringTokenizer;

public class dataCollector  {
    String finaldata = null, banMarks = null, engMarks = null, phyMarks = null, chemMarks = null, hMathMarks = null, ictMarks = null, bioMarks = null;
    String bmMarks = null, acMarks = null, mktMarks = null, fnMarks = null, ecmMarks = null, geoMarks = null;
    String group = null, name = null, fee = null, gender = null,regno=null,rollno=null,password=null,gpa=null,residential=null;
    String[] division = new String[8];
    int divisioncnt = 0, subcnt = 0;
    String[] selectedsub = new String[30];
    File f;
    String sourcefile = null;
    public dataCollector(){



    }

    public dataCollector(String filename,String reg,String roll,String pass) {
		
		CanonicalPath canonicalPath= new CanonicalPath();
        try {
            sourcefile = canonicalPath.getPath()+"\\studentfiles\\" + filename+".txt";
            f = new File(sourcefile);
            if (f.createNewFile()) {
                System.out.println(filename + "* has been created");
                PrintWriter pw = new PrintWriter(new FileWriter(f));

                pw.println("name");
                pw.println("regno*"+reg);
                pw.println("rollno*"+roll);
                pw.println("pass*"+pass);
                pw.println("group");
                pw.println("division");
                pw.println("gender");
                pw.println("residential");
                pw.println("gpa");
                pw.println("fee");
                pw.println("banMarks");
                pw.println("engMarks");
                pw.println("phyMarks");
                pw.println("chemMarks");
                pw.println("hMathMarks");
                pw.println("ictMarks");
                pw.println("bioMarks");
                pw.println("bmMarks");
                pw.println("acMarks");
                pw.println("mktMarks");
                pw.println("fnMarks");
                pw.println("ecmMarks");
                pw.println("geoMarks");
                pw.println("subject");

                pw.close();
            } else {
                System.out.println(filename + " file already exists");
                BufferedReader br = new BufferedReader(new FileReader(sourcefile));
                String ss = null;
                while ((ss = br.readLine()) != null) {
///                    System.out.println("&&&&" + ss);
                    StringTokenizer stok = new StringTokenizer(ss, "*");

                    String s = stok.nextToken();
                    if (s.equals("name")) {
   ///                     System.out.println("*name");
                        name = "";
                        if(stok.hasMoreTokens())
                            name = stok.nextToken();
      ///                  System.out.println("name " + name);
                    } else if (s.equals("regno")) {
         ///               System.out.println("*regno");
                        if (stok.hasMoreTokens()) {
                            regno = stok.nextToken();
            ///                System.out.println("regno " + regno);
                        }
                    }  else if (s.equals("rollno")) {
               ///         System.out.println("*rollno");
                        if (stok.hasMoreTokens()) {
                            rollno = stok.nextToken();
                  ///          System.out.println("rollno " + rollno);
                        }
                    } else if (s.equals("pass")) {
                     ///   System.out.println("*password");
                        if (stok.hasMoreTokens()) {
                            password = stok.nextToken();
                        //    System.out.println("password " + password);
                        }
                    }else if (s.equals("group")) {
                        //System.out.println("*group");
                        if (stok.hasMoreTokens()) {
                            group = stok.nextToken();
                  //          System.out.println("group " + group);
                        }
                    } else if (s.equals("division")) {
                  //      System.out.println("*division");
                        divisioncnt = 0;
                        while (stok.hasMoreTokens()) {
                            division[divisioncnt++] = stok.nextToken();
                    //        System.out.println("division " + division[divisioncnt - 1]);
                        }
                    }else if(s.equals("gender")){
                        if(stok.hasMoreTokens()){
                            gender=stok.nextToken();
                        }
                    }else if(s.equals("residential")){
                        if(stok.hasMoreTokens()){
                            residential=stok.nextToken();
                        }
                    }else if(s.equals("gpa")){
                        if(stok.hasMoreTokens()){
                            gpa=stok.nextToken();
                        }
                    }
                    else if (s.equals("fee")) {
                    //    System.out.println("*fee");
                        if (stok.hasMoreTokens()) {
                            fee = stok.nextToken();
                  ///          System.out.println("fee " + fee);
                        }
                    } else if (s.equals("banMarks")) {
                     //   System.out.println("*ban");
                        if (stok.hasMoreTokens()) {
                            banMarks = stok.nextToken();
                  //          System.out.println("banMarks " + banMarks);

                        }
                    } else if (s.equals("engMarks")) {
                        //System.out.println("*eng");
                        if (stok.hasMoreTokens()) {
                            engMarks = stok.nextToken();
                          //  System.out.println("engMarks " + engMarks);
                        }
                    } else if (s.equals("phyMarks")) {
                        if (stok.hasMoreTokens()) {
                            phyMarks = stok.nextToken();
                            //System.out.println("phyMarks " + phyMarks);
                        }
                    } else if (s.equals("chemMarks")) {
                        if (stok.hasMoreTokens()) {
                            chemMarks = stok.nextToken();
                            //System.out.println("chemMarks " + chemMarks);
                        }
                    } else if (s.equals("hMathMarks")) {
                        if (stok.hasMoreTokens()) {
                            hMathMarks = stok.nextToken();
                            //System.out.println("hMathMarks " + hMathMarks);
                        }
                    } else if (s.equals("ictMarks")) {
                        if (stok.hasMoreTokens()) {
                            ictMarks = stok.nextToken();
                            //System.out.println("ictMarks " + ictMarks);
                        }
                    } else if (s.equals("bioMarks")) {
                        if (stok.hasMoreTokens()) {
                            bioMarks = stok.nextToken();
                            //System.out.println("Marks " + bioMarks);
                        }
                    } else if (s.equals("bmMarks")) {
                        if (stok.hasMoreTokens()) {
                            bmMarks = stok.nextToken();
                            //System.out.println("bmMarks " + bmMarks);
                        }
                    } else if (s.equals("acMarks")) {
                        if (stok.hasMoreTokens()) {
                            acMarks = stok.nextToken();
                            //System.out.println("acMarks " + acMarks);
                        }
                    } else if (s.equals("mktMarks")) {
                        if (stok.hasMoreTokens()) {
                            mktMarks = stok.nextToken();
                            //System.out.println("mktMarks " + mktMarks);
                        }
                    } else if (s.equals("fnMarks")) {
                        if (stok.hasMoreTokens()) {
                            fnMarks = stok.nextToken();
                            //System.out.println("fnMarks " + fnMarks);
                        }
                    } else if (s.equals("ecmMarks")) {
                        if (stok.hasMoreTokens()) {
                            ecmMarks = stok.nextToken();
                            //System.out.println("ecmMarks " + ecmMarks);
                        }
                    } else if (s.equals("geoMarks")) {
                        if (stok.hasMoreTokens()) {
                            geoMarks = stok.nextToken();
                            //System.out.println("geoMarks " + geoMarks);
                        }
                    } else if (s.equals("subject")) {
                        subcnt=0;
                        while (stok.hasMoreTokens()) {
                            s=stok.nextToken();
                            if(s!=null)
                            selectedsub[subcnt++] = s;
                        }
                    }

                }
                br.close();
            }
        } catch (
                IOException e)

        {
            System.out.println(e.getMessage());
        }

    }

    public void update() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));

            if (name != null)
                pw.println("name*" + name);
            else pw.println("name");
            if (regno != null)
                pw.println("regno*" + regno);
            else pw.println("regno");
            if (rollno != null)
                pw.println("rollno*" + rollno);
            else pw.println("rollno");
            if (password != null)
                pw.println("pass*" + password);
            else pw.println("pass");
            if (group != null)
                pw.println("group*" + group);
            else pw.println("group");
            if (divisioncnt > 0) {
                String s = "division";
                for (int i = 0; i < divisioncnt; i++) s += "*" + division[i];
                pw.println(s);
            } else pw.println("division");
            if (gender != null)
                pw.println("gender*" + gender);
            else pw.println("gender");
            if (residential != null)
                pw.println("residential*" + residential);
            else pw.println("residential");
            if (gpa != null)
                pw.println("gpa*" + gpa);
            else pw.println("gpa");
            if (fee != null)
                pw.println("fee*" + fee);
            else pw.println("fee");
            if (banMarks != null)
                pw.println("banMarks*" + banMarks);
            else pw.println("banMarks");
            if (engMarks != null)
                pw.println("engMarks*" + engMarks);
            else pw.println("engMarks");
            if (phyMarks != null)
                pw.println("phyMarks*" + phyMarks);
            else pw.println("phynMarks");
            if (chemMarks != null)
                pw.println("chemMarks*" + chemMarks);
            else pw.println("chemMarks");
            if (hMathMarks != null)
                pw.println("hMathMarks*" + hMathMarks);
            else pw.println("hMathMarks");
            if (ictMarks != null)
                pw.println("ictMarks*" + ictMarks);
            else pw.println("ictMarks");
            if (bioMarks != null)
                pw.println("bioMarks*" + bioMarks);
            else pw.println("bioMarks");
            if (bmMarks != null)
                pw.println("bmMarks*" + bmMarks);
            else pw.println("bmMarks");
            if (acMarks != null)
                pw.println("acMarks*" + acMarks);
            else pw.println("acMarks");
            if (mktMarks != null)
                pw.println("mktMarks*" + mktMarks);
            else pw.println("mktMarks");
            if (fnMarks != null)
                pw.println("fnMarks*" + fnMarks);
            else pw.println("fnMarks");
            if (ecmMarks != null)
                pw.println("ecmMarks*" + ecmMarks);
            else pw.println("ecmMarks");
            if (geoMarks != null)
                pw.println("geoMarks*" + geoMarks);
            else pw.println("geoMarks");
            if (subcnt > 0) {
                String s="subject";
                for (int i = 0; i < subcnt; i++) s+="*"+selectedsub[i];
                pw.println(s);
            }
            else pw.println("subject");

            pw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
