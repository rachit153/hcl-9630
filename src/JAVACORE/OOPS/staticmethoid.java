package JAVACORE.OOPS;

interface vahan{
    static void start(){
        System.out.println("start of vahan");
    }

}
class vahanImpl implements vahan{
    public void start(){
        System.out.println("start of vahan");
    }                                             //static methods me interface ke name se call krte hai
                                                 //override krna compulsory nhi h..
}

public class staticmethoid {
    public static void main(String[] args) {
        vahan obj = new vahanImpl();
        vahan.start();

    }
}
