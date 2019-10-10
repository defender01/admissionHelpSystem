

import javax.swing.*;
import java.awt.*;

public class RU {
    JPanel panel7 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback4;
    JButton urlbut4;
    RU()
        {
            GridBagConstraints constraint4 = new GridBagConstraints();
            JLabel header3 = new JLabel();
            Font f = new Font("Arial", Font.BOLD, 100);
            header3.setFont(f);
            header3.setText("RU");
            constraint4.gridx=200;
            constraint4.gridy=10;
            constraint4.gridwidth=100;
            constraint4.gridheight=10;
            panel7.add(header3,constraint4);

            CanonicalPath canonicalPath= new CanonicalPath();

            ImageIcon image4 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\RU.jpg");
            JLabel labimg4 = new JLabel(image4);
            constraint4.gridx=250;
            constraint4.gridy=100;
            constraint4.gridwidth=200;
            constraint4.gridheight=300;
            panel7.add(labimg4,constraint4);

            JLabel lab7 = new JLabel();
            String s6="<html> University of Rajshahi is one of the largest Universities in the country <br> and the largest with the highest seat of learning in the northern region of Bangladesh. After its foundation on July 6, <br>  1953, the university has passed 62 years providing higher education and research. The university is located at the green premises of Motihar <br>  which is very close to the mighty river Padma and seven km. east from the Rajshahi City Center.<br> It has 17 residential halls ,among them 11 for male students and 6 for female students.It has total 4119 seats for different faculties,<br> among them Faculty of Science contains 660 seats and Faculty of Engineering contains 272 seats. <br> </html>";
            lab7.setText(s6);
            constraint4.gridx=10;
            constraint4.gridy=100;
            constraint4.gridwidth=200;
            constraint4.gridheight=300;
            panel7.add(lab7,constraint4);

            buttonlogsubback4 = new JButton("Back");
            constraint4.gridx=100;
            constraint4.gridy=400;
            constraint4.gridwidth=  105;
            constraint4.gridheight=100;
            panel7.add(buttonlogsubback4,constraint4);

            urlbut4 = new JButton("For more information click me..");
            constraint4.gridx=150;
            constraint4.gridy=400;
            constraint4.gridwidth=200;
            constraint4.gridheight=100;
            panel7.add(urlbut4,constraint4);

        }
}
