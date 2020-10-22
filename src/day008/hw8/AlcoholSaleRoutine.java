package day008.hw8;

public class AlcoholSaleRoutine {
    public static void main(String[] args) {
        int customerAge = 10; // Possible customer ages: 10, 17, 18, 20, 30 Years.

        System.out.println("The customer age is " + customerAge + " Years. \n"
                + "Seller decision: " + "\"" + agePermission(customerAge) + "\".");
    }

    private static String agePermission(int age) {

        String result;

        switch (age) {
            case 10:
            case 17:
            case 18:
                result = "The alcohol will be not sold.";
                break;
            case 20:
            case 30:
                result = "The alcohol will be sold.";
                break;
            default:
                result = "The alcohol will be not sold, because was not correct input of age. Please repeat.";
                break;
        }

        return result;
    }
}
