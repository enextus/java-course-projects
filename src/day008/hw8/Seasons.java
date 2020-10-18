package day008.hw8;

public class Seasons {
    public static void main(String[] args) {
        int monthNumber = 11; // Possible year month numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12.

        System.out.println("The month number is " + monthNumber + ". \n"
                + "Month season name: " + "\"" + seasonOfMonth(monthNumber) + "\"." );
    }

    private static String seasonOfMonth(int age) {

        String result;

        switch (age) {
            case 3:
            case 4:
            case 5:
                result = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                result = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                result = "Autumn";
                break;
            case 12:
            case 1:
            case 2:
                result = "Winter";
                break;
            default:
                result = "The season can not be displayed, because was not correct input of month number. Please repeat.";
                break;
        }

        return result;
    }
}
