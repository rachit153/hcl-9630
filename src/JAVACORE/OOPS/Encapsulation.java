package JAVACORE.OOPS;
class Bankaccount{
   private  int balance=236273;
    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        if(amount>=0){
            balance=amount;
        }
        else{
            System.out.println("INvalid balance");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Bankaccount bank=new Bankaccount();
        System.out.println(bank.getBalance());
        bank.setBalance(43294);
        System.out.println(bank.getBalance());
        bank.setBalance(1232);
        System.out.println(bank.getBalance());
    }
}
