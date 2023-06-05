package Generate_billet;
public class Product {
    private String name;
    private float unitPrice;
    private int quantity;

    public Product(String name, float unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    } 

    public void setunitPrice (float newPrice)
    {
        this.unitPrice = newPrice;
    }
    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public String getName(){
        if (this.name.contains(" ")){
            return this.name.replace(" ", "_");
        }
        return this.name + "\t";
    }

    public float getUnitPrice(){
        return this.unitPrice;
    }

    public int getQuantity(){
        return this.quantity;
    }
}
