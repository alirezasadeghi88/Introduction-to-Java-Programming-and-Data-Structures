public class CastingDemo {
    public static void main(String[] args) {

    }

    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " +
                    ((Circle)object).getArea());
            System.out.println("The circle diameter is " +
                    ((Circle)object).getDiameter());
        }else if (object instanceof Rectangle) {

        }
    }
}
