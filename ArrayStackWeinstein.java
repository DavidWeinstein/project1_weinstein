import java.util.Arrays;

/**
 * ArrayStackWeinstein by David Weinstein 
 * This class is an implementation of StackInterFaceWeinstein which uses an array for a stack and places
 * the top most entry in the stack as the last object of the array.
 * 
 * Pseudocode:
 * 1. Define ArrayStackWeinstein class which implements StackInterfaceWeinstein
 * 2. Initialize field values for empty array to use as stack, an integer topIndex to hold the value of the
 *  last object in array which is the top of the stack, boolean integrityOk to check the security of array.
 * 3. Create final values for default and maximum capacity for array size
 * 4. Define default constructor which creates an empty array with the default capacity
 * 5. Constructor with intitial capacity int as argument.
 *      5a. Constructor will checkCapacity() and create array 
 * 6. Create implemented methods for push, pop, peek, peek2, isEmpty, and clear.
 * 7. Create method to ensureCapacity and double array size if the current array is full
 * 8. Define checkIntegrity method which throws and exception if integrity is broken
 * 9. Define checkCapacity method which compares capacity to the maximum capacity and throws exception if too large
 * 
 * @author David Weinstein 9/24/2020
 */
public final class ArrayStackWeinstein<T> implements StackInterfaceWeinstein<T> {
    private T[] stack; // empty array for stack
    private int topIndex; // index for top of stack
    private boolean integrityOk; // to check integrity
    private static final int DEAFULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10_000;

    /**
     * Default constructor 
    */
    public ArrayStackWeinstein() {
        this(DEAFULT_CAPACITY);
    } // end default constructor
    
    /**
     * Constructor with initial capacity
     * @param initialCapacity 
     */
    public ArrayStackWeinstein(int initialCapacity) {
        integrityOk = false;
        checkCapacity(initialCapacity);
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
        integrityOk = true;
    } // end constructor

    /** Adds a new entry to the top of this stack.
    @param newEntry An object to be added to the stack.
     */
    public void push(T anEntry) {
        checkIntegrity();
        ensureCapacity();
        stack[topIndex + 1] = anEntry;
        topIndex++;
    } // end push

    /** Retrieves this stack’s top entry.
    @return The object at the top of the stack or null if it is empty
    */
    public T peek() {
        checkIntegrity();
        if (isEmpty()) {
            return null;
        } else {
            return stack[topIndex];
        }
    } // end peek

    /** Retrieves this stack’s top entry.
    @return The object underneat the top of the stack or null if there is one or less objects in stack
    */
    public T peek2() {
        checkIntegrity();
        if (topIndex>0){
            return stack[topIndex - 1];
        } else {
            return null;
        }
    }

    /** Removes and returns this stack’s top entry.
    @return  The object at the top of the stack.
    @throws EmptyStackException if the stack is empty before the operation. */
    public T pop() {
        checkIntegrity();
        if (isEmpty()) {
            return null;
        }
        final T top = stack[topIndex];
        stack[topIndex] = null;
        topIndex--;
        return top;
    } // end pop

    /** Detects whether this stack is empty.
    @return True if the stack is empty. */
    public boolean isEmpty() {
        return topIndex < 0;
    } // end isEmpty

    /** Removes all entries from this stack */
    public void clear() {
        stack = null;
        topIndex = -1;
    }

    /** Method to ensure the capacity and double the array size by copying the original to a larger array */
    private void ensureCapacity() {
        if (topIndex == stack.length - 1) {
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            stack = Arrays.copyOf(stack, newLength);
        }
    } // end ensureCapacity

    /** Method to check the integrity. Checks if the boolean integrityOk is not true and throws an exception if so */
    private void checkIntegrity() {
        if (!integrityOk) {
            throw new SecurityException("ArrayBag object is corrupt.");
        }
    } // end checkIntegrity

    /**
     * Method to check the capacity and compare to the max capacity
     * @param capacity integer to compare to max capacity
     * @throws IllegalStateException if attempted capacity is greater than maximum capacity
     */
    private void checkCapacity(int capacity) {
        if (capacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a bag whose " + "capacity exeeds allowed " + 
            "maximum of " + MAX_CAPACITY);
        } // end if
    } // end checkCapacity
    
} // end ArrayStack
