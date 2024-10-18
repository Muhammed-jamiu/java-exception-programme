import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    private static String[] arg;

    public static void tryResources(){
        TryResources.arg = arg;
        try(FileReader fr = new FileReader("E:file.txt")) {
           char [] a =new char [50];fr.read(a);
           for (char c:a)
               System.out.println(c);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

}
