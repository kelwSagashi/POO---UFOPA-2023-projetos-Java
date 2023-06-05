package Generate_billet;
import java.util.Scanner;

public class MainProject{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the product sales system");
        String n = "s";
        Sale sale = new Sale();
        int i = 0;

        do{
            System.out.println("\nProduct " + (i + 1) + " ");
            System.out.print("Name: ");
            String name = scan.next();
            name += scan.nextLine();
            System.out.print("Price: ");
            float price = scan.nextFloat();
            System.out.print("quantity: ");
            int qtt = scan.nextInt();
            Product product = new Product(name, price, qtt);
            sale.addItem(product);
            System.out.print("\"s\" to continue  or type \"n\" to close the sale > ");
            n = scan.next();

            i++;
            if(n.equals("n")){
                break;
            }
        } while(!n.equals("n"));
        
        //#region generate Billet;
        Billet billet = new Billet();
        billet.header();
        for (int j = 0; j < sale.getQuantityProduct(); j++) {
            billet.createBillet(sale.getNameProduct(j), sale.getQuantityProduct(j), sale.getPriceProduct(j), sale.getTotalProduct(j));
            billet.calculateTotal(sale.getTotalProduct(j));
        }
        billet.totals();
        billet.jump(4);
        //#endregion

        scan.close();
    }
}