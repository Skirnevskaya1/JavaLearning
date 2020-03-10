import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Building building = new Building(2);
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Person("Смирнов", 4000));
        priorityQueue.add(new Person("Петров", 9000));
        priorityQueue.add(new Person("Соболев", 1000));

        while (!priorityQueue.isEmpty()) {
            int level = (int) (Math.random() * 1);
            int index = (int) (Math.random() * 4);

            if (Math.random() > 0.75) {
                Person person = building.remove(level, index);
                if (person != null) System.out.println(person.toString() + " покинул свое место");
            }

            Person person = priorityQueue.poll();
            if (building.add(person)) {
                System.out.println("Пытаюсь припорковать " + person.toString());
                System.out.println("Ваша машина успешно припоркованна");
            } else {
                // по идее, если место занято, то должен быть возврат машины обратно в очередь, но сейчас
                // будет зацикливание
                priorityQueue.add(person);
                System.out.println("Упс, у нас нет мест");
            }

            Thread.sleep(1000);

            System.out.println(building.toString());
        }

//
//        Inspector inspector = new Inspector();
//        inspector.checkBuildings(building);
//
//        HashMap<Inspector, Building> inspectorBuildingHashMap = new HashMap<>();
//       //список испекторов, по имени ниспектора получить испектора

    }
}
