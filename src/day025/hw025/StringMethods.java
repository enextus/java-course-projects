package day025.hw025;

public class StringMethods {

    /**
     * A learning of String methods with code examples.
     */

    public static void main(String[] args) {

        // charAt()
        // The char value at the specified index of this string. The first char value is at index 0.
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " + (char) index1);
        System.out.println("The character at position 10 is " + (char) index2);
        System.out.println();

        // The codePointAt()
        // method is used to get the character (Unicode code point) at the specified index.
        // The index refers to char values (Unicode code units) and ranges from 0 to length()- 1.
        String str1 = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original String : " + str1);

        // codepoint at index 1
        int val1 = str1.codePointAt(1);

        // codepoint at index 9
        int val2 = str1.codePointAt(9);

        // prints character at index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character at index9 in string
        System.out.println("Character(unicode point) = " + val2);
        System.out.println();

        // codePointBefore()
        // The codePointBefore() method is used to get a character (Unicode code point) before the specified index.
        // The index refers to char values (Unicode code units) and ranges from 1 to length.
        // If the char value at (index - 1) is in the low-surrogate range, (index - 2) is not negative,
        // and the char value at (index - 2) is in the high-surrogate range,
        // then the supplementary code point value of the surrogate pair is returned.
        // If the char value at index - 1 is an unpaired low-surrogate or a high-surrogate, the surrogate value is returned.
        String str3 = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original String : " + str3);

        // codepoint before index 1
        int val11 = str3.codePointBefore(1);

        // codepoint before index 9
        int val21 = str3.codePointBefore(9);

        // prints character before index1 in string
        System.out.println("Character(unicode point) = " + val11);
        // prints character before index9 in string
        System.out.println("Character(unicode point) = " + val21);
        System.out.println();

        // codePointCount(int beginIndex, int endIndex)
        // The codePointCount() method is used to count the number of Unicode code points in the specified text range of a given String.
        // The text range begins at the specified beginIndex and extends to the char at index endIndex - 1.
        // Thus the length (in chars) of the text range is endIndex-beginIndex.
        // Unpaired surrogates within the text range count as one code point each.
        String str4 = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original String : " + str4);

        // codepoint from index 1 to index 10
        int ctr = str4.codePointCount(1, 10);

        // prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);
        System.out.println();

        // concat()
        // The concat() method is used to concatenate a given string to the end of another string.
        // If the length of the argument string is 0, then this String object is returned.
        // Otherwise, a String object is returned that represents a character sequence that is the concatenation
        // of the character sequence represented by this String object and the character sequence represented by the argument string.
        String str5 = "The quick brown fox ";
        String str6 = "jumps over the lazy dog";
        System.out.println();
        System.out.println("String 1: " + str5);
        System.out.println("String 2: " + str6);


        // compareToIgnoreCase()
        // The compareToIgnoreCase() method compares two strings lexicographically, ignoring case differences.
        // This method returns an integer whose sign is that of calling compareTo with normalized versions
        // of the strings where case differences have been eliminated by calling Character.toLowerCase(Character.toUpperCase(character)) on each character.
        // Note: This method does not take locale into account, and will result in an unsatisfactory ordering for certain locales.
        // The java.text package provides collators to allow locale-sensitive ordering.
        String str8 = "The quick brown fox jumps over the lazy dog";
        String str9 = "the quick brown fox JUMPS over the lazy Dog";

        System.out.println("String 1: " + str8);
        System.out.println("String 2: " + str9);

        // Compare the two strings.
        int result = str8.compareToIgnoreCase(str9);

        // Display the results of the comparison.
        if (result < 0) {
            System.out.println("\"" + str8 + "\"" +
                    " is less than " +
                    "\"" + str9 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str8 + "\"" +
                    " is equal to " +
                    "\"" + str9 + "\"");
        } else // if (result > 0)
        {
            System.out.println("\"" + str8 + "\"" +
                    " is greater than " +
                    "\"" + str9 + "\"");
        }
        System.out.println();

        // Concatenate the two strings together.
        String str7 = str5.concat(str6);

        // Display the new String.
        System.out.println("The concatenated string: " + str7);
        System.out.println();

        // contains(CharSequence s)
        // The contains() method returns true if and only if this string contains the specified sequence of char values.
        String str10 = "The quick brown fox jumps over the lazy dog";
        String str11 = "over";
        System.out.println();
        System.out.println("Original String: " + str10);
        System.out.println("Specified sequence of char values: " + str11);
        System.out.println(str1.contains(str11));
        System.out.println();

        // endsWith(String suffix)
        // The endsWith() method is used to check if a specified string ends with the specified suffix.
        String str12 = "The quick brown fox jumps";
        String str13 = "The quick brown fox jump";

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = "mp";

        // Check first two Strings end with end_str
        boolean ends1 = str12.endsWith(end_str);
        boolean ends2 = str13.endsWith(end_str);
        System.out.println();
        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str13 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);
        System.out.println();

