public class GenericUtils {

    /**
     * Reverses the order of elements in an array.
     * @param <T> The type of elements in the array (any object type).
     * @param array The array to be reversed.
     */
    public static <T> void reverse(T[] array) {
        // The loop only runs to the middle of the array to avoid reversing back to the original order
        for (int i = 0; i < array.length / 2; i++) {
            // Temporary storage for the current element at position i
            T temp = array[i];
            
            // Swap: Move the element from the back of the array to the front
            array[i] = array[array.length - 1 - i];
            
            // Place the stored element into the back position
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Calculates the sum of all numeric elements in an array.
     * @param <T> A type that extends the Number class (e.g., Integer, Double, Float).
     * @param array The array containing numeric values.
     * @return The total sum as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        
        // Iterating through each element of the array using an enhanced for-loop
        for (T element : array) {
            // Crucial: Check for null to prevent a NullPointerException
            if (element != null) {
                // Converting the object to a primitive double value for addition
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}