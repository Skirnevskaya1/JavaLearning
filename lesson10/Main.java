import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws NullPointerException, IndexOutOfBoundsException {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();

        priorityQueue.add(new Person(9000, "Петров"));
        priorityQueue.add(new Person(4000, "Смирнов"));
        priorityQueue.add(new Person(1000, "Соболев"));
        priorityQueue.add(new Person(5000, "Петров"));
        priorityQueue.add(new Person(2000, "Петров"));
        priorityQueue.add(new Person(7000, "Иванов"));
        priorityQueue.add(new Person(3000, "Колмаков"));

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        Apartment apartment = new Apartment(1);
        Building building = new Building(1);

        Inspector inspector = new Inspector(1, "Inspector");
        inspector.checkBuildings(building);

        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();
        inspectorBuildingHashMap.put(inspector, building);

        for (Map.Entry<Inspector, Building> entry : inspectorBuildingHashMap.entrySet()) {
            Inspector key = entry.getKey();
            Building value = entry.getValue();
            System.out.println(key + "" + value);
        }
    }
}
