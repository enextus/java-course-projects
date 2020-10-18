package day006;

public class ClassWork2 {

    public static void main(String[] args) {
        String outLines01 = "<<>>";
        String userName01 = "Yay";
        String userName02 = "WooHoo";

        System.out.println(makeOutWord(outLines01, userName01));
        System.out.println(makeOutWord(outLines01, userName02));

        String outLines02 = "[[]]";
        String userName03 = "word";

        System.out.println(makeOutWord(outLines02, userName03));
    }

    public static String makeOutWord(String outLines, String userName) {
        String beginningOutline = outLines.substring(0, 2);
        String endingOutline = outLines.substring(2);

        return (beginningOutline + userName + endingOutline);
    }
}
