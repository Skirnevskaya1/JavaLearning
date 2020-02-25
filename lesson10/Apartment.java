import java.util.ArrayList;

public class Apartment {
    ArrayList<String> room1 = new ArrayList<String>(1);
    ArrayList<String> room2 = new ArrayList<String>(3);
    ArrayList<String> room3 = new ArrayList<String>(5);

    public void addPerson(String name) {
        if (room1.isEmpty()) {
            room1.add(name);
        } else if (room2.isEmpty()) {
            room2.add(name);
        } else if (room3.isEmpty()) {
            room3.add(name);
        }
        System.out.println(room1 + "\n" + room2 + "\n" + room3);
    }
}

