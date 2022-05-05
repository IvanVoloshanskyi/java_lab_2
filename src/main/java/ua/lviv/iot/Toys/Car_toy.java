package ua.lviv.iot.Toys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car_toy extends Toys {

    public Car_toy(int price, int amount, int size) {

        super(price, amount, size);
    }



    public String toCSV() {
        return super.toCSV();
    }


}

