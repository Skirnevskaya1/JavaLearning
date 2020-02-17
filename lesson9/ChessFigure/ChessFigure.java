package ChessFigure;

public abstract class ChessFigure {
    protected int x;
    protected int y;

    public ChessFigure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move(int x, int y);

    public boolean isPossible(int x, int y) {
        return x > 0 && y > 0 && x < 9 && y < 9;
    }
}
