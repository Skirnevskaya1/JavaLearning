/**
 * Created by User on 18.01.2020.
 */
public class Fraction {

    public static void main(String[] args) {
        Fraction f = new Fraction(5, 4);
        Fraction f2 = new Fraction(3, 6);
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
        f.subtraction(f2);
        System.out.print("Subtraction : ");
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
    }

    // числитель
    private double numerator;
    // знаменатель
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //умножение
    public void multiplication(Fraction f2) {
        numerator = numerator * f2.numerator;
        denominator = denominator * f2.denominator;
    }

    //деление дробей
    public void division(Fraction f2) {
         numerator = f2.denominator * numerator;
        denominator = f2.numerator *denominator;
    }

    //вычитание дробей
    public void subtraction(Fraction f2) {

        if (((gcd(numerator, denominator) / denominator) * numerator) < ((gcd(f2.numerator, f2.denominator) / f2.denominator) * f2.numerator)) {
            numerator = ((denominator + (gcd(numerator, denominator) / denominator) / denominator) * numerator) - ((gcd(f2.numerator, f2.denominator) / f2.denominator) * f2.numerator);
        } else {
            numerator = ((gcd(numerator, denominator) / denominator) * numerator) - ((gcd(numerator, denominator) / f2.denominator) * f2.numerator);
            denominator = gcd(numerator, denominator);
        }
    }
    //сложение
    public void addition(Fraction f2) {
        numerator = (numerator*f2.denominator) + (f2.numerator*denominator);
       denominator=f2.denominator*denominator;
    }

    //НОД
    private static double gcd(double numerator, double denominator) {
        while (denominator != 0) {
            double tmp = (numerator) % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    //сокращение дроби
    public void reduction(Fraction f2) {
        double n = gcd(numerator, denominator);
        numerator = numerator / n;
        denominator = denominator / n;
    }

    //выделение целой части
    public void selectIntPart(Fraction f2) {
        if (numerator >= denominator) {
            numerator %= denominator;
        }
    }

    //преобразование в double
    public double conversion(Fraction fraction) {
        double res = (double) (fraction.numerator / fraction.denominator);
        return res;
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }
}