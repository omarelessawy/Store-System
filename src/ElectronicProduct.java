public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;

   public ElectronicProduct(int productId , String name , double price , String brand , int warrantyPeriod){
       super(productId , name , price);
       this.brand = brand;
       this.warrantyPeriod = warrantyPeriod;
   }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }


}
