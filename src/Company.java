import java.time.LocalDate;

public class Company {

    String name;
    String country;

    LocalDate yearOfFoundation = LocalDate.of(2020, 11, 15);

    Person founder = new Person();
    Group[] group = new Group[0];


    String getInfo(Person person) {
        return "\nCompany name: " + name +
                "\nAddress: " + country +
                "\nDate of foundation: " + yearOfFoundation +
                "\nFounder:\n" + person.getInfo() +
                "\n";
    }
    String getInfo1(Person person,Group group) {
        return "\n" + group.showInfo(person) +
                "\n";
    }

}
