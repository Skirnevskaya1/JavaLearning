import java.util.HashMap;
import java.util.Map;

public class Inspector extends Person {
    HashMap<String, Building> inspector = new HashMap<String, Building>();

    public Inspector(String name, int rating) {
        super(name, rating);
    }

    public void checkBuilding(Building building) {
        for (Map.Entry<String, Building> pair : inspector.entrySet()) {
            String key = pair.getKey();
            Building value = pair.getValue();

            if (value.floor.isEmpty()) {
                System.out.println("Найдено пустое место!" + key + "" + value);
            } else {
                System.out.println("Свободных квартир нет!");
            }

            if (rating > 3000) {
                building.priorityQueue.remove(name);
            } else {
                System.out.println("Найдено пустое место!");
            }
        }
    }
}