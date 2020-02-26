import java.util.ArrayList;

public class Apartment {
    ArrayList<Person> room1 = new ArrayList<>(1);
    ArrayList<Person> room2 = new ArrayList<>(3);
    ArrayList<Person> room3 = new ArrayList<>(5);

    public void addPerson(Person person) {
        if (room1.isEmpty()) {
            room1.add(person);
        } else if (room2.isEmpty()) {
            room2.add(person);
        } else if (room3.isEmpty()) {
            room3.add(person);
        }
        System.out.println(room1.toString() + "\n" + room2.toString() + "\n" + room3.toString());
    }
}

