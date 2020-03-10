import java.util.LinkedList;

public class Building {
    LinkedList<Apartment> floors = new LinkedList<>();

    public Building(int amountFloor) {
        for (int i = 0; i < amountFloor; i++) {
            floors.add(new Apartment(3));
        }
    }


    public boolean add(Person person) {

//        Iterator<Apartment> apartmentIterator = floor.iterator();
//        while (apartmentIterator.hasNext()) {
//            Apartment a = apartmentIterator.next();

        for (Apartment floor1 : floors) {
            if (floor1.addPerson(person)) {
                return true;
            }
        }
        return false;
    }

    public Person remove(int floor, int index) {
        return floors.get(floor).remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Apartment floor : floors) {
            builder.append(floor.toString()).append("\n");
        }
        return builder.toString();
    }
}
