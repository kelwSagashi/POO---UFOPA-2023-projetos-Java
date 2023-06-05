package Simple_banking_system;

//This abstract class cannot be instantiated
//Account have attributes for other classes that inherit from this abstract class
public abstract class Account {
    private Client titular;
    private String number;
    private double balance;

    public Account(Client titular, String number) {
        this.titular = titular;
        this.number = number;
    }

    public String getTitularInfo() {
        return titular.toString();
    }
    public Client getTitular() {
        return titular;
    }
    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double value){
        this.balance += value;
    }
    public void draw(double value){
        this.balance -= value;
    }
    public String toString() {
        return "Titular: " + this.titular + "\t| Account: " + this.number + "\t| Balance: " + this.balance;
    }
}