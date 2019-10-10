

import javax.swing.*;
import java.awt.*;

public class CU {
    JPanel panel9 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback6;
    JButton urlbut6;

    CU()
    {
        GridBagConstraints constraint6 = new GridBagConstraints();
        JLabel header5 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header5.setFont(f);
        header5.setText("CU");
        constraint6.gridx=200;
        constraint6.gridy=10;
        constraint6.gridwidth=100;
        constraint6.gridheight=10;
        panel9.add(header5,constraint6);

        CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon image6 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\CU.jpg");
        JLabel labimg6 = new JLabel(image6);
        constraint6.gridx=250;
        constraint6.gridy=100;
        constraint6.gridwidth=200;
        constraint6.gridheight=300;
        panel9.add(labimg6,constraint6);

        JLabel lab9 = new JLabel();
        String s8 = "<html> The University of Chittagong is a public research University located in the suburban area of Hathazari, Chittagong, Bangladesh.<br> The campus is located 22 Kilometers north of the Chittagong City.It was established in 18th november , 1966 .It contains 1753.88 acres of Hills,Planes and Lakes.<br>It has 12 Residential halls,among them 8 for male students and 4 for female students.<br>It has 1214 seats for A unit,1346 seats for B unit,448 seats for C unit,1181 seats for D unit.<br> <u> Exam pattern for A unit </u> <br> <ul style=\"list-style-type:disc\"> <li>100 marks</li>  <li>mcq</li> <li>Physics 20 marks</li> <li>Math 20 marks</li> <li>chemistry 20 marks</li> <li>Zoology 20 marks </li> <li> botany 20 marks</li> <li> statistics 20 marks</li> <li> ICT 20 marks</li> <li>Students have to answer 4 fields from above 7 fields according to the requirement of his interested faculty/department</li> <li>Bangla 10 marks</li> <li> English 10 marks</li> </ul> <u> Mark Calculation</u> <ul style=\"list-style-type:disc\"> <li> SSC GPA X (40%) </li> <li> HSC GPA X (60%) </li> <li> Admission Score = Your Score Out of 100</li> <li> Final Score = Out of 120</li> <li> Applicants must obtain at least 40 in total out of 100 to qualify for the merit list</li>  </html>";
        lab9.setText(s8);
        constraint6.gridx=10;
        constraint6.gridy=100;
        constraint6.gridwidth=200;
        constraint6.gridheight=300;
        panel9.add(lab9,constraint6);

        buttonlogsubback6 = new JButton("Back");
        constraint6.gridx=100;
        constraint6.gridy=400;
        constraint6.gridwidth=  105;
        constraint6.gridheight=100;
        panel9.add(buttonlogsubback6,constraint6);

        urlbut6 = new JButton("For more information click me..");
        constraint6.gridx=150;
        constraint6.gridy=400;
        constraint6.gridwidth=200;
        constraint6.gridheight=100;
        panel9.add(urlbut6,constraint6);

    }
}
