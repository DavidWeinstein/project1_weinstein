import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * LinkedStackWeinstein
 * This class is an implementation of a stack that place the entries at the end of a chain of linked nodes.
 * The stack operations of pop, peek, and push will all focus on the end of the chain and not traverse the chain.
 * @author David Weinstein 
 * 
 */
public class LinkedStackWeinstein<T> implements StackInterfaceWeinstein<T> {
    private Node tail; // reference to tail node in stack
    private Node head; // reference to head node in stack
    private int numberOfEntries;

    public LinkedStackWeinstein() {
        tail = null;
    } // end default constructor

    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    } // end isEmpty

     /** Adds a new entry to the top of this stack, which will be the end of a chain of nodes.
    @param newEntry An object to be added to the stack. */
    public void push(T newEntry) {
        tail = new Node(newEntry, tail);
        numberOfEntries++;
    }

    /** Removes and returns this stack’s top entry.
    @return  The object at the top of the stack. Returns null if stack is empty */
    public T pop() {
        T end = peek();
        tail = tail.getNextNode();
        numberOfEntries--;
        return end;
    }

    /** Retrieves this stack’s top entry.
    @return The object at the top of the stack or null if stack is empty */
    public T peek(){
        if(isEmpty()) {
            return null;
        } else {
            return tail.getData();
        }
    }

    /** Retrieves the stacks second entry
     * @return The second object in the stack 
     * @throws NullPointerException if stack has fewer than 2 entries 
     */
    public T peek2() {
        return tail.getNextNode().getData();
    }

    /** Removes all entries from this stack */
    public void clear(){
        tail = null;
        numberOfEntries = 0;
    }

    private class Node {
        private T data; // entry in stack
        private Node next; // link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        } // end constructor

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private T getData() {
            return data;
        } // end getData

        private Node getNextNode() {
            return next;
        } // end getNext

    } // end Node
    
} // end linkedstack
