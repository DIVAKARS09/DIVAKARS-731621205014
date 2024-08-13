package dp;

class Animal1 {
    void move() {
        System.out.println("Animal move");
    }
}

class Cheetah extends Animal {
    void move() {
        System.out.println("Cheetah Moves fast");
    }
}
public class AnimalMove {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move(); 
    }
}
