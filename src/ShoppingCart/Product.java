package ShoppingCart;

import java.security.PrivateKey;

public class Product {

    private String productName = "";
    private int productId;
    private float productPrice;
    private String productDetails = "";

    public Product (String productName, int productId, float productPrice, String productDetails){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDetails = productDetails;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductDetails() {
        return productDetails;
    }
}
