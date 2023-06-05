package Simple_banking_system;

public class SavingsAccount extends Account{
    public SavingsAccount (Client titularClient, String number) {
        super(titularClient, number);
    }
    
    public void yieldInterest(double tax){
        super.deposit(this.getBalance() * tax);
    }

    public String getAccountType(){
        return "Account Type is Savings Account"; 
    }
}
