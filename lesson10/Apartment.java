import java.util.ArrayList;
import java.util.Arrays;

public class Apartment {

    ArrayList<Person> residence = new ArrayList<>();

    public Apartment(int amountRooms) {
        for (int i = 0; i < amountRooms; i++) {
            residence.add(null);
        }
    }

    public boolean addPerson(Person person) {
        for (int i = 0; i < residence.size(); i++) {
            if (residence.get(i) == null) {
                residence.set(i, person);
                return true;
            }
        }
        return false;
    }

    public Person remove(int index) {
        return residence.set(index, null);
    }

    @Override
    public String toString() {
        return Arrays.toString(residence.toArray());
    }
}