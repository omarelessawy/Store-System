import java.util.ArrayList;

public class Cart {
    private int customerId;
    private int nProducts ;

    private int cartProducts ;

    private ArrayList<Product> products;
    public Cart() {
        products = new ArrayList<>();
        nProducts = 0;
    }


    public void addProduct(Product product) {

        products.add(product);
     nProducts++;
    }
    public void removeProduct(Product product){
        for(int i = 0; i < nProducts; i++){
            if (products.get(i) == product){
                products.remove(i);
                nProducts--;
                break;
            }
        }
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (Product product : products) {
         totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }


    public void setProducts(ArrayList<Product> products){
        this.products = products;
    }
    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public int getCartProducts() {
        return cartProducts;
    }





    public void setCartProducts(int maxProducts) {
        this.cartProducts = maxProducts;
    }

    public int getnProducts() {
        return nProducts;
    }

}