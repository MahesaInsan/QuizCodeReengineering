package Bloaters.New;

public class Transaction {
    int id, price;
    Delivery delivery = new Delivery();

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
