package ua.lviv.iot;

import ua.lviv.iot.GameRoom.imp.GameRoom;
import ua.lviv.iot.Toys.Ball_toy;
import ua.lviv.iot.Toys.Car_toy;
import ua.lviv.iot.Toys.Cubes_toy;
import ua.lviv.iot.Toys.Doll_toy;

public class Main {

    public static void main(String[] args) {


    Ball_toy ball = new Ball_toy(12, 13, 1);
    Car_toy car = new Car_toy(14,15 , 2);
    Doll_toy doll = new Doll_toy(22, 17, 3);
    Cubes_toy cubes = new Cubes_toy(18, 19, 4);



    GameRoom room = new GameRoom();

    room.addToys(ball);
    room.addToys(car);
    room.addToys(doll);
    room.addToys(cubes);
    System.out.println("---------------Sorting by price:----------------------");
    System.out.println(room.sortByPrice(true));
    System.out.println("---------------Sorting by size:----------------------");
    System.out.println(room.sortBySize(true));
    System.out.println("-------------------------------------------------------");

    }
}
