package ChessFigure;

class Field {
    private ChessFigure[][] chessboard = new ChessFigure[8][8];
    for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
   // private static int whiteColour = 0, blackColour = 0;

}
