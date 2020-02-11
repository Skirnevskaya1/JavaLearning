package Translator;

public class Main {
    public static void main(String[] args) {

        Translator binary = new BinaryTranslator();
        binary.translate(15);

        Translator roman = new RomanTranslator();
        roman.translate(15);
    }
}
