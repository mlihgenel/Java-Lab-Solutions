public class BankAccount {

    private String accountName;
    private int accountID;
    private  int balance;


    public BankAccount(String accountName,int accountID){
        this.accountName = accountName;
        this.accountID = accountID;

    }

    public  int getBalance() {
        return this.balance;
    }

    public  void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(int amount){
        balance = balance + amount;
    }

    public void withdrawMoney(int amount){
        balance = balance - amount;
    }

    public void transferToAnother(int amount, BankAccount anotherBankAccount){
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            anotherBankAccount.depositMoney(amount); // Using the depositMoney method to add the amount
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public void displayBalance(){
        System.out.println("This is your current balance : " + balance);
    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }


}
