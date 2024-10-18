import java.io.FileInputStream;
import java.io.IOException;

public class MultipleCatch {
    public static void mulityCatch() throws IOException {
        try{
            String myName="Muhammed-Jamiu";
            if (myName.startsWith("U")) System.out.println("Sorry you are wrong");
            else if (myName.startsWith("M")) System.out.println("Yes now you are correct");

            ;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
