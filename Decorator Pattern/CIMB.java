
public class CIMB {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount();
        bankAccount.setAccountNumber("1234");
        bankAccount.setAccountName("Juan Dela Cruz");
        bankAccount.setBalance(10000.0);

        System.out.println(bankAccount.showInfo());
        System.out.println("Account Type: " + bankAccount.showAccountType());
        System.out.println("Interest rate: " + bankAccount.getInterestRate());
        System.out.println("New balance: " + bankAccount.computeBalanceWithInterest());
        System.out.println("Benefits: " + bankAccount.showBenefits());

        System.out.println("----------------------");

        BankAccountDecorator gSave = new GSave();
        gSave.setBankAccount(bankAccount);
        System.out.println(gSave.showInfo());

        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + gSave.getInterestRate());
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + gSave.showBenefits());

        System.out.println("----------------------");

        BankAccountDecorator upSave = new UpSave();
        upSave.setBankAccount(bankAccount);
        System.out.println(upSave.showInfo());

        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + upSave.getInterestRate());
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + upSave.showBenefits());
    }

}
