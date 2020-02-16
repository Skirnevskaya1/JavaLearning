package Checker;

import java.util.Objects;

class Move {
    private int dx;
    private int dy;

    public Move(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public boolean isPossible(int figureX, int figureY) {
        int x = dx + figureX;
        int y = dy + figureY;
//      System.out.println(x + " " + y);
        return x > 0 && y > 0 && x < 9 && y < 9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return dx == move.dx && dy == move.dy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy);
    }
}

