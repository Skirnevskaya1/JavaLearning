package Translator;

public class BinaryTranslator extends Translator {

    @Override
    public void translate(Integer s) {
        String convert = Integer.toBinaryString(s);
        System.out.println(convert);
    }
}
