import java.util.Arrays;

public class TryCatch {
    public  static  void errorCatch(){
        try{
            String a[]= {"Musa","Muhammed-Jamiu","Hashid","Abdulsalam", "Abdulrahim"};
            if (a.length<=6) {
                System.out.println("This Array you are trying to define doesn't exit"+ a);
//                throw new RuntimeException(new Exception());
            } else System.out.println(Arrays.toString(a));
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void showMessage(){
        String firstName="Abdulsalam Muhammad-Jamiu";
        System.out.println("This is my full name"+" "+ firstName);
    }


}
