/**
 * Created by User on 18.01.2020.
 */
public class Fraction {

    public static void main(String[] args) {
        Fraction f = new Fraction(1, 2, 6);
        Fraction f2 = new Fraction(1, 3, 6);
        f.multiplication(f2);
        System.out.print("Multiplication : ");
        f.print();
        System.out.print("Reduction -> ");
        f.reduction(f2);
        f.print();
        f.selectIntPart(f2);
        System.out.print("Select Int Part -> ");
        f.print();
        System.out.println("------------------------------------");
        f.division(f2);
        System.out.print("Division : ");
        f.print();
        System.out.print("Reduction -> ");
        f.reduction(f2);
        f.print();
        f.selectIntPart(f2);
        System.out.print("Select Int Part -> ");
        f.print();
        System.out.println("------------------------------------");
        f.addition(f2);
        System.out.print("Addition : ");
        f.print();
        System.out.print("Reduction -> ");
        f.reduction(f2);
        f.print();
        f.selectIntPart(f2);
        System.out.print("Select Int Part -> ");
        f.print();
        System.out.println("------------------------------------");
        f.subtraction(f2);
        System.out.print("Subtraction : ");
        f.print();
        System.out.print("Reduction -> ");
        f.reduction(f2);
        f.print();
        f.selectIntPart(f2);
        System.out.print("Select Int Part -> ");
        f.print();
    }

    private double intPart; // целая часть дроби
    private double numerator; // числитель
    private double denominator; // знаменатель


    public Fraction(double intPart, double numerator, double denominator) {
        this.intPart = intPart;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void multiplication(Fraction f2) {//умножение
        intPart = 1;
        numerator = (intPart * denominator + numerator) * (f2.intPart * f2.denominator + f2.numerator);
        denominator = denominator * f2.denominator;

    }

    public void division(Fraction f2) {//деление дробей
        intPart = 1;
        numerator = (intPart * denominator + numerator) * f2.denominator;
        denominator = denominator * (f2.intPart * f2.denominator + f2.numerator);
    }

    public void subtraction(Fraction f2) { //вычитание дробей

        if (((gcd(intPart, numerator, denominator) / denominator) * numerator) < ((gcd(f2.intPart, f2.numerator, f2.denominator) / f2.denominator) * f2.numerator)) {
            intPart = (intPart - 1) - f2.intPart;
            numerator = ((denominator + (gcd(intPart, numerator, denominator) / denominator) / denominator) * numerator) - ((gcd(f2.intPart, f2.numerator, f2.denominator) / f2.denominator) * f2.numerator);
        } else {
            intPart = intPart - f2.intPart;
            numerator = ((gcd(intPart, numerator, denominator) / denominator) * numerator) - ((gcd(intPart, numerator, denominator) / f2.denominator) * f2.numerator);
            denominator = gcd(intPart, numerator, denominator);
        }
    }

    public void addition(Fraction f2) {
        intPart = intPart + f2.intPart;
        numerator = (f2.denominator / gcd(f2.intPart, f2.numerator, f2.denominator) + denominator / gcd(intPart, numerator, denominator));
    }

    //НОД
    private static double gcd(double intPart, double numerator, double denominator) {
        while (denominator != 0) {
            double tmp = (intPart * numerator) % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    //сокращение дроби
    public void reduction(Fraction f2) {
        double n = gcd(intPart, numerator, denominator);
        numerator = (intPart * numerator) / n;
        denominator = denominator / n;
    }

    //выделение целой части
    public void selectIntPart(Fraction f2) {
        if (numerator >= denominator) {
            intPart = (intPart - 1) + (numerator / denominator);
            numerator %= denominator;
        }
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }

    public void print() {
        System.out.println(intPart + " * " + numerator + " / " + denominator);

    }

}
