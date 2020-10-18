package day006;

public class HelloString {
    public static void main(String[] args) {
        String student1, student2;
        final double PI = Math.PI; // constant every time will use initials

        student1 = "Student 01";
        student2 = "Student 02";

        helloUser(student1);
        helloUser(student2);
        helloUser("Andrei");

        char c1 = 150;
        char c2 = (char) (c1 + 20);

        System.out.println(c1);

    }

    public static void helloUser(String username) {
        System.out.println("Hello " + username + "!");

    }
}
