import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Config {

    private Map<String, String> properties;
    private static Config INSTANCE;

    public static synchronized Config getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Config();
        }

        return INSTANCE;
    }

    public String get(String key) {
        return properties.get(key);
    }

    public void printAllConfigs() {
        System.out.println(properties);
    }

    private Config() {

        File file = new File("config.data");
        properties = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {

            reader.lines().forEach(line -> {
                String[] split = line.split("=");
                properties.put(split[0], split[1]);
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
