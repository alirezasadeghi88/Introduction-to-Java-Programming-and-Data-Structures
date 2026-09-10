public class CastingDemo {
    public static void main(String[] args) {

    }

    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " +
                    ((Circle)object).getArea());
        }
    }
}
