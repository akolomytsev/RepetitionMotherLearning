package kolomytsev.course2.three.trytwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookTelephone {
    private static BookTelephone instance;

    Map<String, Set<String>> book;

    private  BookTelephone(){
        book = new HashMap<>();
    }

    public static BookTelephone getInstance(){
        if (instance == null){
            instance = new BookTelephone();
        }
        return instance;
    }

    public void getAll(){
        System.out.println(book);
    }

    public Set<String> get(String name){
        return book.get(name);
    }

    public void add(String name, String number){
        if (!book.containsKey(name)){
            book.put(name, new HashSet<>());
        }
        book.get(name).add(name);
    }
}
