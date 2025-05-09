package Task_3;

import java.util.Map;
import java.util.HashMap;

public class PhoneBook {

    Map<String, PhoneBookEntry> mapPhoneBook = new HashMap<>();

    //Inserts full name entry

    public void insertPB(String PhoneBookFullName, PhoneBookEntry phoneBookEntry){
        if(!mapPhoneBook.containsKey(PhoneBookFullName)){
            mapPhoneBook.put(PhoneBookFullName, phoneBookEntry);
        }


    }

    //Updates full name entry

    public void updatePB(String PhoneBookFullName, PhoneBookEntry phoneBookEntry){
        if(mapPhoneBook.containsKey(PhoneBookFullName)){
            mapPhoneBook.replace(PhoneBookFullName, phoneBookEntry);
        }

    }

    //Deletes full name entry

    public void deletePB(String PhoneBookFullName, PhoneBookEntry phoneBookEntry){
        if(mapPhoneBook.containsKey(PhoneBookFullName)) {
            mapPhoneBook.remove(PhoneBookFullName, phoneBookEntry);
        }

    }

    //Prints FullNameEntry

    public void printPBEntry(String PhoneBookFullName) {
        if (mapPhoneBook.containsKey(PhoneBookFullName)) {
            System.out.println(mapPhoneBook.get(PhoneBookFullName));
        }
    }

}
