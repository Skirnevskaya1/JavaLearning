import java.util.LinkedList;
import java.util.PriorityQueue;

public class Building extends Apartment {
    LinkedList<String> floor1 = new LinkedList<String>(room1);
    LinkedList<String> floor2 = new LinkedList<String>(room2);
    LinkedList<String> floor3 = new LinkedList<String>(room3);

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

    public void population(String name, Integer rating) {

        if (floor1.isEmpty()) {
            floor1.add(name);
        } else if (floor2.isEmpty()) {
            floor2.add(name);
        } else if (floor3.isEmpty()) {
            floor3.add(name);
        }
        System.out.println(floor1 + "\n" + floor2 + "\n" + floor3);

        if (rating > 3000) {
            priorityQueue.add(rating);
            System.out.println("Ваш рейтинг подходит для заселения!");
        } else {
            System.out.println("Вы не можете заселиться! Повысьте ваш рейтинг.");
        }
    }
}
