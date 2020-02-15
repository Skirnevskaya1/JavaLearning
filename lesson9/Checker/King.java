package Checker;

public class King extends Checker {

    @Override
    public void move(int х, int у) {
        if (х > 0 && у > 0 && х < 9 && у < 9 && (х % 2 == 1 && у % 2 == 1) || (х % 2 == 0 && у % 2 == 0)) {
            for (int i = 1; i <= х; i++) {
                for (int j = 1; j <= у; j++) {
                }
            }
            System.out.println("Ход доступен для дамки на черном поле");
        } else {
            System.out.println("Ход недоступен для дамки");
        }
    }

    @Override
    public void colourChecker(boolean colour) {
        super.colourChecker(colour);
    }
}
