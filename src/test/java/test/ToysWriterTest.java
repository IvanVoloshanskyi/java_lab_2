package test;

import java.io.IOException;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.GameRoom.ToysWriter;
import ua.lviv.iot.GameRoom.imp.GameRoom;
import ua.lviv.iot.Toys.*;

import java.io.Writer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ToysWriterTest {
    private GameRoom gameRoom;
    private Ball_toy ball_toy;
    private Car_toy car_toy;
    private Doll_toy doll_toy;

    @Test
    public void testWriteToCSV() throws IOException {
        ball_toy = new Ball_toy(10,10,1);
        car_toy = new Car_toy(10,10,2);
        doll_toy = new Doll_toy(10,12,3);
        Toys[] toys = { ball_toy, car_toy, doll_toy };
        gameRoom = new GameRoom();
        gameRoom.addToys(ball_toy);
        gameRoom.addToys(car_toy);
        gameRoom.addToys(doll_toy);
        ToysWriter writer = new ToysWriter();
        writer.writeToFile(toys, "src\\test\\resources\\expected.csv");

    }

}