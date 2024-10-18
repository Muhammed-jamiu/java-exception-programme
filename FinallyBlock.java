public class FinallyBlock {
    public static void finallyBlock() throws ArrayIndexOutOfBoundsException {
        double LowFound= 19.23;
        try {
            if (LowFound != 19.23) System.out.println("Access element three" + LowFound);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            double lowFound = LowFound;
            System.out.println("First element thrown:"+ lowFound);
            System.out.println("The Finaly statement is executed on this line");
        }
    }
}
