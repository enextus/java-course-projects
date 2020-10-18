package day006;

public class ClassWork {
    public static void main(String[] args) {
        String name01 = "Bob";
        System.out.println(helloName(name01));

        String name02 = "Alice";
        System.out.println(helloName(name02));

        String name03 = "X";
        System.out.println(helloName(name03));

    }

    public static String helloName(String userName) {
        return ("Hello " + userName +"!");
    }
}
