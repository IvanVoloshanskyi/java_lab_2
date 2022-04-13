package ua.lviv.iot.GameRoom;

import ua.lviv.iot.Toys.Toys;

import java.util.List;

public interface IGameRoom {

    List<Toys> sortByPrice(boolean sorted);

    List<Toys> sortBySize(boolean sorted);

    void addToys(Toys toy);

    void sellToy(Toys toy);

}
