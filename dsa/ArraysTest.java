import org.junit.Test;

public class ArraysTest {

    @Test
    public static void test() {
        Arrays arr = new Arrays(3);

        Tests.asserts(arr.count() == 3, "count");
        Tests.asserts(arr.get(0) == null, "test null 0");

        arr.set(0, "test");
        arr.set(1, "test2");
        Tests.asserts(arr.get(0) == "test", "test 0");
        Tests.asserts(arr.get(1) == "test2", "test 1");
        Tests.asserts(arr.get(2) == null, "test null 2");

        arr.delete(1);
        Tests.asserts(arr.get(1) == null, "test del");
    }
}
