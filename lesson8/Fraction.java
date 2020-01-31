public class Fraction {

    public static void main(String[] args) {
        Fraction f = new Fraction(1, 2);
        f.print();
        Fraction f2 = new Fraction(1, 4);
        f2.print();
        System.out.println("------------------------------------");
        f.addition(f2);
        System.out.print("Addition : ");
        f.print();
        System.out.print("Reduction : ");
        f.reduction();
        f.print();
        System.out.println("------------------------------------");
        f.subtraction(f2);
        System.out.print("Subtraction : ");
        f.print();
        System.out.print("Reduction : ");
        f.reduction();
        f.print();
        System.out.println("------------------------------------");
        f.multiplication(f2);
        System.out.print("Multiplication : ");
        f.print();
        System.out.print("Reduction : ");
        f.reduction();
        f.print();
        System.out.println("------------------------------------");
        f.division(f2);
        System.out.print("Division : ");
        f.print();
        System.out.print("Reduction : ");
        f.reduction();
        f.print();


    }

    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void addition(Fraction f2) {
        numerator = (numerator * f2.denominator) + (f2.numerator * denominator);
        denominator *= f2.denominator;
    }

    public void subtraction(Fraction f2) {
        numerator = (numerator * f2.denominator) - (f2.numerator * denominator);
        denominator = f2.denominator * denominator;
    }

    public void multiplication(Fraction f2) {
        numerator *= f2.numerator;
        denominator *= f2.denominator;
        f2.selectIntPart();
    }

    public void division(Fraction f2) {
        numerator *= f2.denominator;
        denominator *= f2.numerator;
    }


    private static double gcd(double numerator, double denominator) {
        while (denominator != 0) {
            double tmp = numerator % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    public void reduction() {
        double n = gcd(numerator, denominator);
        numerator /= n;
        denominator /= n;
    }

    public double selectIntPart() {
        return numerator / denominator;
    }

    public double conversion(Fraction f2) {
        return (double) (f2.numerator / f2.denominator);
    }

    public void print() {
        System.out.println(numerator + " / " + denominator + " = " + selectIntPart());
    }
}
