

import javax.swing.*;
import java.awt.*;

public class CUET {
    JPanel panel13 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback10;
    JButton urlbut10;
    CUET()
    {
        GridBagConstraints constraint10 = new GridBagConstraints();
        JLabel header9 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header9.setFont(f);
        header9.setText("CUET");
        constraint10.gridx=200;
        constraint10.gridy=10;
        constraint10.gridwidth=100;
        constraint10.gridheight=10;
        panel13.add(header9,constraint10);

        CanonicalPath canonicalPath= new CanonicalPath();

        ImageIcon image10 = new ImageIcon(canonicalPath.getPath()+"\\pictures\\CUET.jpg");
        JLabel labimg10 = new JLabel(image10);
        constraint10.gridx=250;
        constraint10.gridy=100;
        constraint10.gridwidth=200;
        constraint10.gridheight=300;
        panel13.add(labimg10,constraint10);

        JLabel lab13 = new JLabel();
        String s12 = "<html>  Chittagong University of Engineering & Technology  commonly referred to as CUET , located in Raozan Upazila, <br>  Chittagong District, Bangladesh, is renowned as one of the public engineering universities in Bangladesh.<br>  On September 1, 2003 it was a historic moment when the BIT, Chittagong was converted into a fully autonomous <br> public university & named Chittagong University of Engineering and Technology. The university maintains a special emphasis on research.<br> This university has 5 residential halls,among them 4 for male students and 1 for female students.Every year 700 students get admitted in this university in different departments.<br>  <u> Exam pattern of CUET </u> <br> <ul style=\\\"list-style-type:disc\\\"> <li>600 marks(ka + Kha division)</li> <li>3 hours</li> <li>written</li> <li>Physics 200 marks(20 questions)</li> <li>Math 200 marks(20 questions)</li> <li>chemistry 200 marks(20 questions)</li> <li>Free hand drawing for Architecture and URP candidates extra exam(Kha division). 400 marks.</li> <li> Students of ka division must obtain 35% marks from written exam to be selected <br>  as in merit list and for Kha division,beside that 30% mark from free hand drawing exam. </li> </ul> </html>";
        lab13.setText(s12);
        constraint10.gridx=10;
        constraint10.gridy=100;
        constraint10.gridwidth=200;
        constraint10.gridheight=300;
        panel13.add(lab13,constraint10);

        buttonlogsubback10 = new JButton("Back");
        constraint10.gridx=100;
        constraint10.gridy=400;
        constraint10.gridwidth=  105;
        constraint10.gridheight=100;
        panel13.add(buttonlogsubback10,constraint10);

        urlbut10 = new JButton("For more information click me..");
        constraint10.gridx=150;
        constraint10.gridy=400;
        constraint10.gridwidth=200;
        constraint10.gridheight=100;
        panel13.add(urlbut10,constraint10);

    }
}
