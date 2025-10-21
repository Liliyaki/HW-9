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
        int max = Arrays.stream(inputArray1).filter(i -> i >= -1).max().orElse(-1);
        System.out.println("Максимальное значение " + max + " рублей.");
        int min = 1000;
        for (int j : inputArray1) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальное значение " + min + " рублей.");
        int avarage = 0;
        avarage = sum / inputArray1.length - 1;
        System.out.println(avarage);
        int[] outputArray1 = {sum, max, min, avarage};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Задача 2");
        int[] inputArray2 = {50, 10, 34, 90, 20};
        int[] outputArray2 = new int[5];
        int tax = 0;
        for (int b = 0; b < inputArray2.length; b++) {
            tax = (inputArray2[b] * 13) / 100;
            outputArray2[b] = tax;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("Задача 3");
        int[] inputArray3 = {1000, 5500, 6000, 4500, 10000};
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;
            } else {
                outputArray3[i] = false;
            }
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задача 4");
        int[] inputArray4 = {1, 4, 5, 6, 10};
        boolean[] outputArray4 = new boolean[5];
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {
                outputArray4[i] = false;
                break;
            } else {
                outputArray4[i] = true;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println("Задача 5");
        int[] inputArray5 = {-1, 2, -5, 7, 8};
        boolean[] outputArray5 = new boolean[5];
        for (int i = 0; i < inputArray5.length; i++) {
            if (inputArray5[i] > 0) {
                outputArray5[i] = true;
            } else {
                outputArray5[i] = false;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}