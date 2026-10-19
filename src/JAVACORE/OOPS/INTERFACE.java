package JAVACORE.OOPS;
interface VEHICLE{
    void car();
    void bus();

}
class imp implements VEHICLE{
    @Override
    public void car() {
        System.out.println("car");
    }
    public void bus() {
        System.out.println("bus");
    }
}
public class INTERFACE {
    public static void main(String[] args) {
        imp obj = new imp();
        obj.car();
        obj.bus();
    }
}
