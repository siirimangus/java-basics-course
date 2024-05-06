package fileoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BusRepository {
    public static List<BusTime> getBusTimes() {
        List<BusTime> busTimes = new ArrayList<>();

        // Read the data from the file line by line and handle the line to extract hour and minutes
        Path path = Paths.get("src", "fileoperations", "data", "bus-times.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;

                String[] hourAndMinutes = line.split("\\s+");  // \s+ denotes the whitespace
                // The first element is hour
                Integer hour = Integer.parseInt(hourAndMinutes[0]);
                List<Integer> minutes = new ArrayList<>();
                for (int i = 1; i < hourAndMinutes.length; i++) {
                    minutes.add(Integer.parseInt(hourAndMinutes[i]));
                }
                busTimes.add(new BusTime(hour, minutes));
            }
        } catch (IOException e) {
            System.out.println("Could not read the bus times from file: " + e.getMessage());
        }

        return busTimes;
    }

    public static void main(String[] args) {
        List<BusTime> busTimes = getBusTimes();
        for (BusTime busTime : busTimes) {
            System.out.println(busTime);
        }
    }
}
