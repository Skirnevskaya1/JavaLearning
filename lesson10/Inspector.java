public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {
        for (Apartment buildingCheck : building.floors) {

            if (getRating() <= 1000) {
                buildingCheck.residences.remove(getRating());
            }
            System.out.println(buildingCheck.residences.size());
        }
    }
}