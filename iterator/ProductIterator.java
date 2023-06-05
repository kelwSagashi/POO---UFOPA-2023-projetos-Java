package iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.function.Consumer;

import java.util.Iterator;

public class ProductIterator {
    private List<Product> products = new ArrayList<>();
    private Iterator<Product> productIterator = products.iterator();
    
    public void addProduct(Product product){
        products.add(product);
    }

    public void showProducts(){
        this.productIterator();
        this.productIterator.forEachRemaining( E -> {System.out.println(E);});
    }

    public void setProduct(String productName, Product newProduct){
        this.productIterator();
        ListIterator<Product> setIterator = products.listIterator();
        while (setIterator.hasNext()){
            Product p = setIterator.next();
            if (p.getName().equals(productName)){
                setIterator.set(newProduct);
            }
        }
    }

    public void deleteProduct(String productName){
        this.productIterator();
        while (this.productIterator.hasNext()){
            Product p = this.productIterator.next();
            if (p.getName().equals(productName)){
                productIterator.remove();
            }
        }
    }

    public void setProductName(String productName, String newName){
        this.productIterator();
        while (this.productIterator.hasNext()){
            Product p = this.productIterator.next();
            if (p.getName().equals(productName)) {
                p.setName(newName);
            }
        }
    }

    public void setProductDescription(String productName, String newDescription){
        this.productIterator();
        while (this.productIterator.hasNext()){
            Product p = this.productIterator.next();
            if (p.getName().equals(productName)) {
                p.setName(newDescription);
            }
        }
    }

    public void setProductPrice(String productName, Double newPrice){
        this.productIterator();
        while (this.productIterator.hasNext()){
            Product p = this.productIterator.next();
            if (p.getName().equals(productName)) {
                p.setPrice(newPrice);
            }
        }
    }

    private void productIterator(){
        //Atualiza caso for preciso
        this.productIterator = products.iterator();
    }

    /**
     * Set all of the elements of this collection that satisfy the given predicate.
     * {@code example.setProductf(lambda -> (lambda.getMethod() < 10.0), lambda -> lambda.setMethod(arg));} 
     * 
     * @return {@code true} if any elements were modified
     * 
     * @implSpec
     * The default implementation traverses all elements of the Products collection using
     * its {@link Iterator}.
     * 
     * Implementation {@link #setIfPredicate}
     * 
     */
    public boolean setProductIf(Predicate<? super Product> predicate, Consumer<Product> action) {
        return setIfPredicate(predicate, action);
    }

    private boolean setIfPredicate(Predicate<? super Product> predicate, Consumer<Product> action) {
        this.productIterator();
        boolean modified = false;
        while (this.productIterator.hasNext()) {
            Product product = this.productIterator.next();
            if (predicate.test(product)) {
                modified = true;
                action.accept(product);
            }
        }   
        return modified;
    }
}
