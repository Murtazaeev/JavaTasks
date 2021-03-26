import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Account acc;

    Person(String name, Account acc){
        this.name = name;
        this.acc = acc;
    }

    public Account getAcc() {
        return acc;
    }

    public static List<Person> theRich(Person[] arr, int threshold){
        ArrayList<Person> richList = new ArrayList<>();
        for(Person person : arr){
            if(person.getAcc().getBalance() > threshold){
                richList.add(person);
            }
        }
        return richList;
    }

    public String toString(){
        return ""+this.name+this.acc;
    }

}
