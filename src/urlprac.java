

import java.awt.*;
import java.net.URI;
import java.net.URL;

public class urlprac
{
    public static void main(String args[]){
        try {
            Desktop d =  Desktop.getDesktop();
            d.browse(new URI("https://classroom.google.com/o/MTA1MTk3NjQwNzRa"));
            //URL url = new URL("https://classroom.google.com/o/MTA1MTk3NjQwNzRa");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
