package entities;



public class Product{
    private String name;
    private Double price;
    private int quantity;
    private  int quantityadd;
    private  int quantityremove;


    public  Product(){

    }
    public void setQuantityremove(int quantityremove) {
        this.quantityremove = quantityremove;
    }

    public void setQuantityadd(int quantityadd) {
        this.quantityadd = quantityadd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValue(){
        return price * quantity;
    }
    public Integer addProducts(){
        return quantity += quantityadd;
    }
    public Integer removeProducts(){
        return quantity -= quantityremove;
    }
    public double totalValue2(){
        return addProducts() * price;
    }
    public double totalValue3(){
        return removeProducts() * price;
    }


}
