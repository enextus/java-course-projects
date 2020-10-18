package day026;

public class MyLabel {

    public static void main(String args[]) {

        // Метки в Java могут использоваться для выхода из вложенных циклов. Это по сути GOTO в Java.
        // В данном случае не нужно создавать дополнительных "индикаторных" переменных и тем самым усложнять код.
        // Стандартный пример в данном случае:

        int i, j = 0;

        label:
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break label; // в этом случае мы break внешний цикл! Быстро и удобно.
                }
            }
        }

        System.out.println(i + " " + j);

        // __________________________________________________________________________________________________________

        // a joke!

        http:

        //google.com/

        System.out.println("Hello World!");
    }
}


// http://dr-magic.blogspot.com/2009/06/java-java-labels.html