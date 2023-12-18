
public class UpSave implements BankAccountDecorator{
    private  BankAccount bankAccount;

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void setAccountName(String accountName) {
        return;

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
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 4.0;
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + " + With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        double newBalance = getBalance() - getInterestRate();
        return bankAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
