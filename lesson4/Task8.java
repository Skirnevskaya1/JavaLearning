import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task8 {
    /*
    Дано число X. Требуется перевести это число в римскую систему счисления.
    Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).
    Выведите X в римской системе счисления.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int b= x%10;
        int a=x/10;

        if (x>=1 && x<=100) {
            switch (a) {
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
                case 10:
                    System.out.print("C");
                    break;
            }
            switch (b) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VII");
                    break;
                case 9:
                    System.out.print("X");
                    break;
            }
        }
        else System.out.print("Error");
    }
}
