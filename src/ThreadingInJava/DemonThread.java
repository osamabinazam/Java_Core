
public class DemonThread{
    public static void main(String [] argas ){

        Thread th = new Thread (new Daemon());
        th.setDaemon(true);
        th.start();
        System.out.println("Main Thread");
    }
}
class Daemon implements Runnable{
    public void run (){
        System.out.println("This thread is run by JVM along Main Thread");
    }
}

