public class Inspector extends Person {

    public Inspector(int rating, String name) {
        super(rating, name);
    }

    public void checkBuildings(Building building) {
        if (building.floors.isEmpty()) {
            System.out.println("Найдено пустая квартира!");
        } else if (rating <= 1000) {
            building.floors.remove();
        }
    }
}