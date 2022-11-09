

public class UsingRunnableInterface {
    public static void main(String [] args){

        System.out.println("Main Thread Execcuting");


        Thread even = new Thread (new EvenNumber());
        Thread odd = new Thread (new OddNumber());

        even.start();
        odd.start();


        System.out.println("End of Main Thread");

    }
}


class EvenNumber implements Runnable{
    public void run (){
        for(int i =0; i<=20; i=i+2){
            System.out.println("Even Number " + i + " From Thread 1");
        }

        System.out.println("Even Thread is Terminating....");
    }
}
class OddNumber implements Runnable{
    public void run (){
        for(int i =1; i<=20; i=i+2){
            System.out.println("Even Number " + i + " From Thread 2");
        }
        System.out.println("Odd Thread Is Terminating....");
    }
    
}
