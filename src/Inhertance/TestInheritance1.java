package Inhertance;

class Animal {

    Animal(){
        System.out.printf("Animal");
    }
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    Dog(){
       // super();
        System.out.println("Dog");
    }

    void bark() {
        System.out.println("barking...");
    }
}

public class TestInheritance1 {
    public static void main(String args[]) {
        Animal d = new Dog();
       // d.bark();
        //d.eat();
    }
}
