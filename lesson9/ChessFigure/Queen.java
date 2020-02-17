package ChessFigure;

public class Queen extends ChessFigure {

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);
        if (!(isPossible(x, y) && (((x != this.x) && (y != this.y) || (x == this.x) && (y != this.y) || (x != this.x) && (y == this.y))))) {
            System.out.println("Ход невозможен у ферзя");
        } else {
            System.out.println("Ход возможен у ферзя");
        }
    }
}
