package ua.lviv.iot.Toys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Doll_toy  extends Toys{

    public Doll_toy(int price, int amount, int size) {
        super(price, amount, size);


    }
    public String toCSV() {
        return super.toCSV();
    }
}
