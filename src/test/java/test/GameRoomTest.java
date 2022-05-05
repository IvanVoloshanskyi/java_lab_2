package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.GameRoom.imp.GameRoom;
import ua.lviv.iot.Toys.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GameRoomTest {
    private final GameRoom gameRoom = new GameRoom();
    private final Ball_toy ball = new Ball_toy(12, 13, 1);
    private final Car_toy car = new Car_toy(14, 15, 2);
    private final Doll_toy doll = new Doll_toy(22, 17, 3);
    private final Cubes_toy cubes = new Cubes_toy(18, 19, 4);


    @Test
    void addToys() {
        try {
            gameRoom.addToys(ball);
            var privateField = GameRoom.class.getDeclaredField("listToys");
            privateField.setAccessible(true);
            var listTest = (List<Toys>) privateField.get(gameRoom);
            assertEquals(ball, listTest.get(listTest.size() - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    void sortByPrice()
    {
        List<Toys> listTest = Arrays.asList(ball, car, cubes);
        gameRoom.addToys(ball);
        gameRoom.addToys(car);
        gameRoom.addToys(cubes);
        gameRoom.sortByPrice(true);
        var arr = gameRoom.getListToys();
        for (int i = 0; i < gameRoom.getListToys().toArray().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr.get(i).getPrice() - arr.get(j).getPrice() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }


    }

    @Test
    void sortBySize() throws Exception
    {
        List<Toys> listTest = Arrays.asList(ball, car, cubes);
        gameRoom.addToys(ball);
        gameRoom.addToys(car);
        gameRoom.addToys(cubes);
        gameRoom.sortBySize(true);
        var arr = gameRoom.getListToys();
        for (int i = 0; i < gameRoom.getListToys().toArray().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr.get(i).getSize() - arr.get(j).getSize() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }

    }


    @Test
    void sellToy () throws Exception{
        System.out.println("Sosiska");
    }


}