import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Building{
    LinkedList<Apartment> floor = new LinkedList<Apartment>();
    PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();


    public void add(Person person) {
        Iterator<Apartment> apartmentIterator = floor.iterator();
        while (apartmentIterator.hasNext()) {
            Apartment a = apartmentIterator.next();
            if (person.rating > 3000) {
                priorityQueue.add(person);
                System.out.println("Ваш рейтинг подходит для заселения!");
            } else {
                System.out.println("Вы не можете заселиться! Повысьте ваш рейтинг.");
            }
            System.out.println(a);
        }
    }

    public void remove(Person person) {
        //удалить какуб-нибудь персону, смотрю на рейтинг priorityQueue и удаляю верхнего poll
        //iterator
        Iterator<Person> personIterator = priorityQueue.iterator();
        while (personIterator.hasNext()){
            Person p = personIterator.next();
            priorityQueue.poll();
            System.out.println(p);
        }

    }
}
