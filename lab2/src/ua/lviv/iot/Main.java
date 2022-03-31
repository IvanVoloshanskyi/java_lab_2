package ua.lviv.iot;

import ua.lviv.iot.GameRoom.Ball_toy;
import ua.lviv.iot.GameRoom.Car_toy;
import ua.lviv.iot.GameRoom.Cubes_toy;
import ua.lviv.iot.GameRoom.Doll_toy;

public class Main {

    public static void main(String[] args) {


    Ball_toy ball = new Ball_toy(12, 13, "Small");
    Car_toy car = new Car_toy(14,15 , "Medium");
    Doll_toy doll = new Doll_toy(16, 17, "Large");
    Cubes_toy cubes = new Cubes_toy(18, 19, "X-Large");



    ball.getValues();
    car.getValues();
    doll.getValues();
    cubes.getValues();






    }
}
