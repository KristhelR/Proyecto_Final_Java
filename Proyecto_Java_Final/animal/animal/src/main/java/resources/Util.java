package resources;

import java.util.HashMap;
import java.util.List;

public class Util {

    private static final HashMap<String, List<animalId>> map = new HashMap<>();
    private static Util instance;


    public static synchronized Util getInstance() {
        if(instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public List<Task> getValue(String key) {
        return map.get(key);
    }

    public void add(String key, List<Record> tasks) {
        map.put(key, tasks);

    }
}
