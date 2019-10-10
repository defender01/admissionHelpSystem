

import javax.swing.*;
import java.awt.*;

public class KU {
    JPanel panel8 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback5;
    JButton urlbut5;

    KU()
    {
        GridBagConstraints constraint5 = new GridBagConstraints();
        JLabel header4 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header4.setFont(f);
        header4.setText("KU");
        constraint5.gridx=200;
        constraint5.gridy=10;
        constraint5.gridwidth=100;
        constraint5.gridheight=10;
        panel8.add(header4,constraint5);

        CanonicalPath canonicalPath= new CanonicalPath();
        ImageIcon image5 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\KU.jpg");
        JLabel labimg5 = new JLabel(image5);
        constraint5.gridx=250;
        constraint5.gridy=100;
        constraint5.gridwidth=200;
        constraint5.gridheight=300;
        panel8.add(labimg5,constraint5);

        JLabel lab8 = new JLabel();
        String s7 = "<html> Khulna University is the 9th public university in Bangladesh, established in 1987. It is situated at Gollamari,<br> Khulna, Bangladesh, by the river Moyur, beside the Khulna-Satkhira highway.Every year 1118 students get admitted in this university.<br> It has 5 residential halls, among them 3 for male student and 2 for female students.It is a combined university.<br>It is the only university in bangladesh where student's politics is officially banned. </html>";
        lab8.setText(s7);
        constraint5.gridx=10;
        constraint5.gridy=100;
        constraint5.gridwidth=200;
        constraint5.gridheight=300;
        panel8.add(lab8,constraint5);

        buttonlogsubback5 = new JButton("Back");
        constraint5.gridx=100;
        constraint5.gridy=400;
        constraint5.gridwidth=  105;
        constraint5.gridheight=100;
        panel8.add(buttonlogsubback5,constraint5);

        urlbut5 = new JButton("For more information click me..");
        constraint5.gridx=150;
        constraint5.gridy=400;
        constraint5.gridwidth=200;
        constraint5.gridheight=100;
        panel8.add(urlbut5,constraint5);

    }
}
