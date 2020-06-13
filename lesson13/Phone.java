public class Phone implements Comparable<Phone> {

    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}
