package kolomytsev.course2.two;

public class ArrayOfWords {

    public int arrayOf(String[][] arg) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arg.length != 4) {
            throw new MyArraySizeException("Неверное количество строк");
        }
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].length != 4) {
                throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" + " строке", i + 1));
            }
            for (int j = 0; j < arg[i].length; j++) {
                try {
                    sum += getInt(arg[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("в строке " + (i + 1) + " в столбце " + (j + 1) + " не число");
                }
                System.out.print(arg[i][j]);
            }
            System.out.println();

        }
        System.out.println(sum);
        return sum;
    }

    private int getInt(String s) {
        return Integer.parseInt(s);
    }
}
