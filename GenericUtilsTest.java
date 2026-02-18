public class GenericUtilsTest {
    public static void main(String[] args) {
        
        // --- Testing reverse() method ---
        System.out.println("--- Testing Reverse ---");
        String[] words = {"First", "Second", "Third", "Fourth"};
        
        System.out.print("Original array: ");
        printArray(words);
        
        // Swapping elements in-place
        GenericUtils.reverse(words);
        
        System.out.print("Reversed array: ");
        printArray(words);
        System.out.println();

        // --- Testing sum() method ---
        System.out.println("--- Testing Sum ---");
        
        // Testing with Integer array
        Integer[] intNumbers = {10, 20, 30, 40};
        double intSum = GenericUtils.sum(intNumbers);
        System.out.println("Sum of Integers: " + intSum);
        
        // Testing with Double array
        Double[] doubleNumbers = {1.5, 2.5, 3.5};
        double doubleSum = GenericUtils.sum(doubleNumbers);
        System.out.println("Sum of Doubles: " + doubleSum);
        
        // --- Edge Case Testing ---
        System.out.println("\n--- Testing Edge Cases ---");
        Integer[] emptyArray = {};
        System.out.println("Sum of empty array: " + GenericUtils.sum(emptyArray));
    }

    // Helper method to print array contents
    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}