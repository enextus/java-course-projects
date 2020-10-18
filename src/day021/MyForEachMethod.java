package day021;

public class MyForEachMethod {

    /**
     * names.forEach(name -> System.out.println(name));
     */

    public static void main(String[] args) {

        String[] names = new String[]{"aaa", "bbb", "ccc"};

        printArray(names);

        for (String name : names) {
            System.out.println("here: " + name);
        }
    }

    private static void printArray(String[] arr) {

        int c = 0;

        do {

            if (c == 0) System.out.print("Array: {");

            System.out.print(" " + arr[c] + ",");
            c++;

            if (c == arr.length) System.out.println("}.");

        } while (c < arr.length);
    }
}
