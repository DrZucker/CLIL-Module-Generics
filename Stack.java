/**
 * A generic Stack implementation using an array.
 * @param <T> The type of elements held in this stack.
 */
public class Stack<T> {
    private T[] data;
    
    // Default constructor: creates a stack with a capacity of 10
    public Stack() {
        //Type casting is necessary because you cannot create a generic array directly in Java.
        this.data = (T[]) new Object[10];
    }

    // Constructor with custom size
    public Stack(int size) {
        this.data = (T[]) new Object[size];
    }

    /**
     * Adds an item to the stack.
     * Searches from the end of the array to the beginning for the first empty (null) slot.
     */
    public void push(T item) throws StackFullException {
        int length = data.length;
        // Iterate backwards through the array
        for(int i = data.length - 1; i >= 0; i--) {
            if(data[i] == null) {
                data[i] = item;
                return;
            }
        }
        // If no null slot is found, the stack is full
        throw new StackFullException("Stack is full");       
    }

    /**
     * Removes and returns the top element of the stack.
     * In this implementation, the "top" is the first non-null element found from index 0.
     */
    public T pop() throws StackEmptyException {
        for(int i = 0; i < data.length; i++){
            if(data[i] != null){
                T temp = data[i];
                data[i] = null; // Remove the reference (clear the slot)
                return temp;
            }
        }
        throw new StackEmptyException("Stack is empty");
    }

    /**
     * Returns the top element without removing it.
     */
    public T peek() throws StackEmptyException {
        for(int i = 0; i < data.length; i++){
            if(data[i] != null){
                return data[i];
            }
        }
        throw new StackEmptyException("Stack is empty");
    }

    /**
     * Returns a string representation of all elements currently in the stack.
     */
    public String list() throws StackEmptyException {
        String list = "";
        for(int i = 0; i < data.length; i++){
            // Concatenate elements with a semicolon if it's not the last index
            if(data[i] != null && i < data.length - 1){
                list += data[i].toString() + "; ";
            } 
            // Append the last element without a trailing semicolon
            else if(data[i] != null && i == data.length - 1){
                list += data[i].toString();
            }
        }
        
        // If the string remains empty, no elements were found
        if(list.equals("")){
            throw new StackEmptyException("Stack is empty");
        }
        return list;
    }
}