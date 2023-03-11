package banking;

public class AxisBank extends BankInfo {
  public void deposit() {
	System.out.println("Amount successfully deposited");
}
  public static void main(String[] args) {
	AxisBank account= new AxisBank();
	account.saving();
	account.fixed();
	account.deposit();
}
}
