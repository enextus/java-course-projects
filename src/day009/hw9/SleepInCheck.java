package day009.hw9;

public class SleepInCheck {
    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep-in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.
     */

    public static void main(String[] args) {

        boolean weekday = false;
        boolean vacation = true;

        System.out.println(sleepIn(weekday, vacation));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation; // "Es wird ein "True-Wert" zurückgeliefert, wenn es gerage kein Arbeitstag ist oder wenn es gerade ein Urlaubstag ist."
    }
}