        // equals(Object anObject)
        // The equals() method is used to compare a given string to the specified object.
        // The result is true if and only if the argument is not null and is a String object that represents
        // the same sequence of characters as this object.
        String columnist1 = "Walter Winchell";
        String columnist2 = "John Gilbert";
        String columnist3 = "Stephen Edwin King";

        // Are any of the above Strings equal to one another?
        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);
        System.out.println();
        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist3 + "\"? " + equals2);
        System.out.println();

        // equalsIgnoreCase()
        // The equalsIgnoreCase() Method is used to compare a specified String to another String, ignoring case considerations.
        // Two strings are considered equal ignoring case if they are of the same length and corresponding characters
        // in the two strings are equal ignoring case.
        String columnist11 = "Stephen Edwin King";
        String columnist21 = "John Gilbert";
        String columnist31 = "stephenedwin king";

        // Test any of the above Strings equal to one another
        boolean equals11 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals21 = columnist1.equalsIgnoreCase(columnist3);
        System.out.println();
        // Display the results of the equality checks.
        System.out.println("\"" + columnist11 + "\" equals \"" +
                columnist21 + "\"? " + equals11);
        System.out.println("\"" + columnist11 + "\" equals \"" +
                columnist31 + "\"? " + equals21);
        System.out.println();

        // indexOf(int ch)
        // Returns the index within this string of the first occurrence of the specified character.
        // If a character with value ch occurs in the character sequence represented by this String object, then the index (in Unicode code units) of the first such occurrence is returned. For values of ch in the range from 0 to 0xFFFF (inclusive), this is the smallest value k such that:
        // this.charAt(k) == ch
        //
        // is true. For other values of ch, it is the smallest value k such that:
        //
        // this.codePointAt(k) == ch
        //
        // is true. In either case, if no such character occurs in this string, then -1 is returned.
        String strIn = "The quick brown fox jumps over the lazy dog.";

        // Get the index of all the characters of the alphabet
        // starting from the beginning of the String.
        int a = strIn.indexOf("a", 0);
        int b = strIn.indexOf("b", 0);
        int c = strIn.indexOf("c", 0);
        int d = strIn.indexOf("d", 0);
        int e = strIn.indexOf("e", 0);
        int f = strIn.indexOf("f", 0);
        int g = strIn.indexOf("g", 0);
        int h = strIn.indexOf("h", 0);
        int i = strIn.indexOf("i", 0);
        int j = strIn.indexOf("j", 0);
        int k = strIn.indexOf("k", 0);
        int l = strIn.indexOf("l", 0);
        int m = strIn.indexOf("m", 0);
        int n = strIn.indexOf("n", 0);
        int o = strIn.indexOf("o", 0);
        int p = strIn.indexOf("p", 0);
        int q = strIn.indexOf("q", 0);
        int r = strIn.indexOf("r", 0);
        int s = strIn.indexOf("s", 0);
        int t = strIn.indexOf("t", 0);
        int u = strIn.indexOf("u", 0);
        int v = strIn.indexOf("v", 0);
        int w = strIn.indexOf("w", 0);
        int x = strIn.indexOf("x", 0);
        int y = strIn.indexOf("y", 0);
        int z = strIn.indexOf("z", 0);

        // Display the results of all the indexOf method calls.
        System.out.println(" a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                e + " " + f + " " + g + " " + h + " " +
                i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                o + " " + p + " " + q + " " + r + " " +
                s + " " + t + "\n");

        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                y + " " + z);


    }
}
