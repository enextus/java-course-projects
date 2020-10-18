package day012.hw012;

public class SundayTemperature {

    /**
     * Напишите программу, которая принимает название города и возвращает температуру в воскресение.
     * Пример:
     * citiWeather("Минск") -> 24.
     * *
     */

    public static void main(String[] args) {

        String cityName = "Минск";

        if (citiWeather(cityName) == -1) System.out.println("Please enter a correct city name.");
        else
            System.out.println("Sunday temperature in " + cityName + " is " + citiWeather(cityName) + "° Celsius.");

        // Test case "Минск"
        // citiWeather("Минск") -> 24.

    }

    private static int citiWeather(String name) {

        int result;
        int multiplyingFactor = 6;

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
}
