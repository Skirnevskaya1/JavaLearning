package Translator;

public class Binary extends Translator {

    @Override
    public void translate(Integer s) {
        String convert = Integer.toBinaryString(s);
        System.out.println(convert);
    }
}
