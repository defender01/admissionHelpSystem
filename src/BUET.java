

import javax.swing.*;
import java.awt.*;

public class BUET {
    JPanel panel4 = new JPanel(new GridBagLayout());
    JPanel panel5 = new JPanel();
    JButton buttonlogsubback1;
    JButton buttonforsubseat ;
    JButton urlbut2;
    JButton buttonlogsubback2;
    BUET() {
        buttonlogsubback2 = new JButton("Back");
        buttonlogsubback2.setLocation(500, 900);
        buttonlogsubback2.setSize(160, 40);

        GridBagConstraints constraint2 = new GridBagConstraints();
        JLabel header1 = new JLabel();
       Font f = new Font("Arial", Font.BOLD, 100);
        header1.setFont(f);
        header1.setText("BUET");
        constraint2.gridx = 200;
        constraint2.gridy = 10;
        constraint2.gridwidth = 100;
        constraint2.gridheight = 10;
        panel4.add(header1, constraint2);

        CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon image2 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\BUET-logo.jpg");
        JLabel labimg2 = new JLabel(image2);
        constraint2.gridx = 250;
        constraint2.gridy = 100;
        constraint2.gridwidth = 200;
        constraint2.gridheight = 300;
        panel4.add(labimg2, constraint2);

        JLabel lab4 = new JLabel();
        String s3 = "<html> Bangladesh University Of Engineering And Technology (BUET) is the first Engineering University of Bangladesh.<br> Khawaza Ahsanullah was the light bearer of this University It has Eight Residential halls,<br> seven for male students and one for female students.Every year more than One thousand students get admitted in this university.<br> 965 seats for Engineering Students.30 seats for URP students.55 seats for Architecture students.<br> It is a combined university.It is situated in palashi,Dhaka.<br>  <u> Exam pattern of BUET </u> <br> <ul style=\\\"list-style-type:disc\\\"> <li>600 marks</li> <li>3 hours</li> <li>written</li> <li>Physics 200 marks(20 questions)</li> <li>Math 200 marks(20 questions)</li> <li>chemistry 200 marks(20 questions)</li> <li>Free hand drawing for Architecture and URP candidates extra 2 hours exam. 5 questions, 80 marks each.</li> </ul>   </html>";
        lab4.setText(s3);
        constraint2.gridx = 10;
        constraint2.gridy = 100;
        constraint2.gridwidth = 200;
        constraint2.gridheight = 300;
        panel4.add(lab4, constraint2);

        buttonlogsubback1 = new JButton("Back");
        constraint2.gridx = 100;
        constraint2.gridy = 400;
        constraint2.gridwidth = 105;
        constraint2.gridheight = 100;
        panel4.add(buttonlogsubback1, constraint2);

        buttonforsubseat = new JButton("Subjectwise Seat");
        constraint2.gridx = 200;
        constraint2.gridy = 400;
        constraint2.gridwidth = 200;
        constraint2.gridheight = 100;
        panel4.add(buttonforsubseat, constraint2);

        urlbut2 = new JButton("For more information click me..");
        constraint2.gridx = 400;
        constraint2.gridy = 400;
        constraint2.gridwidth = 200;
        constraint2.gridheight = 100;
        panel4.add(urlbut2, constraint2);

        JLabel lab5 = new JLabel();
        lab5.setBounds(100, 30, 1000, 1000);
        panel5.add(lab5);
        panel5.add(buttonlogsubback2);
        String s4 = "<html> <table border='5'> <tr> <td> <u> Subjects</u> </td> <td> <u> Seats </u> </td> </tr> <tr> <td> Department of Chemical Engineering </td> <td> 60</td> </tr> <tr> <td> Department of Materials & Metallurgical Engineering </td> <td> 50</td> </tr> <tr> <td> Department of Civil Engineering </td> <td> 195</td> </tr> <tr> <td> Department of Water Resources Engineering </td> <td> 30</td> </tr> <tr> <td> Department of Mechanical Engineering </td> <td> 180</td> </tr><tr> <td> Department of Naval Architecture & Marine Engineering </td> <td> 55</td> </tr> <tr> <td> Department of Industrial & Production Engineering </td> <td> 50</td> </tr> <tr> <td> Department of Electrical & Electronics Engineering </td> <td> 195</td> </tr> <tr> <td> Department of Computer Science & Engineering </td> <td> 120</td> </tr> <tr> <td> Department of Biomedical Engineering </td> <td> 30</td> </tr> <tr> <td> Department of Architecture </td> <td> 55</td> </tr> <tr> <td> Department of Urban & Regional Planning </td> <td> 30</td> </tr> </html>";
        lab5.setText(s4);
    }
}
