package day012.hw012;

public class WeekdayTemperature {

    /**
     * Напишите программу, которая принимает название города и день недели и возвращает температуру.
     */

    public static void main(String[] args) {

        String cityName = "Минск";
        String weekDay = "Пятница";

        int multiplyingFactorForInputCheck = 1;

        if (multiplyingFactorForWeekDay(weekDay) == -1 || citiWeather(cityName, multiplyingFactorForInputCheck) == -1)
            System.out.println("Input data is incorrect, please try again.");
        else
            System.out.println("Temperature in " + cityName
                    + " at " + weekDay + " is "
                    + citiWeather(cityName, multiplyingFactorForWeekDay(weekDay)) + "° Celsius.");

        // Test case "Минск"
        // citiWeather("Минск", "Пятница") -> 22
        // Temperature in Минск at Пятница is 22° Celsius.
        //
        //  String cityName = "Rинск";
        //  String weekDay = "Пятница";
        // Input data is incorrect, please try again.
        //
        //  String cityName = "Минск";
        //  String weekDay = "Rятница";
        // Input data is incorrect, please try again.

    }

    private static int citiWeather(String name, int multiplyingFactor) {

        int result;

        switch (name) {
            case "Берлин":
                result = 20 + multiplyingFactor;
                break;
            case "Лондон":
                result = 17 + multiplyingFactor;
                break;
            case "Лиссабон":
                result = 25 + multiplyingFactor;
                break;
            case "Париж":
                result = 23 + multiplyingFactor;
                break;
            case "Москва":
                result = 19 + multiplyingFactor;
                break;
            case "Минск":
                result = 18 + multiplyingFactor;
                break;
            case "Саратов":
                result = 15 + multiplyingFactor;
                break;
            default:
                result = -1;
                break;
        }

        return result;
    }

    private static int multiplyingFactorForWeekDay(String name) {

        int result;

        switch (name) {
            case "Понедельник":
                result = 0;
                break;
            case "Вторник":
                result = 1;
                break;
            case "Среда":
                result = 2;
                break;
            case "Четверг":
                result = 3;
                break;
            case "Пятница":
                result = 4;
                break;
            case "Суббота":
                result = 5;
                break;
            case "Воскресенье":
                result = 6;
                break;
            default:
                result = -1;
                break;
        }

        return result;
    }
}
