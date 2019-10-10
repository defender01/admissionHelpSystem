

import javax.swing.*;
import java.awt.*;

public class myPassword {
    JPasswordField pf = new JPasswordField();
    myPassword(String s,int x,int y,int w,int h)
    {
        pf.setBounds(x,y,w,h);
        pf.setText(s);
    }
}
