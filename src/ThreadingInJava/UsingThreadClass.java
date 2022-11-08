/*
    Two ways to create a thread in java 
    1 -> Extends Thread Class
    2 -> Implement Runnable Interface
*/
public class UsingThreadClass extends Thread{
    public static void main (String [] args ){
        UsingThreadClass thread1 = new UsingThreadClass();
        thread1.start();     
    }

    //Overring run method of Thread Class 
    public void run (){

        System.out.println("Hello From Thread");
    }


}


