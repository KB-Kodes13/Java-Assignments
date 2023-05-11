package bankAccountProject;

public class productMain {
    public static void main(String[] args) {
        Product product = new Product(59.99,3, "Concert Ticket");
        product.printProduct();
        product.totalCost();


    }
}
