package kolomytsev.course1.three;

import java.util.Objects;
import java.util.Scanner;
//Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
// "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
// "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает
// его с загаданным словом и сообщает, правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.
public class TaskTwo {
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    static int n = (int)(Math.random() * words.length);
    static String stringRandom = words[n];
    static String stringPrint;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(stringRandom);
        System.out.printf("Загадано слово.%nПопробуйте отгадать!!!%n");
        hiddenWord(stringPrint, stringRandom);
    }
    public static void hiddenWord(String stringPrint, String stringRandom) {
        while (true){
            stringPrint = scanner.nextLine();
            if (Objects.equals(stringRandom, stringPrint)) {
                System.out.println("Вы угадали!!!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i <= stringPrint.length()-1 && i <= stringRandom.length()-1){
                        if (stringRandom.charAt(i) == stringPrint.charAt(i)) {
                            System.out.print(stringPrint.charAt(i));
                        } else if (stringRandom.charAt(i) != stringPrint.charAt(i)) {
                            System.out.print("#");
                        }
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
                System.out.println("Попробуйте еще раз");
            }
        }

    }
}
