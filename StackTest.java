public class StackTest {
    public static void main(String[] args) {
        
        // --- Test 1: Numeric Stack (Integer) ---
        System.out.println("--- Testing Number Stack ---");
        
        // Using explicit types as requested in the structure
        Stack<Integer> numberStack = new Stack<Integer>(3); // Stack with capacity of 3
        
        try {
            // Testing push operation
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            
            // Testing list method
            System.out.println("Stack content: " + numberStack.list()); // Expected: 10;20;30
            
            // Testing peek operation
            System.out.println("Top element (peek): " + numberStack.peek());
            
            // Testing pop operation
            System.out.println("Removed (pop): " + numberStack.pop());
            System.out.println("After pop: " + numberStack.list());
            
        } catch (StackFullException | StackEmptyException e) {
            // Output error message if something goes wrong
            System.err.println("Error in Number Stack: " + e.getMessage());
        }

        System.out.println();

        // --- Test 2: Text Stack (String) ---
        System.out.println("--- Testing Text Stack ---");
        
        Stack<String> textStack = new Stack<String>(); // Uses the default constructor
        
        try {
            textStack.push("Java");
            textStack.push("Generics");
            
            System.out.println("Text Stack: " + textStack.list());
            
            // Testing stack depletion until exception occurs
            textStack.pop();
            textStack.pop();
            textStack.pop(); // This should trigger StackEmptyException
            
        } catch (StackFullException e) {
            //Handles the case where the stack overflows
            System.err.println("Stack is full!");
        } catch (StackEmptyException e) {
            //Handles the case where reading from an empty stack
            System.out.println("Success: StackEmptyException was caught as expected.");
        }
    }
}