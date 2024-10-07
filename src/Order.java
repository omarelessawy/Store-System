public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
    public Order(int customerId , Product[] products , float totalPrice){
        this.customerId = customerId;
        this.orderId = (int)(Math.random() * 100);
        this.products = products;
        this.totalPrice = totalPrice;
    }
    public void printOrderInfo(){
        System.out.println("Order ID : "+orderId);
        System.out.println("Customer ID :"+customerId);
        System.out.println("Products : ");
        for(int i =0; i<products.length;i++){
            System.out.println(products[i].getName()+" - $"+products[i].getPrice());
        }
        System.out.println("Total Price: "+totalPrice);
    }
}
