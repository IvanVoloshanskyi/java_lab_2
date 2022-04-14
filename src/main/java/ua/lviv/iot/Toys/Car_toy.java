package ua.lviv.iot.Toys;

public class Car_toy extends Toys {

    public Car_toy(int price, int amount, String size) {

        super(price, amount, size);
    }



    @Override
    public String toString(){
        return "Car_Toys Size: " + size + ". Price :" + price + ". Amount: " + amount + System.lineSeparator();
    }


}

