package day004.hw4;

public class PersonalData {
    public static void main(String[] args) {
        String name = "Dirk";
        String surname = "Peger";
        String address = "862 Watson Way";
        String zipCode = "11013";
        String state = "North Rhine-Westphalia";
        String country = "Germany";
        String email = "fhdirk7@yopmail.com";
        String phone = "+49(353)-3993207";

        String consoleOutput = "Name: "
                + name + "\n"
                + "Surname: "
                + surname + "\n"
                + "Address: "
                + address + "\n"
                + "Zip Code: "
                + zipCode + "\n"
                + "State: "
                + state + "\n"
                + "Country: "
                + country + "\n"
                + "Email: "
                + email + "\n"
                + "Phone: "
                + phone + "\n";

        System.out.println(consoleOutput);
    }
}
