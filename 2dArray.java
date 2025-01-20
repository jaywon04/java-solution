import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10];

        // Assigning values to the array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Enter a value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Printing the array using a for-each loop
        System.out.println("The array is:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
