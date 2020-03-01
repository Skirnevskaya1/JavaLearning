import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Смирнов", 4000);

        Apartment apartment = new Apartment(1);
        apartment.addPerson(person);

        Building building = new Building(2);
        building.add(person);
        building.remove(person);

        Inspector inspector = new Inspector();
        inspector.checkBuildings(building);

        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();
       //список испекторов, по имени ниспектора получить испектора



//        Inspector inspector = new Inspector("Петров", 2);
//        inspector.checkBuilding(building);
//
    }
}
