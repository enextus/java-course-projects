package day006;

public class HelloString2 {
    public static void main(String[] args) {
        String poem = "Test test test END";
        int dlina = poem.length();
        System.out.println("Dlina: " + dlina);

        String preview = poem.substring(0, 3);
        System.out.println("Substring: " + preview + "...");

        String preview2 = poem.substring(dlina - 3);
        System.out.println("preview2: " + preview2);

        char test = poem.charAt(0);
        System.out.println(test);

        char test2 = poem.charAt(dlina - 3); // wir können den Symbol an der bestimmte Position der Zeichkette finden
        System.out.println(test2);
    }
}
