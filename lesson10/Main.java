
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Смирнов", 4000);

//        Apartment apartment = new Apartment();
//        apartment.addPerson("Иванов");
//        apartment.addPerson("Петров");
//        apartment.addPerson("Соболев");

        Building building = new Building();
        building.population("Харламов", 8000);
        building.population("Батрудинов", 1000);


        Checking checking = new Checking("", 1);
    }
}
