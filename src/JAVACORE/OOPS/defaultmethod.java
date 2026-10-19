package JAVACORE.OOPS;
interface scooter{
    default void start(){
        System.out.println("start");
    }
    class implementor implements scooter{
       public void start(){
           System.out.println("start of scooter");   //overwrite krna compulsory nhi hai..default methods
       }
    }
}
public class defaultmethod {
    public static void main(String[] args) {
        scooter.implementor obj = new scooter.implementor();
        obj.start();
    }
}
