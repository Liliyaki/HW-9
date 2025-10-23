import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] inputArray1 = {20, 60, 40, 100, 50};
        int sum = 0;
        for (int j : inputArray1) {
            sum = sum + j;
        }
        System.out.println("Сумма выплат составляет " + sum + " рублей.");
        int max = -1;
        for (int j : inputArray1) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальное значение " + max + " рублей.");
        int min = inputArray1[0];
        for (int j : inputArray1) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальное значение " + min + " рублей.");
        float avarage = 0;
        avarage = (float) sum / inputArray1.length - 1;
        System.out.println("Среднее значение " + avarage + " рублей.");
        float[] outputArray1 = {sum, max, min, avarage};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Задача 2");
        int[] inputArray2 = {50, 10, 34, 90, 20};
        float[] outputArray2 = new float[inputArray2.length];
        int a = 0;
        for (int k : inputArray2) {
            float tax = (k * 13) / 100.0f;
            outputArray2[a] = tax;
            a++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println();

        System.out.println("Задача 3");
        int[] inputArray3 = {1000, 5500, 6000, 4500, 10000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int k = 0;
        for (final int i : inputArray3) {
            if (i > 5000) {
                outputArray3[k] = true;
            } else {
                outputArray3[k] = false;
            }
            k++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println();

        System.out.println("Задача 4");
        int[] inputArray4 = {1, 4, -5, 6, 10};
        boolean outputArray4 = true;
        for (final int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);
        System.out.println();

        System.out.println("Задача 5");
        int[] inputArray5 = {-1, -2, 5, 7, 8};
        int count = 0;
        for (final int effective : inputArray5) {
            if (effective > 0) {
                count++;
            }
        }
        int[] outputArray5 = {count};
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}