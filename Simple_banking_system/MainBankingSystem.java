package Simple_banking_system;
public class MainBankingSystem {
    public static void main(String[] args) {
        Client client1 = new Client("null", "João batista", 1, "null");
        Client client2 = new Client("null", "Paula leite", 1, "null");
        Account c1 = new CheckingAccount(client1, "1234-5");
        Account c2 = new EspecialAccount(client2, "6789-0");
        c1.deposit(50);
        c2.deposit(100);
        c2.draw(25);
        //Call the method created in Especial Account
        ((EspecialAccount)c2).yieldBonus();

        System.out.println("Account #1");
        System.out.println(c1);

        System.out.println();

        System.out.println("Account #2");
        System.out.println(c2);
    }
}