

import javax.swing.*;
import java.awt.*;

public class myTextField  {
    Font f;
    JTextField textfieldob=new JTextField();;
    myTextField(String s,int x,int y,int w,int h,Font ff)
    {
        textfieldob.setFont(ff);
        textfieldob.setText(s);
        textfieldob.setBounds(x,y,w,h);
    }

}
