import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /**Company деген класс тузунуз, полелери (company name, country, year of foundation, founder, groups[]).
         Group деген класс тузунуз, полелери (group name, start date, mentor),ушул класс
         Company класска поле катары массив болуп барат
         Person деген класс тузунуз, полелери(first name, last name, date of birth) ушул класс
         Company жана Group класстарга поле катары барат.
         main ден класстардын объектин тузуп полелерине маани бериниз жана консольго чыгарыныз.*/

        Company company = new Company();


        company.name = "PeakSoft";
        company.country = "Kyrgyzstan";

        Group group = new Group();
        group.name = "Java";

        group.startDate = LocalDate.of(2023, 1, 3);

        Group group1 = new Group();
        group1.name = "JavaScript";

        group1.startDate = LocalDate.of(2023, 1, 3);


        Person person = new Person();
        person.firsName = "Esen";
        person.lastName = "Niazov";
        person.dateOfBirth = LocalDate.of(1995, 5, 21);

        Person person1 = new Person();
        person1.firsName = "Ulan";
        person1.lastName = "Kubanychbekov";
        person1.dateOfBirth = LocalDate.of(1996, 1, 13);

        Person person2 = new Person();
        person2.firsName = "Datka";
        person2.lastName = "Mamatzhanova";
        person2.dateOfBirth = LocalDate.of(2000, 9, 15);

        Person person3 = new Person();
        person3.firsName = "Mavliuda";
        person3.lastName = "Baktyiar kyzy";
        person3.dateOfBirth = LocalDate.of(1999, 3, 6);


        Person person4 = new Person();
        person4.firsName = "Nursutan";
        person4.lastName = "Kenzhebaev";
        person4.dateOfBirth = LocalDate.of(1999, 8, 19);

        Group[] groups = new Group[10];
        groups[0] = group;
        groups[1] = group1;

        Person[] people = new Person[10];
        people[0] = person;
        people[1] = person1;
        people[2] = person2;
        people[3] = person3;
        people[4] = person4;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (j == 1) {
                    System.out.println(company.getInfo(people[i]));
                }
                if (j == 2) {
                    System.out.println(company.getInfo1(people[i + 1], groups[0]));
                }
                if (j == 3) {
                    System.out.println(company.getInfo1(people[i + 2], groups[1]));
                }
            }
        }


    }


}