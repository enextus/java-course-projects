package day016.hw016;

public class SomeCastTests {

    /**
     * String alphabetCyrillic = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
     * String alphabetLatin = "abcdefghijklmnopqrstuvwxyz";
     * *
     * char ch = 'a';
     * int ascii = ch;
     * *
     * // You can also cast char to int
     * int castAscii = (int) ch;
     * *
     * System.out.println("The ASCII value of " + ch + " is: " + ascii);
     * System.out.println("The ASCII value of " + ch + " is: " + castAscii);
     * *
     * int chr = 'Z';
     * *
     * System.out.println("The ASCII value of Z is :" + chr);
     * System.out.println("The ASCII value of Z is :" + (chr + 3));
     * System.out.println("The ASCII Symbol of code " + (chr + 3) + " is " + (char) (chr) + (char) (chr + 3));
     */

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        int castAscii = (int) ch; // You can also cast char to int

        char chTwo = (char) ascii;
        char chThree = (char) castAscii;

        System.out.println("char ch = " + ch);
        System.out.println("int ascii = " + ascii);
        System.out.println("int castAscii = " + castAscii);

        System.out.println("char chTwo = " + chTwo);
        System.out.println("char chThree = " + chThree);

        intToString();
        magicChar();

    }

    private static void intToString() {

        int x = 25;

        String result = String.valueOf(x);
        System.out.println(result);
    }

    private static void magicChar() {

        char c1 = 'я';

        System.out.println(c1);
        System.out.println(c1 + "");
        System.out.println("" + c1);
        System.out.println(c1 + "" + c1);
        System.out.println(c1 + 10);

        System.out.println('я' + 'я');  // char
        System.out.println("я" + "я"); // String

        System.out.println(c1 + 0); // насильное кастование char to String

    }
}
