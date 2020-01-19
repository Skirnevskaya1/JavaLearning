/**
 * Created by User on 18.01.2020.
 */
public class Fraction {
    //Спроектируйте и реализуйте простейший класс, описывающий рациональную дробь.
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 4, 0, 1);
    }

    int intPart; // целая часть дроби
    int numerator; // числитель
    int denominator; // знаменатель
    int sign; // знак дроби

    public Fraction(int n, int d, int i, int s) {
        intPart = i;
        numerator = n;
        denominator = d;
        sign = s;
    }

    //сокращение дроби
    public void Cancellation() {
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
    public void GetIntPart() {
        if (numerator >= denominator) {
            intPart = (numerator / denominator);
        }

    }

    //знак дроби
    public void operator(int sign) {
        if (numerator < 0 || denominator < 0) {
            this.sign = -sign;
        }
        if (numerator < 0 && denominator < 0) {
            this.sign = sign;
        }
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) fraction.sign * (fraction.numerator / fraction.denominator);
        return res;
    }
}
