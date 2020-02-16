package Checker;

import java.util.ArrayList;

public abstract class Checker {
    protected int x;
    protected int y;
    protected ArrayList<Move> legalMoves = new ArrayList<Move>();

    public Checker(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addLegalMove(int dx, int dy) {
        legalMoves.add(new Move(dx, dy));
    }

    public void move(int х, int у) {
        System.out.println("Хожу на эти координаты--> " + х + ":" + у + ",  местонахождение --> " + this.x + ":" + this.y);
        Move step = new Move(х - this.x, у - this.y);
        for (Move move : legalMoves) {
            if (move.isPossible(this.x, this.y)) {
                if (move.equals(step)) {
                    System.out.println("Ход возможен!");
                    this.x += move.getDx();
                    this.y += move.getDy();
                    return;
                }
            }
        }
        System.out.println("Ход невозможен!");
    }
}
