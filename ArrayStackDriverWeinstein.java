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
        arrayTest.clear();
        System.out.println(arrayTest.isEmpty());
    }
}
