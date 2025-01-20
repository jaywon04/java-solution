import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Part (a): Assign elements to the array using a loop and user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Part (b): Print the entered values using a for-each loop
        System.out.println("\nThe values you entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
