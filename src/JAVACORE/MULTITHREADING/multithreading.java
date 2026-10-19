package JAVACORE.MULTITHREADING;
class Mythread extends Thread{
    public void run(){
        System.out.println("the legends  of vahans");
    }
}
class MYThreads implements  Runnable{
    public void run(){
        System.out.println("the legends  of triangle");
    }
}
public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();
        Mythread mythread = new Mythread();
        MYThreads mythread1 = new MYThreads();
        Thread thread1 = new Thread(mythread1);
        mythread.start();
        thread1.start();
        try {
            mythread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(starttime);
    }
}
