public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {
        for (Apartment floor : building.floors) {
            for (Person person : floor.residences) {
                if (getRating() <= 1000) {
                    floor.residences.remove(getRating());
                }
                System.out.println(person.getRating());
            }
        }
    }
}
