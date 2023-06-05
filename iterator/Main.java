package iterator;
class Main {
    public static void main(String[] args) {
        ProductIterator cadProductIterator = new ProductIterator();
        cadProductIterator.showProducts();
        cadProductIterator.addProduct(new Product("pizza portuguesa", "big", 32.0));
        cadProductIterator.addProduct(new Product("pizza calabresa", "big", 35.0));
        cadProductIterator.addProduct(new Product("coca cola", "lata 350 ml", 6.00));
        cadProductIterator.addProduct(new Product("x-egg", "ovo e pao", 15.0));
        cadProductIterator.setProduct("x-egg", new Product("x-bacon", "bacon e pao", 16.0));
        cadProductIterator.setProductIf(
            p -> p.getName().equals("x-bacon"), 
            p -> {
                p.setDescription("Muito bacon com molho barbecue");
            }
        );
        cadProductIterator.setProductName("x-bacon", "X-Bacon");
        cadProductIterator.showProducts();
    }
  }