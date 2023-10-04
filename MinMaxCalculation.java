import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println("Invalid input. The array is empty.");
            return;
        }
        
        int min = numbers[0];int max = numbers[0];
        int n = numbers.length;

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }
}