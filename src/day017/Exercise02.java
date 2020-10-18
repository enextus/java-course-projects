package day017;

public class Exercise02 {

    /**
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     * <p>
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */

    public static void main(String[] args) {

        //
        String givenString = "codecodecode";
        String mask = "code";

        System.out.println("countCode: " + countCode(givenString, mask));
    }

    private static int countCode(String givenString, String mask) {

        System.out.println(givenString);
        System.out.println(mask);

        int count = 0;
        int endOfBlock = mask.length();

        System.out.println("endOfBlock: " + endOfBlock);

        for (int i = 0; i <= givenString.length(); i += mask.length()) {

            System.out.println("i: " + i);
            System.out.println("endOfBlock + 1: " + endOfBlock);
            System.out.println("givenString.substring(i, endOfBlock + 1): " + givenString.substring(i, endOfBlock));

//            if (givenString.substring(i, endOfBlock+1).contains(mask)) {
//                count++;
//            }
        }

        System.out.println("count: " + count);

        return count;
    }
}
