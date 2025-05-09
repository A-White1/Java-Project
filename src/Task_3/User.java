package Task_3;

public class User {
    public static void main(String[] args) {
        PhoneBookEntry entry1 = new PhoneBookEntry(
                "Aadam White", "0177834034", "aadam@gmail.com", "31 FakeStreet HD2 4QR");
        PhoneBookEntry entry2 = new PhoneBookEntry(
                "Ben S", "044632234", "bens@gmail.com", "82 FakeLane HD4 6RH");

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.insertPB("Aadam White", entry1); // Inserts Entry
        myPhoneBook.printPBEntry("Aadam White"); // Prints Entry

        myPhoneBook.insertPB("Ben S", entry2);
        myPhoneBook.printPBEntry("Ben S");

        myPhoneBook.deletePB("Aadam White", entry1); // Deletes Entry
        myPhoneBook.printPBEntry("Aadam White");

        myPhoneBook.updatePB("Bem S", entry1); // Updates Entry, changes its location
        myPhoneBook.printPBEntry("Ben S");

    }
}
