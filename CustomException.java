import javax.management.InstanceNotFoundException;

public class CustomException {
  private double balance;
  private int number;
  public CustomException(int number){
      this.number=number;
  }
  public void deposit(double amount){
      balance += amount;
  }
  public void withdraw(double amount) throws InstanceNotFoundException{
      if (amount <= balance) {
          balance -= amount;
      }else {
          double needs =amount - balance;
          throw new InstanceNotFoundException();
      }
  }
}
