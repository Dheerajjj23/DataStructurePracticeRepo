package Basic;

public class Strings {
    public static void main(String[] args) {
        //When creating strings like this, a string literal is created and stored in the string pool. If another string with the same content is created, it will refer to the same object in the string pool.
        String name = "John";
        String name2 = "John";
        System.out.println(name == name2); // true, because both refer to the same string literal in the string pool
        System.out.println(name.equals(name2)); // true, because both have the same content

        //WHen creating strings like this, a new string object is created in the heap memory, even if another string with the same content is created. Therefore, they will not refer to the same object in the heap memory.
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); // true, because both have the same content
    }
}
