package JAVACORE.OOPS;
interface VEHICLES{
    void start();
}
class truck implements VEHICLES{
    public void start(){
        System.out.println("truck start");
    }
}
public class abstractmethod {
    public static void main(String[] args) {
        truck obj = new truck();
        obj.start();
    }
}
