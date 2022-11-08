/*
    Two ways to create a thread in java 
    1 -> Extends Thread Class
    2 -> Implement Runnable Interface
*/
public class UsingThreadClass {
    public static void main (String [] args ){
        YourTask yourTask = new YourTask();
        MyTask myTask = new MyTask();
        yourTask.start();
        myTask.start();

    }
}

//Run as a seperate Independent Thread
class YourTask extends Thread {
    public void run (){
        //This is Thread 1
        for (int i=1; i<=10; i++){
        System.out.println("YourTask Printing  " + i);
        }
    }
}
//Run as a seperate Independent Thread
class MyTask extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("MyTask Printing "+ i);
        }
    }
}

