
public class SavingsAccount implements BankAccount{
   private String accountNumber;
   private String accountName;
   private Double balance;

   public SavingsAccount(){
       this.accountNumber = accountNumber;
       this.accountName = accountName;
       this.balance = balance;
   }

    @Override
    public void setAccountName(String accountName) {
       this.accountName = accountName;
    }

    @Override
    public void setBalance(double balance) {
       this.balance = balance;

    }

    @Override
    public void setAccountNumber(String accountNumber) {
       this.accountNumber = accountNumber;
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
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 1.0;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate() /100);
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName
                + balance;
    }
}