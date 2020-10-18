package day003;

public class HelloPi {
        public static void main(String[] args){
            double pi = 3.14;
            double radius = 5.5;

            System.out.println(pi * radius * radius);

            final double PI2 = 3.4;    // константа

            pi = pi * 1;

            System.out.println(pi);
            // PI2 = PI2 +1;   // константа

            double var1 = 1_000_000.0;
            // 1,0E+6

            double pi3 = Math.PI;
            double var2 = Math.pow(2, 3);  // возведение в степень через метод Java

            System.out.println(pi3);
            System.out.println(var2);
        }
}
