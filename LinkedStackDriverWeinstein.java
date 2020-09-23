/**
 * LinkedStackDriverWeinstein
 */
public class LinkedStackDriverWeinstein {

    public static void main(String[] args) {
        System.out.println("=============");
        LinkedStackWeinstein<String> testStack = new LinkedStackWeinstein<>();
        testStack.push("test");
        testStack.push("testing");
        testStack.push("123");
        testStack.push("456");
        testStack.pop();
        System.out.println(testStack.peek());
        System.out.println(testStack.peek2());
        System.out.println(testStack.peek());
    }
    
}
