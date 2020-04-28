import java.util.Scanner;

public class Game  {
    public static Character character;
    public static Story story;

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Имя выжившего: ");
        character = new Character(in.next());
        story = new Story(character.name);

        while (true) {
            character.health += story.current_situation.dHealth;
            character.experience += story.current_situation.dExperience;
            character.days += story.current_situation.dDays;
            //  Thread.sleep(2000);
            System.out.println("\nЗдоровье:" + character.health + "\tОпыт:" + character.experience + "\tДни:" + character.days + "\n");
            System.out.println("=============" + story.current_situation.subject + "==============");
            //  Thread.sleep(2000);
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                return;
            }
            story.go(in.nextInt());
        }
    }
}
