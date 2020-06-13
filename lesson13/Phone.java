public class Phone implements Comparable<Phone> {

    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price + "\n";
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}
