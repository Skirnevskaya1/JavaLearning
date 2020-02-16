package Checker;

public class King extends Checker {

    public King(int x, int y) {
        super(x, y);
        System.out.println("Дамка проинициализирована");
        addLegalMove(1,1);
    }
}
