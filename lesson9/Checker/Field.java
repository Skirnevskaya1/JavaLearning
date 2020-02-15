package Checker;

class Field {

    public static void main(String[] args) {
        SimpleChecker simpleChecker = new SimpleChecker();
        simpleChecker.move(2, 2);
        simpleChecker.colourChecker(true);
        System.out.println("-------------------------------");
        King king = new King();
        king.move(1, 2);
        king.colourChecker(false);
    }
}

