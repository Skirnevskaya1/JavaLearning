import java.util.LinkedList;
import java.util.PriorityQueue;

public class Building {
    LinkedList<Person> floor1 = new LinkedList<Person>();
    LinkedList<Person> floor2 = new LinkedList<Person>();
    LinkedList<Person> floor3 = new LinkedList<Person>();

    PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();


    public void add(Person person) {

        if (person.rating > 3000) {
            System.out.println("Ваш рейтинг подходит для заселения!");
        } else {
            System.out.println("Вы не можете заселиться! Повысьте ваш рейтинг.");
        }

        if (floor1.isEmpty()) {
            floor1.add(person);
        } else if (floor2.isEmpty()) {
            floor2.add(person);
        } else if (floor3.isEmpty()) {
            floor3.add(person);
        }
        System.out.println(floor1.toString() + "\n" + floor2.toString() + "\n" + floor3.toString());
    }
}
