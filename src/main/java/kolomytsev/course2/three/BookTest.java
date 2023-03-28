package kolomytsev.course2.three;

public class BookTest {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = TelephoneBook.getInstance();

        telephoneBook.add("Иванов", "89509592387");
        telephoneBook.add("Иванов", "89509592388");
        telephoneBook.add("Иванов", "89509592389");
        telephoneBook.add("Иванов", "89509592390");
        System.out.println(telephoneBook.get("Иванов"));
        telephoneBook.add("Петров", "89509592390");
        telephoneBook.add("Петров", "89509592390");
        System.out.println(telephoneBook.get("Петров"));

        telephoneBook.getAll();
    }

}
