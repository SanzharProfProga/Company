import java.time.LocalDate;

public class Group {
    String name;
    LocalDate startDate;


    String showInfo(Person person) {
        return "Group name: " + name +
                "\nStart date: " + startDate +
                "\nMentor: " + person.getInfo() +
                "\n";
    }

}
