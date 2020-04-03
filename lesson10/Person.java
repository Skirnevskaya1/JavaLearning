public class Person implements Comparable<Person> {
    private int rating;
    private String name;

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

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}