public class Tests {
    public static void asserts(boolean bool, String msg) {
        if (!bool) {
            throw new RuntimeException("'" + msg + "' failed!");
        }
    }
}
