
public interface BankAccount{
    public void setAccountName(String accountName);
    public void setBalance(double balance);
    public void setAccountNumber(String accountNumber);
    public String getAccountName();
    public double getBalance();

    //methods
    String showAccountType();
    double getInterestRate();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}