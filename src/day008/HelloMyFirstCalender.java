package day008;

public class HelloMyFirstCalender {
    public static void main(String[] args) {
        String myVeryLovelyMonth = "April";
        System.out.println("Your month name was: " + myVeryLovelyMonth);
        System.out.println("Your month number is: " + getMonthNumber(myVeryLovelyMonth));

    }

    private static int getMonthNumber(String month) {
        int result = 0;

        switch (month) {
            case "January":
                result = 1;
                break;
            case "February":
                result = 2;
                break;
            case "Mars":
                result = 3;
                break;
            case "April":
                result = 4;
                break;
            case "May":
                result = 5;
                break;
            case "Juny":
                result = 6;
                break;
            case "July":
                result = 7;
                break;
            case "August":
                result = 8;
                break;
            case "Septembre":
                result = 9;
                break;
            case "Oktobre":
                result = 10;
                break;
            case "Novembre":
                result = 11;
                break;

            case "Decembre":
                result = 12;
                break;

            default:
                result = 0;
                break;
        }

        return result;
    }
}
