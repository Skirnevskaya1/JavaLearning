package ChessFigure;

public class Knight extends ChessFigure {

    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Хожу на эти координаты--> " + x + ":" + y + ",  местонахождение --> " + this.x + ":" + this.y);
        if (isPossible(x, y) && ((Math.abs(x - this.x) == 2 && Math.abs(y - this.y) == 1) || (Math.abs(x - this.x) == 1 && Math.abs(y - this.y) == 2))) {
            System.out.println("Ход возможен у коня");
        } else {
            System.out.println("Ход невозможен у коня");
        }

    }
}
