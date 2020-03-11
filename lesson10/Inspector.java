public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {
        for (Apartment buildingCheck : building.floors) {
//            if (building.floors.isEmpty()) {
            //              System.out.println("Найдено пустая квартира!");
            if (building.floors.size() <= 1000) {
                building.floors.remove();
            }
        }
    }
}