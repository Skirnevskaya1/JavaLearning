public class Character {
    public int health;
    public int experience;
    public int days;
    public String name;

    public Character(String name) {
        this.name = name;
        health = 100;
        experience = 0;
        days = 180;
    }
}