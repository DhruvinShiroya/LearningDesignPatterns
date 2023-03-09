package Interface;

public class ImplementInterfaces {

    // interface is like contract that helps compiler when it call for certain method inside other class object that that child object if implements the interface
    // then it should have method implemented inside the class
    public static void main(String[] args) {

        example1();
        example2();

    }

    private static void example1() {
        Person p1 = new Person("Jack", 24);
        Person p2 = new Person("Jack", 24);
        Person p3 = new Person("Jane", 24);


        System.out.println("Example 2 to test employee class to implement interface with specific object refer to Employee class");
        System.out.println("Test object has the same field value or not");
        System.out.println("p1 = p2 answer "+ p1.compareTo(p2));
        System.out.println("p2 = p3 answer "+ p2.compareTo(p3));
        System.out.println("p1 = p1 answer "+ p1.compareTo(p1));

    }

    private static void example2() {

        Employee e1 = new Employee(1);
        Employee e3 = e1;
        Employee e2 = new Employee(1);


        System.out.println("Example 2 to test employee class to implement interface with specific object refer to Employee class");
        System.out.println("Test object has same address or not in memory");
        System.out.println("e1 == e2 Answer " + (e1.compareTo(e2)));
        System.out.println("e1 == e3 Answer " + (e1.compareTo(e3)));

    }

}

