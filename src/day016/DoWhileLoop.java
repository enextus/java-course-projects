package day016;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 10;

        do {
            
            // this part of loop will be everytime executed
            // regardless of the result of checking the condition

            System.out.println("i: " + i);
            i++;

        } while (i < 20);
    }
}
