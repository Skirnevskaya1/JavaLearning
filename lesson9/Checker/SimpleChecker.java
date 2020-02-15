package Checker;

public class SimpleChecker extends Checker {

    @Override
    public void move(int х, int у) {

        if (х > 0 && у > 0 && х < 9 && у < 9 && (х % 2 == 1 && у % 2 == 1) || (х % 2 == 0 && у % 2 == 0)) {
            System.out.println("Ход доступен для пешки на черном поле");
        } else {
            System.out.println("Ход недоступен для пешки");
        }
    }

    @Override
    public void colourChecker(boolean colour) {
        super.colourChecker(colour);
    }
}