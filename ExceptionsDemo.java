import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
//    sayHello(null);
//        check exception-- type
//        unchecked exception--- type
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException |ParseException e) {
//            throw new RuntimeException(e);
            System.out.println("Could not read the Data");
        }
//        try{
//        System.out.println("File opened");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

    }



    public  static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
