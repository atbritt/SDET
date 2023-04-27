package ShoppingCart;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {

    private float subTotal = 0;
    private float salesTax = 0;
    private float grandTotal = 0;
    private int productQuantity = 0;
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
        if (productQuantity > 0) {
            productQuantity--;
        }
        System.out.println("Shopping cart Name: " + shoppingCartName + "Product quantity: " + productQuantity);
    }

    public void editQuantity(){
        int newQuantity = scanner.nextInt();

    }

    public void printTotal(){
        for (Map.Entry<Product, Integer> mappy : cartMap.entrySet()){
            float productTotal = mappy.getValue() * mappy.getKey().getProductPrice();
            subTotal += productTotal;
            System.out.println("Subtotal: " + subTotal);
        }
        salesTax = (float) (subTotal * .1);
        System.out.println("Sales Tax: " + df.format(salesTax));
        grandTotal = subTotal + salesTax;
        System.out.println("Grand Total: " + df.format(grandTotal));
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
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

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getShoppingCartName() {
        return shoppingCartName;
    }
}