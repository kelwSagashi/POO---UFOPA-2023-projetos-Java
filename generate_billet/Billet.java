import java.time.LocalTime;
import java.time.LocalDate;
public class Billet {
    private LocalTime time = LocalTime.now();
    private LocalDate data = LocalDate.now();
    private float total = 0;
    private float deduction = 0;

    public void header(){
        System.out.println("\n\n\nProof Of Sale");
        System.out.println("Company X");
        System.out.println("\nDate: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear());
        System.out.println("Hour: " + time.getHour() + ":" + time.getMinute());
        System.out.println("\nProduct\t\tQuantity\tUnitPrice\tValue");
    }
    public void createBillet(String itemName, int quantity, float UnitPrice, float price){
        System.out.println(itemName + "\t\t" + quantity + "\t\t$ " + UnitPrice + "\t\t$ " + price);
    }
    public void calculateTotal(float total){
        this.total += total;
    }

    public void totals(){
        System.out.println("\nTotal: $ " + this.total);

        if (this.total >= 100 && this.total < 200){
            this.deduction = this.total * 0.1f;
        }
        if (this.total >= 200 && this.total < 500){
            this.deduction = this.total * 0.15f;
        }
        if (this.total >= 500){
            this.deduction = this.total * 0.2f;
        }
        System.out.println("Discount: $ " + this.deduction);
        System.out.println("Total payable: $ " + (this.total - this.deduction));
    }
}
