import java.util.ArrayList;
import java.util.List;
public class Sale {
    private List<Product> itensList = new ArrayList<>();

    public void addItem(Product item) {
        this.itensList.add(item);
    }
    public String getNameProduct(int index) {
        return itensList.get(index).getName();
    }
    public float getTotalProduct(int index) {
        return itensList.get(index).getUnitPrice() * itensList.get(index).getQuantity();
    }
    public float getPriceProduct(int index) {
        return itensList.get(index).getUnitPrice();
    }
    public int getQuantityProduct(int index) {
        return itensList.get(index).getQuantity();
    }
    public int getQuantityProduct() {
        return itensList.size();
    }
}
