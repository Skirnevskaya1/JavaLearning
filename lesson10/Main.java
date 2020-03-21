import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        Apartment apartment = new Apartment(2);
        Building building = new Building(2);
        Inspector inspector = new Inspector(2, "Inspector");
        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();
        inspectorBuildingHashMap.put(inspector, building);

        priorityQueue.add(new Person(9000, "Петров"));
        priorityQueue.add(new Person(4000, "Смирнов"));
        priorityQueue.add(new Person(1000, "Соболев"));
        priorityQueue.add(new Person(7000, "Иванов"));
        priorityQueue.add(new Person(3000, "Колмаков"));

        while (!priorityQueue.isEmpty()) {
            Person person = priorityQueue.poll();
            if (building.add(person)) {
                System.out.println("Заселяем жителя в дом:  " + person.toString());
            } else {
                priorityQueue.add(person);
                System.out.println("Нельзя заселиться в дом, так как нет свободных мест.");
            }
            Thread.sleep(1000);
            System.out.println(building.toString());
        }

        for (Map.Entry<Inspector, Building> entry : inspectorBuildingHashMap.entrySet()) {
            System.out.println(entry);
        }
        inspector.checkBuildings(building);

    }
}