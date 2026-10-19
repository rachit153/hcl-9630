package JAVACORE.OOPS;
class music{
    void play(){
        System.out.println("music play");
    }
}
class camera{
    void clicking(){
        System.out.println("camera clicking");
    }
}
class smartphone extends music{
    void calling(){
        System.out.println("smartphone calling");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        smartphone Smartphone = new smartphone();
        Smartphone.play();
        Smartphone.calling();
    }
}
