package kolomytsev.course1.five;

public class Main {
    public static void main(String[] args) {
        Employee mike = new Employee("Koka", "Mike","Jonovich", 36, "Killer", "mail@mail.com", 9509509595L, 90000);
        Employee[] persons = new Employee[5];
        persons[0] = new Employee("Koka", "Mike","Jonovich", 40, "Killer", "mail1@mail.com", 9509509596L, 90001);
        persons[1] = new Employee("Koka", "Alex","Jonoxich", 36, "Killer1", "mai2@mail.com", 9509509597L, 90002);
        persons[2] = new Employee("Koka", "Boris","Joxovich", 52, "Killer0", "mail3@mail.com", 9509509598L, 90003);
        persons[3] = new Employee("Koka", "Vladimir","Jonaxovich", 36, "Killer2", "mail4@mail.com", 9509509599L, 94000);
        persons[4] = new Employee("Koka", "Alexander","Jonpoovich", 76, "Killer4", "mail5@mail.com", 9509509594L, 950000);

        //mike.informationEmployee();


        for (Employee person : persons) {
            if (person.getAge() > 40) {
                person.informationEmployee();
                System.out.println();
                System.out.println(person.info());
            }

        }
    }
}
