/**
 * LinkedStackWeinstein by David Weinstein
 * This class is an implementation of a stack that place the entries at the beginning of a chain of linked nodes.
 * 
 * Question 1. I'm trying to imagine a stack where we would put the first entry at the end of the chain. 
 * To me it would be the same as if you put the first entry at the beginning as you still only need to 
 * worry about the most recent entry, the same as if the first entry were at the beginning. Pop, peek, 
 * and push would all deal with the most recent entry and/or the new entry. 
 * 
 * Pseudocode:
 * 1. Define the class LinkedStackWeinstein which implements StackInterfaceWeinstein
 * 2. Field values for object type Node head, which will reference the first node in the chain
 *  and int numberOfEntries, which will reference the number of entries in the stack
 * 3. Define default constructor
 * 4. Define stack operations for isEmpty(), push(anEntry), pop(), peek(), peek2(), and clear()
 * 5. Define inner class Node which will collect the data of the first node and the next node
 * 
 * @author David Weinstein 9/24/2020
 * 
 */
public final class LinkedStackWeinstein<T> implements StackInterfaceWeinstein<T> {
    private Node head; // reference to head node in stack
    private int numberOfEntries;

    public LinkedStackWeinstein() {
        head = null;
    } // end default constructor

    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    } // end isEmpty

     /** Adds a new entry to the top of this stack, which will be the end of a chain of nodes.
    @param newEntry An object to be added to the stack. */
    public void push(T newEntry) {
        head = new Node(newEntry, head);
        numberOfEntries++;
    }

    /** Removes and returns this stack’s top entry.
    @return  The object at the top of the stack. Returns null if stack is empty */
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T end = peek();
        head = head.getNextNode();
        numberOfEntries--;
        return end;
    }

    /** Retrieves this stack’s top entry.
    @return The object at the top of the stack or null if stack is empty */
    public T peek(){
        if(isEmpty()) {
            return null;
        } else {
            return head.getData();
        }
    }

    /** Retrieves the stacks second entry
     * @return The second object in the stack 
     * @throws NullPointerException if stack has fewer than 2 entries 
     */
    public T peek2() {
        if (numberOfEntries<2) {
            return null;
        }
        return head.getNextNode().getData();
    }

    /** Removes all entries from this stack */
    public void clear(){
        head = null;
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
