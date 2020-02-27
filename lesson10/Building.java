import java.util.LinkedList;
import java.util.PriorityQueue;

public class Building {
    LinkedList<Apartment> floor = new LinkedList<Apartment>();
    PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();

    public void add(Person person) {
        for (Apartment a : floor) {
            if (person.rating > 3000) {
                priorityQueue.add(person);
                System.out.println("Ваш рейтинг подходит для заселения!");
            } else {
                System.out.println("Вы не можете заселиться! Повысьте ваш рейтинг.");
            }
            System.out.println(a);
        }
    }
}
