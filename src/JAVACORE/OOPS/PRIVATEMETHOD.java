package JAVACORE.OOPS;
interface vahans{
    private void helper(){
        System.out.println("start of vahans");
    }
    default void start(){
        System.out.println("the legends  of vahans");
        helper();
    }

}
class implementor1 implements vahans{

}
public class PRIVATEMETHOD {
    public static void main(String[] args) {
        implementor1 v = new implementor1();
        v.start();
    }
}
