public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    Apartment apartment;

    public void checkBuildings(Building building) {
        building.floors.add(apartment);
        for (int i = 0; i < apartment.residences.size(); i++) {
            if (apartment.residences.get(i).getRating() <= 1000) {
                apartment.residences.remove(i);
            }
        }
    }
}