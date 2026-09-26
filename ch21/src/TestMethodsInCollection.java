public class TestMethodsInCollection {
    public static void main(String[] args) {
        java.util.Set<String> set1 = new java.util.HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        set1.remove("London");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        java.util.Set<String> set2 = new java.util.HashSet<>();
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
    }
}
