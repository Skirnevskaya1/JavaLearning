import java.util.HashMap;

public class Inspector extends Person {
    HashMap<String, Building> inspector = new HashMap<String, Building>();

    public Inspector(String name, int rating) {
        super(name, rating);
    }

    public void checkBuilding(Building building) {
        if (building.floor1.isEmpty() || building.floor2.isEmpty() || building.floor3.isEmpty()) {
            System.out.println("Найдено пустое место!");
        } else {
            System.out.println("Свободных квартир нет!");
        }

        if (addRating()) {
            building.priorityQueue.remove(name);
        } else {
            System.out.println("Найдено пустое место!");
        }
    }
}