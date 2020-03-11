public class Person implements Comparable<Person> {
    protected int rating;
    protected String name;

    public Person(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.rating - o.rating;
    }
}