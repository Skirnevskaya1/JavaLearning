/**
 * Created by User on 18.01.2020.
 */
public class Fraction {
    //Спроектируйте и реализуйте простейший класс, описывающий рациональную дробь.
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 4, 0);
    }

    int intPart; // целая часть дроби
    int numerator; // числитель
    int denominator; // знаменатель

    private Fraction(int intPart, int numerator, int denominator) {
        this.intPart = intPart;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //сокращение дроби
    public void reduction() {
        if (numerator != 0) {
            int ost = denominator % numerator;
            while (ost != 0) {
                denominator = numerator;
                numerator = ost;
                ost = denominator % numerator;
            }
            int n = numerator;
            if (n != 1) {
                numerator /= n;
                denominator /= n;
            }
        }
    }

    //выделение целой части
    public void getIntPart() {
        if (numerator >= denominator) {
            intPart = (numerator / denominator);
        }
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }
}
