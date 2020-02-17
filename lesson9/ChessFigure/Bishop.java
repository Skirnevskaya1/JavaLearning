package ChessFigure;

public class Bishop extends ChessFigure {

    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);
        if (isPossible(x, y) && (Math.abs(x - this.x) == Math.abs(y - this.y))) {
            System.out.println("Ход возможен у слона");
        } else {
            System.out.println("Ход невозможен у слона");
        }

    }
}
