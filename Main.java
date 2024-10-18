import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Welcome to our world Coding");
        ExceptionsDemo.show();
        TryCatch.errorCatch();
        TryCatch.showMessage();
        MultipleCatch.mulityCatch();
        FinallyBlock.finallyBlock();
        TryResources.tryResources();

        //    try {
//        int a[] = {2,3,5,4,6};
//        System.out.println("The Array of Index two is given as:" + a[7]);
//    } catch (ArrayIndexOutOfBoundsException e) {
////        throw new RuntimeException(e)
//        System.out.println("Exception thrown:"+e.getMessage());
////        e.
//    }
//        System.out.println("Sorry the array you trying to get is out of band");

    }
}
