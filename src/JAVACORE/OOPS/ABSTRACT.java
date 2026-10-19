package JAVACORE.OOPS;
 abstract class Animals{
    abstract void say();
    abstract void eat();

}
class Cats extends Animals{
     void say(){
         System.out.println("cat say");
     }
     void eat(){
         System.out.println("cat eating");

     }
}
class Dogs extends Animals{
     void say(){
         System.out.println("dog say");
     }
     void eat(){
         System.out.println("dog eating");
     }
}
public class ABSTRACT {
     public static void main(String[] args) {
         Cats c = new Cats();
         c.say();
         c.eat();
         Dogs d = new Dogs();
         d.say();
         d.eat();

     }
}
