/**
 * Created by User on 02.02.2020.
 */
public class Phone {
    private String number;
    private String model;
    private int weight;

    public static void main(String[] args) {

        Phone a = new Phone("8-999-888-36-21", "Samsung Galaxy 9", 165);
        Phone b = new Phone("8-888-454-44-85", "Apple iPhone 6", 150);
        Phone c = new Phone("8-777-712-12-66", "Huawei Honor 8", 175);
        a.print();
        b.print();
        c.print();

        a.receiveCall("Ann");
        a.receiveCall("Ann", a.number);
        System.out.println("Number: " + a.getNumber());
        System.out.println("Model: " + a.getModel());
        System.out.println("Weight: " + a.getWeight());

        b.receiveCall("Sam");
        b.receiveCall("Sam", b.number);
        System.out.println("Number: " + b.getNumber());
        System.out.println("Model: " + b.getModel());
        System.out.println("Weight: " + b.getWeight());

        c.receiveCall("Tom");
        c.receiveCall("Tom", c.number);
        System.out.println("Number: " + c.getNumber());
        System.out.println("Model: " + c.getModel());
        System.out.println("Weight: " + c.getWeight());
    }

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("\n" + "Calling is " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling is " + name + "; number : " + number);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void print() {
        System.out.println("Number: " + number + "; model: " + model + "; weight: " + weight);
    }

}


