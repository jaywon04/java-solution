// for singe loop
public class NigerianFlagSingleLoop {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the flag
        for (int i = 0; i < rows; i++) {
            // Construct the row: 4 '*' + 4 '=' + 4 '*'
            String row = "****====****";
            System.out.println(row);
        }
    }
}
// for nested loop
public class NigerianFlagNestedLoop {
    public static void main(String[] args) {
        int rows = 5;   // Number of rows for the flag
        int leftRightStars = 4; // Number of '*' on the left and right
        int middleEquals = 4;   // Number of '=' in the middle

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print left asterisks
            for (int j = 0; j < leftRightStars; j++) {
                System.out.print("*");
            }
            // Print middle equal signs
            for (int j = 0; j < middleEquals; j++) {
                System.out.print("=");
            }
            // Print right asterisks
            for (int j = 0; j < leftRightStars; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
