/**
 * ArrayStackDriverWeinstein
 */
public class ArrayStackDriverWeinstein {

    public static void main(String[] args) {

        ArrayStackWeinstein<String> stackTest = new ArrayStackWeinstein<>();
        System.out.println("****Testing creation of empty stack****");
        System.out.println("isEmpty() returns: " + stackTest.isEmpty());
        System.out.println();

        System.out.println("****Adding names to stack to test push()****");
        stackTest.push("Jim");
        stackTest.push("Jess");
        stackTest.push("Jill");
        stackTest.push("Jane");
        stackTest.push("Joe");
        System.out.println("isEmpty() returns: " + stackTest.isEmpty());
        System.out.println();

        System.out.println("****Testing peek, peek2, and pop****");
        System.out.println(stackTest.peek() + " is at the top of the stack.");
        System.out.println(stackTest.peek2() + " is just beneath the top of the stack.");
        System.out.println(stackTest.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(stackTest.peek() + " is at the top of the stack.");
        System.out.println(stackTest.peek2() + " is just beneath the top of the stack.");
        System.out.println(stackTest.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(stackTest.peek() + " is at the top of the stack.");
        System.out.println(stackTest.peek2() + " is just beneath the top of the stack.");
        System.out.println(stackTest.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(stackTest.peek() + " is at the top of the stack.");
        System.out.println(stackTest.peek2() + " is just beneath the top of the stack.");
        System.out.println(stackTest.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println(stackTest.peek() + " is at the top of the stack.");
        System.out.println(stackTest.peek2() + " is just beneath the top of the stack.");
        System.out.println(stackTest.pop() + " is removed from the stack.");
        System.out.println();

        System.out.println("****The stack should be empty****");
        System.out.println("isEmpty() returns: " + stackTest.isEmpty());
        System.out.println();

        System.out.println("****Adding names to stack to test clear****");
        stackTest.push("Joe");
        stackTest.push("Jess");
        stackTest.push("Jim");
        System.out.println("****Testing clear****");
        stackTest.clear();
        System.out.println("****The stack should be empty****");
        System.out.println("isEmpty() returns: " + stackTest.isEmpty());
        System.out.println();

        System.out.println("stackTest.peek() returns: " + stackTest.peek());
        System.out.println("stackTest.pop() returns: " + stackTest.pop());
        System.out.println();

    }
}
