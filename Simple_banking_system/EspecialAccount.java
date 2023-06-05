package Simple_banking_system;

public class EspecialAccount extends CheckingAccount{
    private double bonus;
    public EspecialAccount (Client titularClient, String number) {
        super(titularClient, number);
        this.bonus = 0;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void yieldBonus() {
        this.deposit(bonus);
        this.bonus = 0;
    }

    public void deposit (double value){
        super.deposit(value);
        //this.deposit(value);
        this.bonus += value * 0.01;
    }

    //#endregion
}
