package ChessFigure;

class Main {
    public static void main(String[] args) {

        ChessFigure king = new King(4, 4);
        king.move(3, 5);
        king.move(4, 6);
        king.move(4, 7);
        king.move(-1, 5);
        System.out.println("---------------------");
        ChessFigure knight = new Knight(4, 4);
        knight.move(6, 3);
        knight.move(4, 6);
        knight.move(1, 7);
        knight.move(0, 7);
        System.out.println("---------------------");
        ChessFigure queen = new Queen(4, 4);
        queen.move(4, 4);
        queen.move(4, 8);
        queen.move(8, 8);
        queen.move(0, -1);
        queen.move(-8,-8);
        System.out.println("---------------------");
        ChessFigure bishop = new Bishop(4, 4);
        bishop.move(8, 8);
        bishop.move(6, 6);
        bishop.move(4, 8);
        bishop.move(0, 8);
        bishop.move(-2, 2);
        bishop.move(-8, -8);
        System.out.println("---------------------");
        ChessFigure pawn = new Pawn(4, 4);
        pawn.move(2, 4);
        pawn.move(4, 3);
        pawn.move(5, 4);
        pawn.move(5, 5);
        pawn.move(0, 1);
        System.out.println("---------------------");
        ChessFigure rook = new Rook(4, 4);
        rook.move(1, 4);
        rook.move(8, 4);
        rook.move(8, 8);
        rook.move(5, 4);
    }
}
