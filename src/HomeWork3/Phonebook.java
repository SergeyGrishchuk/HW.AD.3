package HomeWork3;

import java.util.*;

public class Phonebook {

    private HashMap<String, Set<Long>> phoneBook = new HashMap<>();

    public void add(String surname, Long phone){
        Set<Long> number = phoneBook.getOrDefault(surname, new HashSet<>());
        number.add(phone);
        phoneBook.put(surname, number);
    }

    public Set<Long> get(String surname) {
        return phoneBook.get(surname);
    }
}
