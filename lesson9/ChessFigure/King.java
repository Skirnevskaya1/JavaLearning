package ChessFigure;

public class King extends ChessFigure {

    public King(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);
        if (isPossible(x, y) && (Math.abs(x - this.x) <= 1 && Math.abs(y - this.y) <= 1)) {
            System.out.println("Ход возможен у короля");
        } else {
            System.out.println("Ход невозможен у короля");
        }

    }
}
