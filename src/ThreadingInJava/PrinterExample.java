/*
   - Considering one printer which is shared between two or more people 
   - People are differentiated by Threads
*/
package ThreadingInJava;

class Printer {
    public void printDoc(int copies, String docName) {
        for (int i = 1; i <= copies; i++) {
            System.out.println("Printed  " + docName + " " + i + " times.");
        }
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        Thread osama = new Thread(new user1());
        osama.start();

        Thread Sam = new Thread(new user2());
        Sam.start();
        ;

    }

}

class user1 implements Runnable {
    public void run() {
        new Printer().printDoc(10, "Osama's Document");
    }
}

class user2 implements Runnable {
    public void run() {
        new Printer().printDoc(10, "Sam's Document");
    }
}