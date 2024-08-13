package dp;

class Dog {
    String name;
    String breed;
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void setName(String name) {
        this.name = name;
    }
    void setBreed(String breed) {
        this.breed = breed;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class SetterMethod {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", "Pug");
        Dog dog2 = new Dog("Beem", "Bull");
        dog1.display();
        dog2.display();
        System.out.println("\nAfter change");
        dog1.setName("Jimmy");
        dog1.setBreed("Rajapalayam");
        dog2.setName("Subramani");
        dog2.setBreed("German Shepherd");
        dog1.display();
        dog2.display();
    }
}
