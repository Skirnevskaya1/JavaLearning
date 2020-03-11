import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();

        priorityQueue.add(new Person(9000, "Петров"));
        priorityQueue.add(new Person(4000, "Смирнов"));
        priorityQueue.add(new Person(1000, "Соболев"));
        priorityQueue.add(new Person(5000, "Петров"));
        priorityQueue.add(new Person(2000, "Петров"));
        priorityQueue.add(new Person(7000, "Иванов"));
        priorityQueue.add(new Person(3000, "Колмаков"));

        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll());
        }

        Apartment apartment = new Apartment(1);
        Building building = new Building(1);


        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();

    }
}
