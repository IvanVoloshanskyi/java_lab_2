package ua.lviv.iot.Toys;

public class Doll_toy  extends Toys{

    public Doll_toy(int price, int amount, String size) {
        super(price, amount, size);


    }
    @Override
    public String toString(){
        return "Doll_Toys Size: " + size + ". Price :" + price + ". Amount: " + amount + System.lineSeparator();
    }
}
