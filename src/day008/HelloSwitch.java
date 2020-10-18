package day008;

public class HelloSwitch {
    public static void main(String[] args) {
        int noteHalfYear = 2;

        System.out.println("Your input was: " + noteHalfYear);

        System.out.println(bonus(noteHalfYear));
    }

    private static String bonus(int note) {
        String result = "";


        switch (note) {
            case 5:
                result = "Bicycle";
                break;
            case 4:
                result = "GoPro7";
                break;
            case 3:
                result = "No bonus";
                break;
            case 2:
                result = "Sanction";
                break;
            case 1:
                result = "Apocalypse";
                break;
            default:
                result = "Illegal input";
                break;
        }
        return result;
    }
}
