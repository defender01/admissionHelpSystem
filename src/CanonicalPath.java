import java.io.File;
import java.io.IOException;

public class CanonicalPath {
    public String getPath()
    {
        String canonicalPath=null;
        try {
            canonicalPath = new File(".").getCanonicalPath();
        } catch (IOException e) {
            System.out.println("IOException Occured" + e.getMessage());
        }
        return canonicalPath;

    }
}
