package CollectionsInJava.HashMap;

import java.util.*;

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Designation{
    @Override
    public String toString() {
        return "Designation{" +
                "designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String designation;
    private int salary;

    public Designation(String designation, int salary) {
        this.designation = designation;
        this.salary = salary;
    }

}
public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Person, Designation> details = new HashMap<>();
        details.put(new Person("Jay", 25), new Designation("Software Engineer", 100000));
        details.put(new Person("Dheeraj", 30), new Designation("Senior Software Engineer", 150000));
        details.put(new Person("Amit", 35), new Designation("Manager", 200000));
        details.put(new Person("Rohit", 40), new Designation("Director", 250000));

        Set<Map.Entry<Person, Designation>> entries = details.entrySet();

        for(Map.Entry<Person, Designation> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
