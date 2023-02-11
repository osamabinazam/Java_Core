
/* 
    Lambda Expression provide easier to work with interfaces

*/

package LambdaExpressions;

public class LambdaExpresionDemo {
    public static void main(String args[]) {

        // "Creating Thread Using a seperate class"
        new Thread(new codeToRun()).start(); // Creating a thread of class codeToRun So that run method will execute as
                                             // an independdent thread

        // Creating another Thread using anonymous class
        new Thread(new Runnable() {
            public void run() {
                System.out.println(
                        "Hello From Thread 2 in Ehich Runnable Interface is implemented Using Anonymous Class");

            }
        }).start();

        /// Creating another Thread Using Lambda Expresion

        new Thread(() -> System.out
                .println("Hello From Thread 3 in Ehich Runnable Interface is implemented Using Lambda Expression..."))
                .start();

    }

}

// Class which implements Runnable Interface to create a Thread
class codeToRun implements Runnable {
    public void run() {
        System.out.println("Hello From Thread 1 using a seperate class which implemets Runnable Interface");
    }
}