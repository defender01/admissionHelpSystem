

import javax.swing.*;
import java.awt.*;

public class Label  {
    Font f;
    JLabel labelob;
    Label(String s1,String s2,int x,int y,int w,int h,Font ff)
    {
        ///JLabel label1=new JLabel();
        f=ff;
        labelob=new JLabel();
        labelob.setFont(f);
        labelob.setText(s1);
        labelob.setToolTipText(s2);
        labelob.setForeground(Color.BLUE);
        labelob.setOpaque(true);
        ///labelob.setBackground(Color.LIGHT_GRAY);
        labelob.setBounds(x,y,w,h);
    }
}
