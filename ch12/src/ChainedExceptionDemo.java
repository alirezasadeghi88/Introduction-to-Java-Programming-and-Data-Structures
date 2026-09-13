public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {

        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        }catch (Exception ex) {
            throw new Exception("New info from method1", ex);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}
