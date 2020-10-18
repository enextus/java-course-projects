package day026;

public class MyBreak {

    public static void main(String[] args) {

        boolean permissions = true;

        quarantine(permissions);
    }

    public static void quarantine(boolean quarantine) {

        quarantineZone:
        {
            if (quarantine) {
                break quarantineZone;
            }
            System.out.println("We are here");
        }
    }
}
