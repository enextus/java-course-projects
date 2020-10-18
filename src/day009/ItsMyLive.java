package day009;

public class ItsMyLive {
    public static void main(String[] args) {
        int workWeekDays = 5;

        loop(workWeekDays);
        forIntroduction();
    }

    public static void loop(int workWeekDays) {
        // block
        {
            // область видимости, можно определять блоком
        }

        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("--------------------------------");
            System.out.println("New day.");
            System.out.println("New day.");
            System.out.println("New day.");
            System.out.println("New day.");
            System.out.println("New day.");
            System.out.println("New day.");
            System.out.println("New day.");
        }

        for (int i = 0; i < workWeekDays; i = i + 1) {
            System.out.println("--------------------------------");
            System.out.println("i = i + 1");
            System.out.println("--------------------------------");
        }

        for (int i = 0; i < workWeekDays; i += 1) {
            System.out.println("--------------------------------");
            System.out.println("i += 1");
            System.out.println("--------------------------------");
        }
    }

    public static void forIntroduction() {
        int a = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Print output.");
        }
    }
}
