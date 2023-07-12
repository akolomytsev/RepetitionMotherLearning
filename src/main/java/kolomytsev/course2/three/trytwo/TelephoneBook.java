package kolomytsev.course2.three.trytwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneBook {
    private static TelephoneBook instance;

    Map<String, Set<String>> telephone;

    private TelephoneBook(){
        telephone = new HashMap<>();
    }

    public static TelephoneBook getInstance(){
        if (instance == null){
            instance = new TelephoneBook();
        }
        return instance;
    }

    public void getAll(){
        System.out.println(telephone);
    }

    public Set<String> get(String name){
        return telephone.get(name);
    }

    public void add(String name, String number){
        if (!telephone.containsKey(name)){
            telephone.put(name,new HashSet<>());
        }
        telephone.get(name).add(number);
    }
}
