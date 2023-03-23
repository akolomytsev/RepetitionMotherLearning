package kolomytsev.course2.three;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Кол", "Веревка","Яблоко", "Вишня", "Ванна", "Виталик", "Веревка", "Вишня", "Веревка", "Веревка", "Кол", "Кол", "Кол", "Патисон", "Виталик", "Вишня", "Колесо", "Виталик", "Вишня");
        System.out.println(listString);
        Collections.sort(listString);
        System.out.println(listString);
        String [] l = listString.toArray(new String[0]);
        //String l[] = (String[]) listString.toArray();
        for (String s : l) {
            System.out.print(s + " ");
        }
        System.out.println();


        int count = 0;
        for (int i = 0; i < listString.size() - 1; i++) {
            count++;
            if (!listString.get(i).equals(listString.get(i + 1))) {
                System.out.println("Количество слов " + listString.get(i) + " = " + count);
                count = 0;
            }
            if (i == listString.size() - 2) {
                count++;
                System.out.print("Количество слов " + listString.get(i + 1) + " = " + count);
                System.out.println();
            }
        }

        TreeMap<String, Integer> mapa = new TreeMap<>();
        for (String word : l){

            //mapa.put(word, mapa.getOrDefault(word, 0)+1);// возвращает количество повторяющихся слов
            mapa.put(word, count++);
        }
        System.out.print(mapa);



    }
}
