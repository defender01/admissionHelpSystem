

import javax.swing.*;
import java.awt.*;

public class JU {
    JPanel panel6 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback3;
    JButton urlbut3;
    JU()
    {

        GridBagConstraints constraint3 = new GridBagConstraints();
        JLabel header2 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header2.setFont(f);
        header2.setText("JU");
        constraint3.gridx=200;
        constraint3.gridy=10;
        constraint3.gridwidth=100;
        constraint3.gridheight=10;
        panel6.add(header2,constraint3);

        CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon image3 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\paJU.png");
        JLabel labimg3 = new JLabel(image3);
        constraint3.gridx=250;
        constraint3.gridy=100;
        constraint3.gridwidth=200;
        constraint3.gridheight=300;
        panel6.add(labimg3,constraint3);

        JLabel lab6 = new JLabel();
        String s5="<html> Jahangirnagar University accustomed as a residential accessible university in 1970 has now 34 departments <br> and Six Faculties along with Two institutes.It has 16 Residential halls, among them 8 for male students and 8 for female students<br> It is a combined university. It has total 1953 seats available for different units.It is situated in Savar,Dhaka.</html>";
        lab6.setText(s5);
        constraint3.gridx=10;
        constraint3.gridy=100;
        constraint3.gridwidth=200;
        constraint3.gridheight=300;
        panel6.add(lab6,constraint3);

        buttonlogsubback3 = new JButton("Back");
        constraint3.gridx=100;
        constraint3.gridy=400;
        constraint3.gridwidth=  105;
        constraint3.gridheight=100;
        panel6.add(buttonlogsubback3,constraint3);

        urlbut3 = new JButton("For more information click me..");
        constraint3.gridx=150;
        constraint3.gridy=400;
        constraint3.gridwidth=200;
        constraint3.gridheight=100;
        panel6.add(urlbut3,constraint3);
    }
}
