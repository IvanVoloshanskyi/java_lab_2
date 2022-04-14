package ua.lviv.iot.Toys;

public class Ball_toy extends Toys{

    public Ball_toy(int price, int amount, String size) {

        super(price, amount, size);
    }

    @Override
    public String toString(){
        return "Ball_toys Size: " + size + ". Price :" + price + ". Amount: " + amount + System.lineSeparator();
    }
}

