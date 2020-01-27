/**
 * Created by User on 18.01.2020.
 */
public class Fraction {

    public static void main(String[] args) {
        Fraction f = new Fraction(1, 2, 6);
        Fraction f2 = new Fraction(1, 3, 6);

        Fraction a = f.addition(f2);
        Fraction b = f.multiplication(f2);
        Fraction c = f.division(f2);
    }

    private int intPart; // целая часть дроби
    private int numerator; // числитель
    private int denominator; // знаменатель

    public Fraction(int intPart, int numerator, int denominator) {
        this.intPart = intPart;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction multiplication(Fraction f2) {//умножение
        double resultIntPart = 1;
        double resultNumerator = (intPart * denominator + numerator) * (f2.intPart * f2.denominator + f2.numerator);
        double resultDenominator = denominator * f2.denominator;
        System.out.println("Multiplication : " + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
        return f2;
    }

    public Fraction division(Fraction f2) {//деление дробей
        double resultNumerator = (intPart * denominator + numerator) * f2.denominator;
        double resultDenominator = denominator * (f2.intPart * f2.denominator + f2.numerator);
        double resultIntPart = 1;
        System.out.println("Division : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
        return f2;
    }

    public void subtraction(Fraction f2) { //вычитание дробей

        if (((gcd(intPart, numerator, denominator) / denominator) * numerator) < ((gcd(f2.intPart, f2.numerator, f2.denominator) / f2.denominator) * f2.numerator)) {
            double resultIntPart = (intPart - 1) - f2.intPart;
            double resultNumerator = ((denominator + (gcd(intPart, numerator, denominator) / denominator) / denominator) * numerator) - ((gcd(f2.intPart, f2.numerator, f2.denominator) / f2.denominator) * f2.numerator);
            System.out.println("Subtraction : " + resultIntPart + "*" + resultNumerator + " / " + gcd(intPart, numerator, denominator) / denominator);
        } else {
            double resultIntPart = intPart - f2.intPart;
            double resultNumerator = ((gcd(intPart, numerator, denominator) / denominator) * numerator) - ((gcd(intPart, numerator, denominator) / f2.denominator) * f2.numerator);
            double resultDenominator = gcd(intPart, numerator, denominator);
            System.out.println("Subtraction : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
            System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
        }
    }

    public Fraction addition(Fraction f2) {

        double resultIntPart = intPart + f2.intPart;

        double resultNumerator = (f2.denominator / gcd(f2.intPart, f2.numerator, f2.denominator) + denominator / gcd(intPart, numerator, denominator));
        double resultDenominator = denominator;
        System.out.println("Addition : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
        return f2;
    }

    //НОД
    private static double gcd(double numerator, double denominator, double intPart) {
        while (denominator != 0) {
            double tmp = (intPart * numerator) % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    //сокращение дроби
    public String reduction(double intPart, double numerator, double denominator) {
        double n = gcd(numerator, denominator, intPart);
        numerator = (intPart * numerator) / n;
        denominator = denominator / n;
        return "Reduction -> " + intPart + " * " + numerator + " / " + denominator;
    }

    //выделение целой части
    public String selectIntPart(double intPart, double numerator, double denominator) {
        if (numerator >= denominator) {
            intPart = (intPart - 1) + (numerator / denominator);
            numerator %= denominator;
        }
        return "Select Int Part -> " + intPart + " * " + numerator + " / " + denominator;
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }

    public void print() {

    }

}
