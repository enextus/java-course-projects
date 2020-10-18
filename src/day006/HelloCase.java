package day006;

public class HelloCase {
    public static void main(String[] args) {
        String phrase = "London is the capital of Great Britain";
        System.out.println(phrase);

        String phrase2 = phrase.toUpperCase();
        System.out.println(phrase2);

        String phrase3 = phrase.substring(0, 1).toUpperCase(); // zaglavnaja 1   L
        System.out.println(phrase3);
    }
}
