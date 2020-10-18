package day026;

public class MyReturn {

    /**
     * Метки в Java (Java Labels)
     *
     */

    public static void main(String[] args) {

        boolean permission = true;
        boolean notPermission = false;

        quarantine(permission);
        quarantine(notPermission);

    }

    public static void quarantine(boolean quarantine) {

        quarantineZone:
        {
            if (quarantine) {
                return;
            }

            System.out.println("notPermission");
        }
    }
}
