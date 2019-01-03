package Basic.Exercises;

// Реализуйте карту морского боя, которая выводится на экран.(Нули - пустота, * - часть корабля)

import java.util.Arrays;

public class SeaBattle {
    public static void main(String[] args) {

        String[][] array = new String[][] {
                {"0","0","0","0","0","0","0","*","*","0"},
                {"0","*","*","*","0","*","0","0","0","0"},
                {"0","0","0","0","0","*","0","0","0","0"},
                {"0","0","0","0","0","0","0","0","0","*"},
                {"*","*","*","0","0","0","*","*","0","0"},
                {"0","0","0","0","*","0","0","0","0","0"},
                {"0","0","0","0","*","0","*","0","0","0"},
                {"0","0","0","0","*","0","0","0","0","0"},
                {"*","0","0","0","*","0","0","0","0","0"},
                {"0","0","0","0","0","0","0","0","0","0"}
        };

        System.out.println(Arrays.deepToString(array[0]));
        System.out.println(Arrays.deepToString(array[1]));
        System.out.println(Arrays.deepToString(array[2]));
        System.out.println(Arrays.deepToString(array[3]));
        System.out.println(Arrays.deepToString(array[4]));
        System.out.println(Arrays.deepToString(array[5]));
        System.out.println(Arrays.deepToString(array[6]));
        System.out.println(Arrays.deepToString(array[7]));
        System.out.println(Arrays.deepToString(array[8]));
        System.out.println(Arrays.deepToString(array[9]));
    }
}
