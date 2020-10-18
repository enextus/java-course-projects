package day008;

public class SwitchCoffee {
    public static void main(String[] args) {
        int a = 1;

        vendingMachine(a);
    }

    private static void vendingMachine(int customerChoice) {
        switch (customerChoice) {
            case 1:
                System.out.println("Coffee type 1 will do");
                break;
            case 2:
                System.out.println("Water will boiled");
                break;
            case 3:
                System.out.println("Coffee type 2 will do");
                break;
            case 4:
                System.out.println("Coffee type 3 will do");
                break;
            case 5:
                System.out.println("Coffee type 4 will do");
                break;
            default:
                System.out.println("Please repeat your choice");
                break;
        }
        System.out.println("all should be ok"); // test output
    }
}
