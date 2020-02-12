package Checker;

class Field {
    private Field[][] chessBoard = new Field[8][8];
    private int whiteColour = 1, blackColour = 2;

    public Field(Field[][] chessBoard, int whiteColour, int blackColour) {
        this.chessBoard = chessBoard;
        this.whiteColour = whiteColour;
        this.blackColour = blackColour;
    }


}
