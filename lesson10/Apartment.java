import java.util.ArrayList;
import java.util.Arrays;

public class Apartment {

    ArrayList<Person> residences = new ArrayList<>();

    public Apartment(int amountRooms) {
        for (int i = 0; i < amountRooms; i++) {
            residences.add(null);
        }
    }

    public ArrayList<Person> getResidences() {
        return residences;
    }

    public boolean addPerson(Person person) {
        for (int i = 0; i < residences.size(); i++) {
            if (residences.get(i) == null) {
                residences.set(i, person);
                return true;
            }
        }
        return false;
    }

    public Person remove(int index) {
        return residences.set(index, null);
    }

    @Override
    public String toString() {
        return Arrays.toString(residences.toArray());
    }
}