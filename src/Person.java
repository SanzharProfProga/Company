import java.time.LocalDate;

public class Person {
    String firsName;
    String lastName;
    LocalDate dateOfBirth;

    String getInfo() {
        return "First name: " + firsName +
                "\nLast name: " + lastName +
                "\nDate of birth: " + dateOfBirth;
    }
}
