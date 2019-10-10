

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BAU {
    JPanel panel11 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback8;
    JButton urlbut8;

    BAU()
    {
        GridBagConstraints constraint8 = new GridBagConstraints();
        JLabel header7 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header7.setFont(f);
        header7.setText("BAU");
        constraint8.gridx=200;
        constraint8.gridy=10;
        constraint8.gridwidth=100;
        constraint8.gridheight=10;
        panel11.add(header7,constraint8);

        CanonicalPath canonicalPath= new CanonicalPath();
        ImageIcon image8 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\BAU.jpg");

//        ImageIcon image8 = new ImageIcon(getClass().getResource("BAU.jpg"));
        JLabel labimg8 = new JLabel(image8);
        constraint8.gridx=250;
        constraint8.gridy=100;
        constraint8.gridwidth=200;
        constraint8.gridheight=300;
        panel11.add(labimg8,constraint8);

        JLabel lab11 = new JLabel();
        String s10="<html>  Bangladesh Agricultural University or BAU  was established as the only university of its kind in Bangladesh in 1961.<br> BAU's research in agriculture has made it well recognised across Asia. It also have a very low teacher-student ratio.<br> The campus, with an area of 4.85 square kilometres (1.87 sq mi),is in scenic rural surroundings on the western bank of the old Brahmaputra River,<br> 3 kilometres (1.9 mi) south of the district town of Mymensingh and 120 kilometres (75 mi) north of Dhaka.It has 13 residential halls,among them 9 for male students <br> and 4 for female students.Every year 1200 students get admitted in this university.<br> </html>";
        lab11.setText(s10);
        constraint8.gridx=10;
        constraint8.gridy=100;
        constraint8.gridwidth=200;
        constraint8.gridheight=300;
        panel11.add(lab11,constraint8);

        buttonlogsubback8 = new JButton("Back");
        constraint8.gridx=100;
        constraint8.gridy=400;
        constraint8.gridwidth=  105;
        constraint8.gridheight=100;
        panel11.add(buttonlogsubback8,constraint8);

        urlbut8 = new JButton("For more information click me..");
        constraint8.gridx=150;
        constraint8.gridy=400;
        constraint8.gridwidth=200;
        constraint8.gridheight=100;
        panel11.add(urlbut8,constraint8);

    }
}
