public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {

        for (int i = 0; i < building.floors.size(); i++) {
            // if (apartment.residences.get(i).getRating() <= 1000) {
            building.floors.remove(i);
            if (building.floors != null) {
                System.out.println(building.floors.toString() + " выселен из квартиры.");
            }
        }
    }
}
