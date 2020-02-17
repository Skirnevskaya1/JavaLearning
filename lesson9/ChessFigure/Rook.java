package ChessFigure;

public class Rook extends ChessFigure {
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);
        if (isPossible(x, y) && (!((x != this.x) && (y != this.y)))) {
            System.out.println("Ход возможен у ладьи");
        } else {
            System.out.println("Ход невозможен у ладьи");
        }
    }
}
