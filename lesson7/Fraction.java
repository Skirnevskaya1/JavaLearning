import java.util.Scanner;

/**
 * Created by User on 18.01.2020.
 */
public class Fraction {
    //Спроектируйте и реализуйте простейший класс, описывающий рациональную дробь.
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 20, 6);
        f.reduction();
        f.selectIntPart();
    }

    private int intPart; // целая часть дроби
    private int numerator; // числитель
    private int denominator; // знаменатель

    public Fraction(int intPart, int numerator, int denominator) {
        this.intPart = intPart;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //сокращение дроби
    public void reduction() {
        int a = numerator, b = denominator;
        int n = gcd(a, b, intPart);
        numerator = (intPart * numerator) / n;
        denominator = denominator / n;
        System.out.println("Введенная дробь: " + intPart + " * " + a + " / " + b);
        System.out.println("Reduction -> " + intPart + " * " + numerator + " / " + denominator);
    }

    //НОД
    private static int gcd(int numerator, int denominator, int intPart) {
        while (denominator != 0) {
            int tmp = (intPart * numerator) % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    //выделение целой части
    public void selectIntPart() {
        if (numerator >= denominator) {
            intPart = intPart + (numerator / denominator);
            numerator %= denominator;
            System.out.println("Select Int Part -> " + intPart + " * " + numerator + " / " + denominator);
        }
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }
}