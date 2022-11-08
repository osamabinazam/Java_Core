

public class UsingRunnableInterface  implements Runnable{

    public static void main(String [] args){
            UsingRunnableInterface intr = new UsingRunnableInterface();
            Thread newThread= new Thread(intr);
            newThread.start();
            for(int i=0; i<=10; i++){
                System.out.println(i+" -> from Main Thread");
            }

    }

    public void run (){

        for(int i=0; i<=10; i++){
            System.out.println(i+" -> from Thread");
        }
    }

}