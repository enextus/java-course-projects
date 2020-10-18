package day007;

public class Logic01Two {
    public static void main(String[] args) {
        boolean bellOne = true;
        boolean bellTwo = false;

        System.out.println(doorBell(bellOne, bellTwo));

        boolean electric = true;
        boolean internet = true;

        System.out.println(smartDoorCheckKey(electric, internet));
    }

    public static boolean doorBell(boolean bellOne, boolean bellTwo) {
        //
        return bellOne || bellTwo;
    }

    public static boolean smartDoorCheckKey(boolean electric, boolean internet) {
        //
        return !(electric || internet);
    }
}
