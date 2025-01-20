import java.util.Arrays;

public class StatisticsCalculator {

    public static void main(String[] args) {
        // Given array
        int[] numbers = {2, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        // Calculate mean
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            // If even, average the two middle elements
            return (array[middle - 1] + array[middle]) / 2.0;
        } else {
            // If odd, return the middle element
            return array[middle];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0.0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}
