package day010;

public class HomeWorks {
    public static void main(String[] args) {
        int counter = 0;

        for (char character = 'A'; character <= 'Z'; character++) {
            System.out.print(character);
            counter += 1;

            if (counter % 4 == 0) System.out.print("\n");
        }
    }
}