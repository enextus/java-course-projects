package day004;

public class MyLovelyChar {
    public static void main(String[] args) {
        char dollar = '$';  //  строкоьый литерал, строковое значение
        System.out.println(dollar);

        char symbol = '€';
        System.out.println(symbol);

        String myDollar = "myDollar String $$$";
        System.out.println(myDollar);

        char digit = 100; // Decimal d
        System.out.println(digit);

        char octal = '\u03A6';   // Octal Φ
        System.out.println(octal);

        char tabulator = '\t';  // Tabulator
        System.out.println(tabulator);

        // The String class represents character strings.
        // All string literals in Java programs, such as "abc", are implemented as instances of this class.
        //Strings are constant; their values cannot be changed after they are created.
        // String buffers support mutable strings.
        // Because String objects are immutable they can be shared.
        // For example:

        String str1 = "abc";
        System.out.println(str1);

        char[] data = {'a', 'b', 'c'}; // char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);
        System.out.println(str2);
    }
}
