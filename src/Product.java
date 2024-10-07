public class Product {
    private int productId;
    private String name;
   private double price;

    public Product(int productId , String name , double price){
            this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
