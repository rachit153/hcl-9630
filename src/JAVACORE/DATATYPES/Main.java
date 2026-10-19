package JAVACORE.DATATYPES;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 122;
        System.out.println(a);


        //int=4 byte,byte=1byte,short=2byte,long=8byte
        //decimal numbers
        // float=4 byte
        //double=8byte
        //boolean-1 bit
        //char=2 byte
        char b = 's';
        System.out.println((char) 10065);
        //STRING CREATION METHODS
        String s1 = "HELLO";// literal methods
        String s2 = new String("JAVA");// USING CONSTRUCTOR
        //JVM HAS TWO MEMOEY STORAGE STACK ANGD HEAP INT A=1 STORE IN STACK(STRING POOL)
        // String s="HELLO" STORE IN HEAP;
        // STRING IS IMMUTABLE;
        //ARITHMETIC OPERATORS
        int j=5;
        int c=7;
        float d=5/3;
        System.out.println(d);
        Car car=new Car();
        car.speed=100;
        car.color="red";
        car.drive();


    }
}
