package kolomytsev.course2.two;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] inCorrect = {
                {"1", "2", "3", "4"},
                {"5", "6", "7"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] inCorrect2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        String[][] inCorrect3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "з", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayOfWords arrayOfWords = new ArrayOfWords();

        Arr arr = new Arr();
        arrayOfWords.arrayOf(arr.getCorrect());


    }
}
