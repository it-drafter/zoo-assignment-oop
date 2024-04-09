package zooassignmentoop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(String output) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("zoo_ordinary_day.txt", true))) {
            writer.write(output);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to a file!");
        }
    }
}
