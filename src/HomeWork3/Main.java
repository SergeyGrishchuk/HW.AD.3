package HomeWork3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

                ArrayList<String> list = new ArrayList<>();
                list.addAll(Arrays.asList("apple", "orange", "lemon", "banana", "apricot",
                        "carrot", "cherry", "apple", "garlic", "kiwi",
                        "mango", "lemon", "olive"));

                Set<String> set = new LinkedHashSet<>();
                set.addAll(list);
                System.out.println(set);

                String[] arr = list.toArray(new String[0]);

                Map<String, Integer> map = new LinkedHashMap<>();
                for (int i = 0; i < list.size(); i++) {
                    Integer value = map.getOrDefault(arr[i], 0);
                    map.put(arr[i], value + 1);
                }
                System.out.println(map);

                Phonebook phonebook = new Phonebook();
                phonebook.add("Ivanov", 9035674849L);
                phonebook.add("Ivanov", 9156473829L);
                phonebook.add("Petrov", 7584930294L);
                phonebook.add("Petrov", 859223529235L);
                phonebook.add("Petrov", 85947923293L);
                phonebook.add("Sidorov", 8251589185L);

                System.out.println("Номер(-а) телефона(-ов): " + phonebook.get("Petrov"));
    }
}
