package kolomytsev.course1.four;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Выберете размер игрового поля");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        start(r);
    }

    static void start(int r) {

        String[][] field = createAnArray(r);

        playingField(field);
        while (true) {
            playerTurn(field);


            if (conditionCheck(field, "X ")) {
                System.out.println("Бля, я победил");
                break;
            }
            computerTurn(field);
            if (conditionCheck(field, "O ")) {
                System.out.println("Бля, Он победил");
                break;
            }
        }


    }

    static boolean conditionCheck(String[][] field, String sign) {
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        boolean vertical = true;
        boolean horizontal = true;
        for (int i = 0; i < field.length; i++) {
            diagonal1 &= (field[i][i] == sign);//Objects.equals(field[i][i], sign);
            diagonal2 &= (field[i][field.length - i - 1] == sign);//Objects.equals(field[i][field.length - i - 1], sign);
            for (int j = 0; j < field[i].length; j++) {
                vertical &= (field[i][j] == sign);
                horizontal &= (field[j][i] == sign);
            }
            if (vertical || horizontal){
                return true;
            }
        }
        if (diagonal1 || diagonal2) {
            return true;
        }
        return false;
    }

    static void computerTurn(String[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != "- ");

        field[x][y] = "O ";
        playingField(field);
    }

    static void playerTurn(String[][] field) {
        int x, y;
        do {
            x = chooseCoordinate(field, 'X');
            y = chooseCoordinate(field, 'Y');

        } while (field[x][y] != "- ");

        field[x][y] = "X ";
        playingField(field);
    }

    static int chooseCoordinate(String[][] field, char sign) { //ввод координат игроком
        Scanner s = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Введите %s-координату%n", sign);
            coordinate = s.nextInt() - 1;
        } while (coordinate < 0 || coordinate > field.length);
        return coordinate;
    }

    static String[][] createAnArray(int r) { // инициализация массива (надо сделать по желанию игрока)
        String[][] field = new String[r][r];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "- ";
            }

        }
        return field;
//        return new String[][]{{"- ", "- ", "- "},
//                              {"- ", "- ", "- "},
//                              {"- ", "- ", "- "}};
    }

    static void playingField(String[][] p) { // вывод в консоль
        for (String[] strings : p) {
            for (String string : strings) {
                System.out.printf(string);
            }
            System.out.println();
        }
    }


}
