package JAVACORE.OOPS;
class Animal {
    void  say() {
        System.out.println("ALL Animal barks");
    }
}
class Cat extends Animal {
    void  say() {
        System.out.println("ALL Cat barks");
    }
}
class Dog extends Animal {
    void  say() {
        System.out.println("ALL Dog barks");
    }
}                               //RUNTIME POLYMORPHISM
public class RUNTIME {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.say();
        animal2.say();

    }

}
