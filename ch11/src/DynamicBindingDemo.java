public class DynamicBindingDemo {
    public static void main(String[] args) {

    }


    public static void m(Object x) {
        System.out.println(x.toString());
    }
}


class Student extends Person {

}

class Person extends Object {

}
