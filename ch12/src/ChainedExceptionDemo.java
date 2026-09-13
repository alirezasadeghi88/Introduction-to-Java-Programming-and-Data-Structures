public class ChainedExceptionDemo {
    public static void main(String[] args) {

    }

    public static void method1() throws Exception {
        try {
            method2();
        }
    }
}
