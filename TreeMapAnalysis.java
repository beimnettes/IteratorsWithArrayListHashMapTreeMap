import java.util.Map;
import java.util.TreeMap;

public class TreeMapAnalysis {
    public static void main(String[] args) {
        TreeMap<String, Double> temperatureData = new TreeMap<>();

        // Populate the TreeMap
        temperatureData.put("January", 32.0);
        temperatureData.put("February", 35.5);
        temperatureData.put("March", 42.0);
        temperatureData.put("April", 55.2);
        temperatureData.put("May", 65.8);
        temperatureData.put("June", 72.5);

        System.out.println("Original TreeMap: " + temperatureData);

        // Find highest and lowest temperatures
        Map.Entry<String, Double> lowest = temperatureData.firstEntry();
        Map.Entry<String, Double> highest = temperatureData.lastEntry();

        System.out.println("Lowest Temperature: " + lowest.getValue() + " in " + lowest.getKey());
        System.out.println("Highest Temperature: " + highest.getValue() + " in " + highest.getKey());
    }
}
