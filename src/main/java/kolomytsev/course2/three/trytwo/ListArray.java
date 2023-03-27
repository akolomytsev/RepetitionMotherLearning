package kolomytsev.course2.three.trytwo;

import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> arrayLists = new ArrayList<>();
        arrayLists.add("Кол");
        arrayLists.add("Веревка");
        arrayLists.add("Ведро");
        arrayLists.add("Мыло");
        arrayLists.add("Колокол");
        arrayLists.add("Шпагат");
        arrayLists.add("Балерина");
        arrayLists.add("Василий");
        arrayLists.add("Терминатор");
        arrayLists.add("Ад");
        arrayLists.add("Кол");
        arrayLists.add("Веревка");
        arrayLists.add("Ведро");
        arrayLists.add("Мыло");
        arrayLists.add("Колокол");
        arrayLists.add("Шпагат");
        arrayLists.add("Балерина");
        arrayLists.add("Василий");
        arrayLists.add("Терминатор");
        arrayLists.add("Ад");
        //System.out.println(arrayLists);
        Collections.sort(arrayLists);
        System.out.println(arrayLists);


        String [] l = arrayLists.toArray(new String[0]);
//        Object[] wordsArray = arrayLists.toArray();
//        for (Object k: wordsArray) {
//            System.out.print(k + " ");
//        }
        System.out.println();

        for (String s : l) {
            System.out.print(s + " ");
        }
        System.out.println();


        int count = 0;
        for (int i = 0; i < arrayLists.size() - 1; i++) {
            count++;
            if (!arrayLists.get(i).equals(arrayLists.get(i + 1))) {
                System.out.println("Количество слов " + arrayLists.get(i) + " = " + count);
                count = 0;
            }
            if (i == arrayLists.size() - 2) {
                count++;
                System.out.print("Количество слов " + arrayLists.get(i + 1) + " = " + count);
                System.out.println();
            }
        }

        TreeMap<String, Integer> mapa = new TreeMap<>();
        for (String word : l){
            mapa.put(word, mapa.getOrDefault(word, 0)+1);// возвращает количество повторяющихся слов
        }
        System.out.print(mapa);
    }
}
