package kolomytsev.course2.three.trytwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyBook {
  private static MyBook instance;

  Map<String, Set<String>> book;

  private MyBook() {
    book = new HashMap<>();
  }

  public static MyBook myBook(){
    if(instance == null){
      instance = new MyBook();
    }
    return instance;
  }

  public void getAll(){
    System.out.println(book);;
  }

  public Set<String> get(String name){
    return book.get(name);
  }

  public void add(String name, String telephone){
    if (!book.containsKey(name)){
      book.put(name, new HashSet<>());
    }
    book.get(name).add(telephone);
  }
}
