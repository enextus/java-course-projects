package day018;

public class MyindexOf {

    public static void main(String[] args) {

        String hm = "Testword";

        // indexOf(int ch, int fromIndex)

        System.out.println(hm.indexOf("t"));
        System.out.println(hm.indexOf("d"));

        char tempOne = hm.charAt(7);
        System.out.println("char tempOne: " + tempOne);

        int temp = hm.charAt(7);
        System.out.println("temp: " + temp);

        char tempTwo = (char) temp;
        System.out.println("tempTwo: " + tempTwo);
    }
}
