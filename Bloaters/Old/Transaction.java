package Bloaters.Old;

public class Transaction{
    int id, price, deliveryEst;
    String deliveryType;
    
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }
    
    public void setDeliveryEst(int deliveryEst) {
        this.deliveryEst = deliveryEst;
    }
    
    public int getDeliveryEst() {
        return deliveryEst;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}