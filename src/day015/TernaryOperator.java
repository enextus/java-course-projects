package day015;

public class TernaryOperator {

    public static void main(String[] args) {

        Boolean mamaPermission = false;

        System.out.println(myTernaryOperator());
    }

    private static String myTernaryOperator() {

        String result = (5 > 10) ? "Yes" : "No";
        return result;
    }
}
