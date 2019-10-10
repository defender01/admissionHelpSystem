

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DU {
    JPanel panel2 = new JPanel(new GridBagLayout());
    JPanel panel3 = new JPanel();
    JButton buttonforSubreq;
    JButton buttonlogintroback ;
    JButton urlbut1;
    JButton buttonlogsubback;
    JButton buttonlogsubback2;
    DU()
    {
        GridBagConstraints constraint1 = new GridBagConstraints();
        JLabel header = new JLabel();
        Font  f = new Font("Arial", Font.BOLD, 100);
        header.setFont(f);
        header.setText("DU");
        constraint1.gridx = 200;
        constraint1.gridy = 10;
        constraint1.gridwidth = 100;
        constraint1.gridheight = 10;
        panel2.add(header, constraint1);

       CanonicalPath canonicalPath= new CanonicalPath();


//        ImageIcon image1 = new ImageIcon(getClass().getResource("1.jpg"));
        ImageIcon image1 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\1.jpg");
        JLabel labimg1 = new JLabel(image1);
        constraint1.gridx = 250;
        constraint1.gridy = 100;
        constraint1.gridwidth = 200;
        constraint1.gridheight = 300;
        panel2.add(labimg1, constraint1);

        JLabel lab2 = new JLabel();
        String s1 = ("<html>  Dhaka University is the first established university in bangladesh region in the year 1921.It in known as <br> Oxford of the East.");
        s1 += " This university allocates 21 residential halls among them 16 for male students <br> and 5 for female students.Every year more than";
        s1 += " 7 thousand students get admitted in this university.It is a combined university.<br>  Threre are 1680 seats for A unit,2221 seats for B unit,";
        s1 += " 1250 seats for C unit and 1416 seats for D unit. <br> <u>    Exam pattern for A unit </u> <br> <ul style=\"list-style-type:disc\"> <li>120 marks</li> <li>1.5 hours</li> <li>mcq</li> <li>Physics 30 marks</li> <li>Math 30 marks</li> <li>chemistry 30 marks</li> <li>Biology/Bangla/English 30 marks</li> </ul> <u> Mark Calculation</u> <ul style=\"list-style-type:disc\"> <li> SSC GPA X 6 = Your Score Out of 30</li> <li> HSC GPA X 6 = Your Score Out of 30</li> <li> Admission Score = Your Score Out of 30</li> <li> FInal Score = Out of 200</li> <li> Applicants must obtain at least 48 in total out of 120 to qualify for the merit list</li> </html>";
        lab2.setText(s1);
        constraint1.gridx = 10;
        constraint1.gridy = 100;
        constraint1.gridwidth = 200;
        constraint1.gridheight = 300;
        panel2.add(lab2, constraint1);

        buttonlogintroback = new JButton("Back");
        constraint1.gridx = 100;
        constraint1.gridy = 400;
        constraint1.gridwidth = 105;
        constraint1.gridheight = 100;
        panel2.add(buttonlogintroback, constraint1);

        buttonforSubreq = new JButton("Subjectwise Requirement");
        constraint1.gridx = 200;
        constraint1.gridy = 400;
        constraint1.gridwidth = 200;
        constraint1.gridheight = 100;
        panel2.add(buttonforSubreq, constraint1);

        urlbut1 = new JButton("For more information click me..");
        constraint1.gridx = 400;
        constraint1.gridy = 400;
        constraint1.gridwidth = 200;
        constraint1.gridheight = 100;
        panel2.add(urlbut1, constraint1);

        buttonlogsubback = new JButton("Back");
        buttonlogsubback.setLocation(500, 900);
        buttonlogsubback.setSize(160, 40);

        buttonlogsubback2 = new JButton("Back");
        buttonlogsubback2.setLocation(500, 900);
        buttonlogsubback2.setSize(160, 40);

        JLabel lab3 = new JLabel();
        lab3.setBounds(100, 30, 1000, 1000);
        panel3.add(lab3);
        panel3.add(buttonlogsubback);
        String s2="<html> <table border='5'> <th><b>subject</b></th> <th><b>HSC grade</b></th> <th><b>Admission Exam Mark</b></th> <tr> <td> Physics </td> <td> Physics A,Math A</td> <td> Physics 12,Math 12</td> </tr> <tr> <td> Math </td> <td> Math A</td> <td> Math 12</td> </tr> <tr> <td> Chemistry </td> <td> Chemistry A,Physics A,Math A</td> <td> Chemistry 12</td> </tr> <tr> <td> Statistics </td> <td> Math A</td> <td> Math 15</td> </tr> <tr> <td> Applied Statistics </td> <td> Physics A,Math A</td> <td> Math 15</td> </tr> <tr> <td> Soil,Water & Environment </td> <td> Chemistry B,(Math/Biology) A</td> <td> Chemistry 12</td> </tr> <tr> <td> Botany </td> <td> Biology B</td> <td> Biology 12</td> </tr> <tr> <td> BioChemistry & Molecular Biology </td> <td> Chemistry A,Math B,Biology B</td> <td> Biology 15,Chemistry 15</td> </tr> <tr> <td> Zoology </td> <td> Biology B</td> <td> Biology 14</td> </tr> <tr> <td> Psychology </td> <td> Biology/Math </td> <td> Biology/Math 13</td> </tr> <tr> <td> MicroBiology </td> <td> Chemistry A,(Biology A/Math B)</td> <td> Biology 15,Chemistry 15</td> </tr> <tr> <td> Fisheries </td> <td> Biology B,Math B</td> <td> Biology 14</td> </tr> <tr> <td> Genetic Engineering & BioTechnology </td> <td> Biology B,Chemistry B,Math B</td> <td> Biology 12,Chemistry 12</td> </tr> <tr> <td> pharmacy </td> <td> Biology A,Math B,Chemistry A</td> <td> Biology 15 , chemistry 15</td> </tr> <td> leather Engineering </td> <td> Physics B,Math B,Chemistry A</td> <td> chemistry 12</td> </tr> <td> Footwear Engineering </td>  <td> Physics B,Math B,Chemistry A</td> <td> chemistry 12</td> </tr> <tr> <td> leather Products Engineering </td> <td> Physics B,Math B,Chemistry A</td> <td> chemistry 12</td> </tr> <tr> <td> Geography & Environment </td> <td> (Geography A/Physics B/Math B/Biology B)</td> <td> (Physics 12/Math 12/Biology 12)</td> </tr> <tr> <td> Geology </td> <td> Physics B,Math A,chemistry B</td> <td> (Physics 12/Math 12/chemistry 12)</td> </tr> <tr> <td> Oceanology </td> <td> Physics A,Math A,Biology A,Chemistry B</td> <td> Physics 12,Math 12,Biology 12,Chemistry 12</td> </tr> <tr> <td> Disaster Science & Management </td> <td> Physics B,Math A,Chemistry B</td> <td> Physics 12,Math 12,Chemistry 12)</td> </tr><tr> <td> EEE </td> <td> Physics A,Math A</td> <td> Physics 12,Math 12</td> </tr> <tr> <td> Applied Chemistry & Chemical Engineering </td> <td> Physics B,Math B,Chemistry B</td> <td> Physics 12,Math 12,Chemistry 12</td> </tr> <tr> <td> CSE </td> <td> Physics B,Math B</td> <td> Physics 18,Math 18</td> </tr> <tr> <td> Nuclear Engineering </td> <td> Physics A-,Math A-</td> <td> Physics 12,Math 12</td> </tr><tr> <td> Robotics & Mechatronics Engineering  </td> <td> Physics A,Math A</td> <td> Physics 15,Math 15</td> </tr> <tr> <td> Applied Statistics </td> <td> Math A</td> <td> Math 15</td> </tr> <tr> <td> Nutrition & Food Science </td> <td> Chemistry B,Biology B</td> <td> Chemistry 12,Biology 12</td> </tr> <tr> <td> Software Engineering </td> <td> Physics A,Math A</td> <td> Physics 15,Math 15</td> </tr></table> </html>";
        lab3.setText(s2);

    }

}
