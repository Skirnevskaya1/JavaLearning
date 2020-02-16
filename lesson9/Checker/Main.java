package Checker;

public class Main {
    public static void main(String[] args) {

        Checker simpleChecker = new SimpleChecker(2, 2);
        simpleChecker.move(3, 3);
        simpleChecker.move(4, 4);
        simpleChecker.move(8, 8);
        simpleChecker.move(0, 2);
        simpleChecker.move(-8, 4);
        System.out.println("-------------------");
        Checker king = new King(1, 1);
        king.move(8, 8);
        king.move(1, 1);
        king.move(7, 1);
        king.move(0, 1);
        king.move(-8, -8);
    }
}
