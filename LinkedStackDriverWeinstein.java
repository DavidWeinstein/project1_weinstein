/**
 * LinkedStackDriverWeinstein
 * This class is a test class for LinkedStackWeinstein.java
 * @author David Weinstein
 */
public class LinkedStackDriverWeinstein {

    public static void main(String[] args) {
        System.out.println("***Testing creation of empty stack***");
        LinkedStackWeinstein<String> testStack = new LinkedStackWeinstein<>();
        System.out.println("isEmpty() returns: " + testStack.isEmpty());
        System.out.println();

        System.out.println("***Adding names to list to test push***");
        testStack.push("Jim");
        testStack.push("Jess");
        testStack.push("Jill");
        testStack.push("Jane");
        testStack.push("Joe");
        System.out.println();

        System.out.println("isEmpty() returns: " + testStack.isEmpty());
        System.out.println();

        System.out.println("***Testing peek, peek2, and pop***");
        System.out.println(testStack.peek() + " is at the top of the stack.");
        System.out.println(testStack.peek2() + " is just beneath the top of the stack.");
        System.out.println(testStack.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(testStack.peek() + " is at the top of the stack.");
        System.out.println(testStack.peek2() + " is just beneath the top of the stack.");
        System.out.println(testStack.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(testStack.peek() + " is at the top of the stack.");
        System.out.println(testStack.peek2() + " is just beneath the top of the stack.");
        System.out.println(testStack.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(testStack.peek() + " is at the top of the stack.");
        System.out.println(testStack.peek2() + " is just beneath the top of the stack.");
        System.out.println(testStack.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(testStack.peek() + " is at the top of the stack.");
        System.out.println(testStack.peek2() + " is just beneath the top of the stack.");
        System.out.println(testStack.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println("The stack should be empty: isEmpty() returns: " + testStack.isEmpty());

        System.out.println("***Adding to stack to test clear***");
        testStack.push("Joe");
        testStack.push("Jess");
        testStack.push("Jim");
        System.out.println("***Testing clear***");
        testStack.clear();
        System.out.println("***The stack should be empty***\n***isEmpty() returns: " + testStack.isEmpty());
        System.out.println();

        System.out.println("testStack.peek() returns " + testStack.peek());
        System.out.println("testStack.pop() returns " + testStack.pop());
        System.out.println();
    }
     
}
