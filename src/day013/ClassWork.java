package day013;

public class ClassWork {
    public static void main(String[] args) {
        String hausmeister = "Василий";

        int size = hausmeister.length();

        // System.out.println(hausmeister.charAt(size - 1));

        // System.out.println(hausmeister.charAt(0) + hausmeister.charAt(size - 1));

        // String output = "" + hausmeister.charAt(0) + hausmeister.charAt(size - 1); // String can be added

        // System.out.println(output);

        myCompareTo();
    }

    private static void myCompareTo() {

        String str1 = "Line One";
        String str2 = "Line Two";
        String str3 = "Line Three";

        int result = str1.compareTo(str2);
        int result2 = str2.compareTo(str3);

        System.out.println(result);
        System.out.println(result2);

        String s = Character.toString((char) result2);

        System.out.println("s = " + s);

    }
}
