import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1 () {
            System.out.println("Задание 1");
            int[] number = new int[]{1, 2, 3};
            float[] number1 = {1.57f, 7.654f, 9.986f};
            int[] number2 = {1, 6, 3};
        }
        public static void task2 () {
            System.out.println("Задание 2");
            int[] number = new int[]{1, 2, 3};
            float[] number1 = {1.57f, 7.654f, 9.986f};
            int[] number2 = {1, 6, 3};
            System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
            System.out.println(number1[0] + ", " + number1[1] + ", " + number1[2]);
            System.out.println(number2[0] + ", " + number2[1] + ", " + number2[2]);
        }
        public static void task3 () {
            System.out.println("Задание 3");
            int[] number = new int[]{1, 2, 3};
            float[] number1 = {1.57f, 7.654f, 9.986f};
            int[] number2 = {1, 6, 3};
            System.out.println(number[2] + ", " + number[1] + ", " + number[0]);
            System.out.println(number1[2] + ", " + number1[1] + ", " + number1[0]);
            System.out.println(number2[2] + ", " + number2[1] + ", " + number2[0]);
        }
        public static void task4 () {
            System.out.println("Задание 4");
            int[] number = new int[]{1, 2, 3};
            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 != 0){
                    number[i]++;
                }
            }
            System.out.println(Arrays.toString(number));
        }
}