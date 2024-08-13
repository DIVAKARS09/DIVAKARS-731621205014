package dp;

class Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {    
    void makeSound() {
        System.out.println("Meow");
    }
}
public class AnimalSound {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();  
        Cat c = new Cat();
        c.makeSound(); 
    }
}

