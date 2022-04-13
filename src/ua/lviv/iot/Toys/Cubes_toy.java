package ua.lviv.iot.Toys;

public class Cubes_toy  extends Toys{
    public Cubes_toy(int price, int amount, String size) {
        super(price, amount, size);
    }
    @Override
    public String toString(){
        return "Cubes_Toys Size: " + size + ". Price :" + price + ". Amount: " + amount + System.lineSeparator();
    }
}
