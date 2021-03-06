package ua.lviv.iot.Toys;

import lombok.Getter;
@Getter
public abstract class Toys {
    protected int price;
    protected int amount;
    protected int size;

    protected Toys(int price, int amount, int size) {
        this.price = price;
        this.amount = amount;
        this.size = size;


    }
    public String getHeaders() {
        return "price;amount;size;";
    }
    public String toCSV() {
        return String.format("%d; %d; %d", getPrice(), getSize(), getAmount());
    }


    public String toString(){
        return " Size: " + size + ". Price :" + price + ". Amount: " + amount + System.lineSeparator();
    }
}

