package kolomytsev.course2.three;

import java.util.*;

public class TelephoneBook {
    private static TelephoneBook instance;
    Map<String, Set<String>> telephone;

    private TelephoneBook(){
        telephone = new HashMap<>();
    }
    // пояснения

    public static TelephoneBook getInstance() {
        if (instance == null){
            instance = new TelephoneBook();
        }
        return instance;
    }
    public Set<String> get(String name){
        return telephone.get(name);
    }

    public void add(String name, String number){
        validate(number);
        if (!telephone.containsKey(name)){
            telephone.put(name, new HashSet<>());
        }
        telephone.get(name).add(number);
    }

    private void validate(String number){
        if (!number.matches("[0-9]{9,15}")){
            throw new IllegalArgumentException(number + "Неправильный телефонный номер");
        }
    }
}
