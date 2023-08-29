public class ArrayAverage {
    public static void main(String[] args) {
        // Create and initialize the integer array
        int[] intArray = { 10, 20, 30, 40 };

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / intArray.length;

        // Display the average
        System.out.println("Array values: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average);
    }
}
