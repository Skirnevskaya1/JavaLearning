package Checker;

public abstract class Checker {
    public abstract void move(int х, int у);

    public void colourChecker(boolean colour) {
        if (colour == true) {
            System.out.println("Черный цвет шашки");
        } else {
            System.out.println("Белый цвет шашки");
        }
    }
}
