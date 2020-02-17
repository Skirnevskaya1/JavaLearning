package ChessFigure;

public class Pawn extends ChessFigure {


    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);

        if (x == this.x && y != 1) {
            if (isPossible(x, y) && (y == 2 && y + 2 == this.y || y + 1 == this.y))
                System.out.println("Ход возможен у пешки");
            else {
                System.out.println("Ход невозможен у пешки");
            }
        } else System.out.println("Ход невозможен у пешки");
    }
}
