package Translator;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        BigInteger x = new BigInteger(String.valueOf(scanner.nextBigInteger()));

        Binary binary = new Binary();
        binary.binaryNotation(x.toString(2));

        Roman roman = new Roman();
        roman.romanNumeralTranslation(x.intValue());
    }
}
