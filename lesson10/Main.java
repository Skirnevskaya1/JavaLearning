import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        Apartment apartment = new Apartment(1);
        Building building = new Building(1);

        System.out.println("Реестр всех жителей: ");
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
        System.out.println("-----------------------------------");

        building.add(priorityQueue.peek());
        System.out.println(building.toString());

        //building.floors.add(apartment);
        Inspector inspector = new Inspector(1, "Inspector");
        inspector.checkBuildings(building);

        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();
        inspectorBuildingHashMap.put(inspector, building);

        for (Map.Entry<Inspector, Building> entry : inspectorBuildingHashMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
