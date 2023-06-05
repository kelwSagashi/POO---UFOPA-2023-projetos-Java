package Simple_banking_system;

//this class extends Account and recieve attributes from Account
public class CheckingAccount extends Account {
    //Superclass constructor get attributes from Account
    public CheckingAccount (Client titularClient, String number) {
        super(titularClient, number);
    }

    public String getAccountType(){
        return "Account Type is Checking Account"; 
    }
}
