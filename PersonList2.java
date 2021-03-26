public class PersonList2 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("John", new Account("jh", 10000)),
                new Person("Mary", new Account("mr", 30000)),
                new Person("Alice", new Account("al", 15000)),
                new Person("Cindy", new Account("ci", 11000))
        };
        System.out.println(Person.theRich(arr, 12000));
    }
}
