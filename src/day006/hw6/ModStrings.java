package day006.hw6;

public class ModStrings {
    public static void main(String[] args) {

        String aOne = "last";
        String bOne = "chars";
        System.out.println(lastChar(aOne, bOne));

        String aTwo = "yo";
        String bTwo = "java";
        System.out.println(lastChar(aTwo, bTwo));

        String aThird = "hi";
        String bThird = "";
        System.out.println(lastChar(aThird, bThird));


        String aFourth = "";
        String bFourth = "";
        System.out.println(lastChar(aFourth, bFourth));

        String aFifth = "";
        String bFifth = "exercise";
        System.out.println(lastChar(aFifth, bFifth));
    }

    public static String lengthCheck(String stringToCheck) {

        if (stringToCheck.length() == 0) {
            String commercialAt = "@";
            stringToCheck += commercialAt;
        }
        
        return stringToCheck;
    }

    public static String lastChar(String a, String b) {

        String resultA = lengthCheck(a);
        String resultB = lengthCheck(b);

        String result = resultA.substring(0, 1) + resultB.substring(resultB.length() - 1);

        return result;
    }
}
