

import javax.swing.*;
import java.awt.*;

public class KUET {
    JPanel panel12 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback9;
    JButton urlbut9;

    KUET()
    {
        GridBagConstraints constraint9 = new GridBagConstraints();
        JLabel header8 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header8.setFont(f);
        header8.setText("KUET");
        constraint9.gridx=200;
        constraint9.gridy=10;
        constraint9.gridwidth=100;
        constraint9.gridheight=10;
        panel12.add(header8,constraint9);

        CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon image9 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\KUET.jpg");
        JLabel labimg9 = new JLabel(image9);
        constraint9.gridx=250;
        constraint9.gridy=100;
        constraint9.gridwidth=200;
        constraint9.gridheight=300;
        panel12.add(labimg9,constraint9);

        JLabel lab12 = new JLabel();
        String s11="<html>  Khulna University of Engineering & Technology (KUET), which started functioning from September 2003, is one of the <br>  five public engineering universities of Bangladesh in higher education, <br>  research and development in engineering and technology.It was formerly known as Bangladesh Institute Technology.The admission process in KUET is highly competitive.<br>  Each year it opens about 1005 seats for undergraduate programs. About 10,000 applicants are invited to appear on an admission test.<br>It has seven residential halls,among them 6 for male students and 1 for female students .</html>";
        lab12.setText(s11);
        constraint9.gridx=10;
        constraint9.gridy=100;
        constraint9.gridwidth=200;
        constraint9.gridheight=300;
        panel12.add(lab12,constraint9);

        buttonlogsubback9 = new JButton("Back");
        constraint9.gridx=100;
        constraint9.gridy=400;
        constraint9.gridwidth=  105;
        constraint9.gridheight=100;
        panel12.add(buttonlogsubback9,constraint9);

        urlbut9 = new JButton("For more information click me..");
        constraint9.gridx=150;
        constraint9.gridy=400;
        constraint9.gridwidth=200;
        constraint9.gridheight=100;
        panel12.add(urlbut9,constraint9);

    }
}
