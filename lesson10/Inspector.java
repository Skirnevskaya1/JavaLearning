public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {
        for (Apartment floor : building.floors) {
            for (int i = 0; i < floor.residences.size(); i++) {
                if (floor.residences.get(i).getRating() <= 1000) {
                    floor.remove(getRating());
                    System.out.println(floor.residences.get(i).getName() + " выселен из квартиры из-за низкого рейтинга = " + floor.residences.get(i).getRating());
                }
            }
        }
    }
}