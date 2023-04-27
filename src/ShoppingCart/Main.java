package ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product iPhone1 = new Product("iPhone 1", 1,799.99F, "This is the basest model");
        Product galaxy1 = new Product("Galaxy 1", 2,699.99F, "The barest of Androids");

        ShoppingCart cart = new ShoppingCart("Andrew's");
        cart.addProduct(iPhone1);
        cart.addProduct(iPhone1);
        cart.addProduct(iPhone1);
        cart.addProduct(iPhone1);
        cart.addProduct(iPhone1);
        cart.addProduct(iPhone1);
        cart.addProduct(galaxy1);

        cart.printTotal();
    }
}