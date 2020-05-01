public class Situation {
    public Situation[] direction;
    public String subject;
    public String text;
    public int dHealth;
    public int dExperience;
    public int dDays;

    public Situation(String subject, String text, int variants, int dHealth, int dExperience, int dDays) {
        this.subject = subject;
        this.text = text;
        this.dHealth = dHealth;
        this.dExperience = dExperience;
        this.dDays = dDays;
        direction = new Situation[variants];
    }
}