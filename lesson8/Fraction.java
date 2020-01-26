import java.util.Scanner;

/**
 * Created by User on 18.01.2020.
 */
public class Fraction {
    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3, 4, 1, 1, 10);// дробь
        f.print();
    }

    private double intPart; // целая часть дроби 1
    private double numerator; // числитель 1
    private double denominator; // знаменатель 1

    private double intPart2; // целая часть дроби 2
    private double numerator2; // числитель 2 дроби
    private double denominator2; // знаменатель 2 дроби

    public Fraction(int intPart, int numerator, int denominator, int intPart2, int numerator2, int denominator2) {
        this.intPart = intPart;
        this.numerator = numerator;
        this.denominator = denominator;
        this.intPart2 = intPart2;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }

    //сокращение дроби
    private String reduction(double intPart, double numerator, double denominator) {
        double n = gcd(intPart, numerator, denominator);
        numerator /= n;
        denominator /= n;
        return "Reduction -> " + intPart + " * " + numerator + " / " + denominator;
    }

    //выделение целой части
    private String selectIntPart(double intPart, double numerator, double denominator) {
        if (numerator >= denominator) {
            intPart = (numerator / denominator);
            numerator -= denominator * intPart;
            this.intPart += intPart;
        }
        return "Select Int Part -> " + intPart + " * " + numerator + " / " + denominator;
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

    //НОД для знаменателей
    private static double gcd1(double denominator, double denominator2) {
        return denominator2 == 0 ? denominator : gcd1(denominator2, denominator % denominator2);
    }

    //НОК
    private static double noc(double denominator, double denominator2) {
        return denominator / gcd1(denominator, denominator2) * denominator2;
    }

    //преобразование в double
    public double toDouble(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }

    public void addition() { //сумма дробей
        double resultIntPart = intPart + intPart2;
        double den = noc(denominator, denominator2);
        double resultNumerator = ((den / denominator) * numerator) + ((den / denominator2) * numerator2);
        double resultDenominator = den;
        System.out.println("Addition : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
    }

    public void subtraction() { //вычитание дробей
        double den = noc(denominator, denominator2);
        if (((den / denominator) * numerator) < ((den / denominator2) * numerator2)) {
            double resultIntPart = (intPart - 1) - intPart2;
            double resultNumerator = ((denominator + (den / denominator) * numerator)) - ((den / denominator2) * numerator2);
            System.out.println("Subtraction : " + resultIntPart + "*" + resultNumerator + " / " + den);
        } else {
            double resultIntPart = intPart - intPart2;
            double resultNumerator = ((den / denominator) * numerator) - ((den / denominator2) * numerator2);
            double resultDenominator = den;
            System.out.println("Subtraction : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
            System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
        }
    }

    public void multiplication() {//умножение
        double resultNumerator = (intPart * denominator + numerator) * (intPart2 * denominator2 + numerator2);
        double resultDenominator = denominator * denominator2;
        double resultIntPart = 0;
        System.out.println("Multiplication : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
    }

    public void division() {//деление дробей
        double resultNumerator = (intPart * denominator + numerator) * denominator2;
        double resultDenominator = denominator * (intPart2 * denominator2 + numerator2);
        double resultIntPart = 0;
        System.out.println("Division : " + resultIntPart + "*" + resultNumerator + " / " + resultDenominator);
        System.out.println(reduction(resultIntPart, resultNumerator, resultDenominator) + "\n" + selectIntPart(resultIntPart, resultNumerator, resultDenominator));
    }

    public void print() {
        addition();
        System.out.println("*****************************************");
        subtraction();
        System.out.println("*****************************************");
        multiplication();
        System.out.println("*****************************************");
        division();
    }

}