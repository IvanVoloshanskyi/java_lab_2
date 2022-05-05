package ua.lviv.iot.GameRoom;

import ua.lviv.iot.Toys.Toys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TooManyListenersException;

public class ToysWriter {

    public void writeToFile(Toys[] toys, String fileName) {
        File file = new File(fileName + ".csv");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(toys[0].getHeaders() + "\n");
            for (Toys toy : toys) {
                writer.write(toy.toCSV() + "\n");

            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}