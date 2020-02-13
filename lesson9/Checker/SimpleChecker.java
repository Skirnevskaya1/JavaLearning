package Checker;

public class SimpleChecker extends Checker {

    @Override
    public void makeAMove(int х, int у) {
        int a1 = х + 1;
        int y1 = у + 1;
        int y2 = у - 1;
        if (х >= 1 && у > 1) {
            System.out.println("Ваш ход: (" + a1 + ";" + y1 + ")" + " или " + "(" + a1 + ";" + y2 + ")");
        } else if (х >= 1 && у == 1) {
            System.out.println("Ваш ход: (" + a1 + ";" + y1 + ")");
        }
    }

}
