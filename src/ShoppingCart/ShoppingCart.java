package ShoppingCart;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {

    private float subTotal = 0;
    private float salesTax = 0;
    private String shoppingCartName = "";
    private Scanner scanner = new Scanner(System.in);
    private HashMap<Product, Integer> cartMap = new HashMap<>();
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public ShoppingCart(String shoppingCartName){
        this.shoppingCartName = shoppingCartName;
    }
    public void addProduct(Product product){

        if (cartMap.containsKey(product) && cartMap.get(product) >= 5){
            System.out.println("There is a limit of 5 items per product.");
        } else if (cartMap.containsKey(product)){
            cartMap.merge(product, 1, Integer::sum);
        } else {
            cartMap.put(product, 1);
        }

        System.out.println();

        for (Map.Entry<Product, Integer> mappy : cartMap.entrySet()){
            System.out.println(mappy.getKey().getProductName() + " = " + mappy.getValue());
        }
    }

    public void removeProduct(Product product){
        if (cartMap.get(product) > 0) {
            cartMap.merge(product, -1, Integer::sum);
            System.out.println("You currently have " + cartMap.get(product) +" "+ product.getProductName() + "'s in your cart.");
        } else {
            System.out.println("You currently have no " + product.getProductName() + "'s in your cart");
        }

    }

    public void editQuantity(Product product){
        int newQuantity;
        do {
            System.out.println("\n\nHow many " + product.getProductName() + "'s would you like? (Max 5)");
            newQuantity = scanner.nextInt();
        } while (newQuantity < 0 || newQuantity >5);
        cartMap.put(product, newQuantity);
        System.out.println("You currently have " + cartMap.get(product) +" "+ product.getProductName() + "'s in your cart.\n");
    }

    public void printTotal(){
        for (Map.Entry<Product, Integer> mappy : cartMap.entrySet()){
            float productTotal = mappy.getValue() * mappy.getKey().getProductPrice();
            subTotal += productTotal;
            System.out.println("Subtotal: " + subTotal);
        }
        salesTax = (float) (subTotal * .1);
        System.out.println("Sales Tax: " + df.format(salesTax));
        float grandTotal = subTotal + salesTax;
        System.out.println("Grand Total: " + df.format(grandTotal));
    }

    public void setShoppingCartName(String shoppingCartName) {
        this.shoppingCartName = shoppingCartName;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public float getSalesTax() {
        return salesTax;
    }

    public String getShoppingCartName() {
        return shoppingCartName;
    }
}