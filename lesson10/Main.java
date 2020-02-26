
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Смирнов", 4000);

        Apartment apartment = new Apartment();
        apartment.addPerson(person);

        Building building = new Building();
        building.add(person);

        Inspector inspector = new Inspector("Петров", 2);
        inspector.checkBuilding(building);
    }
}
