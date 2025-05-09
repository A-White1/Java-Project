package Task_3;

public class PhoneBookEntry {
    String fullName;
    String phoneNumber;
    String email;
    String address;

    public PhoneBookEntry(String fullName, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Phone_Book_Entry | " + "\n" +
                "Full Name: " + fullName + "\n" +
                "Phone Number: " +phoneNumber + "\n"+
                "Email: " + email + "\n"+
                "Address: " + address + "\n";
    }
}
