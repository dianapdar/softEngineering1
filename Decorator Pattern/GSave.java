
public class GSave implements BankAccountDecorator {
   private BankAccount bankAccount;

   @Override
   public void setBankAccount(BankAccount bankAccount) {
      this.bankAccount = bankAccount;

   }

   @Override
   public void setAccountName(String accountName) {

   }

   @Override
   public void setBalance(double balance) {

   }

   @Override
   public void setAccountNumber(String accountNumber) {

   }

   @Override
   public String getAccountName() {
      return null;
   }

   @Override
   public double getBalance() {
      return 0;
   }

   @Override
   public String showAccountType() {
      return "GSave";
   }

   @Override
   public double getInterestRate() {
      return 2.5;
   }

   @Override
   public String showBenefits() {
      return bankAccount.showBenefits() + " + GCash Transfer";
   }

   @Override
   public double computeBalanceWithInterest() {
      return bankAccount.computeBalanceWithInterest();
   }

   @Override
   public String showInfo() {
      return bankAccount.showInfo();
   }
}
