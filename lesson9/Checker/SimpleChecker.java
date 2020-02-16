package Checker;

public class SimpleChecker extends Checker {

    public SimpleChecker(int x, int y) {
        super(x, y);
        addLegalMove(1, 1);
        addLegalMove(2, 2);
    }
}