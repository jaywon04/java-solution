// using a single loop
public class NigerianFlagSingleLoop {
    public static void main(String[] args) {
        int width = 20; // Adjust width as needed

        for (int i = 0; i < width; i++) {
            if (i < width / 3 || i >= 2 * width / 3) {
                System.out.print("*"); // Print green
            } else {
                System.out.print("="); // Print white
            }
        }
        System.out.println(); // Move to the next line
    }
}

// using a nested loop
public class NigerianFlagNestedLoop {
    public static void main(String[] args) {
        int width = 20; // Adjust width as needed

        for (int row = 0; row < 10; row++) { // Adjust height as needed
            for (int col = 0; col < width; col++) {
                if (col < width / 3 || col >= 2 * width / 3) {
                    System.out.print("*"); // Print green
                } else {
                    System.out.print("="); // Print white
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
