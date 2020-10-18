package day005;

public class SalaryNew {
    public static void main(String[] args) {
        // Даны часы
        // Sidorov
        double hourSidorov = 100.5;
        double kSidorov = 1.9;

        // Petrov
        double hourPetrov = 155.5;
        double kPetrov = 1.1;

        findMySalary(hourSidorov, kSidorov);
        findMySalary(hourPetrov, kPetrov);

        findMySalary(150, 30);
    }

    private static void findMySalary(double hours, double k) {
        double minimalEuroPerHour = 9.26; // minimum salary per hour
        double result = hours * k * minimalEuroPerHour;

        System.out.println(
                "Salary: " + result
                        + " pri vyrabotke " + hours
                        + " i koeff " + k);
    }
}
