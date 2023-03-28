package kolomytsev.course2.three.trytwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyTelephoneBook {
    private static MyTelephoneBook myTelephoneBook;

    Map<String, Set<String>> telephone;

    private MyTelephoneBook(){
        telephone = new HashMap<>();
    }

    public static MyTelephoneBook getTelephone(){
        if (myTelephoneBook == null){
            myTelephoneBook = new MyTelephoneBook();
        }
        return myTelephoneBook;
    }

    public void getAll(){
        System.out.println(telephone);
    }

    public Set<String> get(String name){
        return telephone.get(name);
    }

    public void add(String name, String number){
        if (!telephone.containsKey(name)) {
            telephone.put(name, new HashSet<>());
        }
        telephone.get(name).add(number);
    }
}
