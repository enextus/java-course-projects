package day007;

public class HelloBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b, c;
        b = false;

        c = a & b; // conjunction (JUNION) обобщение
        System.out.println("a & b: " + c);

        c = a | b; // "pipeline" disjunction  (DIS  JUNION) разобщение
        System.out.println("a | b: " + c);

        c = a ^ b; // XOR  Exclusive or or exclusive disjunction
        System.out.println("a ^ b: " + c);

        c = a != b; //  negation, also called the logical complement
        System.out.println("a != b: " + c);

        introduction();
    }

    public static void introduction() {
        int a = 1;
        int b = 2;

        System.out.println(a > 2);
        System.out.println(a < 2);
        System.out.println(a == 2);
        System.out.println(a != 2);
    }
}
