import java.util.Arrays;

/**
 * ArrayStackWeinstein
 */

public final class ArrayStackWeinstein<T> implements StackInterfaceWeinstein<T> {
    private T[] stack; // empty array for stack
    private int topIndex; // index for top of stack
    private boolean integrityOk; // to check integrity
    private static final int DEAFULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10_000;

    public ArrayStackWeinstein() {
        this(DEAFULT_CAPACITY);
    } // end default constructor
    
    public ArrayStackWeinstein(int initialCapacity) {
        integrityOk = false;
        checkCapacity(initialCapacity);
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
        integrityOk = true;
    } // end constructor

    public void push(T anEntry) {
        checkIntegrity();
        ensureCapacity();
        stack[topIndex + 1] = anEntry;
        topIndex++;
    } // end push

    public T peek() {
        checkIntegrity();
        if (isEmpty()) {
            return null;
        } else {
            return stack[topIndex];
        }
    } // end peek

    public T peek2() {
        checkIntegrity();
        if (topIndex>0){
            return stack[topIndex - 1];
        } else {
            return null;
        }
    }

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

    public boolean isEmpty() {
        return topIndex < 0;
    } // end isEmpty

    public void clear() {
        stack = null;
        topIndex = -1;
    }

    private void ensureCapacity() {
        if (topIndex == stack.length - 1) {
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            stack = Arrays.copyOf(stack, newLength);
        }
    } // end ensureCapacity

    private void checkIntegrity() {
        if (!integrityOk) {
            throw new SecurityException("ArrayBag object is corrupt.");
        }
    } // end checkIntegrity

    private void checkCapacity(int capacity) {
        if (capacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a bag whose " + "capacity exeeds allowed " + 
            "maximum of " + MAX_CAPACITY);
        } // end if
    } // end checkCapacity
}
