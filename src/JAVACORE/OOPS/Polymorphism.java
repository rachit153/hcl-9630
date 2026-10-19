package JAVACORE.OOPS;
class Calcualtor {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
    class overloading{
        void add(int a,int b){
            System.out.println(a+b);
        }
        void name(String names){
            System.out.println(names);
        }
        void divsion(double a, double b){
            System.out.println(a/b);
        }

}                                             // EXAMPLE OF METHOD OVERLOADING SAME NAME WITH DIFFERENT METHODS
public class Polymorphism {
    public static void main(String[] args) { //COMPILE TIME POLYMORPHISM
        Calcualtor calc = new Calcualtor();
        calc.add(1,2,3);
        calc.add(5,9);
        overloading over = new overloading();
        over.add(8787,987);
        over.name("RACHIT");
        over.divsion(346.65,2213.87);


    }
}
