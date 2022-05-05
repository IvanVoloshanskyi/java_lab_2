package ua.lviv.iot.GameRoom.imp;

import lombok.Getter;
import lombok.Setter;
import ua.lviv.iot.GameRoom.IGameRoom;
import ua.lviv.iot.Toys.Toys;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter

public class GameRoom implements IGameRoom  {


    private final List<Toys> listToys = new LinkedList<>();




    @Override
    public List<Toys> sortByPrice(boolean sorted) {
        if (sorted) {
            return listToys.stream().sorted(Comparator.comparing(Toys::getPrice)).collect(Collectors.toList());
        } else {
            return listToys.stream().sorted(Comparator.comparing(Toys::getPrice).reversed()).collect(Collectors.toList());
        }
    }

    @Override
    public List<Toys> sortBySize(boolean sorted) {
        if (sorted) {
            return listToys.stream().sorted(Comparator.comparing(Toys::getSize)).collect(Collectors.toList());
        } else {
            return listToys.stream().sorted(Comparator.comparing(Toys::getSize).reversed()).collect(Collectors.toList());
        }
    }

    @Override
    public void addToys(Toys toy)
    {
        listToys.add(toy);
    }

    @Override
    public void sellToy(Toys toy) {
        // coming soon
    }

}