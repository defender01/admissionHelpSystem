

import javax.swing.*;
import java.awt.*;

public class SUST {
    JPanel panel10 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback7;
    JButton urlbut7;

    SUST()
    {
        GridBagConstraints constraint7 = new GridBagConstraints();
        JLabel header6 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header6.setFont(f);
        header6.setText("SUST");
        constraint7.gridx=200;
        constraint7.gridy=10;
        constraint7.gridwidth=100;
        constraint7.gridheight=10;
        panel10.add(header6,constraint7);

        ImageIcon image7 = new ImageIcon(getClass().getResource("pictures\\SUST.jpg"));
        JLabel labimg7 = new JLabel(image7);
        constraint7.gridx=250;
        constraint7.gridy=100;
        constraint7.gridwidth=200;
        constraint7.gridheight=300;
        panel10.add(labimg7,constraint7);

        JLabel lab10 = new JLabel();
        String s9= "<html> Shahjalal University of Science and Technology was established in 1986. The campus is located in Kumargaon, <br> approximately six kilometers away from the heart of Sylhet City Centre.SUST is the first university in Bangladesh providing whole campus free Wi-fi access <br> for students and staff.There are 5 residential halls,among them 3 for male students and 2 for female students.<br> University authorities also run some private halls of residence outside the main campus especially for female students to guarantee housing for female students. <br> Every year 1463 students get admitted in sust in different faculties,among them 980 seats for Science faculty.<br> <u> Exam pattern for B unit </u> <br> <ul style=\"list-style-type:disc\"><li>mcq</li> <li>Physics 20 marks</li> <li>Math 20 marks</li> <li>chemistry 20 marks</li> <li> English 10 marks </li> <li> 1.5 hours </li> <li> Drawing 30 marks exam for Architecture Candidates for 1 hour</li> </ul> </html>";
        lab10.setText(s9);
        constraint7.gridx=10;
        constraint7.gridy=100;
        constraint7.gridwidth=200;
        constraint7.gridheight=300;
        panel10.add(lab10,constraint7);

        buttonlogsubback7 = new JButton("Back");
        constraint7.gridx=100;
        constraint7.gridy=400;
        constraint7.gridwidth=  105;
        constraint7.gridheight=100;
        panel10.add(buttonlogsubback7,constraint7);

        urlbut7 = new JButton("For more information click me..");
        constraint7.gridx=150;
        constraint7.gridy=400;
        constraint7.gridwidth=200;
        constraint7.gridheight=100;
        panel10.add(urlbut7,constraint7);

    }
}
