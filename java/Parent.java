package dp;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Parent {
    public static void main(String[] args) {
        Person person1 = new Person("Diva", 20);
        Person person2 = new Person("Pooja", 19);
        person1.display();
        person2.display();
    }
}

