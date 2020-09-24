/**
 * ArrayStackDriverWeinstein
 */
public class ArrayStackDriverWeinstein {

    public static void main(String[] args) {
        System.out.println("****Testing****");
        ArrayStackWeinstein<String> arrayTest = new ArrayStackWeinstein<>();
        arrayTest.push("dave");
        arrayTest.push("joe");
        arrayTest.push("krissy");
        System.out.println(arrayTest.pop());
        System.out.println(arrayTest.peek());
        System.out.println(arrayTest.peek2());
        System.out.println(arrayTest.isEmpty());
    }
}
